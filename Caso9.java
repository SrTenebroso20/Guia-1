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
		
		int área = (ld1 * ld2);
		int perímetro = ((ld1*2) + (ld2 *2));
		
		System.out.println("================================");
		System.out.println("***********Resultados***********");
		System.out.println("================================");
		System.out.println("Área del rectángulo.......: " + área);
		System.out.println("Perímetro del rectángulo..: " + perímetro);

	}

}
