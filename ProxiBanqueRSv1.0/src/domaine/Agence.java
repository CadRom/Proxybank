package domaine;

import java.util.ArrayList;

public class Agence {

	// PROPRIETES
	
	private String numeroIdentification;
	private String dateCreation;
	private String nomGerant;
	private ArrayList<Conseiller> carnetConseiller;
	
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

	public ArrayList<Conseiller> getCarnetConseiller() {
		return carnetConseiller;
	}

	public void setCarnetConseiller(ArrayList<Conseiller> carnetConseiller) {
		this.carnetConseiller = carnetConseiller;
	}
	
	// METHODES METIERS

	public void faireAudit() {
			// TODO Auto-generated constructor stub
			
			for (Conseiller csl : this.getCarnetConseiller()) {
				csl.AuditClients();
			}
		}
	}

