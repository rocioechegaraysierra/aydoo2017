import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Provincia {

	List<Partido> partidos;
	String nombre;
		
	public Provincia(String nombre){
		partidos=new ArrayList<Partido>();
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void agregarPartido(Partido partido){
		partidos.add(partido);
	}
	
	public String partidoMasVotado(){
		String masVotado=partidos.get(0).nombre;
		int masVotos=partidos.get(0).cantidadDeVotosDelPartido();
		
		Iterator<Partido> it= partidos.iterator();
		while(it.hasNext()){
			Partido partido= it.next();
			if(partido.cantidadDeVotosDelPartido()> masVotos ){
				masVotado=partido.nombre;
				masVotos=partido.cantidadDeVotosDelPartido();
			}
		}
		
		return masVotado;
	}
	
	public void votar(Partido partido, Candidato candidato){
		candidato.votar();
	}
	
	public String candidatoMasVotado(){
		
		String nombreDelCandidato = this.partidos.get(0).candidatoMasVotado();
		int cantidadDeVotosDelCandidato=this.partidos.get(0).cantidadDeVotosDelPartido();
		
		Iterator<Partido> itPartido= this.partidos.iterator();
		while(itPartido.hasNext()){
			Partido partido = itPartido.next();
			if(partido.cantidadDeVotosDelCandidatoMasVotado()> cantidadDeVotosDelCandidato){
				cantidadDeVotosDelCandidato= partido.cantidadDeVotosDelCandidatoMasVotado();
				nombreDelCandidato= partido.candidatoMasVotado();
			}
		}
		return nombreDelCandidato;
	}

	public int mayorCantidadDeVotosANivelProvincia() {
		int cantidadDeVotosDelCandidato=this.partidos.get(0).cantidadDeVotosDelPartido();
		Iterator<Partido> itPartido= this.partidos.iterator();
		while(itPartido.hasNext()){
			Partido partido = itPartido.next();
			if(partido.cantidadDeVotosDelCandidatoMasVotado()> cantidadDeVotosDelCandidato){
				cantidadDeVotosDelCandidato= partido.cantidadDeVotosDelCandidatoMasVotado();
				
			}
		}
		return cantidadDeVotosDelCandidato;
	}
	
}
