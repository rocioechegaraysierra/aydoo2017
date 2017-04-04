
public class ArticuloDeLibreria {

	String nombre;
	double precio;
	int mesDeCompra;
	
	public ArticuloDeLibreria(String nombre, double precio, int mes){
		this.nombre=nombre;
		this.precio = precio*(0.21)+ precio;
		this.mesDeCompra=mes;
	}

	public String getNombre() {
		return nombre;
	}

	public int getMesDeCompra() {
		return mesDeCompra;
	}

	public double getPrecio() {
		return precio;
	}

	
	
	
	
	
}
