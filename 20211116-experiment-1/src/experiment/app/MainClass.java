package experiment.app;

import java.util.Scanner;

import experiment.app.MainClass.Coordinates;

/** Самый главный класс
 * 
 * @author unyuu
 *
 */
public class MainClass {

	public static void main(String[] args) {
		/*
		 * 0. Агрегация
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
		 */
		Coordinates p, v1, v2, v3, p2;

		Scanner sc = new Scanner(System.in);
		System.out.print("Введите координаты точки p: ");
		p = new Coordinates( sc.nextDouble(), sc.nextDouble() );

		System.out.print("Введите координаты вектора v1: ");
		v1 = new Coordinates( sc.nextDouble(), sc.nextDouble() );

		System.out.print("Введите координаты вектора v2: ");
		v2 = new Coordinates( sc.nextDouble(), sc.nextDouble() );
		
		v3 = new Coordinates(v1.x + v2.x, v1.y + v2.y);
		System.out.println("v3 = {" + v3.x + "," + v3.y + "}");
		
		p2 = new Coordinates(p.x + v3.x, p.y + v3.y);
		System.out.println("p2 = (" + p2.x + "," + p2.y + ")");
	}
	
	static class Coordinates {
		public double x, y;
		
		Coordinates(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

}
