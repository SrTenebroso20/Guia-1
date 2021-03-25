package com.senati.eti;

import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese nombre del producto: ");
		String prod = sc.nextLine();
		
		System.out.print("Ingrese precio: ");
		float prc = sc.nextInt();

		System.out.print("Ingrese cantidad: ");
		int cant = sc.nextInt();
		
		float total = prc * cant;
		float IGV = total * 0.18f;
		float desc = total * 0.03f;
		
		System.out.println("----------------------------");
		System.out.println("======= Resultados =========");
		System.out.println("----------------------------");
		System.out.println("Producto..: " + prod);
		System.out.println("Precio....: " + "$" + prc);
		System.out.println("Cantidad..: " + cant);
		System.out.println("Descuento.: " + "$" + desc);
		System.out.println("Subtotal..: " + "$" + total);
		System.out.println("IGV.......: " + "$" + IGV);
		System.out.println("Total.....: " + "$" + (total - desc + IGV));

	}

}
