package experiment.app;

import java.util.Scanner;

/** Самый главный класс
 * 
 * @author unyuu
 *
 */
public class MainClass {

	public static void main(String[] args) {
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
		double
			p_x, p_y,
			v1_x, v1_y,
			v2_x, v2_y,
			v3_x, v3_y,
			p2_x, p2_y;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите координаты точки p: ");
		p_x = sc.nextDouble();
		p_y = sc.nextDouble();

		System.out.print("Введите координаты вектора v1: ");
		v1_x = sc.nextDouble();
		v1_y = sc.nextDouble();

		System.out.print("Введите координаты вектора v2: ");
		v2_x = sc.nextDouble();
		v2_y = sc.nextDouble();
		
		v3_x = v1_x + v2_x;
		v3_y = v1_y + v2_y;
		
		System.out.println("v3 = {" + v3_x + "," + v3_y + "}");
		
		p2_x = p_x + v3_x;
		p2_y = p_y + v3_y;
		
		System.out.println("p2 = (" + p2_x + "," + p2_y + ")");

	}

}
