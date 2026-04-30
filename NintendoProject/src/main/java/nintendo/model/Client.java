package nintendo.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private List<Achat> listeAchat = new ArrayList<Achat>();
	
	public Client(String nom, String prenom,List<Achat> listeAchat) { // client qui a deja fait un achat
		this.nom = nom;
		this.prenom = prenom;
		this.listeAchat=listeAchat;
	}
	
	public Client(String nom, String prenom) {//nouveau client
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public List<Achat> getListeAchat() {
		return listeAchat;
	}

	public void setListeAchat(List<Achat> listeAchat) {
		this.listeAchat = listeAchat;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + "]";
	}
}
