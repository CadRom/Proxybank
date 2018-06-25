package lanceur;

import java.util.ArrayList;
import java.util.Set;

import domaine.Agence;
import domaine.Client;
import domaine.ClientEntreprise;
import domaine.ClientParticulier;
import domaine.Conseiller;

public class ClassePrincipale {

	public static void main(String[] args) {

		// JEU DE TEST
		Client client1 = new ClientParticulier(1, "273654988", "Dupont", "Antoine", "2 rue de la Garonne", 31400, "Toulouse", "0613389493");
		Client client2 = new ClientParticulier(2, "131644987", "Chevalier", "Helene", "3 rue de la Pomme", 74400, "Paris", "0712289492");
		Client client3 = new ClientParticulier(3, "201654970", "Ba", "Christine", "5 rue de la Poire", 75300, "Bordeaux", "0913399493");
		Client client4 = new ClientEntreprise(4, "Siret131604", "Microsoft");
		Client client5 = new ClientParticulier(5, "201654931", "Marcelin", "Michel", "82 rue de la Paix", 10200, "Nice", "0613089493");
		Client client6 = new ClientEntreprise(6, "Siret1356549", "Oracle");
		Client client7 = new ClientParticulier(7, "201654983", "Marley", "Bob", "91 chemin de la Gare", 11000, "London", "5613889493");
		Client client8 = new ClientParticulier(8, "131656907", "Dalton", "Joe", "12 impasse du bateau", 66200, "Berlin", "7613289490");
		Client client9 = new ClientParticulier(9, "231659936", "Redding", "Otis", "25 rue Jeanjean", 31400, "Madrid", "1613689491");
		
		// CONSEILLER A
		ArrayList<Client> carnetClientA = new ArrayList<Client>();
		carnetClientA.add(client1);
		carnetClientA.add(client2);
		carnetClientA.add(client3);
		carnetClientA.add(client4);
		Conseiller conseillerA = new Conseiller("matriculeA", carnetClientA);

		// CONSEILLER B
		ArrayList<Client> carnetClientB = new ArrayList<Client>();
		carnetClientB.add(client5);
		carnetClientB.add(client6);
		Conseiller conseillerB = new Conseiller("matriculeB", carnetClientB);
		
		// CONSEILLER C
		ArrayList<Client> carnetClientC = new ArrayList<Client>();
		carnetClientC.add(client7);
		carnetClientC.add(client8);
		Conseiller conseillerC = new Conseiller("matriculeC", carnetClientC);
		
		
		// CONSEILLER D
		ArrayList<Client> carnetClientD = new ArrayList<Client>();
		carnetClientD.add(client9);
		Conseiller conseillerD = new Conseiller("matriculeD", carnetClientD);
		
		// AGENCES		
		Agence agence1 = new Agence("377K", "27/05/2018");
		ArrayList<Conseiller> carnetConseiller1 = new ArrayList<Conseiller>();
		carnetConseiller1.add(conseillerA);
		carnetConseiller1.add(conseillerB);
		carnetConseiller1.add(conseillerC);
		agence1.setCarnetConseiller(carnetConseiller1);
			
		Agence agence2 = new Agence("021J", "18/06/2018");
		ArrayList<Conseiller> carnetConseiller2 = new ArrayList<Conseiller>();
		carnetConseiller2.add(conseillerD);
		agence2.setCarnetConseiller(carnetConseiller2);
		

	}

}
