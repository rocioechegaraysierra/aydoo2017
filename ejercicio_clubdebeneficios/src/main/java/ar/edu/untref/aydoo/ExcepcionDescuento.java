package ar.edu.untref.aydoo;


public class ExcepcionDescuento extends Exception {
	public ExcepcionDescuento (String elPorcentajeDebeSerMayorA5) {
		super(elPorcentajeDebeSerMayorA5);
	}
}

