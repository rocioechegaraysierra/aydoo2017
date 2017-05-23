package ar.edu.untref.aydoo;


public class Tarjeta {

	private Beneficio beneficio;
	private CategoriaDeLaTarjeta categoria;

	public Tarjeta(CategoriaDeLaTarjeta categoria){
		this.beneficio = null;
		this.categoria = categoria;
	}
	public CategoriaDeLaTarjeta getCategoria() {
		return categoria;
	}
	public void agregarBeneficio(BeneficioDescuento descuento){
		this.beneficio = descuento;
	}
	public Beneficio getBeneficio() {
		return this.beneficio;
	}
	public void agregarBeneficio(BeneficioDosPorUno descuento) {
		this.beneficio = descuento;
	}

}

