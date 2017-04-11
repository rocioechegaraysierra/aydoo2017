import org.junit.Assert;
import org.junit.Test;


public class ClienteTest {

	
	@Test
	public void calcularMontoDeCompraIndicandoElMes3MismoAnio(){
		
		Cliente carlos= new Cliente("Carlos", "Perez", "45066789", "Uruguay 4567");
		Periodico perfil = new Periodico("Perfil", 100.0, 1, true, 2, 2017);
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1, 2017);
		Libro luz = new Libro("Luz", "Alberto Martinez", 30.0, 3, 2017);
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 100.0, 4, 2017);
		carlos.agregarCompra(perfil);
		carlos.agregarCompra(rosa);
		carlos.agregarCompra(luz);
		carlos.agregarCompra(lapiz);
		
		double costo = carlos.calcularMontoACobrar(3, 2017);
		
		Assert.assertEquals(30.0, costo, 0.1);
	}
	

	@Test
	public void verMontoDe3LibrosAgregadosALaListaDeLibrosDelCiente(){
	
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		Libro luz = new Libro("Luz", "Alberto Fran", 30.0, 1, 2017);
		Libro amarillo = new Libro("Amarillo", "Oscar Moreno", 30.0, 1, 2017);
		Libro subir = new Libro("Subir", "Esteban Rios", 30.0, 1, 2017);
		carlos.agregarCompra(luz);
		carlos.agregarCompra(amarillo);
		carlos.agregarCompra(subir);
		
		
		double costo= carlos.calcularMontoACobrar(1, 2017);
		
		
		Assert.assertTrue(costo==90);
		
	
	}

	@Test 
	public void verMontoDe3PeriodicosAgregadosEnElListadoDelCliente(){
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		Periodico perfil = new Periodico("Perfil", 100.0, 1, true, 1, 2017);
		Periodico gaceta = new Periodico("La Gaceta", 100.0, 1, true, 1, 2017);
		Periodico clarin = new Periodico("Perfil", 100.0, 1, true, 1, 2017);
		carlos.agregarCompra(perfil);
		carlos.agregarCompra(gaceta);
		carlos.agregarCompra(clarin);
		
		double costo= carlos.calcularMontoACobrar(1, 2017);
		
		Assert.assertTrue(costo==240);
		
		
	}
	

	@Test
	public void verMontoDe3ArticulosAgregadosEnElListadoDelCliente(){
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 100.0, 1, 2017);
		ArticuloDeLibreria lapicera = new ArticuloDeLibreria("Lapicera", 100.0, 1, 2017);
		ArticuloDeLibreria regla = new ArticuloDeLibreria("Regla", 100.0, 1, 2017);
		carlos.agregarCompra(lapiz);
		carlos.agregarCompra(lapicera);
		carlos.agregarCompra(regla);
		
		double costo=carlos.calcularMontoACobrar(1, 2017);
		
		Assert.assertTrue(costo==363);
		
		
	}
	
	
	@Test
	public void verMontoDeUnArticuloAgregadoEnElListadoDelCliente(){
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		ArticuloDeLibreria regla = new ArticuloDeLibreria("Regla", 100.0, 1, 2017);
		carlos.agregarCompra(regla);
		
		double costo=carlos.calcularMontoACobrar(1, 2017);
		
		Assert.assertEquals(121.0, costo, 0.1);
		
		
	}
	
	
	@Test
	public void verMontoDeUnaRevistasAgregadasEnElListadoDelCliente(){
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1, 2017);
		Revista zoe= new Revista("Zoe", 100.0, 1, true, 1, 2017);
		Revista yuya= new Revista("Yuya",100.0, 1, true, 1, 2017);
		carlos.agregarCompra(rosa);
		carlos.agregarCompra(zoe);
		carlos.agregarCompra(yuya);
		
		double costo=carlos.calcularMontoACobrar(1, 2017);
				
		Assert.assertEquals(240.0, costo, 0.1);
	}
	
	@Test
	public void calcularMontoTotalDesdeElCliente(){
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		Periodico perfil = new Periodico("Perfil", 100.0, 1, true, 1, 2017);
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1, 2017);
		Libro luz = new Libro("Luz", "Alberto Martinez", 30.0, 1, 2017);
		ArticuloDeLibreria lapicera = new ArticuloDeLibreria("Lapicera", 100.0, 1, 2017);
		carlos.agregarCompra(perfil);
		carlos.agregarCompra(rosa);
		carlos.agregarCompra(lapicera);
		carlos.agregarCompra(luz);
		
		double costo = carlos.calcularMontoACobrar(1, 2017);
		
		Assert.assertEquals(311.0, costo, 0.1);
	}
	
	
	
	@Test
	public void calcularMontoDeCompraIndicandoElMes4MismoAnio(){
		
		Cliente carlos= new Cliente("Carlos", "Perez", "45066789", "Uruguay 4567");
		Periodico perfil = new Periodico("Perfil", 100.0, 1, true, 2, 2017);
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1, 2017);
		Libro luz = new Libro("Luz", "Alberto Martinez", 30.0, 3, 2017);
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 100.0, 4, 2017);
		carlos.agregarCompra(perfil);
		carlos.agregarCompra(rosa);
		carlos.agregarCompra(luz);
		carlos.agregarCompra(lapiz);
		
		double costo = carlos.calcularMontoACobrar(4, 2017);
		
		Assert.assertEquals(121.0, costo, 0.1);
	}
	
	@Test
	public void calcularMontoDeCompraDelMismoMesMismoAnio(){
		
		Cliente carlos= new Cliente("Carlos", "Perez", "45066789", "Uruguay 4567");
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 100.0, 3, 2017);
		Libro luz = new Libro("Luz", "Alberto Martinez", 30.0, 3, 2017);
		carlos.agregarCompra(luz);
		carlos.agregarCompra(lapiz);
		
		double costo = carlos.calcularMontoACobrar(3, 2017);
		
		Assert.assertEquals(151.0, costo, 0.1);
	}
	
		
}
