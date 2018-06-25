package domaine;

import java.util.ArrayList;

public class Conseiller {

	// PROPRIETES
	
	private String matricule;
	private ArrayList<Client> carnetClient;

	// CONSTRUCTEURS
			
	public Conseiller() {
		super();
	}
	
	public Conseiller(String matricule) {
		super();
		this.matricule = matricule;
	}
	
	public Conseiller(String matricule, ArrayList<Client> carnetClient) {
		super();
		this.matricule = matricule;
		this.carnetClient = carnetClient;
	}

	// ASCESSEURS
	
	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public ArrayList<Client> getCarnetClient() {
		return carnetClient;
	}

	public void setCarnetClient(ArrayList<Client> carnetClient) {
		this.carnetClient = carnetClient;
	}
		
	// METHODES METIERS (ET PEUT ETRE METHODE IHM AUSSI)
	
	public void IHMcreerClient() {
		
		// CLIENT ENTREPRISE OU PRIVE
//		char reponse;
//		Scanner scn= new Scanner(System.in);
//		System.out.println("Le client est [P]articulier ou une [E]ntreprise?");
//		reponse = scn.nextLine().charAt(0);
//		
//		if (reponse == 'E') {
//			
//			//le client est une entreprise	
//			int idClient;
//			double solde;
//			String monNumeroSiret;
//			String monNomEntreprise;
//			
//			System.out.println("ID du Client?");
//			idClient=scn.nextInt();
//			System.out.println("Nom de l'entreprise?");
//			monNomEntreprise=scn.nextLine();
//			System.out.println("Numero Siret de l'entreprise?");
//			monNumeroSiret=scn.nextLine();
//			System.out.println("Nom de l'entreprise?");
//			solde=scn.nextDouble();
//			
//			this.carnetClient.add( new ClientEntreprise(idClient, solde, monNumeroSiret, monNomEntreprise));
//			
//
//		System.out.println("Client");
//		}
//	if (reponse == 'P') {
//			int idClient;
//			double solde;
//			int numeroSecu;
//			String nom;
//			String prenom;
//			String adresse;
//			int codePostal;
//			String ville;
//			String telephone;
//			
//			System.out.println("ID du Client?");
//			numeroSecu=scn.nextInt();
//			System.out.println("Nom de l'entreprise?");
//			nom=scn.nextLine();
//			System.out.println("Nom de l'entreprise?");
//			prenom=scn.nextLine();
//			
//		//	List.add( new ClientParticulier(idClient, solde, numeroSecu, nom, prenom));
//			
//
//		System.out.println("Client");
//		}
//	
//	
//		scn.close();

	}




}
