package domaine;

import java.util.ArrayList;
import java.util.Scanner;


public class Conseiller {

	private String matricule;
	private ArrayList<Client> List = new ArrayList<Client>();
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public ArrayList<Client> getList() {
		return List;
	}
	public void setList(ArrayList<Client> list) {
		List = list;
	}
	public Conseiller(String matricule, ArrayList<Client> list) {
		super();
		this.matricule = matricule;
		List = list;
	}
	
	public void IHMcreerClient() {
		
		// CLIENT ENTREPRISE OU PRIVE
		char reponse;
		Scanner scn= new Scanner(System.in);
		System.out.println("Le client est [P]artiiculier ou une [E]ntreprise?");
		reponse = scn.nextLine().charAt(0);
		
		if (reponse == 'E') {
			
			//le client est une entreprise
			
			
			int idClient;
			double solde;
			String monNumeroSiret;
			String monNomEntreprise;
			
			System.out.println("ID du Client?");
			idClient=scn.nextInt();
			System.out.println("Nom de l'entreprise?");
			monNomEntreprise=scn.nextLine();
			System.out.println("Numero Siret de l'entreprise?");
			monNumeroSiret=scn.nextLine();
			System.out.println("Nom de l'entreprise?");
			solde=scn.nextDouble();
			
			List.add( new ClientEntreprise(idClient, solde, monNumeroSiret, monNomEntreprise));
			

		System.out.println("Client");
		}
	/* if (reponse == 'P') {
			
		// le cliente st un particulier
		
		
			int idClient;
			double solde;
			private String numeroSecu;
			private String nom;
			private String prenom;
			private String adresse;
			private int codePostal;
			private String ville;
			private String telephone;
			
			System.out.println("ID du Client?");
			numeroSecu=scn.nextInt();
			System.out.println("Nom de l'entreprise?");
			nom=scn.nextLine();
			System.out.println("Nom de l'entreprise?");
			prenom=scn.nextLine();
			
			System.out.println("Numero Siret de l'entreprise?");
			monNumeroSiret=scn.nextLine();
			System.out.println("Nom de l'entreprise?");
			solde=scn.nextDouble();
			
			List.add( new ClientEntreprise(idClient, solde, monNumeroSiret, monNomEntreprise));
			

		System.out.println("Client");
		}
	*/
	
		scn.close();
	}
}
