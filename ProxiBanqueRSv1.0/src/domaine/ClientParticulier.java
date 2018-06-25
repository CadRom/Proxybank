package domaine;

import java.util.ArrayList;

public class ClientParticulier extends Client {

	private String numeroSecu;
	private String nom;
	private String prenom;
	private String adresse;
	private int codePostal;
	private String ville;
	private String telephone;
	
	
    private ArrayList<Placement> listPlacement = new ArrayList<Placement>();
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
	
	
	// CONSTRUCTEURS
	
	public ClientParticulier(int idClient, String numeroSecu, String nom, String prenom, String adresse, int codePostal, String ville, String telephone) {
		super(idClient);
		this.numeroSecu=numeroSecu; this.nom= nom; this.prenom = prenom; this.adresse =adresse; this.codePostal= codePostal; this.ville =ville; this.telephone = telephone;
	}
	public ClientParticulier() {
		super();
	}

// ASCESSEURS
	public String getNumeroSecu() {
		return numeroSecu;
	}


	public void setNumeroSecu(String numeroSecu) {
		this.numeroSecu = numeroSecu;
	}


	public String getNom() {
		return nom;
	}



	public ArrayList<Placement> getListPlacement() {
		return listPlacement;
	}
	public void setListPlacement(ArrayList<Placement> listPlacement) {
		this.listPlacement = listPlacement;
	}
	public CompteCourant getCompteCourant() {
		return compteCourant;
	}
	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}
	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}
	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public int getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
}
