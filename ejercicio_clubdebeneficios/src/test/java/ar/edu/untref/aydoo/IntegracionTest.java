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
	public void establecimientoConMasBeneficiosUnSoloEstablecimientoConMasBeneficios() throws ExcepcionDescuento{
		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento heladeria = new Establecimiento();
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Beneficio descuento = new Beneficio();
		descuento.agregarDatosDelBeneficio(10);
		tarjetaPremium.agregarBeneficio(descuento);
		Cliente lujan= new Cliente(tarjetaPremium, "lujan@gmail.com");
		Producto helado = new Producto("Medio kilo de helado", 80);
		heladeria.agregarSucursal(heladeriaFlores);
		
		heladeriaFlores.comprar(heladeria,lujan, tarjetaPremium, helado);
		
			
		Assert.assertEquals(heladeria, club.establecimientoConMasBeneficios());
		
	}
	
	
	@Test
	public void establecimientoConMasBeneficiosDosEstablecimientosYUnoSoloRealizoMasBeneficios() throws ExcepcionDescuento{
		
		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento floreria = new Establecimiento();
		club.agregarEstablecimiento(floreria);
		Sucursal floreriaFlores= new Sucursal();
		floreria.agregarSucursal(floreriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Beneficio descuento = new Beneficio();
		descuento.agregarDatosDelBeneficio(10);
		tarjetaPremium.agregarBeneficio(descuento);
		Cliente lujan= new Cliente(tarjetaPremium, "lujan@gmail.com");
		Producto rosa = new Producto("Rosas rojas", 80);
		Establecimiento heladeria = new Establecimiento();
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		heladeria.agregarSucursal(heladeriaFlores);
		
		heladeriaFlores.comprar(floreria, lujan, tarjetaPremium, rosa);
					
		Assert.assertEquals(heladeria, club.establecimientoConMasBeneficios());
		
	}
	
	
	@Test
	public void  establecimientoConMasBeneficios3EstablecimientosConUnaSolaSucursalTodosRealizaronBeneficios() throws ExcepcionDescuento{
		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento floreria = new Establecimiento();
		club.agregarEstablecimiento(floreria);
		Sucursal floreriaFlores= new Sucursal();
		floreria.agregarSucursal(floreriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Beneficio descuento = new Beneficio();
		descuento.agregarDatosDelBeneficio(10);
		tarjetaPremium.agregarBeneficio(descuento);
		Cliente lujan= new Cliente(tarjetaPremium, "lujan@gmail.com");
		Producto rosa = new Producto("Rosas rojas", 80);
		Producto margarita = new Producto("Margaritas amarillas", 80);
		Producto malbon = new Producto("Malbon verde", 80);
		
		Establecimiento heladeria = new Establecimiento();
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		heladeria.agregarSucursal(heladeriaFlores);
		Cliente maria= new Cliente(tarjetaPremium, "maria@gmail.com");
		Producto helado = new Producto("Medio kilo de helado", 80);
		Establecimiento carniceria = new Establecimiento();
		club.agregarEstablecimiento(carniceria);
		Sucursal carniceriaFlores= new Sucursal();
		carniceria.agregarSucursal(carniceriaFlores);
		Cliente lucas= new Cliente(tarjetaPremium, "lucas@gmail.com");
		Producto carne = new Producto("Medio kilo de carne picada", 80);
		
		carniceriaFlores.comprar(carniceria, lucas, tarjetaPremium, carne);
		heladeriaFlores.comprar(heladeria, maria, tarjetaPremium, helado);
		floreriaFlores.comprar(floreria, lujan, tarjetaPremium, margarita);
		floreriaFlores.comprar(floreria, lujan, tarjetaPremium, rosa);
		floreriaFlores.comprar(floreria, lujan, tarjetaPremium, malbon);
		
		Assert.assertEquals(floreria, club.establecimientoConMasBeneficios());
		
	}
	
	@Test
	public void establecimientoConMasBeneficios3EstablecimientosConVariasSucursalesTodosRealizaronBeneficios() throws ExcepcionDescuento{
		ClubDeBeneficios club = new ClubDeBeneficios();
		
		Establecimiento floreria = new Establecimiento();
		club.agregarEstablecimiento(floreria);
		Sucursal floreriaFlores= new Sucursal();
		Sucursal floreriaRosa= new Sucursal();
		floreria.agregarSucursal(floreriaRosa);
		floreria.agregarSucursal(floreriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Beneficio descuento = new Beneficio();
		descuento.agregarDatosDelBeneficio(10);
		tarjetaPremium.agregarBeneficio(descuento);
		Cliente maria= new Cliente(tarjetaPremium, "maria@gmail.com");
		Producto petunia = new Producto("Petunia", 80);
		Producto rosa = new Producto("Rosas rojas", 80);
		Producto margarita = new Producto("Margaritas amarillas", 80);
		Producto malbon = new Producto("Malbon verde", 80);
		Establecimiento heladeria = new Establecimiento();
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		heladeria.agregarSucursal(heladeriaFlores);
		Cliente lucia= new Cliente(tarjetaPremium, "lucia@gmail.com");
		Producto cuarto = new Producto("Un cuarto de helado", 40);
		
		Sucursal heladeriaCaballito = new Sucursal();
		heladeria.agregarSucursal(heladeriaCaballito);
		Cliente alicia= new Cliente(tarjetaPremium, "alicia@gmail.com");
		Producto medio = new Producto("Medio kilo de helado", 40);
		Establecimiento carniceria = new Establecimiento();
		club.agregarEstablecimiento(carniceria);
		Sucursal carniceriaFlores= new Sucursal();
		carniceria.agregarSucursal(carniceriaFlores);
		Cliente pedro= new Cliente(tarjetaPremium, "pedro@gmail.com");
		Producto asado = new Producto("Asado", 240);
		Sucursal carniceriaFloresta = new Sucursal();
		carniceria.agregarSucursal(carniceriaFloresta);
		Cliente mario= new Cliente(tarjetaPremium, "mario@gmail.com");
		Producto matambre = new Producto("Matambre", 40);
		Producto lomo = new Producto("Matambre", 340);
		
		heladeriaFlores.comprar(heladeria, lucia, tarjetaPremium, cuarto);
		heladeriaCaballito.comprar(heladeria, alicia, tarjetaPremium, medio);
		carniceriaFlores.comprar(carniceria, pedro, tarjetaPremium, asado);
		carniceriaFloresta.comprar(carniceria, mario, tarjetaPremium, matambre);
		carniceriaFloresta.comprar(carniceria, mario, tarjetaPremium, lomo);
		floreriaFlores.comprar(floreria, maria, tarjetaPremium, petunia);
		floreriaRosa.comprar(floreria, maria, tarjetaPremium, rosa);
		floreriaRosa.comprar(floreria, maria, tarjetaPremium, margarita);
		floreriaRosa.comprar(floreria, maria, tarjetaPremium, malbon);
		
		Assert.assertEquals(floreria, club.establecimientoConMasBeneficios());
		
	}
	
	@Test
	public void sucursalQueMasVendioConUnaSolaSucursal() throws ExcepcionDescuento{
		ClubDeBeneficios club = new ClubDeBeneficios();
		
		Establecimiento floreria = new Establecimiento();
		club.agregarEstablecimiento(floreria);
		Sucursal floreriaFlores= new Sucursal();
		floreria.agregarSucursal(floreriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Beneficio descuento = new Beneficio();
		descuento.agregarDatosDelBeneficio(10);
		tarjetaPremium.agregarBeneficio(descuento);
		Cliente maria= new Cliente(tarjetaPremium, "maria@gmail.com");
		Producto petunia = new Producto("Petunia", 80);
		Producto rosa = new Producto("Rosas rojas", 80);
		Producto margarita = new Producto("Margaritas amarillas", 80);
		
		floreriaFlores.comprar(floreria, maria, tarjetaPremium, petunia);
		floreriaFlores.comprar(floreria, maria, tarjetaPremium, rosa);
		floreriaFlores.comprar(floreria, maria, tarjetaPremium, margarita);
		
		
		Assert.assertEquals(floreriaFlores, club.sucursalQueMasVendio());
		
	}
	
	@Test
	public void sucursalQueMasVendioConMasDeUnaSucursal() throws ExcepcionDescuento{
		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento floreria = new Establecimiento();
		club.agregarEstablecimiento(floreria);
		Sucursal floreriaFlores= new Sucursal();
		Sucursal floreriaRosa= new Sucursal();
		floreria.agregarSucursal(floreriaRosa);
		floreria.agregarSucursal(floreriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Beneficio descuento = new Beneficio();
		descuento.agregarDatosDelBeneficio(10);
		tarjetaPremium.agregarBeneficio(descuento);
		Cliente maria= new Cliente(tarjetaPremium, "maria@gmail.com");
		Producto petunia = new Producto("Petunia", 80);
		Producto rosa = new Producto("Rosas rojas", 80);
		Producto margarita = new Producto("Margaritas amarillas", 80);
		Producto malbon = new Producto("Malbon verde", 80);
		
		floreriaFlores.comprar(floreria, maria, tarjetaPremium, rosa);
		floreriaRosa.comprar(floreria, maria, tarjetaPremium, petunia);
		floreriaRosa.comprar(floreria, maria, tarjetaPremium, margarita);
		floreriaRosa.comprar(floreria, maria, tarjetaPremium,malbon);
		
		Assert.assertEquals(floreriaRosa, club.sucursalQueMasVendio());
		
	}
	
	@Test
	public void sucursalQueMasVendioConTresEstablecimientosConUnaSolaSucursal() throws ExcepcionDescuento{
		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento floreria = new Establecimiento();
		club.agregarEstablecimiento(floreria);
		Sucursal floreriaFlores= new Sucursal();
		floreria.agregarSucursal(floreriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Beneficio descuento = new Beneficio();
		descuento.agregarDatosDelBeneficio(10);
		tarjetaPremium.agregarBeneficio(descuento);
		Cliente maria= new Cliente(tarjetaPremium, "maria@gmail.com");
		Producto petunia = new Producto("Petunia", 80);
		Producto rosa = new Producto("Rosas rojas", 80);
		Producto margarita = new Producto("Margaritas amarillas", 80);
		Establecimiento heladeria = new Establecimiento();
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		heladeria.agregarSucursal(heladeriaFlores);
		Cliente lucas= new Cliente(tarjetaPremium, "lucas@gmail.com");
		Producto helado = new Producto("Medio kilo de helado", 80);
		Establecimiento carniceria = new Establecimiento();
		club.agregarEstablecimiento(carniceria);
		Sucursal carniceriaFlores= new Sucursal();
		carniceria.agregarSucursal(carniceriaFlores);
		Cliente martin= new Cliente(tarjetaPremium, "martin@gmail.com");
		Producto asado = new Producto("Asado", 80);
		
		heladeriaFlores.comprar(heladeria, lucas, tarjetaPremium, helado);
		carniceriaFlores.comprar(carniceria, martin,tarjetaPremium, asado);
		floreriaFlores.comprar(floreria, maria, tarjetaPremium, margarita);
		floreriaFlores.comprar(floreria, maria, tarjetaPremium, rosa);
		floreriaFlores.comprar(floreria, maria, tarjetaPremium, petunia);
		Assert.assertEquals(floreriaFlores, club.sucursalQueMasVendio());
		
	}
	
	@Test
	public void sucursalQueMasVendioConTresEstablecimientosConVariasSucursalesTodosRealizaronBeneficios() throws ExcepcionDescuento{
		ClubDeBeneficios club = new ClubDeBeneficios();
		
		Establecimiento floreria = new Establecimiento();
		club.agregarEstablecimiento(floreria);
		Sucursal floreriaFlores= new Sucursal();
		Sucursal floreriaRosa= new Sucursal();
		floreria.agregarSucursal(floreriaRosa);
		floreria.agregarSucursal(floreriaFlores);
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Beneficio descuento = new Beneficio();
		descuento.agregarDatosDelBeneficio(10);
		tarjetaPremium.agregarBeneficio(descuento);
		Cliente maria= new Cliente(tarjetaPremium, "maria@gmail.com");
		Producto petunia = new Producto("Petunia", 80);
		Producto rosa = new Producto("Rosas rojas", 80);
		Producto margarita = new Producto("Margaritas amarillas", 80);
		Producto malbon = new Producto("Malbon verde", 80);
		Establecimiento heladeria = new Establecimiento();
		club.agregarEstablecimiento(heladeria);
		Sucursal heladeriaFlores= new Sucursal();
		heladeria.agregarSucursal(heladeriaFlores);
		Cliente lucas= new Cliente(tarjetaPremium, "lucas@gmail.com");
		Producto cono = new Producto("Cono de helado", 80);
		Sucursal heladeriaCaballito = new Sucursal();
		heladeria.agregarSucursal(heladeriaCaballito);
		Cliente mario= new Cliente(tarjetaPremium, "mario@gmail.com");
		Producto kilo = new Producto("Kilo de Helado", 80);
		Establecimiento carniceria = new Establecimiento();
		club.agregarEstablecimiento(carniceria);
		Sucursal carniceriaFlores= new Sucursal();
		carniceria.agregarSucursal(carniceriaFlores);
		Cliente juan= new Cliente(tarjetaPremium, "juan@gmail.com");
		Producto asado = new Producto("Asado", 80);
		Sucursal carniceriaFloresta = new Sucursal();
		carniceria.agregarSucursal(carniceriaFloresta);
		Cliente mariana= new Cliente(tarjetaPremium, "mariana@gmail.com");
		Producto lomo = new Producto("Lomo", 80);
		Producto matambre = new Producto("Matambre", 80);
		
		heladeriaCaballito.comprar(heladeria, mario, tarjetaPremium, kilo);		
		heladeriaFlores.comprar(heladeria, lucas, tarjetaPremium, cono);
		carniceriaFlores.comprar(carniceria, juan, tarjetaPremium, asado);
		carniceriaFloresta.comprar(carniceria, mariana, tarjetaPremium, lomo);
		carniceriaFloresta.comprar(carniceria, mariana, tarjetaPremium, matambre );
		floreriaFlores.comprar(floreria, maria, tarjetaPremium, rosa);
		floreriaRosa.comprar(floreria, maria, tarjetaPremium, petunia);
		floreriaRosa.comprar(floreria, maria, tarjetaPremium, margarita);
		floreriaRosa.comprar(floreria, maria, tarjetaPremium, malbon);
		
		Assert.assertEquals(floreriaRosa, club.sucursalQueMasVendio());
		

	
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
		Cliente lujan= new Cliente(tarjetaPremium, "lujan@gmail.com");
		club.agregarCliente(lujan);
		Cliente maria= new Cliente(tarjetaPremium, "maria@gmail.com");
		club.agregarCliente(maria);
		Producto helado = new Producto("Medio kilo de helado", 100);
		
		heladeriaFlores.comprar(heladeria, lujan, tarjetaPremium, helado);
		
		
	}
	
	@Test
	public void reporteDeUnSoloCliente() throws ExcepcionDescuento{

		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento heladeria = new Establecimiento();
		heladeria.setNombre("Verde");
		Sucursal sucursalFlores = new Sucursal();
		heladeria.agregarSucursal(sucursalFlores);		
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Beneficio descuento = new Beneficio();
		descuento.agregarDatosDelBeneficio(10);
		tarjetaPremium.agregarBeneficio(descuento);
		Cliente lujan= new Cliente(tarjetaPremium, "lujan@gmail.com");
		club.agregarCliente(lujan);
		Producto helado = new Producto("Medio kilo de helado", 100);
		sucursalFlores.comprar(heladeria, lujan, tarjetaPremium,helado);
		
		List<String> detalle = new ArrayList<String>();
		detalle.add(heladeria.getNombre());
		detalle.add(helado.getNombre());
		detalle.add("100.0");
		detalle.add("90.0");
		
		
		Assert.assertEquals(detalle, club.reporteDeClientes());
	}
	
	@Test
	public void reporteDeDosClientes() throws ExcepcionDescuento{

		ClubDeBeneficios club = new ClubDeBeneficios();
		Establecimiento heladeria = new Establecimiento();
		heladeria.setNombre("Verde");
		Sucursal sucursalFlores = new Sucursal();
		heladeria.agregarSucursal(sucursalFlores);		
		Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
		Beneficio descuento = new Beneficio();
		descuento.agregarDatosDelBeneficio(10);
		tarjetaPremium.agregarBeneficio(descuento);
		Cliente lujan= new Cliente(tarjetaPremium, "lujan@gmail.com");
		club.agregarCliente(lujan);
		Cliente maria= new Cliente(tarjetaPremium, "maria@gmail.com");
		club.agregarCliente(maria);
		Producto helado = new Producto("Medio kilo de helado", 100);
		sucursalFlores.comprar(heladeria, lujan, tarjetaPremium,helado);
		sucursalFlores.comprar(heladeria, maria, tarjetaPremium,helado);
		
		List<String> detalle = new ArrayList<String>();
		detalle.add(heladeria.getNombre());
		detalle.add(helado.getNombre());
		detalle.add("100.0");
		detalle.add("90.0");
		detalle.add(heladeria.getNombre());
		detalle.add(helado.getNombre());
		detalle.add("100.0");
		detalle.add("90.0");
		
		
		Assert.assertEquals(detalle, club.reporteDeClientes());
	}
	
}
