package ar.edu.untref.aydoo;


public class Sucursal extends Establecimiento{
	
	private int cantidadDeVentas;
	
	public Sucursal(){
		this.cantidadDeVentas = 0;
	}
	
	public int getCantidadDeVentas() {
		return cantidadDeVentas;
	}
	
	public void comprar(Establecimiento establecimiento, Cliente cliente, Tarjeta tarjeta, Producto producto){
		this.cantidadDeVentas += 1;
				
	}
}
