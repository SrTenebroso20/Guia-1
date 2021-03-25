package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Primer número: ");
		n1 = sc.nextFloat();
		
		System.out.print("Segundo número: ");
		n2 = sc.nextFloat();
		
		float prom = (n1 + n2)/2;
		double aumento = n1 * 0.2;
		double aum1 = n1 + aumento;
		double disminución = n1 * 0.3;
		double dism1 = n1 + disminución;
		

		System.out.println("\n************* RESULTADOS ************");
		System.out.println("Promedio...........................: " + prom);
		System.out.println("Primer número aumentado en 20%.....: " + aum1);
		System.out.println("Segundo número disminuido en 30%...: " + dism1);
	}
}
