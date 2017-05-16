package ar.edu.untref.aydoo;



public class Formato extends FactoresPrimos {
	
	static void aplicar(int numero, String[]args){
		if(devolverParametro(args) == "--format=pretty"){
			pretty(numero);
		}
		if(devolverParametro(args) == "--format=quiet"){
			quiet();
		}
	}
	
	
	private static String devolverParametro (String[]args){
		String param = null;
		for (int i = 0; i < args.length; i++) {
			if(args[i]=="--format=quiet" || args[i]=="--format=pretty" ){
				param = args[i];
			}
		}
		return param;
	}
	
	
	 private static void pretty(int numero) {
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
