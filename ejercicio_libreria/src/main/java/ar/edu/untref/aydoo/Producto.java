
//Tipo de Objeto: Value Object

public abstract class Producto {

	double precio;
	int anio;
	int mesDeCompra;
	String nombre;

	public abstract double getPrecio();

	public int getAnio() {
		return anio;
	}

	public int getMesDeCompra() {
		return mesDeCompra;
	}

	public String getNombre() {
		return nombre;
	}
	
}
