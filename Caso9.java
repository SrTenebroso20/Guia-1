package com.senati.eti;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ld1 = 0, ld2 = 0;
		
		System.out.print("Ingrese 1er lado: ");
		ld1 = sc.nextInt();
		
		System.out.print("Ingrese 2do lado: ");
		ld2 = sc.nextInt();
		
		int �rea = (ld1 * ld2);
		int per�metro = ((ld1*2) + (ld2 *2));
		
		System.out.println("================================");
		System.out.println("***********Resultados***********");
		System.out.println("================================");
		System.out.println("�rea del rect�ngulo.......: " + �rea);
		System.out.println("Per�metro del rect�ngulo..: " + per�metro);

	}

}
