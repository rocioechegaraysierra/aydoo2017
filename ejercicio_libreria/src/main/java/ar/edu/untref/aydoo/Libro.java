
public class Libro {

	String nombre;
	String autor;
	double precio;
	int mesDeCompra;
	
	public Libro(String nombre, String autor, double precio, int mes){
		this.autor=autor;
		this.nombre=nombre;
		this.precio = precio;
		this.mesDeCompra=mes;
	}

	public String getNombre() {
		return nombre;
	}

	public String getAutor() {
		return autor;
	}

	public int getMesDeCompra() {
		return mesDeCompra;
	}

	public double getPrecio() {
		return precio;
	}

	
	
	
}
