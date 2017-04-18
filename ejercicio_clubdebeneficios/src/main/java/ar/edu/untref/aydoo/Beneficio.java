
public class Beneficio {
	
private int porcentaje;

	public void agregarDatosDelBeneficio(int porcentaje) throws ExcepcionDescuento{
		if(porcentaje > 5){
			this.porcentaje=porcentaje;
		}else{
			throw new ExcepcionDescuento("El porcentaje debe ser mayor al 5%");
		}
	}
	
	public double aplicarBeneficio(double precio){
		return precio - ((precio * this.porcentaje)/100);
	}
	
}
