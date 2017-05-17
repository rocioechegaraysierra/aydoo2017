package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {
	
	@Test
	public void reporteElClienteRealizoUnaCompraConBeneficioDescuento() throws ExcepcionDescuento{
		
		
		Establecimiento heladeria = new Establecimiento();
		heladeria.setNombre("Verde");
		Sucursal heladeriaFlores= new Sucursal();
		heladeria.agregarSucursal(heladeriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Beneficio descuento = new Beneficio();
		descuento.agregarDatosDelBeneficio(10);
		tarjetaPremium.agregarBeneficio(descuento);
		Cliente lujan= new Cliente(tarjetaPremium);
		Producto helado = new Producto("Medio kilo de helado", 100);
		
		lujan.agregarDatosDeCompra(heladeria, helado, tarjetaPremium);
		
		List<String> detalle= new ArrayList<String>();
		detalle.add(heladeria.getNombre());
		detalle.add(helado.getNombre());
		detalle.add("100.0");
		detalle.add("90.0");
		
		
		Assert.assertEquals(detalle, lujan.imprimirReporte());
		
	}
	

}
