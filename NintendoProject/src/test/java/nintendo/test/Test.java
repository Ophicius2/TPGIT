package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adresse adresseD = new Adresse("15", "rue de Mario", "Tokyo");
		Boutique boutiqueD = new Boutique("Boutique du Lac", adresseD);
		
		Client clientD1 = new Client("Floyd", "George");
		Client clientD2 = new Client("Valls", "Emmanuel");
	}

}
