package domaine;

public class ClientEntreprise extends Client {

	private String numeroSiret;
	private String nomEntreprise;
	
	
	private CompteCourant compteCourant;
	
	
	// CONSTRUCTEUR
	public ClientEntreprise(int idClient, String monNumeroSiret, String monNomEntreprise) {
		super(idClient);
		this.numeroSiret=monNumeroSiret;
		this.nomEntreprise=monNomEntreprise;
		
	}
	public ClientEntreprise() {
		super();		
	}
	
	
	// ASCESSEUR
	
	public String getNumeroSiret() {
		return numeroSiret;
	}
	public void setNumeroSiret(String numeroSiret) {
		this.numeroSiret = numeroSiret;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	public CompteCourant getCompteCourant() {
		return compteCourant;
	}
	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	

	
	
	
	
}
