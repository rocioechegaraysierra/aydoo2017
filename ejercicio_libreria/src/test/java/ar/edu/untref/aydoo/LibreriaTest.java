import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;


public class LibreriaTest {

	@Test
	public void obtenerPrecioDeUnLibro(){
		
		Libro negro = new Libro("Negro", "Mario Alfonso",35.0, 1);
	
		double precio=negro.getPrecio();
		
		Assert.assertTrue(precio==35.0);
		
	}
	
	@Test
	public void obtenerPrecioDeArticuloDeLibreria(){
		
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 100.0, 1);
		
		double precio=lapiz.getPrecio();
		
		Assert.assertEquals(121.0, precio, 0.1);
	}
	
	@Test
	public void obtenerPrecioDeRevistaQueSeEmiteUnaVezAlMesSinSuscripcionAnual(){
		
		Revista rosa= new Revista("Rosa",100.0, 1, false, 1);
		
		double precio=rosa.getPrecio();
		
		Assert.assertEquals(100.0, precio, 0.1);
	}
	
	@Test
	public void obtenerPrecioDeRevistaQueSeEmite3VecesAlMesSinSuscripcionAnual(){
		
		Revista rosa= new Revista("Rosa",100.0, 3, false, 1);
		
		double precio=rosa.getPrecio();
		
		Assert.assertEquals(300.0, precio, 0.1);
	}
	
	@Test
	public void obtenerPrecioDeRevistaQueSeEmiteUnaVezAleMesConSuscripcionAnual(){
		
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1);
		
		double precio=rosa.getPrecio();
		
		Assert.assertEquals(80.0, precio, 0.1);
	}
	
	@Test
	public void obtenerPrecioDeRevistaQueSeEmite3VecesAlMesConSuscripcionAnual(){
		
		Revista rosa= new Revista("Rosa", 100.0, 3, true, 1);
		
		double precio=rosa.getPrecio();
		
		Assert.assertEquals(240.0, precio, 0.1);
	}
	
	@Test 
	public void obtenerPrecioDePeriodicoQueSeEmiteUnaVezAlMesSinSuscripcionAnual(){
		
		Periodico gaceta = new Periodico("La Gaceta", 100.0, 1, false, 1);
		
		double precio=gaceta.getPrecio();
		
		Assert.assertEquals(100.0, precio, 0.1);
		
	}
	
	@Test 
	public void obtenerPrecioDePeriodicoQueSeEmiteUnaVezAlMesConSuscripcionAnual(){
		
		Periodico gaceta = new Periodico("La Gaceta", 100.0, 1, true, 1);
		
		double precio=gaceta.getPrecio();
		
		Assert.assertEquals(80.0, precio, 0.1);
		
	}
	
	@Test 
	public void obtenerPrecioDePeriodicoQueSeEmite4VezAlMesSinSuscripcionAnual(){
		
		Periodico gaceta = new Periodico("La Gaceta", 100.0, 4, false, 1);
		
		double precio=gaceta.getPrecio();
		
		Assert.assertEquals(400.0, precio, 0.1);
		
	}
	
	@Test 
	public void obtenerPrecioDePeriodicoQueSeEmite4VezAlMesConSuscripcionAnual(){
		
		Periodico gaceta = new Periodico("La Gaceta", 100.0, 4, true, 1);
		
		double precio=gaceta.getPrecio();
		
		Assert.assertEquals(320.0, precio, 0.1);
		
	}
	
	@Test
	
	public void verCantidadDeUnLibroAgregadoALaListaDeLibrosDelCiente(){
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		Libro terror = new Libro("Terror de noche", "Lucas Marianz", 35.0, 1);
		carlos.agregarLibro(terror);
		
		int tam= carlos.cantidadDeLibros();
		
		Assert.assertTrue(tam==1);
		
	
		
	}
	
	
	@Test
	
	public void verCantidadDe3LibrosAgregadosALaListaDeLibrosDelCiente(){
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		Libro luces = new Libro("Luces de noche", "Alfredo Gonz", 35.0, 1);
		Libro querer = new Libro("Querer es poder", "Bernardo Stamateas", 35.0, 1);
		Libro estrellas = new Libro("Estrellas en el cilo", "Mariano Bernardi", 35.0, 1);
		
		carlos.agregarLibro(luces);
		carlos.agregarLibro(querer);
		carlos.agregarLibro(estrellas);
		
		int tam= carlos.cantidadDeLibros();
		
		Assert.assertTrue(tam==3);
		
	
		
	}
	
	
	@Test
	public void verCantidadDeUnaRevistaAgregadaALaListaDeRevistasdelCliente(){
		
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		Revista rosa= new Revista("Rosa",100.0, 1, true, 1);
		carlos.agregarRevista(rosa);
		
		int tam=carlos.cantidadDeRevistas();

		Assert.assertTrue(tam==1);
	
		
	}
	
	@Test
	public void verCantidadDe3RevistasAgregadasALaListaDeRevistasDelCliente(){
		
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1);
		Revista zoe= new Revista("Zoe", 100.0, 1, true, 1);
		Revista yuya= new Revista("Yuya", 100.0, 1, true, 1);
		carlos.agregarRevista(rosa);
		carlos.agregarRevista(zoe);
		carlos.agregarRevista(yuya);
		
		
		int tam=carlos.cantidadDeRevistas();

		Assert.assertTrue(tam==3);
	
		
	}
	
	@Test
	public void verCantidadUnArticuloAgregadoALaListaDeArticulosDelCliente(){
		
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		ArticuloDeLibreria lapicera = new ArticuloDeLibreria("Lapicera", 100.0, 1);
		carlos.agregarArticulo(lapicera);
		
		int tam=carlos.cantidadDeArticulos();
		
		Assert.assertTrue(tam==1);
		
	
	}
	
	@Test
	public void verCantidadDe3ArticuloAgregadoALaListaDeArticulosDelCliente(){
		
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		ArticuloDeLibreria lapicera = new ArticuloDeLibreria("Lapicera",100.0, 1);
		ArticuloDeLibreria tijera = new ArticuloDeLibreria("Tijera", 100.0, 1);
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 100.0, 1);
		carlos.agregarArticulo(lapicera);
		carlos.agregarArticulo(tijera);
		carlos.agregarArticulo(lapiz);
		
		int tam=carlos.cantidadDeArticulos();
		
		Assert.assertTrue(tam==3);
			
	}
	
	@Test
	public void verCantidadDeUnPeriodicoAgregadoALaListaDePeriodicosDelCliente(){
		
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		Periodico clarin = new Periodico("Clarin", 100.0, 1, true, 1);
		carlos.agregarPeriodico(clarin);
		
		int tam=carlos.cantidadDePeriodicos();
		
		
		Assert.assertTrue(tam==1);
		
	}
	
	@Test
	public void verCantidadDe3PeriodicosAgregadoALaListaDePeriodicosDelCliente(){
		
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		Periodico gaceta = new Periodico("La Gaceta", 100.0, 1, true, 1);
		Periodico nacion = new Periodico("La Nacion", 100.0, 1, true, 1);
		Periodico perfil = new Periodico("Perfil", 100.0, 1, true, 1);
		carlos.agregarPeriodico(gaceta);
		carlos.agregarPeriodico(nacion);
		carlos.agregarPeriodico(perfil);
		
		int tam=carlos.cantidadDePeriodicos();
		
		
		Assert.assertTrue(tam==3);
		
	}

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
	public void verMontoDe3LibrosAgregadosALaListaDeLibrosDelCiente(){
	
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		Libro luz = new Libro("Luz", "Alberto Fran", 30.0, 1);
		Libro amarillo = new Libro("Amarillo", "Oscar Moreno", 30.0, 1);
		Libro subir = new Libro("Subir", "Esteban Rios", 30.0, 1);
		carlos.agregarLibro(luz);
		carlos.agregarLibro(amarillo);
		carlos.agregarLibro(subir);
		
		
		double costo= carlos.calcularMontoLibros(1);
		
		
		Assert.assertTrue(costo==90);
		
	
	}

	@Test
	public void verMontoDe3ArticulosAgregadosEnElListadoDelCliente(){
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 100.0, 1);
		ArticuloDeLibreria lapicera = new ArticuloDeLibreria("Lapicera", 100.0, 1);
		ArticuloDeLibreria regla = new ArticuloDeLibreria("Regla", 100.0, 1);
		carlos.agregarArticulo(lapiz);
		carlos.agregarArticulo(lapicera);
		carlos.agregarArticulo(regla);
		
		double costo=carlos.calcularMontoArticulosLibreria(1);
		
		Assert.assertTrue(costo==363);
		
		
	}
	
	@Test 
	public void verMontoDe3PeriodicosAgregadosEnElListadoDelCliente(){
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		Periodico perfil = new Periodico("Perfil", 100.0, 1, true, 1);
		Periodico gaceta = new Periodico("La Gaceta", 100.0, 1, true, 1);
		Periodico clarin = new Periodico("Perfil", 100.0, 1, true, 1);
		carlos.agregarPeriodico(perfil);
		carlos.agregarPeriodico(gaceta);
		carlos.agregarPeriodico(clarin);
		
		double costo= carlos.calcularMontoPeriodicos(1);
		
		Assert.assertTrue(costo==240);
		
		
	}
	
	
	@Test
	public void verMontoDeUnaRevistasAgregadasEnElListadoDelCliente(){
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1);
		Revista zoe= new Revista("Zoe", 100.0, 1, true, 1);
		Revista yuya= new Revista("Yuya",100.0, 1, true, 1);
		carlos.agregarRevista(rosa);
		carlos.agregarRevista(zoe);
		carlos.agregarRevista(yuya);
		
		double costo=carlos.calcularMontoRevista(1);
				
		Assert.assertEquals(240.0, costo, 0.1);
	}
	
	@Test
	public void calcularMontoTotalDesdeElCliente(){
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		Periodico perfil = new Periodico("Perfil", 100.0, 1, true, 1);
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1);
		Libro luz = new Libro("Luz", "Alberto Martinez", 30.0, 1);
		ArticuloDeLibreria lapicera = new ArticuloDeLibreria("Lapicera", 100.0, 1);
		carlos.agregarPeriodico(perfil);
		carlos.agregarRevista(rosa);
		carlos.agregarArticulo(lapicera);
		carlos.agregarLibro(luz);
		
		double costo = carlos.calcularMontoTotal(1);
		
		Assert.assertEquals(311.0, costo, 0.1);
	}
	
	@Test
	public void calcularMontoDeClienteDeDistintosProductos(){
		
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		Periodico perfil = new Periodico("Perfil", 100.0, 1, true, 1);
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1);
		Libro luz = new Libro("Luz", "Alberto Martinez", 30.0, 1);
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 100.0, 1);
		
		carlos.agregarPeriodico(perfil);
		carlos.agregarRevista(rosa);
		carlos.agregarArticulo(lapiz);
		carlos.agregarLibro(luz);
		
		libreria.agregarCliente(carlos);
		
		double costo = libreria.calcularMontoTotal(1, carlos);
		
		Assert.assertEquals(311.0, costo, 0.1);
	}
	
	@Test
	public void verSuscripcionesARevistasDeCliente(){
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(carlos);
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1);
		Revista zoe= new Revista("Zoe", 100.0, 1, true, 1);
		Revista yuya= new Revista("Yuya", 100.0, 1, true, 1);
		carlos.agregarRevista(rosa);
		carlos.agregarRevista(zoe);
		carlos.agregarRevista(yuya);
		
		List<Revista> listado= new ArrayList<Revista>();
		listado.add(rosa);
		listado.add(zoe);
		listado.add(yuya);
		
		Assert.assertEquals(listado, libreria.verSuscripcionesARevista(carlos));
	}
	
	@Test 
	public void verSuscripcionesAPeridiocosDeCliente(){
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(carlos);
		Periodico gaceta = new Periodico("La Gaceta", 100.0, 1, true, 1);
		Periodico nacion = new Periodico("La Nacion", 100.0, 1, true, 1);
		Periodico perfil = new Periodico("Perfil", 100.0, 1, true, 1);
		carlos.agregarPeriodico(gaceta);
		carlos.agregarPeriodico(nacion);
		carlos.agregarPeriodico(perfil);
		
		List<Periodico> listado = new ArrayList<Periodico>();
		listado.add(gaceta);
		listado.add(nacion);
		listado.add(perfil);
		
		Assert.assertEquals(listado, libreria.verSuscripcionesAPeriodico(carlos));
		
	}
	
	

	@Test
	public void buscarRevistasCompradasEnMes4(){
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(carlos);
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1);
		Revista zoe= new Revista("Zoe", 100.0, 1, true, 4);
		Revista yuya= new Revista("Yuya",100.0, 1, true, 1);
		carlos.agregarRevista(rosa);
		carlos.agregarRevista(zoe);
		carlos.agregarRevista(yuya);
		
		List<Revista> revistas= new ArrayList<Revista>();
		revistas.add(zoe);
		
		Assert.assertEquals(revistas,libreria.buscarRevistasCompradas(4, carlos));
		
		
	}
	
	@Test
	public void buscarPeriodicosCompradosEnMes1(){
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(carlos);
		Periodico gaceta = new Periodico("La Gaceta", 100.0, 1, true, 1);
		Periodico nacion = new Periodico("La Nacion", 100.0, 1, true, 1);
		Periodico perfil = new Periodico("Perfil", 100.0, 1, true, 3);
		carlos.agregarPeriodico(gaceta);
		carlos.agregarPeriodico(nacion);
		carlos.agregarPeriodico(perfil);
		
		List<Periodico> listado = new ArrayList<Periodico>();
		listado.add(gaceta);
		listado.add(nacion);
		
		Assert.assertEquals(listado, libreria.buscarPeriodicosComprados(1, carlos));
	}
	
	@Test
	public void buscarLibrosCompradosEnMes5(){
		
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(carlos);
		Libro luces = new Libro("Luces de noche", "Alfredo Gonz", 35.0, 5);
		Libro querer = new Libro("Querer es poder", "Bernardo Stamateas", 35.0, 1);
		Libro estrellas = new Libro("Estrellas en el cilo", "Mariano Bernardi", 35.0, 5);
		carlos.agregarLibro(luces);
		carlos.agregarLibro(querer);
		carlos.agregarLibro(estrellas);
		
		List<Libro> listado = new ArrayList<Libro>();
		listado.add(luces);
		listado.add(estrellas);
		
		Assert.assertEquals(listado, libreria.buscarLibrosComprados(5, carlos));
	}
	
	@Test
	public void buscarArticulosDeLibreriaDeMes4(){
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("carlos", "perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(carlos);
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 100.0, 2);
		ArticuloDeLibreria lapicera = new ArticuloDeLibreria("Lapicera", 100.0, 1);
		ArticuloDeLibreria regla = new ArticuloDeLibreria("Regla", 100.0, 4);
		carlos.agregarArticulo(lapiz);
		carlos.agregarArticulo(lapicera);
		carlos.agregarArticulo(regla);	
		
		List<ArticuloDeLibreria> listado = new ArrayList<ArticuloDeLibreria>();
		listado.add(regla);
				
		Assert.assertEquals(listado, libreria.buscarArticulosComprados(4, carlos));
		
	}
	
	@Test
	public void calcularMontoDeCompraIndicandoElMes3(){
		
		Libreria libreria = new Libreria();
		Cliente carlos= new Cliente("Carlos", "Perez", "45066789", "Uruguay 4567");
		Periodico perfil = new Periodico("Perfil", 100.0, 1, true, 2);
		Revista rosa= new Revista("Rosa", 100.0, 1, true, 1);
		Libro luz = new Libro("Luz", "Alberto Martinez", 30.0, 3);
		ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lapiz", 100.0, 4);
		
		carlos.agregarPeriodico(perfil);
		carlos.agregarRevista(rosa);
		carlos.agregarArticulo(lapiz);
		carlos.agregarLibro(luz);
		
		libreria.agregarCliente(carlos);
		
		double costo = libreria.calcularMontoTotal(3, carlos);
		
		Assert.assertEquals(30.0, costo, 0.1);
	}
	
	@Test
	public void calcularCaso1DeEjemploPlanteadoEnElEnunciado(){
		
		Libreria libreria = new Libreria();
		Cliente juan= new Cliente("Juan", "Perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(juan);
		Libro hobbit = new Libro("El Hobbit", "Tolkien", 50.0, 8);
		ArticuloDeLibreria lapiceraB = new ArticuloDeLibreria("Lapicera Bic", 5.0, 8);
		ArticuloDeLibreria lapiceraS = new ArticuloDeLibreria("Lapicera Simball", 5.0, 8);
		Revista grafico= new Revista("El Grafico", 30.0, 1, false, 8);
		juan.agregarRevista(grafico);
		juan.agregarArticulo(lapiceraB);
		juan.agregarArticulo(lapiceraS);
		juan.agregarLibro(hobbit);
		
		
		double costo = libreria.calcularMontoTotal(8, juan);
		
		Assert.assertEquals(92.1, costo, 0.1);
	}
	@Test
	public void calcularCaso2DeEjemploPlanteadoEnElEnunciado(){
		
		Libreria libreria = new Libreria();
		Cliente maria= new Cliente("Maria", "Perez", "45066789", "Uruguay 4567");
		libreria.agregarCliente(maria);
		Revista barcelona= new Revista("Barcelona", 20.0, 2, true, 1);
		Periodico pagina12= new Periodico("Pagina 12", 12.0, 1, false, 1);
		maria.agregarRevista(barcelona);
		maria.agregarPeriodico(pagina12);
		
		
		double costo = libreria.calcularMontoTotal(1, maria);
		
		Assert.assertEquals(44.0, costo, 0.1);
	}
	
}
