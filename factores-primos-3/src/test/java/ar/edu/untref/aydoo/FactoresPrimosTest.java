import org.junit.Test;


public class FactoresPrimosTest {

	

	
	@Test
	public void factoresDe25ConFormatoQuietAscendente(){
		String[]argumentos={"25", "--format=quiet", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe25ConFormatoQuietDescendente(){
		String[]argumentos={"25", "--format=quiet", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe25ConFormatoPrettyAscendente(){
		String[]argumentos={"25", "--format=pretty", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe25ConFormatoPrettyDescendente(){
		String[]argumentos={"25", "--format=pretty", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	

	
	@Test
	public void factoresDe14ConFormatoQuietAscendente(){
		String[]argumentos={"14", "--format=quiet", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14ConFormatoQuietDescendente(){
		String[]argumentos={"14", "--format=quiet", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe14ConFormatoPrettyAscendente(){
		String[]argumentos={"14", "--format=pretty", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14ConFormatoPrettyDescendente(){
		String[]argumentos={"14", "--format=pretty", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	
	
	
	@Test
	public void factoresDe9ConFormatoQuietAscendente(){
		String[]argumentos={"9", "--format=quiet", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe9ConFormatoQuietDescendente(){
		String[]argumentos={"9", "--format=quiet", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe95ConFormatoPrettyAscendente(){
		String[]argumentos={"9", "--format=pretty", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe95ConFormatoPrettyDescendente(){
		String[]argumentos={"9", "--format=pretty", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe85ConFormatoQuietAscendente(){
		String[]argumentos={"85", "--format=quiet", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe85ConFormatoQuietDescendente(){
		String[]argumentos={"85", "--format=quiet", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe85ConFormatoPrettyAscendente(){
		String[]argumentos={"85", "--format=pretty",  "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe85ConFormatoPrettyDescendente(){
		String[]argumentos={"85", "--format=pretty", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	
	@Test
	public void factoresDe62ConFormatoQuietAscendete(){
		String[]argumentos={"62", "--format=quiet", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe62ConFormatoQuietDescendete(){
		String[]argumentos={"62", "--format=quiet", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe62ConFormatoPrettyAscendente(){
		String[]argumentos={"62", "--format=pretty", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe62ConFormatoPrettyDescendente(){
		String[]argumentos={"62", "--format=pretty", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	
	@Test
	public void factoresDe230ConFormatoQuietAscendente(){
		String[]argumentos={"230", "--format=quiet", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe230ConFormatoQuietDescendente(){
		String[]argumentos={"230", "--format=quiet", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe230ConFormatoPrettyAscendente(){
		String[]argumentos={"230", "--format=pretty", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe230ConFormatoPrettyDescendente(){
		String[]argumentos={"230", "--format=pretty", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	
	
	@Test
	public void factoresDe7787ConFormatoQuietAscendente(){
		String[]argumentos={"7787", "--format=quiet", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe7787ConFormatoQuietDescendente(){
		String[]argumentos={"7787", "--format=quiet", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe7787ConFormatoPrettyAscendente(){
		String[]argumentos={"7787", "--format=pretty", "--sort=asc"};
		FactoresPrimos.main(argumentos);
	}
	
	
	@Test
	public void factoresDe7787ConFormatoPrettyDescendente(){
		String[]argumentos={"7787", "--format=pretty", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14ConFormatoIncorrecto(){
		String[]argumentos={"14","--format=Yerba", "--sort=des"};
		FactoresPrimos.main(argumentos);
	}
	
	
}
