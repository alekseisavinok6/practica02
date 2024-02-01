//practica02_v01_1;

import java.awt.Toolkit;
import java.util.Locale;
import java.util.Scanner;

/*
Autor: Aleksei Savinok
Fecha: 01/02/24
Objetivo: Crear una lista de los coches
*/

public class Main {
	static Scanner scannerStr = new Scanner(System.in);
    static Scanner scannerNum = new Scanner(System.in).useLocale(Locale.US);
    static GestorCoche gc = new GestorCoche();

	public static void main(String[] args) {
		int opcion;
		System.out.println("¡Buenos días!");
		System.out.println("¡Bienvenido a Concesionario Toyota en Madrid!");
		System.out.println();
		Toolkit.getDefaultToolkit().beep();
		boolean salir=false;
		do {
			menu();
			opcion=scannerNum.nextInt();
			switch(opcion) {
			case 1:
				ingresarCoche();
				break;
			case 2:
				mostrarCoches();
				break;
			case 9:
				mocearCoches();
				break;
			case 0:
				salir=true;
				break;
			default:
				System.out.println("Opción no válida");
			}
		}while(!salir);
		System.out.println("¡Gracias por venir!");
		System.out.println("Concesionario oficial Toyota en Madrid");
		System.out.println("España, Madrid·2024");
		Toolkit.getDefaultToolkit().beep();
	}	
	
	private static void menu() {
		System.out.println("      **MENÚ DE OPCIÓNES**     ");
		System.out.println("===============================");
		System.out.println("1. Ingreasar coche");
		System.out.println("2. Listar coches");
		System.out.println("9. Agregar coches añadidos");
		System.out.println("0. Salir");
		System.out.println();
		System.out.println("Ingrese una opción:");
	}
	
	private static void ingresarCoche() {
        String marca;
        String modelo;
        int anio;
        String color;
        System.out.println("Formulario de ingreso de Coche");
        System.out.println("==============================");
        System.out.println();
        System.out.print("Marca: ");
        marca = scannerStr.nextLine();
        System.out.print("Modelo: ");
        modelo = scannerStr.nextLine();
        System.out.print("Año: ");
        anio = scannerNum.nextInt();
        System.out.print("Color: ");
        color = scannerStr.nextLine();
        gc.agregarCoche(new Coche( marca, modelo, anio, color));
        System.out.println("\nCoche agregado exitosamente.......!");
        pausa();
    }
	
 	private static void cabeceraListarCoches() {
        System.out.println("\n\n                  *Listado de Coches*");
        System.out.println("============================================================");
        System.out.println("ID   Marca                Modelo          Año    Color");
        System.out.println("============================================================");
    }

    private static void pausa() {
        System.out.println();
        System.out.println("Presione ENTER para continuar...");
        scannerStr.nextLine();
    }
    private static void mostrarCoches() {
        cabeceraListarCoches();
        for (Coche c : gc.listarCoches()) {
            System.out.println(c.toStr());
        }
        pausa();
    }
    private static void  mocearCoches() {
        gc.agregarCoche(new Coche("Toyota", "Corolla", 2024, "Azul"));
        gc.agregarCoche(new Coche("Toyota", "GR Supra", 2024, "Rojo"));
        gc.agregarCoche(new Coche("Toyota", "Camry", 2024, "Negro"));
        gc.agregarCoche(new Coche("Toyota", "Yaris", 2023, "Amarillo"));
        gc.agregarCoche(new Coche("Toyota", "Hilux", 2024, "Verde"));
        gc.agregarCoche(new Coche("Toyota", "RAV4", 2023, "Gris"));
        System.out.println("\n6 registros agregados exitosamente.......!");
        pausa();
    }
}