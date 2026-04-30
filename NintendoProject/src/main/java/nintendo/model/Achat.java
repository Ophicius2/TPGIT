package nintendo.model;

import java.time.LocalDate;

public class Achat {
	
	Jeu jeu;
	LocalDate dateachat;
	double prix;
	
	public Achat (Jeu jeu,LocalDate dateachat,double prix) {
		this.jeu = jeu;
		this.dateachat = dateachat;
		this.prix = prix;
		
	}

	public Jeu getJeu() {
		return jeu;
	}

	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}

	public LocalDate getDateachat() {
		return dateachat;
	}

	public void setDateachat(LocalDate dateachat) {
		this.dateachat = dateachat;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Achat [jeu=" + jeu + ", dateachat=" + dateachat + ", prix=" + prix + "]";
	}

}
