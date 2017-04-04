
public class Revista {

	String nombre;
	double precio;
	int cantidadDeEjemplaresEnUnMes;
	boolean suscripcionAnual;
	int mesDeCompra;
	
	public Revista(String nombre, double precio, int cantidadDeEjemplaresEnUnMes, boolean suscripcionAnual, int mes){
		this.nombre=nombre;
		this.setPrecio(precio, cantidadDeEjemplaresEnUnMes, suscripcionAnual);
		this.cantidadDeEjemplaresEnUnMes=cantidadDeEjemplaresEnUnMes;
		this.suscripcionAnual=suscripcionAnual;
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
	
	public void setPrecio(double precio, int cantidadDeEjemplaresEnUnMes, boolean suscripcionAnual) {
		if(suscripcionAnual == true){
			double precioConDescuento= precio-(precio*0.20);
			this.precio= ( precioConDescuento* cantidadDeEjemplaresEnUnMes);
		}else{
			this.precio=precio*cantidadDeEjemplaresEnUnMes;
		}
	}

	
	
}
