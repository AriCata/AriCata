package conversor;

import java.util.Scanner;

public class Conversor {

	private static int opcion;
	static Scanner scaner;
	private static Moneda moneda;

	public static void main(String[] args) {
		scaner = new Scanner(System.in);
		do {
			escribirMenu();
			pedirOpcion();
			opcion = leerInt();
			switch(opcion) {
			case 1:
				pedirCantidad();
				double cantidadDolar = leerDouble();	
				moneda = new Dolar(cantidadDolar);
				break;
			case 2:
				pedirCantidad();
				double cantidadLibra = leerDouble();	
				moneda = new Libra(cantidadLibra);
				break;
			case 3:
				pedirCantidad();
				double cantidadYen = leerDouble();	
				moneda = new Yen(cantidadYen);
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Opción no válida.");
			}
			if(moneda != null) {
				System.out.println("La cantidad en euros es: " + moneda.cantidadEnEuros());
			}
		}while(opcion != 0);
	}

	private static double leerDouble() {
		return scaner.nextDouble();
	}

	private static void pedirCantidad() {
		System.out.println("Indique la cantidad: ");
	}

	private static void pedirOpcion() {
		System.out.println("Elija una opción: ");
		
	}

	private static int leerInt() {
		return scaner.nextInt();
	}

	private static void escribirMenu() {
		System.out.println("CONVERSOR DE MONEDAS\r\n"
				+ "1. Dólares\r\n"
				+ "2. Libras\r\n"
				+ "3. Yens\r\n"
				+ "0. Salir");
		
	}

}
