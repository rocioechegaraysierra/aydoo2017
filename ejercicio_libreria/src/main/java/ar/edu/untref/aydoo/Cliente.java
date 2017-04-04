import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Cliente {
	
	List<Libro> libros;
	List<Revista> revistas;
	List<ArticuloDeLibreria> articulos;
	List <Periodico> periodicos;
	String nombre;
	String apellido;
	String telefono;
	
	String direccion;
	
	public Cliente(String nombre, String apellido, String telefono, String direccion){
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.telefono=telefono;
		this.direccion=direccion;
		this.libros=new ArrayList<Libro>();
		this.revistas=new ArrayList<Revista>();
		this.articulos= new ArrayList<ArticuloDeLibreria>();
		this.periodicos=new ArrayList<Periodico>();
		
	}
	
	public void agregarLibro(Libro libro){
		this.libros.add(libro);
	}
	
	public void agregarRevista(Revista revista){
		this.revistas.add(revista);
	}
	
	public void agregarPeriodico(Periodico periodico){
		this.periodicos.add(periodico);
	}
	
	public void agregarArticulo(ArticuloDeLibreria articulo){
		this.articulos.add(articulo);
	}
	
	public int cantidadDeLibros(){
		return this.libros.size();
	}
	
	public int cantidadDeRevistas(){
		return this.revistas.size();
	}
	
	public int cantidadDeArticulos(){
		return this.articulos.size();
	}
	
	public int cantidadDePeriodicos(){
		return this.periodicos.size();
	}

	public double calcularMontoLibros(int mes){
		
		double monto=0;
		Iterator<Libro> itLibro = this.libros.iterator();
		while(itLibro.hasNext()){
			Libro libro= itLibro.next();
			if(libro.mesDeCompra==mes){
				monto+=libro.getPrecio();
			}
		}
		 return monto;
	}
	
	public double calcularMontoArticulosLibreria(int mes){
		double monto=0;
		Iterator<ArticuloDeLibreria> itArt= this.articulos.iterator();
		while(itArt.hasNext()){
			ArticuloDeLibreria articulo = itArt.next();
			if(articulo.mesDeCompra==mes){
				monto+=articulo.getPrecio();
			}
		}
		
		return monto;
	}
	
	
	public double calcularMontoPeriodicos(int mes){
		double monto=0;
		Iterator<Periodico> itPeriodico= this.periodicos.iterator();
		while(itPeriodico.hasNext()){
			Periodico periodico= itPeriodico.next();
			if(periodico.mesDeCompra==mes){
				monto+=periodico.getPrecio();
			}
		}
		
		return monto;
	}
	
	public double calcularMontoRevista(int mes){
		double monto=0;
		Iterator<Revista> itRevista= this.revistas.iterator();
		while(itRevista.hasNext()){
			Revista revista= itRevista.next();
			if(revista.mesDeCompra== mes){
				monto+=revista.getPrecio();
			}
		}
		
		return monto;
	}
	
	public double calcularMontoTotal(int mes){
		
		double montoTotal=0;
		
		montoTotal+= this.calcularMontoArticulosLibreria(mes);
		montoTotal+= this.calcularMontoLibros(mes);
		montoTotal+= this.calcularMontoPeriodicos(mes); 
		montoTotal+= this.calcularMontoRevista(mes);
		
		return montoTotal;
	}
	
	public List<Libro> getLibros() {
		return libros;
	}

	public List<Revista> getRevistas() {
		return revistas;
	}

	public List<ArticuloDeLibreria> getArticulos() {
		return articulos;
	}

	public List<Periodico> getPeriodicos() {
		return periodicos;
	}


	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}


	public String getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public List<Libro> buscarLibrosComprados(int mes) {
		
		List<Libro> librosBuscados= new ArrayList<Libro>();
		
		Iterator<Libro> itLibro = this.libros.iterator();
		while(itLibro.hasNext()){
			Libro libro= itLibro.next();
			if(libro.mesDeCompra==mes){
				librosBuscados.add(libro);
			}
		}
		
		return librosBuscados;
	}

	public List<Revista> buscarRevistasCompradas(int mes) {
		
		List<Revista> revistasBuscadas =new ArrayList<Revista>();
		
		Iterator<Revista> itRevista = this.revistas.iterator();
		while(itRevista.hasNext()){
			Revista revista= itRevista.next();
			if(revista.mesDeCompra== mes){
				revistasBuscadas.add(revista);
			}
		}
		
		return revistasBuscadas;
	}

	public List<Periodico> buscarPeriodicosComprados(int mes) {
		List<Periodico> periodicosBuscados = new ArrayList<Periodico>();
		
		Iterator<Periodico> itPer= this.periodicos.iterator();
		while(itPer.hasNext()){
			Periodico periodico = itPer.next();
			if(periodico.mesDeCompra== mes){
				periodicosBuscados.add(periodico);
			}
		}
		
		return periodicosBuscados;
	}

	public List<ArticuloDeLibreria> buscarArticulosComprados(int mes) {
		List<ArticuloDeLibreria> articulos = new ArrayList<ArticuloDeLibreria>();
		
		Iterator<ArticuloDeLibreria> itArt = this.articulos.iterator();
		while(itArt.hasNext()){
			ArticuloDeLibreria articulo = itArt.next();
			if(articulo.mesDeCompra == mes){
				articulos.add(articulo);
			}
		}
		return articulos;
	}




	

}

