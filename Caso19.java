package com.senati.eti;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese lado 1: ");
		int ld1 = sc.nextInt();

		System.out.print("Ingrese lado 2: ");
		int ld2 = sc.nextInt();

		System.out.print("Ingrese lado 3: ");
		int ld3 = sc.nextInt();
		
		int Per�metro = ld1 + ld2 + ld3;

		System.out.println("-----------------------------------");
		System.out.println("=========== Resultados ============");
		System.out.println("-----------------------------------");
		System.out.println("Per�metro del tri�ngulo es: " + Per�metro);
		

	}

}
