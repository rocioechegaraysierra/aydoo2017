
public class Candidato {

	public String nombre;
	private int votos;

	public Candidato(String nombre){
		this.nombre=nombre;
		this.votos=0;
	}
	
	public void votar(){
		this.votos+=1;
	}
	
	public int cantidadDeVotos(){
		return votos;
	}

	public String getNombre() {
		return nombre;
	}
}
