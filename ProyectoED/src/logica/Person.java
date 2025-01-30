/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author rodri
 */
public class Person {
    private String nick;
    private String password;
    private Enum country;
    private String occupation;
    private String p;

    public Person(String nick, String password, String country, String occupation) {
        setNick(nick);
        setPassword(password);
        setOccupation(occupation);
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

  
    
    
}
