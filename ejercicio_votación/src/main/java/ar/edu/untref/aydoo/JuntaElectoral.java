import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class JuntaElectoral {

	List<Provincia> provincias;
	
	public JuntaElectoral(){
		this.provincias= new ArrayList<Provincia>();
	}
	
	public void agregarProvincia(Provincia provincia){
		provincias.add(provincia);
	}
	
	
	public void votar(Provincia provincia, Partido partido, Candidato candidato){
		provincia.votar(partido, candidato);
	}
	
	public String partidoMasVotado(Provincia provincia){
		return provincia.partidoMasVotado();
	}
	
	public String candidatoMasVotado(){
		
		String nombreCandidatoNacional= this.provincias.get(0).candidatoMasVotado();
		int cantidadDeVotos = 0;
		
		Iterator<Provincia> itProvincia = this.provincias.iterator();
		while(itProvincia.hasNext()){
			Provincia provincia = itProvincia.next();
			if(cantidadDeVotos < provincia.mayorCantidadDeVotosANivelProvincia()){
				cantidadDeVotos= provincia.mayorCantidadDeVotosANivelProvincia();
				nombreCandidatoNacional= provincia.candidatoMasVotado();
			}
		}
		
		
		return nombreCandidatoNacional;
	}
	
}
