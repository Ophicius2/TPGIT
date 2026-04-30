package nintendo.test;

import java.io.Console;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adresse adresseD = new Adresse("15", "rue de Mario", "Tokyo");
		Boutique boutiqueD = new Boutique("Boutique du Lac", adresseD);
		
		Client clientD1 = new Client("Floyd", "George");
		Client clientD2 = new Client("Valls", "Emmanuel");

		Console c1 = new Console("swatch 1");
		Console c2 = new Console("swatch 2");
		Console c3 = new Console("3do");
		Console c4 = new Console("2d");
		Console c5 = new Console("playstation");
		
		Jeu j1 = new Jeu("mario kart",c1,boutiqueD);
		Jeu j2 = new Jeu("animal across",c2,boutiqueD);
		Jeu j3 = new Jeu("Jordan adventure country returns",c3,boutiqueD);
		Jeu j4 = new Jeu("mario kart",c4,boutiqueD);
		Jeu j5 = new Jeu("mario kart",c5,boutiqueD);
	}

}
