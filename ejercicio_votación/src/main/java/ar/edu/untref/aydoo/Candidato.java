
public class Candidato {

	String nombre;
	int votos;
	
	public Candidato(String nombre){
		this.nombre=nombre;
		this.votos=0;
	}
	
	
	public void votar(){
		this.votos+=1;
	}
}
