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
	
	public double calcularMontoTotal(int mes, Cliente clienteACalcularMonto){
		
		double monto=0;
		
		Iterator<Cliente> itCliente= this.clientes.iterator();
		while(itCliente.hasNext()){
			Cliente cliente = itCliente.next();
			if(cliente == clienteACalcularMonto){
				monto=cliente.calcularMontoTotal(mes);
			}
		}
		
		
		return monto;	
	}
	
	public List<Revista> verSuscripcionesARevista(Cliente clienteSuscrip){
		
		List<Revista> revistas = new ArrayList<Revista>(); 
		
		Iterator<Cliente> itCliente= this.clientes.iterator();
		while(itCliente.hasNext()){
			Cliente cliente = itCliente.next();
			if(cliente == clienteSuscrip){
				revistas=cliente.getRevistas();
			}
		}
		
		
		return revistas;	
	}
	
	public List<Periodico> verSuscripcionesAPeriodico(Cliente clientePeriod){
		
		List<Periodico> periodicos = new ArrayList<Periodico>(); 
		
		Iterator<Cliente> itCliente= this.clientes.iterator();
		while(itCliente.hasNext()){
			Cliente cliente = itCliente.next();
			if(cliente == clientePeriod){
				periodicos=cliente.getPeriodicos();
			}
		}
		
		
		return periodicos;	
	}
	
	public List<Libro> buscarLibrosComprados(int mes, Cliente cliente){
		
		List<Libro> libros = new ArrayList<Libro>(); 
		
		Iterator<Cliente> itCliente= this.clientes.iterator();
		while(itCliente.hasNext()){
			Cliente clienteBuscado = itCliente.next();
			if(cliente == clienteBuscado){
				libros=cliente.buscarLibrosComprados(mes);
			}
		}
		
		return libros;	
	}
	
	public List<Revista> buscarRevistasCompradas(int mes, Cliente cliente){
		
		List<Revista> revistas = new ArrayList<Revista>(); 
		
		Iterator<Cliente> itCliente= this.clientes.iterator();
		while(itCliente.hasNext()){
			Cliente clienteBuscado = itCliente.next();
			if(cliente == clienteBuscado){
				revistas=cliente.buscarRevistasCompradas(mes);
			}
		}
		
		return revistas;	
	}
	
	public List<Periodico> buscarPeriodicosComprados(int mes, Cliente cliente){
		
		List<Periodico> periodicos = new ArrayList<Periodico>(); 
		
		Iterator<Cliente> itCliente= this.clientes.iterator();
		while(itCliente.hasNext()){
			Cliente clienteBuscado = itCliente.next();
			if(cliente == clienteBuscado){
				periodicos=cliente.buscarPeriodicosComprados(mes);
			}
		}
		
		return periodicos;	
	}
	
	public List<ArticuloDeLibreria> buscarArticulosComprados(int mes, Cliente cliente){
		
		List<ArticuloDeLibreria> articulos = new ArrayList<ArticuloDeLibreria>(); 
		
		Iterator<Cliente> itCliente= this.clientes.iterator();
		while(itCliente.hasNext()){
			Cliente clienteBuscado = itCliente.next();
			if(cliente == clienteBuscado){
				articulos=cliente.buscarArticulosComprados(mes);
			}
		}
		
		return articulos;	
	}

}
