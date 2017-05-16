package ar.edu.untref.aydoo;



public class Formato extends FactoresPrimos {
	
	static void aplicar(final int numero, final String[]args){
		if (devolverParametro(args) == "--format=pretty") {
			pretty(numero);
		}
		if (devolverParametro(args) == "--format=quiet") {
			quiet();
		}
	}

	private static String devolverParametro (final String[]args){
		String param = null;
		for (int i = 0; i < args.length; i++) {
			if (args[i] == "--format=quiet" || args[i] == "--format=pretty" ) {
				param = args[i];
			}
		}
		return param;
	}

	 private static void pretty(final int numero) {
		System.out.print("Factores primos " + numero + " : ");
		for (int i = 0; i < divisores.size(); i++) {
			System.out.print(divisores.get(i) + " ");
		}
		System.out.println();
	}

		private static void quiet() {
			for (int i = 0; i < divisores.size(); i++) {
				System.out.println(divisores.get(i));
			}
		}
}
