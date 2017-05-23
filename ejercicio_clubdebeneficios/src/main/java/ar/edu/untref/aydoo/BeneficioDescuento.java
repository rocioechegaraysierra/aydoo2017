package ar.edu.untref.aydoo;

public class BeneficioDescuento extends Beneficio{
	
	private int porcentaje;
	private int porcentajeMinimo = 5;
	
	public void agregarDatosDelBeneficio(final int porcentaje)
			throws ExcepcionDescuento {
		if (porcentaje > porcentajeMinimo) {
			this.porcentaje = porcentaje;
		} else {
			throw new ExcepcionDescuento("El porcentaje"
					+ " debe ser mayor al 5%");
		}
	}

	public double aplicarBeneficio(double precio){
		return precio - ((precio * this.porcentaje)/100);
	}

}
