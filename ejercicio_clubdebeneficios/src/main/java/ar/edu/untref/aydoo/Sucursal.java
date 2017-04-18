
public class Sucursal extends Establecimiento{

	private int cantidadDeVentas;
	
	public Sucursal(){
		this.cantidadDeVentas=0;
	}

	public int getCantidadDeVentas() {
		return cantidadDeVentas;
	}
	
	public void comprar(){
		this.cantidadDeVentas= this.cantidadDeVentas + 1;
	}
}
