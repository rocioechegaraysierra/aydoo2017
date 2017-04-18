
import java.util.ArrayList;
import java.util.List;


public class Cliente {

	List<Establecimiento> establecimientos;
	List<Producto> productos;
	List<Double> precios;
	List<Double> preciosConBeneficios;
	private Tarjeta tarjeta;
	
	public Cliente(Tarjeta tarjeta){
		this.establecimientos= new ArrayList<Establecimiento>();
		this.productos= new ArrayList<Producto>();
		this.precios= new ArrayList<Double>();
		this.preciosConBeneficios= new ArrayList<Double>();
		this.tarjeta= tarjeta;
	}
	
	public void agregarDatosDeCompra(Establecimiento establecimiento, Producto producto, Tarjeta tarjeta){
			this.establecimientos.add(establecimiento);
			this.productos.add(producto);
			this.precios.add(producto.getPrecio());
			this.preciosConBeneficios.add(tarjeta.getBeneficio().aplicarBeneficio(producto.getPrecio()));
	}
	
	
	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public boolean realizoCompras(){
		return !(this.establecimientos.size()== 0 && this.precios.size() == 0 &&
				this.preciosConBeneficios.size()==0 && this.productos.size() ==0);
	}
	
	
	
}
