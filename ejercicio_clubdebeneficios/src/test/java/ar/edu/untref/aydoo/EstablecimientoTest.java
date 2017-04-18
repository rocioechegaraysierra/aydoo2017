
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
	public void cantidadTotalDeUnaVentaConUnaSucursal(){
		Establecimiento establecimiento = new Establecimiento();
		Sucursal sucursalDevoto = new Sucursal();
		establecimiento.agregarSucursal(sucursalDevoto);
		establecimiento.comprar(sucursalDevoto);
		
		Assert.assertEquals(1, establecimiento.getCantidadTotalDeVentasDelEstablecimiento());
	}
	
	@Test
	public void cantidadTotalDeMasVentaConUnaSucursal(){
		Establecimiento establecimiento = new Establecimiento();
		Sucursal sucursalDevoto = new Sucursal();
		establecimiento.agregarSucursal(sucursalDevoto);
		establecimiento.comprar(sucursalDevoto);
		establecimiento.comprar(sucursalDevoto);
		establecimiento.comprar(sucursalDevoto);
		establecimiento.comprar(sucursalDevoto);
		
		
		Assert.assertEquals(4, establecimiento.getCantidadTotalDeVentasDelEstablecimiento());
	}
	
	@Test
	public void cantidadTotalDeVentasCon3SucursalesYSoloVendeUnaSucursal(){
		Establecimiento establecimiento = new Establecimiento();
		Sucursal sucursalDevoto = new Sucursal();
		Sucursal sucursalAvellaneda = new Sucursal();
		Sucursal sucursalFlores = new Sucursal();
		establecimiento.agregarSucursal(sucursalDevoto);		
		establecimiento.agregarSucursal(sucursalAvellaneda);
		establecimiento.agregarSucursal(sucursalFlores);
		establecimiento.comprar(sucursalAvellaneda);
		
		Assert.assertEquals(1, establecimiento.getCantidadTotalDeVentasDelEstablecimiento());
	}
	
	@Test
	public void cantidadTotalDeVentasCon3SucursalesYTodasVendenUnaVez(){
		Establecimiento establecimiento = new Establecimiento();
		Sucursal sucursalFlores = new Sucursal();
		Sucursal sucursalAvellaneda = new Sucursal();
		Sucursal sucursalDevoto = new Sucursal();
		establecimiento.agregarSucursal(sucursalFlores);		
		establecimiento.agregarSucursal(sucursalAvellaneda);
		establecimiento.agregarSucursal(sucursalDevoto);
		establecimiento.comprar(sucursalAvellaneda);
		establecimiento.comprar(sucursalFlores);
		establecimiento.comprar(sucursalDevoto);
		
		Assert.assertEquals(3, establecimiento.getCantidadTotalDeVentasDelEstablecimiento());
	}
	
	@Test
	public void cantidadTotalDeVentasCon3SucursalesYTodasVendenMasDeUnaVez(){
		Establecimiento establecimiento = new Establecimiento();
		Sucursal sucursalFlores = new Sucursal();
		Sucursal sucursalCaballito = new Sucursal();
		Sucursal sucursalAvellaneda = new Sucursal();
		establecimiento.agregarSucursal(sucursalFlores);		
		establecimiento.agregarSucursal(sucursalCaballito);
		establecimiento.agregarSucursal(sucursalAvellaneda);
		establecimiento.comprar(sucursalCaballito);
		establecimiento.comprar(sucursalCaballito);
		establecimiento.comprar(sucursalCaballito);
		establecimiento.comprar(sucursalFlores);
		establecimiento.comprar(sucursalAvellaneda);
		establecimiento.comprar(sucursalAvellaneda);
		establecimiento.comprar(sucursalAvellaneda);
		
		Assert.assertEquals(7, establecimiento.getCantidadTotalDeVentasDelEstablecimiento());
	}
}
