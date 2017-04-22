package ar.edu.untref.aydoo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FactoresPrimos {
	
	static List<Integer> divisores;
	
	public static void main(String[] args) {
		
		divisores = new ArrayList<Integer>();
		
		int numero=Integer.parseInt(args[0]);
		
		if (args.length ==1){
			factoresPrimosPretty(numero);
		}else if(args[1].toLowerCase().equals("--format=pretty")){
			factoresPrimosPretty(numero);
		}else if(args[1].toLowerCase().equals("--format=quiet")){
			factoresPrimosQuiet(numero);
		}else{
			System.out.println("Formato no aceptado. Las opciones posibles son: pretty o quiet.");
		}
		
	}
	
	
	static void factoresPrimosPretty(int numero){
		int divisor=2;
		System.out.print("Factores primos "+numero+" : ");
		if(numero > 1){ 
			for(int i = 0; i <= numero; i++) { 
				if (numero % divisor == 0) { 
					divisores.add(divisor); 
					numero = numero/divisor; 
				}else{ 
					divisor++; 
				} 
			}
		} 
		for (int i = 0; i < divisores.size(); i++) {
			System.out.print(divisores.get(i)+" "); 
		}
		System.out.println();
			
	}
	
	static void factoresPrimosQuiet(int numero){
		int divisor=2;
		if(numero > 1){ 
			for (int i = 0; i <= numero; i++) { 
				if (numero % divisor == 0) { 
					divisores.add(divisor);
					numero = numero/divisor; 
				}else{ 
					divisor++; 
				} 
			}
		}
		Collections.reverse(divisores);
		for (int i = 0; i < divisores.size(); i++) {
			System.out.println(divisores.get(i)); 
		}
	}
}

