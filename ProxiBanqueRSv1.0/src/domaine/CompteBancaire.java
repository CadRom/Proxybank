package domaine;

public class CompteBancaire {
	protected String numeroDeCompte;
	protected double solde;
	protected String dateOuverture;
	protected double autorisationDecouvert;
	protected double tauxRemuneration;
	protected String carte;
	
	
	
	// CONSTRUCTEUR
	public CompteBancaire(String numeroDeCompte, double solde, String dateOuverture, double autorisationDecouvert,
			double tauxRemuneration, String carte) {
		super();
		this.numeroDeCompte = numeroDeCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.autorisationDecouvert = autorisationDecouvert;
		this.tauxRemuneration = tauxRemuneration;
		this.carte = carte;
	}
	
	public CompteBancaire(String numeroDeCompte, double solde, String dateOuverture, double autorisationDecouvert,
			double tauxRemuneration) {
		super();
		this.numeroDeCompte = numeroDeCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.autorisationDecouvert = autorisationDecouvert;
		this.tauxRemuneration = tauxRemuneration;
	}


	// ASCESSEURS ...

	public String getNumeroDeCompte() {
		return numeroDeCompte;
	}



	public void setNumeroDeCompte(String numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}



	public double getSolde() {
		return solde;
	}



	public void setSolde(double solde) {
		this.solde = solde;
	}



	public String getDateOuverture() {
		return dateOuverture;
	}



	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}



	public double getAutorisationDecouvert() {
		return autorisationDecouvert;
	}



	public void setAutorisationDecouvert(double autorisationDecouvert) {
		this.autorisationDecouvert = autorisationDecouvert;
	}



	public double getTauxRemuneration() {
		return tauxRemuneration;
	}



	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}



	public String getCarte() {
		return carte;
	}



	public void setCarte(String carte) {
		this.carte = carte;
	}
	

	
	
	

}
