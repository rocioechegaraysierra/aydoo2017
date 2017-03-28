public class Factores {
     
	public static void main (String [ ] args){
		int numero=Integer.parseInt(args[0]);
		factor(numero);
		System.out.print("Factores primos "+numero+" : ");
     
	}

     static void factor(int numero){
    	 int num = 2;
    	 while(numero!=1){
    		 while(numero%num==0){
    			 System.out.print(num);
    			 numero /= num;
    		 }
         }
     }
}