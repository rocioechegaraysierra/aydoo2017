
//Tipo de Objeto: Entidad

public class Libro extends Producto{
	
	String autor;

	public Libro(String nombre, String autor, double precio, int mes, int anio){
		this.autor=autor;
		this.nombre=nombre;
		this.precio = precio;
		this.mesDeCompra=mes;
		this.anio=anio;
	}


	public String getAutor() {
		return autor;
	}


	@Override
	public double getPrecio() {
		return this.precio;
	}

}
