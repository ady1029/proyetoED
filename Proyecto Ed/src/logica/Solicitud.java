package logica;

public class Request{
	private Person PersonaEnvia; 
	private int cantdTrabajos;
	public Person getPersonaEnvia() {
		return PersonaEnvia;
	}
	public void setPersonaEnvia(Person personaEnvia) {
		PersonaEnvia = personaEnvia;
	}
	public int getCantdTrabajos() {
		return cantdTrabajos;
	}
	public void setCantdTrabajos(int cantdTrabajos) {
		this.cantdTrabajos = cantdTrabajos;
	}
	
	

}
