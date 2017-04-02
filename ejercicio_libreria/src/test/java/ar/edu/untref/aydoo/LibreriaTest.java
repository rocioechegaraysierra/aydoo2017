import junit.framework.Assert;

import org.junit.Test;


public class LibreriaTest {

	@Test
	public void obtenerPrecioDeUnLibro(){
		
		Libro l = new Libro(35.0);
	
		double precio=l.getPrecio();
		
		Assert.assertTrue(precio==35.0);
		
	}
	
	@Test
	public void obtenerPrecioDeArticuloDeLibreria(){
		
		ArticuloDeLibreria a = new ArticuloDeLibreria(100.0);
		
		double precio=a.getPrecio();
		
		Assert.assertEquals(121.0, precio, 0.1);
	}
	
	@Test
	public void obtenerPrecioDeRevistaQueSeEmiteUnaVezAlMesSinSuscripcionAnual(){
		
		Revista r= new Revista(100.0, 1, false);
		
		double precio=r.getPrecio();
		
		Assert.assertEquals(100.0, precio, 0.1);
	}
	
	@Test
	public void obtenerPrecioDeRevistaQueSeEmite3VecesAlMesSinSuscripcionAnual(){
		
		Revista r= new Revista(100.0, 3, false);
		
		double precio=r.getPrecio();
		
		Assert.assertEquals(300.0, precio, 0.1);
	}
	
	@Test
	public void obtenerPrecioDeRevistaQueSeEmiteUnaVezAleMesConSuscripcionAnual(){
		
		Revista r= new Revista(100.0, 1, true);
		
		double precio=r.getPrecio();
		
		Assert.assertEquals(80.0, precio, 0.1);
	}
	
	@Test
	public void obtenerPrecioDeRevistaQueSeEmite3VecesAlMesConSuscripcionAnual(){
		
		Revista r= new Revista(100.0, 3, true);
		
		double precio=r.getPrecio();
		
		Assert.assertEquals(240.0, precio, 0.1);
	}
	
	@Test 
	public void obtenerPrecioDePeriodicoQueSeEmiteUnaVezAlMesSinSuscripcionAnual(){
		
		Periodico p = new Periodico(100.0, 1, false);
		
		double precio=p.getPrecio();
		
		Assert.assertEquals(100.0, precio, 0.1);
		
	}
	
	@Test 
	public void obtenerPrecioDePeriodicoQueSeEmiteUnaVezAlMesConSuscripcionAnual(){
		
		Periodico p = new Periodico(100.0, 1, true);
		
		double precio=p.getPrecio();
		
		Assert.assertEquals(80.0, precio, 0.1);
		
	}
	
	@Test 
	public void obtenerPrecioDePeriodicoQueSeEmite4VezAlMesSinSuscripcionAnual(){
		
		Periodico p = new Periodico(100.0, 4, false);
		
		double precio=p.getPrecio();
		
		Assert.assertEquals(400.0, precio, 0.1);
		
	}
	
	@Test 
	public void obtenerPrecioDePeriodicoQueSeEmite4VezAlMesConSuscripcionAnual(){
		
		Periodico p = new Periodico(100.0, 4, true);
		
		double precio=p.getPrecio();
		
		Assert.assertEquals(320.0, precio, 0.1);
		
	}
	
	@Test
	
	public void verCantidadDeUnLibroAgregadoALaListaDeLibrosDelCiente(){
		Cliente c= new Cliente();
		Libro l = new Libro(35.0);
		c.agregarLibro(l);
		
		int tam= c.cantidadDeLibros();
		
		Assert.assertTrue(tam==1);
		
	
		
	}
	
	
	@Test
	
	public void verCantidadDe3LibrosAgregadosALaListaDeLibrosDelCiente(){
		Cliente c= new Cliente();
		Libro l = new Libro(35.0);
		Libro q = new Libro(35.0);
		Libro w = new Libro(35.0);
		c.agregarLibro(l);
		c.agregarLibro(q);
		c.agregarLibro(w);
		
		int tam= c.cantidadDeLibros();
		
		Assert.assertTrue(tam==3);
		
	
		
	}
	
	
	@Test
	public void verCantidadDeUnaRevistaAgregadaALaListaDeRevistasdelCliente(){
		
		Cliente c = new Cliente();
		Revista r= new Revista(100.0, 1, true);
		c.agregarRevista(r);
		
		int tam=c.cantidadDeRevistas();

		Assert.assertTrue(tam==1);
	
		
	}
	
	@Test
	public void verCantidadDe3RevistasAgregadasALaListaDeRevistasDelCliente(){
		
		Cliente c = new Cliente();
		Revista r= new Revista(100.0, 1, true);
		Revista z= new Revista(100.0, 1, true);
		Revista y= new Revista(100.0, 1, true);
		c.agregarRevista(r);
		c.agregarRevista(z);
		c.agregarRevista(y);
		
		
		int tam=c.cantidadDeRevistas();

		Assert.assertTrue(tam==3);
	
		
	}
	
	@Test
	public void verCantidadUnArticuloAgregadoALaListaDeArticulosDelCliente(){
		
		Cliente c = new Cliente();
		ArticuloDeLibreria a = new ArticuloDeLibreria(100.0);
		c.agregarArticulo(a);
		
		int tam=c.cantidadDeArticulos();
		
		Assert.assertTrue(tam==1);
		
	
	}
	
	@Test
	public void verCantidadDe3ArticuloAgregadoALaListaDeArticulosDelCliente(){
		
		Cliente c = new Cliente();
		ArticuloDeLibreria a = new ArticuloDeLibreria(100.0);
		ArticuloDeLibreria b = new ArticuloDeLibreria(100.0);
		ArticuloDeLibreria f = new ArticuloDeLibreria(100.0);
		c.agregarArticulo(a);
		c.agregarArticulo(b);
		c.agregarArticulo(f);
		
		int tam=c.cantidadDeArticulos();
		
		Assert.assertTrue(tam==3);
			
	}
	
	@Test
	public void verCantidadDeUnPeriodicoAgregadoALaListaDePeriodicosDelCliente(){
		
		Cliente c = new Cliente();
		Periodico p = new Periodico(100.0, 1, true);
		c.agregarPeriodico(p);
		
		int tam=c.cantidadDePeriodicos();
		
		
		Assert.assertTrue(tam==1);
		
	}
	
	@Test
	public void verCantidadDe3PeriodicosAgregadoALaListaDePeriodicosDelCliente(){
		
		Cliente c = new Cliente();
		Periodico p = new Periodico(100.0, 1, true);
		Periodico j = new Periodico(100.0, 1, true);
		Periodico s = new Periodico(100.0, 1, true);
		c.agregarPeriodico(p);
		c.agregarPeriodico(j);
		c.agregarPeriodico(s);
		
		int tam=c.cantidadDePeriodicos();
		
		
		Assert.assertTrue(tam==3);
		
	}

	@Test
	public void agregarClienteALaLibreria(){
		
		Libreria libreria = new Libreria();
		Cliente lucia= new Cliente();
		libreria.agregarCliente(lucia);
		
		int tam=libreria.cantidadDeClientes();
		
		Assert.assertTrue(tam==1);
	}
	
	@Test
	public void agregarClientesALaLibreria(){
		
		Libreria libreria = new Libreria();
		Cliente lucia= new Cliente();
		Cliente lucas= new Cliente();
		Cliente martin= new Cliente();
		Cliente marcos= new Cliente();
		libreria.agregarCliente(lucia);
		libreria.agregarCliente(lucas);
		libreria.agregarCliente(martin);
		libreria.agregarCliente(marcos);
		
		int tam=libreria.cantidadDeClientes();
		
		Assert.assertTrue(tam==4);
	}
	
	

	@Test
	public void verMontoDe3LibrosAgregadosALaListaDeLibrosDelCiente(){
	
		Cliente c= new Cliente();
		Libro l = new Libro(30.0);
		Libro q = new Libro(30.0);
		Libro w = new Libro(30.0);
		c.agregarLibro(l);
		c.agregarLibro(q);
		c.agregarLibro(w);
		
		
		double costo= c.calcularMontoLibros();
		
		
		Assert.assertTrue(costo==90);
		
	
	}

	@Test
	public void verMontoDe3ArticulosAgregadosEnElListadoDelCliente(){
		Cliente c = new Cliente();
		ArticuloDeLibreria a = new ArticuloDeLibreria(100.0);
		ArticuloDeLibreria b = new ArticuloDeLibreria(100.0);
		ArticuloDeLibreria f = new ArticuloDeLibreria(100.0);
		c.agregarArticulo(a);
		c.agregarArticulo(b);
		c.agregarArticulo(f);
		
		double costo=c.calcularMontoArticulosLibreria();
		
		Assert.assertTrue(costo==363);
		
		
	}
	
	@Test 
	public void verMontoDe3PeriodicosAgregadosEnElListadoDelCliente(){
		Cliente c= new Cliente();
		
		Periodico p = new Periodico(100.0, 1, true);
		Periodico m = new Periodico(100.0, 1, true);
		Periodico h = new Periodico(100.0, 1, true);
		
		c.agregarPeriodico(p);
		c.agregarPeriodico(m);
		c.agregarPeriodico(h);
		
		double costo= c.calcularMontoPeriodicos();
		
		Assert.assertTrue(costo==240);
		
		
	}
	
	
	@Test
	public void verMontoDeUnaRevistasAgregadasEnElListadoDelCliente(){
		Cliente c = new Cliente();
		Revista r= new Revista(100.0, 1, true);
		Revista z= new Revista(100.0, 1, true);
		Revista y= new Revista(100.0, 1, true);
		c.agregarRevista(r);
		c.agregarRevista(z);
		c.agregarRevista(y);
		
		
		int tam=c.cantidadDeRevistas();

	
		double costo=c.calcularMontoRevista();
		
		
		Assert.assertEquals(240.0, costo, 0.1);
	}
	
	@Test
	public void calcularMontoTotalDesdeElCliente(){
		Cliente c= new Cliente();
		
		Periodico p = new Periodico(100.0, 1, true);
		Revista r= new Revista(100.0, 1, true);
		Libro l = new Libro(30.0);
		ArticuloDeLibreria a = new ArticuloDeLibreria(100.0);
		
		c.agregarPeriodico(p);
		c.agregarRevista(r);
		c.agregarArticulo(a);
		c.agregarLibro(l);
		
		double costo = c.calcularMontoTotal();
		
		Assert.assertEquals(311.0, costo, 0.1);
	}
	
	@Test
	public void calcularMontoDeCliente(){
		
		Libreria libreria = new Libreria();
		
		Cliente c= new Cliente();
		
		Periodico p = new Periodico(100.0, 1, true);
		Revista r= new Revista(100.0, 1, true);
		Libro l = new Libro(30.0);
		ArticuloDeLibreria a = new ArticuloDeLibreria(100.0);
		
		c.agregarPeriodico(p);
		c.agregarRevista(r);
		c.agregarArticulo(a);
		c.agregarLibro(l);
		
		libreria.agregarCliente(c);
		
		double costo = libreria.calcularMontoTotal(c);
		
		Assert.assertEquals(311.0, costo, 0.1);
	}
	
	
}
