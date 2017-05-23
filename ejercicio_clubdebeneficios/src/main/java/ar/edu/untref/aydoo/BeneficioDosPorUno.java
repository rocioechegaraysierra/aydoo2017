package ar.edu.untref.aydoo;

public class BeneficioDosPorUno extends Beneficio {
	
	private double valorMinimoDeBeneficio = 100;
	private double precioPrimerProducto;

	public void agregarProducto(double precio) throws ExcepcionDosPorUno{
		if (precio >= valorMinimoDeBeneficio) {
			this.precioPrimerProducto = precio;
		} else {
			throw new ExcepcionDosPorUno("El precio de "
					+ "cualquiera de los dos productos"
					+ " debe ser mayor o igual a cien.");
		}
	}

	public double aplicarBeneficio (double segundoProducto) {
		double precioFinal = 0;
		if (precioPrimerProducto >= valorMinimoDeBeneficio)  {
			precioFinal = precioPrimerProducto;
		} else if (segundoProducto >= valorMinimoDeBeneficio) {
			precioFinal = segundoProducto;
		}
		return precioFinal;
	}
}


