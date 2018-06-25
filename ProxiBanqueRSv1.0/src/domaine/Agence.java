package domaine;

import java.util.Set;

public class Agence {

	// PROPRIETES
	
	private String numeroIdentification;
	private String dateCreation;
	private String nomGerant;
	private Set<Conseiller> carnetConseiller;
	
	// CONSTRUCTEURS
	
	public Agence() {
		super();
	}

	public Agence(String numeroIdentification, String dateCreation) {
		super();
		this.numeroIdentification = numeroIdentification;
		this.dateCreation = dateCreation;
	}

	// ASCESSEURS
	
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
	
	// METHODES METIERS

	public void auditAgence() {
// methode audit agence
// on liste d'abord les conseillers, ce qui nous permet de lister les clients
//		System.out.println("L'audit de l'agence va commencer");
//		System.out.println(this.numeroIdentification);
//		System.out.println(this.dateCreation);
//		System.out.println(this.nomGerant);
//		
//		for (Conseiller cons : carnetConseiller) {
//			
//			// TODO lister tous les clients vraiment trop dans le rouge
//			System.out.println(cons.getMatricule());
//			
//			// TODO bloucle à l'interieur de CarnetClient
//			// Set<Client> carnetClient = cons.getMatricule().getCarnetClient
//			
//	}
		
	}
}
