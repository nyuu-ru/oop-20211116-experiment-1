package experiment.app;

import java.util.Scanner;

import experiment.app.MainClass.Coordinates;

/** Самый главный класс
 * 
 * @author unyuu
 *
 */
public class MainClass {
	public static int a = 5; // "Глобальная" переменная :)

	public static void main(String[] args) {
		/*
		 * Объект - программная сущность, которая находится в определённом
		 * 		состоянии и обладает определённым поведением.
		 * Класс  - тип данных, который определяет структуру состояния и
		 * 		задаёт определённое поведение.
		 * 
		 * 0. Агрегация		- состояние может быть составным
		 * 1. Инкапсуляция	- состояние + поведение = объект
		 * 2. Наследование	- класс-потомок включает состояние и поведение
		 * 						класса-предка, + может включать своё.
		 * 3. Полиморфизм	- класс-потомок может реализовывать поведение,
		 * 						предусмотренное предком, другим способом.
		 * 
		 * static-методы - просто функции, которые находятся в пространстве
		 * 		имён какого-то класса. Неявный параметр this они _не_
		 * 		принимают.
		 * 
		 * Обычные методы - функции, которые не только находятся в
		 * 		пространстве имён класса, но также принимают неявный
		 * 		параметр this соответствующего типа.
		 * 
		 */
		
		/*
		 *  - Имеется плоскость.
		 *  - На плоскости - точки. У точек есть координаты (x, y)
		 *  - Есть вектора. У векторов тоже есть координаты (x, y)
		 *  - Должна быть возможность вывода точек и векторов на консоль
		 *  - Должна быть возможность выполнения операций с векторами
		 *  - Должна быть возможность перемещать точку на какой-то вектор.
		 */
		
		/*
		 * Пример 1:
		 * Есть точка p=(x0, y0) и два вектора - v1={x1, y1}, v2={x2, y2}
		 * Найти сумму векторов v3 = v1 + v2
		 * Переместить точку p на вектор v3
		 * 
		 * Пример 2:
		 * То же самое, что в примере 1,
		 * но перед перемещением точки вектор v3 удвоить.
		 */
		Point p, p2;
		Vector v1, v2, v3;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите координаты точки p: ");
		p = new Point( sc.nextDouble(), sc.nextDouble() );

		System.out.print("Введите координаты вектора v1: ");
		v1 = new Vector( sc.nextDouble(), sc.nextDouble() );

		System.out.print("Введите координаты вектора v2: ");
		v2 = new Vector( sc.nextDouble(), sc.nextDouble() );
		
		v3 = Vector.add(v1, v2);
		System.out.println("v3 = " + v3);
		
		v3.add(v3);
		System.out.println("v3 = " + v3);
		
		Point.move(p, v3);
		
		p.moveBy(v3);
		System.out.println("p  = " + p);
	}
	
	
	
	
	static class Coordinates {
		public double x, y;
		
		Coordinates(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		@Override
		public String toString() {
			return "" + x + "," + y;
		}
	}
	
	static class Point extends Coordinates {
		Point(double x, double y) {
			super(x, y);
		}
		
		@Override
		public String toString() {
			return "(" + super.toString() + ")";
		}
		
		public void moveBy(Vector v) { // this - неявный параметр.
			x += v.x;
			y += v.y;
		}
		
		static Point move(Point p, Vector v) {
			return new Point(p.x + v.x, p.y + v.y);
		}
	}
	
	static class Vector extends Coordinates {
		Vector(double x, double y) {
			super(x, y);
		}
		
		@Override
		public String toString() {
			return "{" + super.toString() + "}";
		}
		
		public void add(Vector v) {
			x += v.x;
			y += v.y;
		}
		
		public void subtract(Vector v) {
			x -= v.x;
			y -= v.y;
		}
		
		static Vector add(Vector v1, Vector v2) { // Не принимает this
			return new Vector(v1.x + v2.x, v1.y + v2.y);
		}
	}
}
