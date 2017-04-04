import org.junit.Test;


public class FactoresPrimosTest {


	@Test
	public void factoresDe25SinFormato(){
		String[]argumentos={"25"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe25ConFormatoQuiet(){
		String[]argumentos={"25", "--format=quiet"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe25ConFormatoPretty(){
		String[]argumentos={"25", "--format=pretty"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe25ConFormatoIncorrecto(){
		String[]argumentos={"25", "--format=yerba"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14SinFormato(){
		String[]argumentos={"14"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14ConFormatoQuiet(){
		String[]argumentos={"14", "--format=quiet"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe14ConFormatoPretty(){
		String[]argumentos={"14", "--format=pretty"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe14ConFormatoIncorrecto(){
		String[]argumentos={"14", "--format=yerba"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe9SinFormato(){
		String[]argumentos={"9"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe9ConFormatoQuiet(){
		String[]argumentos={"9", "--format=quiet"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe95ConFormatoPretty(){
		String[]argumentos={"9", "--format=pretty"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe95ConFormatoIncorrecto(){
		String[]argumentos={"9", "--format=yerba"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe85SinFormato(){
		String[]argumentos={"85"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe85ConFormatoQuiet(){
		String[]argumentos={"85", "--format=quiet"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe85ConFormatoPretty(){
		String[]argumentos={"85", "--format=pretty"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe85ConFormatoIncorrecto(){
		String[]argumentos={"85", "--format=yerba"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe62SinFormato(){
		String[]argumentos={"62"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe62ConFormatoQuiet(){
		String[]argumentos={"62", "--format=quiet"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe62ConFormatoPretty(){
		String[]argumentos={"62", "--format=pretty"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe62ConFormatoIncorrecto(){
		String[]argumentos={"62", "--format=yerba"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe230SinFormato(){
		String[]argumentos={"230"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe230ConFormatoQuiet(){
		String[]argumentos={"230", "--format=quiet"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe230ConFormatoPretty(){
		String[]argumentos={"230", "--format=pretty"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe230ConFormatoIncorrecto(){
		String[]argumentos={"230", "--format=yerba"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe7787SinFormato(){
		String[]argumentos={"7787"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe7787ConFormatoQuiet(){
		String[]argumentos={"7787", "--format=quiet"};
		FactoresPrimos.main(argumentos);
	}
	@Test
	public void factoresDe7787ConFormatoPretty(){
		String[]argumentos={"7787", "--format=pretty"};
		FactoresPrimos.main(argumentos);
	}
	
	@Test
	public void factoresDe7787ConFormatoIncorrecto(){
		String[]argumentos={"7787", "--format=yerba"};
		FactoresPrimos.main(argumentos);
	}

	
}
