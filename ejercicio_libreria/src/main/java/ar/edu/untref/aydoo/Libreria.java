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

	public List<Producto> verSuscripciones(Cliente clienteSuscrip, int mes, int anio){
		List<Producto> suscripciones = new ArrayList<Producto>(); 
		Iterator<Cliente> itCliente= this.clientes.iterator();
		while(itCliente.hasNext()){
			Cliente cliente = itCliente.next();
			if(cliente == clienteSuscrip){
				suscripciones=cliente.getProductos(mes, anio);
			}
		}
		return suscripciones;	
	}

	public double calcularMontoTotal(int mes, int anio, Cliente clienteACalcularMonto){
		double monto=0;
		Iterator<Cliente> itCliente= this.clientes.iterator();
		while(itCliente.hasNext()){
			Cliente clienteEncontrado = itCliente.next();
			if(clienteEncontrado == clienteACalcularMonto){
				monto+=clienteEncontrado.calcularMontoACobrar(mes, anio);
			}
		}
		return monto;	
	}
	

	public List<Producto> buscarProductosComprados(int mes,int anio, Cliente cliente){
		List<Producto> productos = new ArrayList<Producto>(); 
		Iterator<Cliente> itCliente= this.clientes.iterator();
		while(itCliente.hasNext()){
			Cliente clienteEncontrado = itCliente.next();
			if(clienteEncontrado == cliente){
				productos=cliente.getProductos(mes, anio);
			}
		}
		return productos;	
	}
		
}
