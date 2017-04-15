
//Tipo de Objeto: Entidad

public class Periodico extends Suscripcion {

	public Periodico(String nombre, double precio, int cantidadDeEjemplaresEnUnMes, boolean suscripcionAnual, int mes, int anio){
		this.nombre=nombre;
		this.precio=precio;
		this.cantidadDeEjemplaresEnUnMes=cantidadDeEjemplaresEnUnMes;
		this.suscripcionAnual=suscripcionAnual;
		this.mesDeCompra=mes;
		this.anio=anio;
	}
	
}
