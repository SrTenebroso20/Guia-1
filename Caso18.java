package com.senati.eti;

import java.util.Scanner;
public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese altura: ");
		int h = sc.nextInt();
		
		System.out.print("Ingrese base: ");
		int b = sc.nextInt();
		
		float Area = b*h/2;
		
		System.out.println("-------------------------------");
		System.out.println("========= Resultados ==========");
		System.out.println("-------------------------------");
		System.out.println("Área del triángulo: " + Area);

	}

}
