package com.senati.eti;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lado = 0;
		
		System.out.print("Ingrese lado: ");
		lado = sc.nextInt();
		
		System.out.println("----------------------");
		System.out.println("\n**** Resultados ****");
		System.out.println("----------------------");
		System.out.println("�rea del cuadrado...: "+ lado * lado);
		System.out.println("Per�metro del cuadrado..: " + lado * 4);
	}

}
