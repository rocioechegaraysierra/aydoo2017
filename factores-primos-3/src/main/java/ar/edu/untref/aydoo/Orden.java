package ar.edu.untref.aydoo;

import java.util.Collections;
import java.util.List;

public class Orden extends FactoresPrimos{

	static void aplicar(String[]args){
		if(devolverParametro(args) == "--sort=des"){
			ordenDescendente(divisores);
		}
	}

	private static void ordenDescendente(List<Integer> divisores) {
		Collections.reverse(divisores);
	}
	
	private static String devolverParametro (String[]args){
		String param = null;
		for (int i = 0; i < args.length; i++) {
			if(args[i]=="--sort=asc" || args[i]=="--sort=des" ){
				param = args[i];
			}
		}
		return param;
	}
	
}
