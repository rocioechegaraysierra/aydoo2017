package ar.edu.untref.aydoo;


import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private List<String> establecimientos;
	private List<String> productos;
	private List<Double> precios;
	private List<Double> preciosConBeneficios;
	private Tarjeta tarjeta;
	private String mail;



	public Cliente(Tarjeta tarjeta, String mail){
		this.establecimientos = new ArrayList<String>();
		this.productos = new ArrayList<String>();
		this.precios = new ArrayList<Double>();
		this.preciosConBeneficios = new ArrayList<Double>();
		this.tarjeta = tarjeta;
		this.mail = mail;
	}

	public void agregarDatosDeCompra(Establecimiento establecimiento, Producto producto, Tarjeta tarjeta){
			this.establecimientos.add(establecimiento.getNombre());
			this.productos.add(producto.getNombre());
			this.precios.add(producto.getPrecio());
			this.preciosConBeneficios.add(tarjeta.getBeneficio().aplicarBeneficio(producto.getPrecio()));

	}

	public List<String> imprimirReporte() {
		List<String> detalles = new ArrayList<String>();
		for (int i = 0; i < establecimientos.size(); i++) {
			detalles.add(establecimientos.get(i));
			detalles.add(productos.get(i));
			detalles.add(String.valueOf(precios.get(i)));
			detalles.add(String.valueOf(preciosConBeneficios.get(i)));
		}
		return detalles;
	}

	public boolean isRealizoCompras() {
		return !(this.establecimientos.isEmpty()
				&& this.productos.isEmpty()
				&& this.precios.isEmpty()
				&& this.preciosConBeneficios.isEmpty());
	}

	public String getMail() {
		return mail;
	}


	public CategoriaDeLaTarjeta getTarjeta() {
		return tarjeta.getCategoria();
	}

}
