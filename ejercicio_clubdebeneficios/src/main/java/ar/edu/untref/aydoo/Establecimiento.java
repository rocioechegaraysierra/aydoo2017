import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Establecimiento {

	public List <Producto> productos;
	private List<Sucursal> sucursales;
	private String nombre;
	

	public Establecimiento(){
		
		this.productos= new ArrayList<Producto>();
		this.sucursales= new ArrayList<Sucursal>();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}


	public int getCantidadTotalDeVentasDelEstablecimiento() {
		int cantidadTotal=0;
		Iterator<Sucursal> itSucursal = this.sucursales.iterator();
		while(itSucursal.hasNext()){
			Sucursal sucursal = itSucursal.next();
			cantidadTotal+= sucursal.getCantidadDeVentas();
		}
		return cantidadTotal;
	}

	public List<Producto> getProductos() {
		return productos;
	}
	
	public void agregarSucursal(Sucursal sucursal){
		this.sucursales.add(sucursal);
	}
	
	public void comprar(Sucursal sucursalDeCompra){
		Iterator<Sucursal> itSucursal = this.sucursales.iterator();
		while(itSucursal.hasNext()){
			Sucursal sucursal = itSucursal.next();
			if(sucursal == sucursalDeCompra ){
				sucursal.comprar();
			}
			
		}
	}
	
	public Sucursal sucursalConMasVentas(){
		Sucursal sucursalConMasVentas = new Sucursal();
		int cantidadDeVentas=0;
		Iterator<Sucursal> itSucursal = this.sucursales.iterator();
		while(itSucursal.hasNext()){
			Sucursal sucursal = itSucursal.next();
			if(sucursal.getCantidadDeVentas() > cantidadDeVentas ){
				sucursalConMasVentas=sucursal;
				cantidadDeVentas= sucursal.getCantidadDeVentas();
			}
			
		}
		return sucursalConMasVentas;
	}
	
	
}
