
public class Producto {

	private double precio;
	private String nombre;
	
	public Producto(String nombre, double precio){
		this.nombre=nombre;
		this.precio=precio;
	}

	public double getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
