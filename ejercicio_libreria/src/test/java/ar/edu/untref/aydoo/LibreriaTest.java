import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;


public class LibreriaTest {


	@Test
	public void agregarClienteALaLibreria(){
		
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(carlos);
		
		int tam=libreria.cantidadDeClientes();
		
		Assert.assertTrue(tam==1);
	}
	
	@Test
	public void agregarClientesALaLibreria(){
		
		Libreria libreria = new Libreria();
		Cliente lucia= new Cliente("Lucia", "Ortiz","45344654", "Vallejos 4321");
		Cliente lucas= new Cliente("Lucas", "Martinez", "43267854", "Lima 24");
		Cliente martin= new Cliente("Martin", "Ortega", "45768097", "Corrientes 1234");
		Cliente marcos= new Cliente("Marcos", "Perez", "49564376", "Segurola 2495");
		libreria.agregarCliente(lucia);
		libreria.agregarCliente(lucas);
		libreria.agregarCliente(martin);
		libreria.agregarCliente(marcos);
		
		int tam=libreria.cantidadDeClientes();
		
		Assert.assertTrue(tam==4);
	}
	
		

	
	@Test
	public void verSuscripcionesARevistasDeCliente(){
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(carlos);
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1, 2017);
		Revista zoe= new Revista("Zoe", 100.0, 1, true, 1, 2017);
		Revista yuya= new Revista("Yuya", 100.0, 1, true, 1, 2017);
		carlos.agregarCompra(rosa);
		carlos.agregarCompra(zoe);
		carlos.agregarCompra(yuya);
		
		List<Revista> listado= new ArrayList<Revista>();
		listado.add(rosa);
		listado.add(zoe);
		listado.add(yuya);
		
		Assert.assertEquals(listado, libreria.verSuscripciones(carlos, 1, 2017));
	}
	
	@Test 
	public void verSuscripcionesAPeridiocosDeCliente(){
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(carlos);
		Periodico gaceta = new Periodico("La Gaceta", 100.0, 1, true, 1, 2017);
		Periodico nacion = new Periodico("La Nacion", 100.0, 1, true, 1, 2017);
		Periodico perfil = new Periodico("Perfil", 100.0, 1, true, 1, 2017);
		carlos.agregarCompra(gaceta);
		carlos.agregarCompra(nacion);
		carlos.agregarCompra(perfil);
		
		List<Periodico> listado = new ArrayList<Periodico>();
		listado.add(gaceta);
		listado.add(nacion);
		listado.add(perfil);
		
		Assert.assertEquals(listado, libreria.verSuscripciones(carlos, 1, 2017));
		
	}
	
	

	@Test
	public void buscarRevistasCompradasEnMes4(){
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(carlos);
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1, 2017);
		Revista zoe= new Revista("Zoe", 100.0, 1, true, 4, 2017);
		Revista yuya= new Revista("Yuya",100.0, 1, true, 1, 2017);
		carlos.agregarCompra(rosa);
		carlos.agregarCompra(zoe);
		carlos.agregarCompra(yuya);
		
		List<Revista> revistas= new ArrayList<Revista>();
		revistas.add(zoe);
		
		Assert.assertEquals(revistas,libreria.buscarProductosComprados(4,2017, carlos));
		
		
	}
	
	@Test
	public void buscarPeriodicosCompradosEnMes1(){
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(carlos);
		Periodico gaceta = new Periodico("La Gaceta", 100.0, 1, true, 1, 2017);
		Periodico nacion = new Periodico("La Nacion", 100.0, 1, true, 1, 2017);
		Periodico perfil = new Periodico("Perfil", 100.0, 1, true, 3, 2017);
		carlos.agregarCompra(gaceta);
		carlos.agregarCompra(nacion);
		carlos.agregarCompra(perfil);
		
		List<Periodico> listado = new ArrayList<Periodico>();
		listado.add(gaceta);
		listado.add(nacion);
		
		Assert.assertEquals(listado, libreria.buscarProductosComprados(1,2017, carlos));
	}
	
	@Test
	public void buscarLibrosCompradosEnMes5(){
		
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(carlos);
		Libro luces = new Libro("Luces de noche", "Alfredo Gonz", 35.0, 5, 2017);
		Libro querer = new Libro("Querer es poder", "Bernardo Stamateas", 35.0, 1, 2017);
		Libro estrellas = new Libro("Estrellas en el cilo", "Mariano Bernardi", 35.0, 5, 2017);
		carlos.agregarCompra(luces);
		carlos.agregarCompra(querer);
		carlos.agregarCompra(estrellas);
		
		List<Libro> listado = new ArrayList<Libro>();
		listado.add(luces);
		listado.add(estrellas);
		
		Assert.assertEquals(listado, libreria.buscarProductosComprados(5,2017, carlos));
	}
	
	@Test
	public void buscarArticulosDeLibreriaDeMes4(){
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(carlos);
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 100.0, 2, 2017);
		ArticuloDeLibreria lapicera = new ArticuloDeLibreria("Lapicera", 100.0, 1, 2017);
		ArticuloDeLibreria regla = new ArticuloDeLibreria("Regla", 100.0, 4, 2017);
		carlos.agregarCompra(lapiz);
		carlos.agregarCompra(lapicera);
		carlos.agregarCompra(regla);	
		
		List<ArticuloDeLibreria> listado = new ArrayList<ArticuloDeLibreria>();
		listado.add(regla);
				
		Assert.assertEquals(listado, libreria.buscarProductosComprados(4, 2017, carlos));
		
	}
	
	@Test
	public void calcularMontoDeClienteDeDistintosProductos(){
		
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		Periodico perfil = new Periodico("Perfil", 100.0, 1, true, 1, 2017);
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1, 2017);
		Libro luz = new Libro("Luz", "Alberto Martinez", 30.0, 1, 2017);
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 100.0, 1, 2017);
		
		carlos.agregarCompra(perfil);
		carlos.agregarCompra(rosa);
		carlos.agregarCompra(lapiz);
		carlos.agregarCompra(luz);
		
		libreria.agregarCliente(carlos);
		
		double costo = libreria.calcularMontoACobrar(1, 2017, carlos);
		
		Assert.assertEquals(311.0, costo, 0.1);
	}
	
	@Test
	public void calcularMontoDeCompraIndicandoElMes3(){
		
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("Carlos", "Perez", "45066789", "Uruguay 4567");
		Periodico perfil = new Periodico("Perfil", 100.0, 1, true, 2, 2017);
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1, 2017);
		Libro luz = new Libro("Luz", "Alberto Martinez", 30.0, 3, 2017);
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 100.0, 4, 2017);
		
		carlos.agregarCompra(perfil);
		carlos.agregarCompra(rosa);
		carlos.agregarCompra(lapiz);
		carlos.agregarCompra(luz);
		
		libreria.agregarCliente(carlos);
		
		double costo = libreria.calcularMontoACobrar(3, 2017, carlos);
		
		Assert.assertEquals(30.0, costo, 0.1);
	}
	
	@Test
	public void calcularCaso1DeEjemploPlanteadoEnElEnunciado(){
		
		Libreria libreria = new Libreria();
		Cliente juan= new Cliente("Juan", "Perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(juan);
		Libro hobbit = new Libro("El Hobbit", "Tolkien", 50.0, 8, 2017);
		ArticuloDeLibreria lapiceraB = new ArticuloDeLibreria("Lapicera Bic", 5.0, 8, 2017);
		ArticuloDeLibreria lapiceraS = new ArticuloDeLibreria("Lapicera Simball", 5.0, 8, 2017);
		Revista grafico= new Revista("El Grafico", 30.0, 1, false, 8, 2017);
		juan.agregarCompra(grafico);
		juan.agregarCompra(lapiceraB);
		juan.agregarCompra(lapiceraS);
		juan.agregarCompra(hobbit);
		
		
		double costo = libreria.calcularMontoACobrar(8, 2017, juan);
		
		Assert.assertEquals(92.1, costo, 0.1);
	}
	@Test
	public void calcularCaso2DeEjemploPlanteadoEnElEnunciado(){
		
		Libreria libreria = new Libreria();
		Cliente maria= new Cliente("Maria", "Perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(maria);
		Revista barcelona= new Revista("Barcelona", 20.0, 2, true, 1, 2017);
		Periodico pagina12= new Periodico("Pagina 12", 12.0, 1, false, 1, 2017);
		maria.agregarCompra(barcelona);
		maria.agregarCompra(pagina12);
		
		
		double costo = libreria.calcularMontoACobrar(1, 2017, maria);
		
		Assert.assertEquals(44.0, costo, 0.1);
	}
	
}
