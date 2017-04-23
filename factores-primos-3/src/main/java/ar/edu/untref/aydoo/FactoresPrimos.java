import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FactoresPrimos {
	
	static List<Integer> divisores;
	
	public static void main(String[] args) {
		
		divisores = new ArrayList<Integer>();
		
		int numero=Integer.parseInt(args[0]);
		
		if(estaEnFormatoPretty(args)){
			if(estaEnFormatoAscendente(args)){
				factoresPrimosPretty(numero);
				prettyAscendente();
			}else{
				factoresPrimosPretty(numero);
				prettyDescendente();
			}
		}else if(estaEnFormatoQuiet(args)){
			if(estaEnFormatoAscendente(args)){
				factoresPrimosQuiet(numero);
				quietAscendente();
			}else{
				factoresPrimosQuiet(numero);
				quietDescendente();
			}
		}else if(estaEnFormatoIncorrecto(args)){
			System.out.print("Formato no aceptado. Las opciones posibles son: pretty o quiet.");
		}
				
	}


	private static boolean estaEnFormatoIncorrecto(String[] args) {
		return (args[1].toLowerCase().equals("--format=pretty") &&
				args[1].toLowerCase().equals("--format=quiet"));
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
		return args[2].toLowerCase().equals("--sort=des");
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
		
			
	}


	private static void prettyAscendente() {
		for (int i = 0; i < divisores.size(); i++) {
			System.out.print(divisores.get(i)+" "); 
		}
		System.out.println();
	}
	

	private static void prettyDescendente() {
		Collections.reverse(divisores);
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