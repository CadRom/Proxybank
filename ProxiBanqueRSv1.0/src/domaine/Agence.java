package domaine;

import java.util.Set;

public class Agence {

	// 1. proprietes de Agence
	
	private String numeroIdentification;
	private String dateCreation;
	private String nomGerant;
	private Set<Conseiller> carnetConseiller;
	
	// 2. methodes de Agence
	
	// constructeur vide
	public Agence() {
		super();
	}

	// constructeur avec ID et date
	public Agence(String numeroIdentification, String dateCreation) {
		super();
		this.numeroIdentification = numeroIdentification;
		this.dateCreation = dateCreation;
	}

	// getters et setters
	
	public String getNumeroIdentification() {
		return numeroIdentification;
	}

	public void setNumeroIdentification(String numeroIdentification) {
		this.numeroIdentification = numeroIdentification;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getNomGerant() {
		return nomGerant;
	}

	public void setNomGerant(String nomGerant) {
		this.nomGerant = nomGerant;
	}

	public Set<Conseiller> getCarnetConseiller() {
		return carnetConseiller;
	}

	public void setCarnetConseiller(Set<Conseiller> carnetConseiller) {
		this.carnetConseiller = carnetConseiller;
	}
	
	// methodes metiers
	
	public void auditAgence() {
		System.out.println("L'audit de l'agence va commencer");
		System.out.println(this.numeroIdentification);
		System.out.println(this.dateCreation);
		System.out.println(this.nomGerant);
		
		for (Conseiller cons : carnetConseiller) {
			
			// TODO lister tous les clients vraiment trop dans le rouge
			System.out.println(cons.getMatricule());
			
			// TODO bloucle à l'interieur de CarnetClient
			// Set<Client> carnetClient = cons.getMatricule().getCarnetClient
			
			
		}
		
	}
}
