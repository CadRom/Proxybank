package domaine;

import java.util.ArrayList;
import java.util.Scanner;


public class Conseiller {

	private String matricule;
	private ArrayList<Client> List = new ArrayList<Client>();
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public ArrayList<Client> getList() {
		return List;
	}
	public void setList(ArrayList<Client> list) {
		List = list;
	}
	public Conseiller(String matricule, ArrayList<Client> list) {
		super();
		this.matricule = matricule;
		List = list;
	}
	
	public void IHMcreerClient() {
		
		// CLIENT ENTREPRISE OU PRIVE
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Client");
		
		
		Client newClt = Client();  
		Scanner scn= new Scanner(System.in);
		System.out.println("Client");
		
		
		this.List.add(e)
	}
}
