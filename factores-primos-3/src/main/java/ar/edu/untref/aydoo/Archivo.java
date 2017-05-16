package ar.edu.untref.aydoo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Archivo extends FactoresPrimos{

	public static void main(String[] args, int numero) throws IOException {
		File archivo = new File("salida.txt");
		BufferedWriter bw;
		bw = new BufferedWriter(new FileWriter(archivo));
		if (hayOrden(args)) {
			Orden.aplicar(args);
		}
		if (hayFormato(args)) {
			aplicarFormato(numero, args, bw);
		}
		bw.close();
	}

	private static boolean hayFormato(final String[] args) {
		return (buscarParametro(args, "--format=pretty") || buscarParametro(args, "--format=quiet"));
	}

	private static boolean hayOrden(final String[] args) {
		return (buscarParametro(args, "--sort=asc") || buscarParametro(args, "--sort=des"));
	}

	private static boolean buscarParametro (String[]args, String parametro){
		boolean encontrado = false;
		for (int i = 0; i < args.length; i++) {
			if (args[i] == parametro) {
				encontrado = true;
			}
		}
		return encontrado;
	}

	static void aplicarFormato(final int numero, final String[]args, BufferedWriter bw) throws IOException{
		if (devolverParametroDeFormato(args) == "--format=pretty") {
			prettyArchivo(numero, bw);
		}
		if (devolverParametroDeFormato(args) == "--format=quiet") {
			quietArchivo(bw);
		}
	}

	private static String devolverParametroDeFormato (String[]args){
		String param = null;
		for (int i = 0; i < args.length; i++) {
			if (args[i] == "--format=quiet" || args[i] == "--format=pretty" ) {
				param = args[i];
			}
		}
		return param;
	}

	 private static void prettyArchivo(int numero, BufferedWriter bw) throws IOException {
		bw.write("Factores primos " + numero + " : ");
		for (int i = 0; i < divisores.size(); i++) {
			bw.write(divisores.get(i) + " ");
		}
		System.out.println();
	}


		private static void quietArchivo(BufferedWriter bw) throws IOException {
			for (int i= 0; i<divisores.size();i++) {
				bw.write(divisores.get(i).toString());
				bw.newLine();
			}

		}
}
