import java.util.ArrayList;
import java.util.List;


public class Partido {
	
	String nombre;
	List<Candidato> candidatos;
	int votos;
	
	public Partido(String nombre){
		this.candidatos= new ArrayList<Candidato>();
		this.votos=0;
		this.nombre=nombre;
	}
	
	public void agregarCandidatos(Candidato candidato){
		this.candidatos.add(candidato);
	}
	
	public void votar(Candidato candidato){
		this.votos+=1;
		candidato.votar();
		
	}

}
