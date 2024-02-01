//practica02_v01_0;

import java.util.Locale;
import java.util.Scanner;

/*
Autor: Aleksei Savinok
Fecha: 31/01/24
Objetivo: Crear una lista de los coches
*/

public class Main {

	public static void main(String[] args) {
		
		Scanner scannerStr=new Scanner(System.in);
		Scanner scannerNum=new Scanner(System.in).useLocale(Locale.US);
		int opcion;
		System.out.println("¡Buenos días!");
		System.out.println("¡Bienvenido a Toyota Nuestro Concesionario!");
		boolean salir=false;
		do {
			menu();
			opcion=scannerNum.nextInt();
			switch(opcion) {
			case 1:
				// Ingreso de datos
				ingresarCoches();
				break;
			case 2:
				// Listar datos
				//listarCoches();
				break;
			case 9:
				// Agregar datos de ejemplo
				//agregarCochesEjemplo();
				break;
			case 0:
				// Salir
				salir=true;
				break;
			default:
				System.out.println("Opción no válida");
			}
		}while(!salir);
		System.out.println("¡Gracias por venir!");
		System.out.println("Concesionario oficial Toyota en Madrid");
		System.out.println("España,Madrid·2024");
	}	
	
			
	private static void menu() {
		System.out.println("      **MENÚ DE OPCIÓNES**     ");
		System.out.println("===============================");
		System.out.println("1. Ingreasar coches");
		System.out.println("2. Listar coches");
		System.out.println("9. Agregar coches ejemplo");
		System.out.println("0. Salir");
		System.out.println();
		System.out.println("Ingrese una opción:");
	}
	
	private static void ingresarCoches() {
		System.out.println("Formulario de ingreso de coches");
		System.out.println("-------------------------------");
	}
}