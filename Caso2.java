package com.senati.eti;

//Importar una libreria para la lectura de datos
import java.util.Scanner;
public class Caso2 {

	public static void main(String[] args) {
		//Creaci�n de una instancia para crear el objeto Scanner
		Scanner dj = new Scanner(System.in);
		
		//Declarar y asignar un valor a la variable
		int n = 0;
		
		System.out.print("Ingresar n�mero: ");
		n = dj.nextInt();
		
		System.out.print("********Valor Ingresado********");
		System.out.print("\nN�mero: " + n);

	}

}
