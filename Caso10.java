package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float rd = 0;
		
		System.out.print("Radio del c�rculo: ");
		rd = sc.nextFloat();
		
		float Area = (float)(3.14 * Math.pow(rd, 2));
		float Pm = (float)(2 * 3.14 * rd);
		
		System.out.println("\n====================");
		System.out.println("******Resultados******");
		System.out.println("======================");
		System.out.println("�rea del c�rculo.......: " + Area);
		System.out.println("Per�metro del c�rculo..: " + Pm);

	}
}