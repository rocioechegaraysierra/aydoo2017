package ar.edu.untref.aydoo;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Permite el calculo de factores primos.
 * @author Rocio
 *
 */

public class FactoresPrimos {

	protected static List<Integer> divisores;


	/**
	 * Permite calcular los factores primos en base a los argumentos.
	 * @param args
	 * @throws IOException
	 */
	public static void main(final String[] args) throws IOException {
		
		divisores = new ArrayList<Integer>();
		int numero = Integer.parseInt(args[0]);
		factoresPrimos(numero);
		
		if(hayArchivo(args)){
			Archivo.main(args, numero);
		}else{
			if(hayOrden(args)){
				Orden.aplicar(args);
			}
			if(hayFormato(args)){
				Formato.aplicar(numero, args);
			}
	}

	}
	
	

	private static boolean buscarParametro (String[]args, String parametro){
		boolean encontrado = false;
		for (int i = 0; i < args.length; i++) {
			if(args[i]==parametro){
				encontrado = true;
			}
		}
		return encontrado;
	}
	

	
	private static boolean hayFormato(String[] args) {
		return (buscarParametro(args, "--format=pretty") || buscarParametro(args, "--format=quiet"));
	}
	
	private static boolean hayOrden(String[] args) {
		return (buscarParametro(args, "--sort=asc") || buscarParametro(args, "--sort=des"));
	}
	
	private static boolean hayArchivo(String[] args) {
		return (buscarParametro(args, "--output-file=salida.txt"));
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

	

}