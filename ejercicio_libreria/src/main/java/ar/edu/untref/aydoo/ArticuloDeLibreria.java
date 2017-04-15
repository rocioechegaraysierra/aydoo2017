//Tipo de Objeto: Entidad

public class ArticuloDeLibreria extends Producto{

	
	public ArticuloDeLibreria(String nombre, double precio, int mes, int anio){
		this.nombre=nombre;
		this.precio=precio;
		this.mesDeCompra=mes;
		this.anio=anio;
	}

	
	@Override
	public double getPrecio(){
		double precio=0;
		double porcentaje= 0;
		porcentaje= this.precio*(0.21);
		precio= (porcentaje + this.precio);
		return precio;
		
	}
}
