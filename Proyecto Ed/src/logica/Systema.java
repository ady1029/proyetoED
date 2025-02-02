package logica;

import java.util.Iterator;
import cu.edu.cujae.ceis.graph.LinkedGraph;
import cu.edu.cujae.ceis.graph.interfaces.ILinkedWeightedEdgeNotDirectedGraph;
import cu.edu.cujae.ceis.graph.vertex.Vertex;

public class System {
    private String name;
    private ILinkedWeightedEdgeNotDirectedGraph graph;

    public Systema(String name) {
        this.name = name;
        this.graph = new LinkedGraph();
    }
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ILinkedWeightedEdgeNotDirectedGraph getGraph() {
        return graph;
    }

    public void setGraph(ILinkedWeightedEdgeNotDirectedGraph graph) {
        this.graph = graph;
    }
   
    public boolean login(String nick,String password ) {
    	boolean correcto= false;
    	Iterator <Vertex> it= graph.getVerticesList().iterator();
    	while(it.hasNext() && !correcto) {
    		Vertex actual= it.next();
    		if(((Person) actual.getInfo()).getNick().equalsIgnoreCase(nick) && ((Person) actual.getInfo()).getPassword().equalsIgnoreCase(password)) {
    			correcto = true;
    		}
    	}
    	return correcto;    	
    }
    public boolean registrarse(String nick, String password,String country, String occupation) {
    	boolean registrado= false;
    	Vertex aux= findNick(nick);
    	if(aux == null) {
    		graph.insertVertex(new Person(nick, password, country, occupation));
    		registrado= true;
    	}    	
    	return registrado;
    	
    }
    
    public Vertex findNick(String nick) {
    	Vertex aux = null;
    	Iterator <Vertex> it= graph.getVerticesList().iterator();
    	while(it.hasNext() && aux== null) {
    		Vertex actual= it.next();
    		if(((Person) actual.getInfo()).getNick().equalsIgnoreCase(nick))
    			aux = actual;
    		}
    	return aux;
    }
    
    
}
