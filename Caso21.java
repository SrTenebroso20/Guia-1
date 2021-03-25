package com.senati.eti;

import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Monto 1: ");
		int i1 = sc.nextInt();

		System.out.print("Monto 2: ");
		int i2 = sc.nextInt();
		
		int total = i1 + i2;
		float dsc = total * 0.12f;

		System.out.println("\n========= Resultados ==========");
		System.out.println("Gasto.........: " + "S/"+ total);
		System.out.println("Disminución...: " + "S/" + dsc);
		System.out.println("Gasto final...: "+ "S/" + (total - dsc));

	}

}
