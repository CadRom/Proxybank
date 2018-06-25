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

public void AuditClients() {
	
	// POUR CHAQUE CLIENT ON VA AFFICHER LE NOM ET LE SOLDE DES COMPTES ET UN MESSAGE SI LE COPMPTE EST AU ROUGE
	
	for (Client clt : this.carnetClient) {
		System.out.println("ID client: "+clt.getIdClient());
		
		if(clt.getClass().equals(ClientParticulier.class)) {
			ClientParticulier cltp = (ClientParticulier) clt;
			
			System.out.println("client: "+cltp.getNom()+" "+cltp.getPrenom());
			System.out.println("Solde Epargne Client : "+cltp.getCompteEpargne().getSolde());
			System.out.println("Solde Courant Client : "+cltp.getCompteCourant().getSolde());
			// on regarde si le compte est au rouge
			if (cltp.getCompteCourant().getSolde()+cltp.getCompteEpargne().getSolde()<5000) {
				System.out.println("LE CLIENT "+ cltp.getIdClient() + " du nom de "+cltp.getNom()+" "+cltp.getPrenom() + " EST DEBITEUR DE PLUS DE 5000 EUROS");
			}
		}
		else if (clt.getClass().equals(ClientEntreprise.class)) {
			ClientEntreprise clte = (ClientEntreprise) clt;
			System.out.println("client: "+clte.getNomEntreprise() + " numero");
			System.out.println("Solde Epargne Client : "+cltp.getCompteEpargne().getSolde());
			System.out.println("Solde Courant Client : "+cltp.getCompteCourant().getSolde());
			// on regarde si le compte est au rouge
			if (clte.getCompteCourant().getSolde()+cltp.getCompteEpargne().getSolde()<5000) {
				System.out.println("LE CLIENT "+ cltp.getIdClient() + " du nom de "+cltp.getNom()+" "+cltp.getPrenom() + " EST DEBITEUR DE PLUS DE 5000 EUROS");
			
		}
		
		
		
	}
	
	
	
}


}
