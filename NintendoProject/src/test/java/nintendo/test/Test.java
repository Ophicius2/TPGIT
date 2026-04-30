package nintendo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import nintendo.model.Achat;
import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Hybride;
import nintendo.model.Jeu;
import nintendo.model.Portable;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adresse adresseD = new Adresse("15", "rue de Mario", "Tokyo");
		Boutique boutiqueD = new Boutique("Boutique du Lac", adresseD);

		//console
		Hybride c1 = new Hybride("swatch 1",4000,LocalDate.parse("2020-08-10"));
		Hybride c2 = new Hybride("swatch 2",5000,LocalDate.parse("2025-08-10"));
		Portable c3 = new Portable("3do",4000,LocalDate.parse("2020-08-10"));
		Portable c4 = new Portable("2d",4000,LocalDate.parse("2020-08-10"));
		Salon c5 = new Salon("playstation",4000,LocalDate.parse("2020-08-10"));

		Jeu j1 = new Jeu("mario kart",c1,boutiqueD);
		Jeu j2 = new Jeu("animal across",c2,boutiqueD);
		Jeu j3 = new Jeu("Jordan adventure country returns",c3,boutiqueD);
		Jeu j4 = new Jeu("mario kart",c4,boutiqueD);
		Jeu j5 = new Jeu("mario kart",c5,boutiqueD);

		Achat a1 = new Achat(j3,LocalDate.now(),50);
		List <Achat> achatsD2 = new ArrayList<Achat>();
		achatsD2.add(a1);

		Client clientD1 = new Client("Floyd", "George",null);
		Client clientD2 = new Client("Valls", "Emmanuel",achatsD2);

	}

}
