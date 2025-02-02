package logica;

import java.util.Queue;

public class Person {
    private String nick;
    private String password;
    private String country;
    private String occupation;
    private Queue <Solicitud> solicitudAmistad;

    public Person(String nick, String password, String country,String country1) {
        setNick(nick);
        setPassword(password);
        setOccupation(occupation);
        this.country = country1;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Queue<Solicitud> getSolicitudAmistad() {
		return solicitudAmistad;
	}

	public void setSolicitudAmistad(Queue<Solicitud> solicitudAmistad) {
		this.solicitudAmistad = solicitudAmistad;
	}

  
    
    
}
