package domaine;

/**
 * Cette classe decrit les caracteristiques
 * d'un placement
 * @author Adminl
 * @version 0.1
 */
public class Placement {

	private String nom;
	private double montant;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Placement(String nom, double montant) {
		super();
		this.nom = nom;
		this.montant = montant;
	}
	
	
	
	
}
