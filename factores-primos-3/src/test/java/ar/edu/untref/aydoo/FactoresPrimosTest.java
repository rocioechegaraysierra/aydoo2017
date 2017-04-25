package ar.edu.untref.aydoo;

import java.io.IOException;

import org.junit.Test;


public class FactoresPrimosTest {

	

	
	@Test
	public void factoresDe25ConFormatoQuietAscendente() throws IOException{
		String[]argumentos={"25", "--format=quiet", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe25ConFormatoQuietDescendente() throws IOException{
		String[]argumentos={"25", "--format=quiet", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe25ConFormatoPrettyAscendente() throws IOException{
		String[]argumentos={"25", "--format=pretty", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe25ConFormatoPrettyDescendente() throws IOException{
		String[]argumentos={"25", "--format=pretty", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	

	
	@Test
	public void factoresDe14ConFormatoQuietAscendente() throws IOException{
		String[]argumentos={"14", "--format=quiet", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14ConFormatoQuietDescendente() throws IOException{
		String[]argumentos={"14", "--format=quiet", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe14ConFormatoPrettyAscendente() throws IOException{
		String[]argumentos={"14", "--format=pretty", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14ConFormatoPrettyDescendente() throws IOException{
		String[]argumentos={"14", "--format=pretty", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	
	
	
	@Test
	public void factoresDe9ConFormatoQuietAscendente() throws IOException{
		String[]argumentos={"9", "--format=quiet", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe9ConFormatoQuietDescendente() throws IOException{
		String[]argumentos={"9", "--format=quiet", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe95ConFormatoPrettyAscendente() throws IOException{
		String[]argumentos={"9", "--format=pretty", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe95ConFormatoPrettyDescendente() throws IOException{
		String[]argumentos={"9", "--format=pretty", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe85ConFormatoQuietAscendente() throws IOException{
		String[]argumentos={"85", "--format=quiet", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe85ConFormatoQuietDescendente() throws IOException{
		String[]argumentos={"85", "--format=quiet", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe85ConFormatoPrettyAscendente() throws IOException{
		String[]argumentos={"85", "--format=pretty",  "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe85ConFormatoPrettyDescendente() throws IOException{
		String[]argumentos={"85", "--format=pretty", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	
	@Test
	public void factoresDe62ConFormatoQuietAscendete() throws IOException{
		String[]argumentos={"62", "--format=quiet", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe62ConFormatoQuietDescendete() throws IOException{
		String[]argumentos={"62", "--format=quiet", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe62ConFormatoPrettyAscendente() throws IOException{
		String[]argumentos={"62", "--format=pretty", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe62ConFormatoPrettyDescendente() throws IOException{
		String[]argumentos={"62", "--format=pretty", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	
	@Test
	public void factoresDe230ConFormatoQuietAscendente() throws IOException{
		String[]argumentos={"230", "--format=quiet", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe230ConFormatoQuietDescendente() throws IOException{
		String[]argumentos={"230", "--format=quiet", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe230ConFormatoPrettyAscendente() throws IOException{
		String[]argumentos={"230", "--format=pretty", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe230ConFormatoPrettyDescendente() throws IOException{
		String[]argumentos={"230", "--format=pretty", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	
	
	@Test
	public void factoresDe7787ConFormatoQuietAscendente() throws IOException{
		String[]argumentos={"7787", "--format=quiet", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe7787ConFormatoQuietDescendente() throws IOException{
		String[]argumentos={"7787", "--format=quiet", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe7787ConFormatoPrettyAscendente() throws IOException{
		String[]argumentos={"7787", "--format=pretty", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	
	@Test
	public void factoresDe7787ConFormatoPrettyDescendente() throws IOException{
		String[]argumentos={"7787", "--format=pretty", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14ConFormatoIncorrecto() throws IOException{
		String[]argumentos={"14","--format=Yerba", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14ConFormatoPrettyConSortVacio() throws IOException{
		String[]argumentos={"14", "--format=pretty"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14ConFormatoQuietConSortVacio() throws IOException{
		String[]argumentos={"14", "--format=quiet"};
		FactoresPrimos.main(argumentos);
	}

	
	@Test
	public void factoresDe14ConFormatoPrettyAscendenteSinArchivo() throws IOException{
		String[]argumentos={"14", "--format=pretty", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14ConFormatoPrettyDescendenteSinArchivo() throws IOException{
		String[]argumentos={"14", "--format=pretty", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14ConFormatoQuietAscendenteSinArchivo() throws IOException{
		String[]argumentos={"14", "--format=quiet", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14ConFormatoQuietDescendenteSinArchivo() throws IOException{
		String[]argumentos={"14", "--format=quiet", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14SinFormatoSortAscendenteSinArchivo() throws IOException{
		String[]argumentos={"14",  "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14SinFormatoSortDescendenteSinArchivo() throws IOException{
		String[]argumentos={"14",  "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14ConFormatoPrettyAscendenteConArchivo() throws IOException{
		String[]argumentos={"14", "--format=pretty", "--sort=asc", "--output-file=salida.txt"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14ConFormatoPrettyDescendenteConArchivo() throws IOException{
		String[]argumentos={"14", "--format=pretty", "--sort=des", "--output-file=salida.txt"};
		FactoresPrimos.main(argumentos);
	}
	
	
}
