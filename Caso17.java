package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.print("Número de aprobados.....: ");
		int ca = sc.nextInt();
		
		System.out.print("Número de desaprobados..: ");
		int cd = sc.nextInt();
		
		System.out.print("Número de retirados.....: ");
		int cr = sc.nextInt();
		
		float total = ca + cd + cr;
		float pa = ca / total * 100;
		float pd = cd / total * 100;
		float pr = cr / total * 100;
		

		System.out.println("--------------------------------------");
		System.out.println("============= Resultados =============");
		System.out.println("--------------------------------------");
		System.out.println("Aprobados......: " + df.format(pa) + "%");
		System.out.println("Desaprobados...: " + df.format(pd) + "%");
		System.out.println("Retirados......: " + df.format(pr) + "%");
		

	}

}
