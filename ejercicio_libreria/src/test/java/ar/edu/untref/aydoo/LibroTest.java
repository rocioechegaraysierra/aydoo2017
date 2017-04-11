import org.junit.Assert;
import org.junit.Test;


public class LibroTest {

	@Test
	public void obtenerPrecioDeUnLibro(){
		
		Libro negro = new Libro("Negro", "Mario Alfonso",35.0, 1, 2017);
	
		double precio=negro.getPrecio();
		
		Assert.assertTrue(precio==35.0);
		
	}
	
}
