import java.util.ArrayList;
import java.util.List;

//Tipo de Objeto: Entidad

public class Cliente {

	String nombre;
	String apellido;
	String telefono;
	String direccion;
	List<Producto> productos;
	
	public Cliente(String nombre, String apellido, String telefono, String direccion){
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.telefono=telefono;
		this.direccion=direccion;
		this.productos= new ArrayList<Producto>();
	}
	
	public void agregarCompra(Producto producto){
		this.productos.add(producto);
	}
	
		
	public double calcularMontoACobrar(int mes, int anio){
		double montoFinal=0;
		for (Producto producto : productos) {
			if(producto.getAnio() == anio && producto.getMesDeCompra()==mes){
				montoFinal+= producto.getPrecio();
			}
		}
		return montoFinal;
	}
	
	public List<Producto> getProductos(int mes, int anio) {
		List<Producto> productosBuscados = new ArrayList<Producto>();;
		for (Producto producto : productos) {
			if(producto.getAnio() == anio && producto.getMesDeCompra()==mes){
				productosBuscados.add(producto);
			}
		}
		return productosBuscados;
	}

}
