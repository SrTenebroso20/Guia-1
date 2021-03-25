package com.senati.eti;

import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1er monto: ");
		int mt1 = sc.nextInt();

		System.out.print("2do monto: ");
		int mt2 = sc.nextInt();

		System.out.print("Monto 3: ");
		int mt3 = sc.nextInt();
		
		float res1= (mt1/5) + (mt2*0.2f);
		float res2= ((mt3*0.6f) + mt3)/2;
		float res3= ((mt1 + mt2 + mt3) - (mt1 + mt2 + mt3) * 0.8f);
		
		System.out.println("------------------------");
		System.out.println("====== Resultados ======");
		System.out.println("------------------------");
		System.out.println("Resultado 1: " + res1);
		System.out.println("Resultado 2: " + res2);
		System.out.println("Resultado 3: " + res3);
	}

}
