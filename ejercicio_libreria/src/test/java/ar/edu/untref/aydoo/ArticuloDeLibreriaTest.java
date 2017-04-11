import org.junit.Assert;
import org.junit.Test;

public class ArticuloDeLibreriaTest {

	@Test
	public void obtenerPrecioDeArticuloDeLibreria(){
		
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 100.0, 1, 2017);
		
		double precio=lapiz.getPrecio();
		
		Assert.assertEquals(121.0, precio, 0.1);
	}
	
	
}
