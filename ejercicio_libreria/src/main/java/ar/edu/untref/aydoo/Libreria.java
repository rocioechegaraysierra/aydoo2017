import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Libreria {
	
	List<Cliente> clientes;
	
	public Libreria(){
		this.clientes= new ArrayList<Cliente>();
	}
	
	public void agregarCliente(Cliente cliente){
		this.clientes.add(cliente);
	}
	
	public int cantidadDeClientes(){
		return this.clientes.size();
	}
	
	public double calcularMontoTotal(Cliente clienteACalcularMonto){
		
		double monto=0;
		
		Iterator<Cliente> itCliente= this.clientes.iterator();
		while(itCliente.hasNext()){
			Cliente cliente = itCliente.next();
			if(cliente == clienteACalcularMonto){
				monto=cliente.calcularMontoTotal();
			}
		}
		
		
		return monto;	
	}
	

}
