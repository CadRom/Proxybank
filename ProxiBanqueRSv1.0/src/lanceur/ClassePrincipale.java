package lanceur;

import java.util.ArrayList;
import java.util.Scanner;

import domaine.Agence;
import domaine.Client;
import domaine.ClientEntreprise;
import domaine.ClientParticulier;
import domaine.CompteCourant;
import domaine.CompteEpargne;
import domaine.Conseiller;


public class ClassePrincipale {

	public static void main(String[] args) {

		// NOUS ALLONS GENERER UN JEU D'AGENCE/CONSEILLERS/CLIENTS/COMPTE IL FAUDRAIT
		// NORMALMEENT TRAVAILLER EN BASE DE DONNEES

		// JEU DE TEST
		ClientParticulier client1 = new ClientParticulier(1, "273654988", "Dupont", "Antoine", "2 rue de la Garonne",
				31400, "Toulouse", "0613389493");
		ClientParticulier client2 = new ClientParticulier(2, "131644987", "Chevalier", "Helene", "3 rue de la Pomme",
				74400, "Paris", "0712289492");
		ClientParticulier client3 = new ClientParticulier(3, "201654970", "Ba", "Christine", "5 rue de la Poire", 75300,
				"Bordeaux", "0913399493");
		ClientEntreprise client4 = new ClientEntreprise(4, "Siret131604", "Microsoft");
		ClientParticulier client5 = new ClientParticulier(5, "201654931", "Marcelin", "Michel", "82 rue de la Paix",
				10200, "Nice", "0613089493");
		ClientEntreprise client6 = new ClientEntreprise(6, "Siret1356549", "Oracle");
		ClientParticulier client7 = new ClientParticulier(7, "201654983", "Marley", "Bob", "91 chemin de la Gare",
				11000, "London", "5613889493");
		ClientParticulier client8 = new ClientParticulier(8, "131656907", "Dalton", "Joe", "12 impasse du bateau",
				66200, "Berlin", "7613289490");
		ClientParticulier client9 = new ClientParticulier(9, "231659936", "Redding", "Otis", "25 rue Jeanjean", 31400,
				"Madrid", "1613689491");

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

		// COMPTES
		CompteEpargne compteEpargne1 = new CompteEpargne("100J", 10000, "25/06/2018");
		CompteEpargne compteEpargne2 = new CompteEpargne("101J", 500000, "25/06/2018");
		CompteEpargne compteEpargne3 = new CompteEpargne("102J", 5000000, "25/06/2018");
		CompteEpargne compteEpargne5 = new CompteEpargne("104J", 0, "25/06/2018");
		CompteEpargne compteEpargne7 = new CompteEpargne("106J", -100000, "25/06/2018");
		CompteEpargne compteEpargne8 = new CompteEpargne("107J", 0, "25/06/2018");

		CompteCourant compteCourant1 = new CompteCourant("100J", 2000, "25/06/2018");
		CompteCourant compteCourant2 = new CompteCourant("101J", 5000000, "25/06/2018");
		CompteCourant compteCourant3 = new CompteCourant("102J", 200, "25/06/2018");
		CompteCourant compteCourant4 = new CompteCourant("103J", 0, "25/06/2018");
		CompteCourant compteCourant5 = new CompteCourant("104J", 0, "25/06/2018");
		CompteCourant compteCourant6 = new CompteCourant("105J", 56561, "25/06/2018");
		CompteCourant compteCourant7 = new CompteCourant("106J", 0, "25/06/2018");
		CompteCourant compteCourant8 = new CompteCourant("107J", 5000, "25/06/2018");
		CompteCourant compteCourant9 = new CompteCourant("108J", 0, "25/06/2018");

		client1.setCompteCourant(compteCourant1);
		client1.setCompteEpargne(compteEpargne1);
		client2.setCompteCourant(compteCourant2);
		client2.setCompteEpargne(compteEpargne2);
		client3.setCompteCourant(compteCourant3);
		client3.setCompteEpargne(compteEpargne3);
		client4.setCompteCourant(compteCourant4); // entreprise
		client5.setCompteCourant(compteCourant5);
		client5.setCompteEpargne(compteEpargne5);
		client6.setCompteCourant(compteCourant6); // entreprise
		client7.setCompteCourant(compteCourant7);
		client7.setCompteEpargne(compteEpargne7);
		client8.setCompteCourant(compteCourant8);
		client8.setCompteEpargne(compteEpargne8);
		client8.setCompteCourant(compteCourant9);

		// EXECUTION DU PROGRAME

		char reponse;
		Scanner scn = new Scanner(System.in);
		System.out.println("Etes vous le [G]erant ou un [C]onseiller?");
		reponse = scn.nextLine().charAt(0);

		if (reponse == 'G') {
			char reponse2;
			System.out.println(
					"Voulez vous réaliser un [A]udit de l'entreprise ou vous rendre sur un compte [C]onseiller?");

			reponse2 = scn.nextLine().charAt(0);

			if (reponse2 == 'A') {

				String reponse3;
				System.out.println("Vous etes le Gerant de Quelle agence? 377K ou 021J ?");
				reponse3 = scn.nextLine();
				if (reponse3.equals("377K")) {
					// audit de l'agence 1
					System.out.println("Lancement de l'Audit");
					agence1.faireAudit();
				} else if (reponse3.equals("021J")) {
					// audit de l'agence 2
					System.out.println("Lancement de l'Audit");
					agence2.faireAudit();
				} else
					System.out.println("pas d'agence de ce nom..");

			} else if (reponse2 == 'C') {
				reponse = reponse2;
			} else {
				System.out.println("mauvaise reponse");
			}
		}
		
		// CONSEILLER
		
		
		if (reponse == 'C') {
			String reponse4;
			System.out.println("Quel conseiller? matriculeA? matriculeB? matriculeC? matriculeD? dans cette version seul matricule A est codé");
			reponse4 = scn.nextLine();
			
			// MATRICULE A
			if (reponse4.equals("matriculeA")) {
				System.out.println(
						"Voulez vous réaliser un [A]udit de vos client? ou faire un [V]irement compte à compte? ou [P]roposer un placement?");
				String reponse5 = scn.nextLine();
				if (reponse5.equals("A")) {
					conseillerA.AuditClients();
				}
				else if(reponse5.equals("V")){

		System.out.println(" Demonstration de virement");
		System.out.println("Solde du compte debiteur"+ client1.getCompteCourant().getSolde());
		System.out.println("Solde du compte credité"+ client2.getCompteCourant().getSolde());
		System.out.println("choisissez un montant à virer depuis le compte courant de "+ client1.getNom() + " " + client1.getPrenom() + " pour le compte courant de " + client2.getNom() + " " + client2.getPrenom());
		Double reponse6 = scn.nextDouble();
		
		conseillerA.VirementCaC(client1.getCompteCourant(), client2.getCompteCourant(), reponse6);
		client1.getCompteCourant().setSolde(client1.getCompteCourant().getSolde()-reponse6);
		client2.getCompteCourant().setSolde(client2.getCompteCourant().getSolde()+reponse6);
		
		System.out.println("Solde du compte debiteur"+ client1.getCompteCourant().getSolde());
		System.out.println("Solde du compte credité"+ client2.getCompteCourant().getSolde());
				}
		
				else if(reponse5.equals("P")) {
					System.out.println(
							"tentative de placement sur un client pas assez fortuné, montant par defaut 30 000 (euros) sur un placement GTM ");
					conseillerA.FairePlacement(client1, 30000, "GTM");
					
				
				System.out.println(
						"Placement avec un client assez fortuné, montant par defaut 30 000 (euros) sur un placement GTM ");
				conseillerA.FairePlacement(client2, 30000, "GTM");
				}
			
			}
		
		
		
		
		
		
		
		
		}

		scn.close();
	}
	}
