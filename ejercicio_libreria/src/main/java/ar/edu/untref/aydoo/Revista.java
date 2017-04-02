
public class Revista {

	double precio;
	int cantidadDeEjemplaresEnUnMes;
	boolean suscripcionAnual;
	
	public Revista(double precio, int cantidadDeEjemplaresEnUnMes, boolean suscripcionAnual){
		this.setPrecio(precio, cantidadDeEjemplaresEnUnMes, suscripcionAnual);
		this.cantidadDeEjemplaresEnUnMes=cantidadDeEjemplaresEnUnMes;
		this.suscripcionAnual=suscripcionAnual;
		
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
