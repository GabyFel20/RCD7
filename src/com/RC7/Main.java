package com.RC7;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private static HashMap<String, String> capitales;

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        inicializarCapitales();

	        String pais;
	        while (true) {
	            pais = obtenerPaisDelUsuario(scanner);
	            if (pais.equals("salir")) {
	                break;
	            }

	            manejarConsultaCapital(scanner, pais);
	        }

	        scanner.close();
	    }

	    private static void inicializarCapitales() {
	        capitales = new HashMap<>();
	        capitales.put("Canadá", "Ottawa");
	        capitales.put("Estados Unidos", "Washington DC");
	        capitales.put("México", "México DF");
	        capitales.put("Belice", "Belmopán");
	        capitales.put("Costa Rica", "San José");
	        capitales.put("El Salvador", "San Salvador");
	        capitales.put("Guatemala", "Ciudad de Guatemala");
	        capitales.put("Honduras", "Tegucigalpa");
	        capitales.put("Nicaragua", "Managua");
	        capitales.put("Panamá", "Panamá");
	    }

	    private static String obtenerPaisDelUsuario(Scanner scanner) {
	        System.out.print("Escribe el nombre de un país y te diré su capital (o 'salir' para terminar): ");
	        return scanner.nextLine();
	    }

	    private static void manejarConsultaCapital(Scanner scanner, String pais) {
	        if (capitales.containsKey(pais)) {
	            System.out.println("La capital de " + pais + " es " + capitales.get(pais));
	        } else {
	            System.out.print("No conozco la respuesta. ¿Cuál es la capital de " + pais + "?: ");
	            String capital = scanner.nextLine();
	            capitales.put(pais, capital);
	            System.out.println("Gracias por enseñarme nuevas capitales.");
	        }

	}

}
