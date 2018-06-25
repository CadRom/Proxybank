package domaine;

public class Client {

protected int idClient;
protected double soldeTotal;

// CONSTRUCTEUR

public Client(int idClient, double solde) {
	super();
	this.idClient = idClient;
	this.soldeTotal = solde;
}

public Client() {
	super();
	this.idClient = 666;
	this.soldeTotal = 666;
}

// ASCESSEURS
public double getIdClient() {
	return idClient;
}
public void setIdClient(int idClient) {
	this.idClient = idClient;
}
public double getSolde() {
	return soldeTotal;
}
public void setSolde(double solde) {
	this.soldeTotal = solde;
}


}
