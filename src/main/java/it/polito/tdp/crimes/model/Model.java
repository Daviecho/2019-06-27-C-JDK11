package it.polito.tdp.crimes.model;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import it.polito.tdp.crimes.db.EventsDao;

public class Model {
	private Graph<String, DefaultWeightedEdge> grafo;
	private EventsDao dao;
	
	public Model() {
		this.dao = new EventsDao();
	}
	
	public void creaGrafo(String categoria, int giorno) {
		this.grafo = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
		
		//aggiungo vertici
		Graphs.addAllVertices(this.grafo, this.dao.getVertici(categoria, giorno));
		
		//Aggiungo archi
		
		
	}
}
