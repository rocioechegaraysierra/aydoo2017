import org.junit.Assert;
import org.junit.Test;


public class IntegracionTest {

	@Test
	public void partidoMasVotadoEnUnaProvincia(){
		JuntaElectoral junta = new JuntaElectoral();
		Provincia tucuman = new Provincia("Tucuman");
		Partido rojo = new Partido("Rojo");
		Partido azul = new Partido("Azul");
		Candidato jose = new Candidato("Jose");
		Candidato juan = new Candidato("Juan");
		rojo.agregarCandidatos(jose);
		azul.agregarCandidatos(juan);
		tucuman.agregarPartido(rojo);
		tucuman.agregarPartido(azul);
		junta.agregarProvincia(tucuman);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, azul, juan);
		
		String nombre = junta.partidoMasVotado(tucuman);
		
		Assert.assertTrue(nombre == "Rojo");
		
	}
	
	@Test
	public void candidatoMasVotadoEnUnaProvincia(){
		JuntaElectoral junta = new JuntaElectoral();
		Provincia tucuman = new Provincia("Tucuman");
		Partido rojo = new Partido("Rojo");
		Partido azul = new Partido("Azul");
		Candidato jose = new Candidato("Jose");
		Candidato juan = new Candidato("Juan");
		rojo.agregarCandidatos(jose);
		azul.agregarCandidatos(juan);
		tucuman.agregarPartido(rojo);
		tucuman.agregarPartido(azul);
		junta.agregarProvincia(tucuman);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, azul, juan);
		
		String nombre = junta.candidatoMasVotado();
		
		Assert.assertTrue(nombre == "Jose");
	}
	
	@Test
	public void candidatoMasVotadoConMasDeUnaProvincia(){
		JuntaElectoral junta = new JuntaElectoral();
		Provincia tucuman = new Provincia("Tucuman");
		Provincia jujuy = new Provincia("Jujuy");
		Partido rojo = new Partido("Rojo");
		Partido azul = new Partido("Azul");
		Candidato jose = new Candidato("Jose");
		Candidato juan = new Candidato("Juan");
		rojo.agregarCandidatos(jose);
		azul.agregarCandidatos(juan);
		tucuman.agregarPartido(rojo);
		tucuman.agregarPartido(azul);
		jujuy.agregarPartido(rojo);
		jujuy.agregarPartido(azul);
		junta.agregarProvincia(jujuy);
		junta.agregarProvincia(tucuman);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, azul, juan);
		junta.votar(jujuy, azul, juan);
		junta.votar(jujuy, azul, juan);
		
		String nombre = junta.candidatoMasVotado();
		
		Assert.assertTrue(nombre == "Jose");
	}
	
	@Test
	public void cantidadDeVotosDeUnCandidatoEnVariasProvincias(){
		JuntaElectoral junta = new JuntaElectoral();
		Provincia tucuman = new Provincia("Tucuman");
		Provincia jujuy = new Provincia("Jujuy");
		Partido rojo = new Partido("Rojo");
		Partido azul = new Partido("Azul");
		Candidato jose = new Candidato("Jose");
		Candidato juan = new Candidato("Juan");
		rojo.agregarCandidatos(jose);
		azul.agregarCandidatos(juan);
		tucuman.agregarPartido(rojo);
		tucuman.agregarPartido(azul);
		jujuy.agregarPartido(rojo);
		jujuy.agregarPartido(azul);
		junta.agregarProvincia(jujuy);
		junta.agregarProvincia(tucuman);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, azul, juan);
		junta.votar(jujuy, rojo, jose);
		junta.votar(jujuy, azul, juan);
		junta.votar(jujuy, azul, juan);
		
		int cantidad= jose.cantidadDeVotos();
		
		Assert.assertTrue(cantidad == 5);
	}
	
	@Test
	public void cantidadDeVotosDeUnCandidatoEnUnaProvincia(){
		JuntaElectoral junta = new JuntaElectoral();
		Provincia tucuman = new Provincia("Tucuman");
		Provincia jujuy = new Provincia("Jujuy");
		Partido rojo = new Partido("Rojo");
		Partido azul = new Partido("Azul");
		Candidato jose = new Candidato("Jose");
		Candidato juan = new Candidato("Juan");
		rojo.agregarCandidatos(jose);
		azul.agregarCandidatos(juan);
		tucuman.agregarPartido(rojo);
		tucuman.agregarPartido(azul);
		jujuy.agregarPartido(rojo);
		jujuy.agregarPartido(azul);
		junta.agregarProvincia(jujuy);
		junta.agregarProvincia(tucuman);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, rojo, jose);
		junta.votar(tucuman, azul, juan);

		int cantidad= jose.cantidadDeVotos();
		
		Assert.assertTrue(cantidad == 4);
	}
	
}
