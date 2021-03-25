package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.print("Ingrese horas trabajadas: ");
		int horas = sc.nextInt();

		System.out.print("Ingrese tarifa por hora: ");
		float tarifa = sc.nextFloat();
		
		float sueldo = horas * tarifa;
		float bono = sueldo * 0.05f;
		float total = sueldo + bono;
		
		System.out.println("\n========= Resultados ==========");
		System.out.println("Sueldo...........: " + df.format(sueldo));
		System.out.println("Bono.............: " + df.format(bono));
		System.out.println("Total............: " + df.format(total));
		System.out.println("Total en dólares.: " + df.format(total/3.24f));
		

	}

}
