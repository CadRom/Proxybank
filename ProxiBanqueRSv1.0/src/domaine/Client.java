package domaine;

public class Client {

protected int idClient;


// CONSTRUCTEUR

public Client(int idClient) {
	super();
	this.idClient = idClient;
}

public Client() {
	super();
	this.idClient = 666;

}

// ASCESSEURS
public double getIdClient() {
	return idClient;
}
public void setIdClient(int idClient) {
	this.idClient = idClient;
}



}
