package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ClubDeBeneficios {
	
	private List<Cliente> clientes;
	private List<Establecimiento> establecimientos;
	private List<Tarjeta> tarjetas;
	
	
	public ClubDeBeneficios(){
		this.clientes= new ArrayList<Cliente>();
		this.establecimientos= new ArrayList<Establecimiento>();
		this.tarjetas = new ArrayList<Tarjeta>();
		
	}
	
	public void agregarTarjeta(Tarjeta tarjeta){
		this.tarjetas.add(tarjeta);
	}
	
	public void agregarEstablecimiento(Establecimiento establecimiento){
		this.establecimientos.add(establecimiento);
	}
	
	public void agregarCliente(Cliente cliente){
		this.clientes.add(cliente);
	}
	
	
	public void compra(Establecimiento establecimiento, Sucursal sucursal, Cliente cliente, Producto producto){
		Iterator<Cliente> itCliente = this.clientes.iterator();
		while(itCliente.hasNext()){
			Cliente clienteEncontrado = itCliente.next();
			if(clienteEncontrado == cliente){
				clienteEncontrado.agregarDatosDeCompra(establecimiento, producto, clienteEncontrado.getTarjeta());
			}
			
		}
		
		Iterator<Establecimiento> itEstablecimiento = this.establecimientos.iterator();
		while(itEstablecimiento.hasNext()){
			Establecimiento establecimientoEncontrado= itEstablecimiento.next();
			if(establecimiento == establecimientoEncontrado){
				establecimiento.comprar(sucursal);
			}
		}
		
	}
	
	
	
	
	
	public List<String> reporteDeClientes(){
		
		List<String> detalles= new ArrayList<String>();
		
		Iterator<Cliente> itCliente= this.clientes.iterator();
		while(itCliente.hasNext()){
			Cliente cliente = itCliente.next();
			if(cliente.realizoCompras()){
				detalles.add(cliente.establecimientos.get(0).getNombre());
				detalles.add(String.valueOf(cliente.productos.get(0).getNombre()));
				detalles.add(String.valueOf(cliente.precios.get(0)));
				detalles.add(String.valueOf(cliente.preciosConBeneficios.get(0)));
			}
		}
		
		
		return detalles;
	}
	
	
	
	public Establecimiento establecimientoConMasBeneficios(){
		Establecimiento establecimientoConMasBeneficios = null;
		int cantidad = 0;
		Iterator<Establecimiento> itEstablecimiento = this.establecimientos.iterator();
		while(itEstablecimiento.hasNext()){
			Establecimiento establecimiento= itEstablecimiento.next();
			if(establecimiento.getCantidadTotalDeVentasDelEstablecimiento() > cantidad){
				cantidad= establecimiento.getCantidadTotalDeVentasDelEstablecimiento();
				establecimientoConMasBeneficios=establecimiento;
			}
		}
		return establecimientoConMasBeneficios;
	}
	
	public Sucursal sucursalQueMasVendio(){
		Sucursal sucursalConMasVentas = new Sucursal();
		int cantidad=0;
		Iterator<Establecimiento> itEstablecimiento = this.establecimientos.iterator();
		while(itEstablecimiento.hasNext()){
			Establecimiento establecimiento= itEstablecimiento.next();
			if(establecimiento.sucursalConMasVentas().getCantidadDeVentas() > cantidad){
				cantidad= establecimiento.sucursalConMasVentas().getCantidadDeVentas();
				sucursalConMasVentas=establecimiento.sucursalConMasVentas(); 
			}
		}
		return sucursalConMasVentas;
	}
	
	
}
