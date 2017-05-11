package ar.edu.untref.aydoo;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class IntegracionTest {
	
	@Test
	public void establecimientoConMasBeneficiosSinCompras(){
		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento heladeria = new Establecimiento();
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		heladeria.agregarSucursal(heladeriaFlores);
		
		Assert.assertEquals(null, club.establecimientoConMasBeneficios());
		
	}

	@Test
	public void establecimientoConMasBeneficiosUnSoloEstablecimientoConMasBeneficios(){
		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento heladeria = new Establecimiento();
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Cliente lujan= new Cliente(tarjetaPremium);
		Producto helado = new Producto("Medio kilo de helado", 80);
		heladeria.agregarSucursal(heladeriaFlores);
		
		club.compra(heladeria, heladeriaFlores, lujan, helado);
		
			
		Assert.assertEquals(heladeria, club.establecimientoConMasBeneficios());
		
	}
	
	@Test
	public void establecimientoConMasBeneficiosDosEstablecimientosYUnoSoloRealizoMasBeneficios(){
		
		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento floreria = new Establecimiento();
		club.agregarEstablecimiento(floreria);
		Sucursal floreriaFlores= new Sucursal();
		floreria.agregarSucursal(floreriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Cliente lujan= new Cliente(tarjetaPremium);
		Producto rosa = new Producto("Rosas rojas", 80);
		Establecimiento heladeria = new Establecimiento();
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		heladeria.agregarSucursal(heladeriaFlores);
		
		club.compra(floreria, floreriaFlores, lujan, rosa);
					
		Assert.assertEquals(floreria, club.establecimientoConMasBeneficios());
		
	}
	
	
	@Test
	public void  establecimientoConMasBeneficios3EstablecimientosConUnaSolaSucursalTodosRealizaronBeneficios(){
		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento floreria = new Establecimiento();
		club.agregarEstablecimiento(floreria);
		Sucursal floreriaFlores= new Sucursal();
		floreria.agregarSucursal(floreriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Cliente lujan= new Cliente(tarjetaPremium);
		Producto rosa = new Producto("Rosas rojas", 80);
		Producto margarita = new Producto("Margaritas amarillas", 80);
		Producto malbon = new Producto("Malbon verde", 80);
		
		Establecimiento heladeria = new Establecimiento();
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		heladeria.agregarSucursal(heladeriaFlores);
		Cliente maria= new Cliente(tarjetaPremium);
		Producto helado = new Producto("Medio kilo de helado", 80);
		Establecimiento carniceria = new Establecimiento();
		club.agregarEstablecimiento(carniceria);
		Sucursal carniceriaFlores= new Sucursal();
		carniceria.agregarSucursal(carniceriaFlores);
		Tarjeta tarjetaLucas= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Cliente lucas= new Cliente(tarjetaLucas);
		Producto carne = new Producto("Medio kilo de carne picada", 80);
		
		club.compra(carniceria, carniceriaFlores, lucas, carne);
		club.compra(heladeria, heladeriaFlores, maria, helado);
		club.compra(floreria, floreriaFlores, lujan, margarita);
		club.compra(floreria, floreriaFlores, lujan, rosa);
		club.compra(floreria, floreriaFlores, lujan, malbon);
		
		Assert.assertEquals(floreria, club.establecimientoConMasBeneficios());
		
	}
	
	@Test
	public void establecimientoConMasBeneficios3EstablecimientosConVariasSucursalesTodosRealizaronBeneficios(){
		ClubDeBeneficios club = new ClubDeBeneficios();
		
		Establecimiento floreria = new Establecimiento();
		club.agregarEstablecimiento(floreria);
		Sucursal floreriaFlores= new Sucursal();
		Sucursal floreriaRosa= new Sucursal();
		floreria.agregarSucursal(floreriaRosa);
		floreria.agregarSucursal(floreriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Cliente maria= new Cliente(tarjetaPremium);
		Producto petunia = new Producto("Petunia", 80);
		Producto rosa = new Producto("Rosas rojas", 80);
		Producto margarita = new Producto("Margaritas amarillas", 80);
		Producto malbon = new Producto("Malbon verde", 80);
		Establecimiento heladeria = new Establecimiento();
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		heladeria.agregarSucursal(heladeriaFlores);
		Cliente lucia= new Cliente(tarjetaPremium);
		Producto cuarto = new Producto("Un cuarto de helado", 40);
		
		Sucursal heladeriaCaballito = new Sucursal();
		heladeria.agregarSucursal(heladeriaCaballito);
		Cliente alicia= new Cliente(tarjetaPremium);
		Producto medio = new Producto("Medio kilo de helado", 40);
		Establecimiento carniceria = new Establecimiento();
		club.agregarEstablecimiento(carniceria);
		Sucursal carniceriaFlores= new Sucursal();
		carniceria.agregarSucursal(carniceriaFlores);
		Cliente pedro= new Cliente(tarjetaPremium);
		Producto asado = new Producto("Asado", 240);
		Sucursal carniceriaFloresta = new Sucursal();
		carniceria.agregarSucursal(carniceriaFloresta);
		Cliente mario= new Cliente(tarjetaPremium);
		Producto matambre = new Producto("Matambre", 40);
		Producto lomo = new Producto("Matambre", 340);
		
		club.compra(heladeria, heladeriaFlores, lucia, cuarto);
		club.compra(heladeria, heladeriaCaballito, alicia, medio);
		club.compra(carniceria, carniceriaFlores, pedro, asado);
		club.compra(carniceria, carniceriaFloresta, mario, matambre);
		club.compra(carniceria, carniceriaFloresta, mario, lomo);
		club.compra(floreria, floreriaFlores, maria, petunia);
		club.compra(floreria, floreriaRosa, maria, rosa);
		club.compra(floreria, floreriaRosa, maria, margarita);
		club.compra(floreria, floreriaRosa, maria, malbon);
		
		Assert.assertEquals(floreria, club.establecimientoConMasBeneficios());
		
	}
	
	@Test
	public void sucursalQueMasVendioConUnaSolaSucursal(){
		ClubDeBeneficios club = new ClubDeBeneficios();
		
		Establecimiento floreria = new Establecimiento();
		club.agregarEstablecimiento(floreria);
		Sucursal floreriaFlores= new Sucursal();
		floreria.agregarSucursal(floreriaFlores);
		Tarjeta tarjetaMaria= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Cliente maria= new Cliente(tarjetaMaria);
		Producto petunia = new Producto("Petunia", 80);
		Producto rosa = new Producto("Rosas rojas", 80);
		Producto margarita = new Producto("Margaritas amarillas", 80);
		
		club.compra(floreria, floreriaFlores, maria, petunia);
		club.compra(floreria, floreriaFlores, maria, rosa);
		club.compra(floreria, floreriaFlores, maria, margarita);
		
		
		Assert.assertEquals(floreriaFlores, club.sucursalQueMasVendio());
		
	}
	
	@Test
	public void sucursalQueMasVendioConMasDeUnaSucursal(){
		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento floreria = new Establecimiento();
		club.agregarEstablecimiento(floreria);
		Sucursal floreriaFlores= new Sucursal();
		Sucursal floreriaRosa= new Sucursal();
		floreria.agregarSucursal(floreriaRosa);
		floreria.agregarSucursal(floreriaFlores);
		Tarjeta tarjetaMaria= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Cliente maria= new Cliente(tarjetaMaria);
		Producto petunia = new Producto("Petunia", 80);
		Producto rosa = new Producto("Rosas rojas", 80);
		Producto margarita = new Producto("Margaritas amarillas", 80);
		Producto malbon = new Producto("Malbon verde", 80);
		
		club.compra(floreria, floreriaFlores, maria, rosa);
		club.compra(floreria, floreriaRosa, maria, petunia);
		club.compra(floreria, floreriaRosa, maria, margarita);
		club.compra(floreria, floreriaRosa, maria, malbon);
		
		Assert.assertEquals(floreriaRosa, club.sucursalQueMasVendio());
		
	}
	
	@Test
	public void sucursalQueMasVendioConTresEstablecimientosConUnaSolaSucursal(){
		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento floreria = new Establecimiento();
		club.agregarEstablecimiento(floreria);
		Sucursal floreriaFlores= new Sucursal();
		floreria.agregarSucursal(floreriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Cliente maria= new Cliente(tarjetaPremium);
		Producto petunia = new Producto("Petunia", 80);
		Producto rosa = new Producto("Rosas rojas", 80);
		Producto margarita = new Producto("Margaritas amarillas", 80);
		Establecimiento heladeria = new Establecimiento();
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		heladeria.agregarSucursal(heladeriaFlores);
		Cliente lucas= new Cliente(tarjetaPremium);
		Producto helado = new Producto("Medio kilo de helado", 80);
		Establecimiento carniceria = new Establecimiento();
		club.agregarEstablecimiento(carniceria);
		Sucursal carniceriaFlores= new Sucursal();
		carniceria.agregarSucursal(carniceriaFlores);
		Cliente martin= new Cliente(tarjetaPremium);
		Producto asado = new Producto("Asado", 80);
		
		club.compra(heladeria, heladeriaFlores, lucas, helado);
		club.compra(carniceria, carniceriaFlores, martin, asado);
		club.compra(floreria, floreriaFlores, maria, margarita);
		club.compra(floreria, floreriaFlores, maria, rosa);
		club.compra(floreria, floreriaFlores, maria, petunia);
		Assert.assertEquals(floreriaFlores, club.sucursalQueMasVendio());
		
	}
	
	@Test
	public void sucursalQueMasVendioConTresEstablecimientosConVariasSucursalesTodosRealizaronBeneficios(){
		ClubDeBeneficios club = new ClubDeBeneficios();
		
		Establecimiento floreria = new Establecimiento();
		club.agregarEstablecimiento(floreria);
		Sucursal floreriaFlores= new Sucursal();
		Sucursal floreriaRosa= new Sucursal();
		floreria.agregarSucursal(floreriaRosa);
		floreria.agregarSucursal(floreriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Cliente maria= new Cliente(tarjetaPremium);
		Producto petunia = new Producto("Petunia", 80);
		Producto rosa = new Producto("Rosas rojas", 80);
		Producto margarita = new Producto("Margaritas amarillas", 80);
		Producto malbon = new Producto("Malbon verde", 80);
		Establecimiento heladeria = new Establecimiento();
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		heladeria.agregarSucursal(heladeriaFlores);
		Cliente lucas= new Cliente(tarjetaPremium);
		Producto cono = new Producto("Cono de helado", 80);
		Sucursal heladeriaCaballito = new Sucursal();
		heladeria.agregarSucursal(heladeriaCaballito);
		Cliente mario= new Cliente(tarjetaPremium);
		Producto kilo = new Producto("Kilo de Helado", 80);
		Establecimiento carniceria = new Establecimiento();
		club.agregarEstablecimiento(carniceria);
		Sucursal carniceriaFlores= new Sucursal();
		carniceria.agregarSucursal(carniceriaFlores);
		Cliente juan= new Cliente(tarjetaPremium);
		Producto asado = new Producto("Asado", 80);
		Sucursal carniceriaFloresta = new Sucursal();
		carniceria.agregarSucursal(carniceriaFloresta);
		Cliente mariana= new Cliente(tarjetaPremium);
		Producto lomo = new Producto("Lomo", 80);
		Producto matambre = new Producto("Matambre", 80);
		
		club.compra(heladeria, heladeriaCaballito, mario, kilo);		
		club.compra(heladeria, heladeriaFlores, lucas, cono);
		club.compra(carniceria, carniceriaFlores, juan, asado);
		club.compra(carniceria, carniceriaFloresta, mariana, lomo);
		club.compra(carniceria, carniceriaFloresta, mariana, matambre );
		club.compra(floreria, floreriaFlores, maria, rosa);
		club.compra(floreria, floreriaRosa, maria, petunia);
		club.compra(floreria, floreriaRosa, maria, margarita);
		club.compra(floreria, floreriaRosa, maria, malbon);
		
		Assert.assertEquals(floreriaRosa, club.sucursalQueMasVendio());
		
	}
	

	@Test
	public void reporteElClienteRealizoUnaCompraConBeneficioDescuento() throws ExcepcionDescuento{
		
		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento heladeria = new Establecimiento();
		heladeria.setNombre("Verde");
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		heladeria.agregarSucursal(heladeriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Beneficio descuento = new Beneficio();
		descuento.agregarDatosDelBeneficio(10);
		tarjetaPremium.agregarBeneficio(descuento);
		Cliente lujan= new Cliente(tarjetaPremium);
		club.agregarCliente(lujan);
		Producto helado = new Producto("Medio kilo de helado", 100);
		
		club.compra(heladeria, heladeriaFlores, lujan, helado);
		
		List<String> detalle= new ArrayList<String>();
		detalle.add(heladeria.getNombre());
		detalle.add(helado.getNombre());
		detalle.add("100.0");
		detalle.add("90.0");
		
		
		Assert.assertEquals(detalle, club.reporteDeClientes());
		
	}
	

	@Test
	public void reporteDeDosClientesQueRealizaronUnaCompra() throws ExcepcionDescuento{
		
		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento heladeria = new Establecimiento();
		heladeria.setNombre("Verde");
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		heladeria.agregarSucursal(heladeriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Beneficio descuento = new Beneficio();
		descuento.agregarDatosDelBeneficio(10);
		tarjetaPremium.agregarBeneficio(descuento);
		Cliente lujan= new Cliente(tarjetaPremium);
		club.agregarCliente(lujan);
		Cliente maria= new Cliente(tarjetaPremium);
		club.agregarCliente(maria);
		Producto cono = new Producto("Cono", 100);
		Producto helado = new Producto("Medio kilo de helado", 100);
		
		club.compra(heladeria, heladeriaFlores, lujan, helado);
		club.compra(heladeria, heladeriaFlores, maria, cono);
		
		List<String> detalle= new ArrayList<String>();
		detalle.add(heladeria.getNombre());
		detalle.add(helado.getNombre());
		detalle.add("100.0");
		detalle.add("90.0");
		detalle.add(heladeria.getNombre());
		detalle.add(cono.getNombre());
		detalle.add("100.0");
		detalle.add("90.0");
		
		
		Assert.assertEquals(detalle, club.reporteDeClientes());
		
	}
		
	
	@Test
	public void reporteDosClientesYSoloUnoRealizaUnaCompra() throws ExcepcionDescuento{
		
		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento heladeria = new Establecimiento();
		heladeria.setNombre("Verde");
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		heladeria.agregarSucursal(heladeriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Beneficio descuento = new Beneficio();
		descuento.agregarDatosDelBeneficio(10);
		tarjetaPremium.agregarBeneficio(descuento);
		Cliente lujan= new Cliente(tarjetaPremium);
		club.agregarCliente(lujan);
		Cliente maria= new Cliente(tarjetaPremium);
		club.agregarCliente(maria);
		Producto helado = new Producto("Medio kilo de helado", 100);
		
		club.compra(heladeria, heladeriaFlores, lujan, helado);
		
		
		List<String> detalle= new ArrayList<String>();
		detalle.add(heladeria.getNombre());
		detalle.add(helado.getNombre());
		detalle.add("100.0");
		detalle.add("90.0");
	
				
		Assert.assertEquals(detalle, club.reporteDeClientes());
		
	
	}

	
	@Test (expected = ExcepcionDescuento.class)
	public void beneficioDeDescuentoConPorcentajeMenorACinco() throws ExcepcionDescuento{
		
		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento heladeria = new Establecimiento();
		heladeria.setNombre("Verde");
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		heladeria.agregarSucursal(heladeriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Beneficio descuento = new Beneficio();
		descuento.agregarDatosDelBeneficio(2);
		tarjetaPremium.agregarBeneficio(descuento);
		Cliente lujan= new Cliente(tarjetaPremium);
		club.agregarCliente(lujan);
		Cliente maria= new Cliente(tarjetaPremium);
		club.agregarCliente(maria);
		Producto helado = new Producto("Medio kilo de helado", 100);
		
		club.compra(heladeria, heladeriaFlores, lujan, helado);
		
		
		List<String> detalle= new ArrayList<String>();
		detalle.add(heladeria.getNombre());
		detalle.add(helado.getNombre());
		detalle.add("100.0");
		detalle.add("90.0");
	
				
		Assert.assertEquals(detalle, club.reporteDeClientes());
		
	
	}
}
