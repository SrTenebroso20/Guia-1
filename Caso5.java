package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Primer n�mero: ");
		n1 = sc.nextFloat();
		
		System.out.print("Segundo n�mero: ");
		n2 = sc.nextFloat();
		
		float prom = (n1 + n2)/2;
		double aumento = n1 * 0.2;
		double aum1 = n1 + aumento;
		double disminuci�n = n1 * 0.3;
		double dism1 = n1 + disminuci�n;
		

		System.out.println("\n************* RESULTADOS ************");
		System.out.println("Promedio...........................: " + prom);
		System.out.println("Primer n�mero aumentado en 20%.....: " + aum1);
		System.out.println("Segundo n�mero disminuido en 30%...: " + dism1);
	}
}
