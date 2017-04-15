
//Tipo de Objeto: deberia ser Value Object

public class Suscripcion extends Producto{

	int cantidadDeEjemplaresEnUnMes;
	boolean suscripcionAnual;
	
	@Override
	public double getPrecio() {
		double precioFinal=0;
		if(this.suscripcionAnual == true){
			double precioConDescuento= this.precio-(this.precio*0.20);
			precioFinal= ( precioConDescuento* cantidadDeEjemplaresEnUnMes);
		}else{
			precioFinal=this.precio*cantidadDeEjemplaresEnUnMes;
		}
		return precioFinal;
	}
	
	public boolean isSuscripcionAnual() {
		return suscripcionAnual;
	}
	
	
}
