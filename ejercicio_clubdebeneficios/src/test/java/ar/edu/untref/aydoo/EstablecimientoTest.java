package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
	import org.junit.Test;


	public class EstablecimientoTest {

		@Test
		public void cantidadTotalCeroDeVentasConUnaSucursal(){
			Establecimiento establecimiento = new Establecimiento();
			Sucursal sucursalDevoto = new Sucursal();
			establecimiento.agregarSucursal(sucursalDevoto);		
			
			Assert.assertEquals(0, establecimiento.getCantidadTotalDeVentasDelEstablecimiento());
		}
		
		@Test
		public void cantidadTotalDeUnaVentaConUnaSucursal() throws ExcepcionDescuento{
			Establecimiento establecimiento = new Establecimiento();
			Sucursal sucursalDevoto = new Sucursal();
			establecimiento.agregarSucursal(sucursalDevoto);
			Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
			Beneficio descuento = new Beneficio();
			descuento.agregarDatosDelBeneficio(10);
			tarjetaPremium.agregarBeneficio(descuento);
			Cliente lujan= new Cliente(tarjetaPremium, "lujan@gmail.com");
			Producto helado = new Producto("Medio kilo de helado", 80);
			sucursalDevoto.comprar(establecimiento, lujan, tarjetaPremium,helado);
			
			Assert.assertEquals(1, sucursalDevoto.getCantidadDeVentas());
		}
		
	
		
		@Test
		public void cantidadTotalDeMasVentaConUnaSucursal() throws ExcepcionDescuento{
			Establecimiento establecimiento = new Establecimiento();
			Sucursal sucursalDevoto = new Sucursal();
			establecimiento.agregarSucursal(sucursalDevoto);
			Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
			Beneficio descuento = new Beneficio();
			descuento.agregarDatosDelBeneficio(10);
			tarjetaPremium.agregarBeneficio(descuento);
			Cliente lujan= new Cliente(tarjetaPremium, "lujan@gmail.com");
			Producto helado = new Producto("Medio kilo de helado", 80);
			sucursalDevoto.comprar(establecimiento, lujan, tarjetaPremium,helado);
			sucursalDevoto.comprar(establecimiento, lujan, tarjetaPremium,helado);
			sucursalDevoto.comprar(establecimiento, lujan, tarjetaPremium,helado);
			sucursalDevoto.comprar(establecimiento, lujan, tarjetaPremium,helado);
			
			
			
			Assert.assertEquals(4, establecimiento.getCantidadTotalDeVentasDelEstablecimiento());
		}
		
		@Test
		public void cantidadTotalDeVentasCon3SucursalesYSoloVendeUnaSucursal() throws ExcepcionDescuento{
			Establecimiento establecimiento = new Establecimiento();
			Sucursal sucursalDevoto = new Sucursal();
			Sucursal sucursalAvellaneda = new Sucursal();
			Sucursal sucursalFlores = new Sucursal();
			establecimiento.agregarSucursal(sucursalDevoto);		
			establecimiento.agregarSucursal(sucursalAvellaneda);
			establecimiento.agregarSucursal(sucursalFlores);
			Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
			Beneficio descuento = new Beneficio();
			descuento.agregarDatosDelBeneficio(10);
			tarjetaPremium.agregarBeneficio(descuento);
			Cliente lujan= new Cliente(tarjetaPremium, "lujan@gmail.com");
			Producto helado = new Producto("Medio kilo de helado", 80);
			sucursalDevoto.comprar(establecimiento, lujan, tarjetaPremium,helado);
			
			
			Assert.assertEquals(1, establecimiento.getCantidadTotalDeVentasDelEstablecimiento());
		}
		
		@Test
		public void cantidadTotalDeVentasCon3SucursalesYTodasVendenUnaVez() throws ExcepcionDescuento{
			Establecimiento establecimiento = new Establecimiento();
			Sucursal sucursalFlores = new Sucursal();
			Sucursal sucursalAvellaneda = new Sucursal();
			Sucursal sucursalDevoto = new Sucursal();
			establecimiento.agregarSucursal(sucursalFlores);		
			establecimiento.agregarSucursal(sucursalAvellaneda);
			establecimiento.agregarSucursal(sucursalDevoto);
			
			Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
			Beneficio descuento = new Beneficio();
			descuento.agregarDatosDelBeneficio(10);
			tarjetaPremium.agregarBeneficio(descuento);
			Cliente lujan= new Cliente(tarjetaPremium, "lujan@gmail.com");
			Producto helado = new Producto("Medio kilo de helado", 100);
			sucursalDevoto.comprar(establecimiento, lujan, tarjetaPremium,helado);
			sucursalFlores.comprar(establecimiento, lujan, tarjetaPremium,helado);
			sucursalAvellaneda.comprar(establecimiento, lujan, tarjetaPremium,helado);
			
		
			
			Assert.assertEquals(3, establecimiento.getCantidadTotalDeVentasDelEstablecimiento());
		}
		
		@Test
		public void cantidadTotalDeVentasCon3SucursalesYTodasVendenMasDeUnaVez() throws ExcepcionDescuento{
			Establecimiento establecimiento = new Establecimiento();
			Sucursal sucursalFlores = new Sucursal();
			Sucursal sucursalCaballito = new Sucursal();
			Sucursal sucursalAvellaneda = new Sucursal();
			establecimiento.agregarSucursal(sucursalFlores);		
			establecimiento.agregarSucursal(sucursalCaballito);
			establecimiento.agregarSucursal(sucursalAvellaneda);

			Tarjeta tarjetaPremium= new Tarjeta(CategoriaDeLaTarjeta.PREMIUM);
			Beneficio descuento = new Beneficio();
			descuento.agregarDatosDelBeneficio(10);
			tarjetaPremium.agregarBeneficio(descuento);
			Cliente lujan= new Cliente(tarjetaPremium, "lujan@gmail.com");
			Producto helado = new Producto("Medio kilo de helado", 100);
			sucursalFlores.comprar(establecimiento, lujan, tarjetaPremium,helado);
			sucursalFlores.comprar(establecimiento, lujan, tarjetaPremium,helado);
			sucursalFlores.comprar(establecimiento, lujan, tarjetaPremium,helado);
			sucursalCaballito.comprar(establecimiento, lujan, tarjetaPremium,helado);
			sucursalAvellaneda.comprar(establecimiento, lujan, tarjetaPremium,helado);
			sucursalAvellaneda.comprar(establecimiento, lujan, tarjetaPremium,helado);
			sucursalAvellaneda.comprar(establecimiento, lujan, tarjetaPremium,helado);
			
			Assert.assertEquals(7, establecimiento.getCantidadTotalDeVentasDelEstablecimiento());
		}
		

		
	}
