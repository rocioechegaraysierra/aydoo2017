import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Provincia {

	List<Partido> partidos;
	int votos;
		
	public Provincia(){
		partidos=new ArrayList<Partido>();
		this.votos=0;
	}
	
	public void agregarPartido(Partido partido){
		partidos.add(partido);
		
	}
	
	public String partidoMasVotado(){
		String masVotado=partidos.get(0).nombre;
		int masVotos=partidos.get(0).votos;
		
		Iterator<Partido> it= partidos.iterator();
		while(it.hasNext()){
			Partido partido= it.next();
			if(partido.votos> masVotos ){
				masVotado=partido.nombre;
				masVotos=partido.votos;
			}
		}
		
		return masVotado;
	}
	
	public void votar(Partido partido, Candidato candidato){
		partido.votar(candidato);
		candidato.votar();
		this.votos+=1;
	}
	
	public int cantidadDeVotos(){
		return this.votos;
	}
	
	
	
}
