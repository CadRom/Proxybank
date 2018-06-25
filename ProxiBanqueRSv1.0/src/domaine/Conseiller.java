package domaine;

import java.util.ArrayList;

/**
 * Cette classe decrit les caracteristiques
 * d'un Conseiller Clientele
 * @author Adminl
 * @version 0.1
 */

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

	// FAIRE UN PLACEMENT POUR UN CLIENT FORTUNE

	/**
	 * Cette methode permet de creer un placement pour un particulier,
	 *  si son solde le permet
	 * 
	 * @param ClientParticulier
	 *            Indique le client qui souhaite faire un placement
	 * @param montant
	 *            Indique le montant que l'on souhaite placer
	 * @param nomPlacement
	 *            Indique le nom du placement que l'on va créer
	 */
	public void FairePlacement(ClientParticulier clt, double montant, String nomPlacement) {
		// TODO Auto-generated constructor stub
		double soldeTotal = (clt.getCompteCourant().getSolde() + clt.getCompteEpargne().getSolde());
		if (soldeTotal < 50000) {
			System.out.println(
					"Le client n'est pas éligible pour faire des placements. Son solde (epargne+compte courant) est insuffisant");

		} else {

			if ((clt.getCompteEpargne().getSolde() + clt.getCompteEpargne().getAutorisationDecouvert()) > montant) {
				ArrayList<Placement> listTampon = new ArrayList<Placement>();
				listTampon = clt.getListPlacement();
				listTampon.add(new Placement(nomPlacement, montant));
				clt.setListPlacement(listTampon);
				double soldeTampon;
				soldeTampon = clt.getCompteEpargne().getSolde();
				clt.getCompteEpargne().setSolde(soldeTampon - montant);

			} else {
				System.out.println(
						"Le solde du compte Epargne du client est trop bas pour permettre ce montant de placement");
			}
		}

	}

	/**
	 * Cette methode permet d'effectuer un virement
	 * d'un compte vers un autre
	 * 
	 * @param cptDeb
	 *            Indique le compte à débiter
	 * @param cptCred
	 *            Indique le compte à créditer
	 * @param nomPlacement
	 *            Indique le montant à placer
	 */
	public void VirementCaC(CompteBancaire cptDeb, CompteBancaire cptCred, double montant) {

		// On controle la legitimité de la transaction
		double control;
		control = cptDeb.getSolde() + cptDeb.getAutorisationDecouvert();
		if (control >= montant) {

			double newS1 = cptCred.getSolde() - montant;
			cptCred.setSolde(newS1);
			double newS2 = cptCred.getSolde() + montant;
			cptCred.setSolde(newS2);
		}
	}

	/**
	 * Cette methode permet d'effectuer un audit
	 * des clients du carnet de client du
	 * conseiller clientele
	 * 
	 * Elle ne prend aucun parametre : ce n'est pas
	 * nécessaire puisqu'il est appelee a partir d'un objet
	 * Conseiller, et que sa propriete CarnetClient nous suffit
	 * pour lister les clients, puis leurs comptes, et ainsi
	 * d'afficher les comptes qui sont en dessous de zéro.
	 *    
	 */
	public void AuditClients() {

		// POUR CHAQUE CLIENT ON VA AFFICHER LE NOM ET LE SOLDE DES COMPTES ET UN
		// MESSAGE SI LE COMPTE EST AU ROUGE

		for (Client clt : this.carnetClient) {
			System.out.println("ID client: " + clt.getIdClient());

			if (clt.getClass().equals(ClientParticulier.class)) {
				ClientParticulier cltp = (ClientParticulier) clt;

				System.out.println("client: " + cltp.getNom() + " " + cltp.getPrenom());
				System.out.println("Solde Epargne Client : " + cltp.getCompteEpargne().getSolde());
				System.out.println("Solde Courant Client : " + cltp.getCompteCourant().getSolde());

				// on regarde si le compte est au rouge
				if (cltp.getCompteCourant().getSolde() + cltp.getCompteEpargne().getSolde() < -5000) {
					System.out.println("LE CLIENT " + cltp.getIdClient() + " du nom de " + cltp.getNom() + " "
							+ cltp.getPrenom() + " EST DEBITEUR DE PLUS DE 5000 EUROS");
				}
			} else if (clt.getClass().equals(ClientEntreprise.class)) {
				ClientEntreprise clte = (ClientEntreprise) clt;
				System.out.println("client: " + clte.getNomEntreprise() + " numero siret " + clte.getNumeroSiret());
				System.out.println("Solde Courant Client : " + clte.getCompteCourant().getSolde());
				// on regarde si le compte est au rouge
				if (clte.getCompteCourant().getSolde() < -50000) {
					System.out.println("LE CLIENT " + clte.getIdClient() + " du nom de " + clte.getNomEntreprise()
							+ " EST DEBITEUR DE PLUS DE 50 000 EUROS");

				}
			}

		}

	}

}
