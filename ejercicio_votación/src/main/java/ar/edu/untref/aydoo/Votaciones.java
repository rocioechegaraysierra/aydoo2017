import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Votaciones {

	List<Provincia> provincias;
	List<Candidato> candidatosNacionales;
	int votos;
	
	public Votaciones(){
		this.provincias= new ArrayList<Provincia>();
		this.candidatosNacionales=new ArrayList<Candidato>();
		this.votos=0;
	}
	
	public void votar(Provincia provincia, Partido partido, Candidato candidato){
		provincia.votar(partido, candidato);
		candidatosNacionales.add(candidato);
		candidatosNacionales.get(0).votar();
		this.votos+=1;
	}
	
	public String partidoMasVotado(Provincia provincia){
		return provincia.partidoMasVotado();
	}
	
	public String candidatoMasVotado(){
		String masVotado=candidatosNacionales.get(0).nombre;
		int masVotos=candidatosNacionales.get(0).votos;
		
		Iterator<Candidato> it= candidatosNacionales.iterator();
		while(it.hasNext()){
			Candidato candidato= it.next();
			if(candidato.votos> masVotos ){
				masVotado=candidato.nombre;
				masVotos=candidato.votos;
			}
		}
		
		return masVotado;
	}
	
	public void agregarProvincia(Provincia provincia){
		provincias.add(provincia);
	}
	
	public int cantidadDeVotos(){
		return this.votos;
	}
}
