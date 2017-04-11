import org.junit.Assert;
import org.junit.Test;

public class PeriodicoTest {

	@Test 
	public void obtenerPrecioDePeriodicoQueSeEmiteUnaVezAlMesSinSuscripcionAnual(){
		
		Periodico gaceta = new Periodico("La Gaceta", 100.0, 1, false, 1, 2017);
		
		double precio=gaceta.getPrecio();
		
		Assert.assertEquals(100.0, precio, 0.1);
		
	}
	
	@Test 
	public void obtenerPrecioDePeriodicoQueSeEmiteUnaVezAlMesConSuscripcionAnual(){
		
		Periodico gaceta = new Periodico("La Gaceta", 100.0, 1, true, 1, 2017);
		
		double precio=gaceta.getPrecio();
		
		Assert.assertEquals(80.0, precio, 0.1);
		
	}
	
	@Test 
	public void obtenerPrecioDePeriodicoQueSeEmite4VezAlMesSinSuscripcionAnual(){
		
		Periodico gaceta = new Periodico("La Gaceta", 100.0, 4, false, 1, 2017);
		
		double precio=gaceta.getPrecio();
		
		Assert.assertEquals(400.0, precio, 0.1);
		
	}
	
	@Test 
	public void obtenerPrecioDePeriodicoQueSeEmite4VezAlMesConSuscripcionAnual(){
		
		Periodico gaceta = new Periodico("La Gaceta", 100.0, 4, true, 1, 2017);
		
		double precio=gaceta.getPrecio();
		
		Assert.assertEquals(320.0, precio, 0.1);
		
	}
	
}
