package com.senati.eti;

import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Artículo 1: ");
		int a1 = sc.nextInt();

		System.out.print("Artículo 2: ");
		int a2 = sc.nextInt();	
		
		int total = a1 + a2;
		float inc = total * 0.42f;

		System.out.println("-------------------------------");
		System.out.println("========= Resultados ==========");
		System.out.println("-------------------------------");
		System.out.println("Venta...............: " + "S/" + total);
		System.out.println("Incremento..........: " + "S/"+ inc);
		System.out.println("Venta incrementada..: " + "S/" + (total + inc));
	}

}
