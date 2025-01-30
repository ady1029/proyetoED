/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import cu.edu.cujae.ceis.graph.LinkedGraph;
import cu.edu.cujae.ceis.graph.interfaces.ILinkedWeightedEdgeNotDirectedGraph;

/**
 *
 * @author rodri
 */
public class System {
    private String name;
    private ILinkedWeightedEdgeNotDirectedGraph graph;

    public System(String name, ILinkedWeightedEdgeNotDirectedGraph graph) {
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
   
     
    
}
