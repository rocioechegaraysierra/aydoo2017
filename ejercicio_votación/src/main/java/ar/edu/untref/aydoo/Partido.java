import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Partido {
	
	String nombre;
	List<Candidato> candidatos;
	
	public Partido(String nombre){
		this.candidatos= new ArrayList<Candidato>();
		this.nombre=nombre;
	}
	
	public void agregarCandidatos(Candidato candidato){
		this.candidatos.add(candidato);
	}
	
	public void votar(Candidato candidato){
		candidato.votar();
	}
	
	public int cantidadDeVotosDelPartido(){
		
		int votos=0;
		
		Iterator<Candidato> itCandidato = this.candidatos.iterator();
		while(itCandidato.hasNext()){
			Candidato candidato = itCandidato.next();
			votos+=candidato.cantidadDeVotos();
		}
		return votos;
	}
	
	public String candidatoMasVotado(){
		
		String nombre = this.candidatos.get(0).getNombre();
		int cantidadDeVotos= this.candidatos.get(0).cantidadDeVotos();
		
		Iterator<Candidato> itCandidato = this.candidatos.iterator();
		while(itCandidato.hasNext()){
			Candidato candidato = itCandidato.next();
			if(cantidadDeVotos<candidato.cantidadDeVotos()){
				nombre= candidato.getNombre();
				cantidadDeVotos= candidato.cantidadDeVotos();
			}
		}
		
		return nombre;
	}
	
	
	public int cantidadDeVotosDelCandidatoMasVotado(){
		
		int cantidadDeVotos= this.candidatos.get(0).cantidadDeVotos();
		
		Iterator<Candidato> itCandidato = this.candidatos.iterator();
		while(itCandidato.hasNext()){
			Candidato candidato = itCandidato.next();
			if(cantidadDeVotos<candidato.cantidadDeVotos()){
				cantidadDeVotos= candidato.cantidadDeVotos();
			}
		}
		
		return cantidadDeVotos;
	}

}
