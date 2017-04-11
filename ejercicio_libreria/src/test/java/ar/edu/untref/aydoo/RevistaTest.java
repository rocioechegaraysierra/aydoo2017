import org.junit.Assert;
import org.junit.Test;

public class RevistaTest {

	@Test
	public void obtenerPrecioDeRevistaQueSeEmiteUnaVezAlMesSinSuscripcionAnual(){
		
		Revista rosa= new Revista("Rosa",100.0, 1, false, 1, 2017);
		
		double precio=rosa.getPrecio();
		
		Assert.assertEquals(100.0, precio, 0.1);
	}
	
	@Test
	public void obtenerPrecioDeRevistaQueSeEmite3VecesAlMesSinSuscripcionAnual(){
		
		Revista rosa= new Revista("Rosa",100.0, 3, false, 1, 2017);
		
		double precio=rosa.getPrecio();
		
		Assert.assertEquals(300.0, precio, 0.1);
	}
	
	@Test
	public void obtenerPrecioDeRevistaQueSeEmiteUnaVezAleMesConSuscripcionAnual(){
		
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1, 2017);
		
		double precio=rosa.getPrecio();
		
		Assert.assertEquals(80.0, precio, 0.1);
	}
	
	@Test
	public void obtenerPrecioDeRevistaQueSeEmite3VecesAlMesConSuscripcionAnual(){
		
		Revista rosa= new Revista("Rosa", 100.0, 3, true, 1, 2017);
		
		double precio=rosa.getPrecio();
		
		Assert.assertEquals(240.0, precio, 0.1);
	}
}
