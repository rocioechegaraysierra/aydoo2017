package ar.edu.untref.aydoo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Permite el calculo de factores primos.
 * @author Rocio
 *
 */

public class FactoresPrimos {

	private static List<Integer> divisores;

	/**
	 * Permite calcular los factores primos en base a los argumentos.
	 * @param args
	 * @throws IOException
	 */
	public static void main(final String[] args) throws IOException {

		divisores = new ArrayList<Integer>();

		int numero = Integer.parseInt(args[0]);

		if (estaEnFormatoPretty(args)) {

			if (noHayFormatoSort(args)) {

				factoresPrimos(numero);
				prettyAscendente(numero);

			} else if (estaEnFormatoAscendente(args)) {
				if (noHayArchivo(args)) {
					factoresPrimos(numero);
					prettyAscendente(numero);

				} else if (hayArchivo(args)) {
					factoresPrimos(numero);
					archivoPrettyAscendente(numero);
				}

			} else {
				if (noHayArchivo(args)) {
					factoresPrimos(numero);
					prettyDescendente(numero);

				} else if (hayArchivo(args)) {
					factoresPrimos(numero);
					archivoPrettyDescendente(numero);
				}

			}
		} else if (estaEnFormatoQuiet(args)) {

			if (noHayFormatoSort(args)) {
				factoresPrimos(numero);
				prettyAscendente(numero);

			} else if (estaEnFormatoAscendente(args)) {
				if (noHayArchivo(args)) {
					factoresPrimos(numero);
					quietAscendente();

				}

			} else {
				if (noHayArchivo(args)) {
					factoresPrimos(numero);
					quietDescendente();
				}
			}
		} else if (estaEnFormatoIncorrecto(args)) {
			System.out.print("Formato no aceptado."
					+ " Las opciones posibles son:"
					+ " pretty o quiet.");
		} else {

			if (noHayFormatoSort(args)) {
				factoresPrimos(numero);
				prettyAscendente(numero);

			} else if (estaEnFormatoAscendente(args)) {
				if (noHayArchivo(args)) {
					factoresPrimos(numero);
					prettyAscendente(numero);

				}
			} else {
				if (noHayArchivo(args)) {
					factoresPrimos(numero);
					prettyDescendente(numero);
				}

			}
		}

	}
	private static void archivoPrettyDescendente(final int numero) throws IOException {
		File archivo = new File("salida.txt");
		FileWriter escribir = new FileWriter(archivo, true);
		escribir.write("Factores primos " + numero + " : ");
		Collections.reverse(divisores);
		for (int i = 0; i < divisores.size(); i++) {
			escribir.write((divisores.get(i) + " "));
		}
		escribir.close();

	}

	private static void archivoPrettyAscendente(int numero) throws IOException {
		File archivo = new File("salida.txt");
		FileWriter escribir = new FileWriter(archivo, true);
		escribir.write("Factores primos " + numero + " : ");
		for (int i = 0; i < divisores.size(); i++) {
			escribir.write((divisores.get(i) + " "));
		}
		escribir.close();
	}

	private static boolean hayArchivo(String[] args) {
		return args[3].toLowerCase().equals("--output-file=salida.txt");
	}

	private static boolean noHayArchivo(String[] args) {
		return (args.length == 3);
	}

	private static boolean noHayFormatoSort(String[] args) {
		return (args.length == 2 || args.length == 1);
	}

	private static boolean estaEnFormatoIncorrecto(String[] args) {
		return (args[1].toLowerCase().equals("--format=pretty") && args[1].toLowerCase().equals("--format=quiet"));
	}

	private static boolean estaEnFormatoPretty(String[] args) {
		return args[1].toLowerCase().equals("--format=pretty");
	}

	private static boolean estaEnFormatoQuiet(String[] args) {
		return args[1].toLowerCase().equals("--format=quiet");
	}

	private static boolean estaEnFormatoAscendente(String[] args) {
		return (args[2].toLowerCase().equals("--sort=asc") || args[1].toLowerCase().equals("--sort=asc"));
	}

	private static boolean estaEnFormatoDescendente(String[] args) {
		return args[2].toLowerCase().equals("--sort=des") || args[1].toLowerCase().equals("--sort=des");
	}

	private static void prettyAscendente(int numero) {
		System.out.print("Factores primos " + numero + " : ");
		for (int i = 0; i < divisores.size(); i++) {
			System.out.print(divisores.get(i) + " ");
		}
		System.out.println();
	}

	private static void prettyDescendente(int numero) {
		System.out.print("Factores primos " + numero + " : ");
		Collections.reverse(divisores);
		for (int i = 0; i < divisores.size(); i++) {
			System.out.print(divisores.get(i) + " ");
		}
		System.out.println();
	}

	static void factoresPrimos(int numero) {
		int divisor = 2;
		if (numero > 1) {
			for (int i = 0; i <= numero; i++) {
				if (numero % divisor == 0) {
					divisores.add(divisor);
					numero = numero / divisor;
				} else {
					divisor++;
				}
			}
		}

	}

	private static void quietDescendente() {
		Collections.reverse(divisores);
		for (int i = 0; i < divisores.size(); i++) {
			System.out.println(divisores.get(i));
		}
	}

	private static void quietAscendente() {
		for (int i = 0; i < divisores.size(); i++) {
			System.out.println(divisores.get(i));
		}
	}
}