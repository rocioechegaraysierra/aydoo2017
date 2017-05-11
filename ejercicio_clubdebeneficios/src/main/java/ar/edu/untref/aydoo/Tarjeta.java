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
	
	public void agregarBeneficio(Beneficio beneficio){
		this.beneficio = beneficio;
	}
	
	public Beneficio getBeneficio() {
		return this.beneficio;
	}
	
	
}

