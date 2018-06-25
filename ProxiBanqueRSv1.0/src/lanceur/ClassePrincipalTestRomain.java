package lanceur;

import java.util.Scanner;

public class ClassePrincipalTestRomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char reponse;
		Scanner scn = new Scanner(System.in);
		System.out.println("Etes vous le [G]erant ou un [C]onseiller?");
		reponse = scn.nextLine().charAt(0);

		if (reponse == 'G') {
			char reponse2;
			System.out.println(
					"Voulez vous réaliser un [A]udit de l'entreprise ou vous rendre sur un compte [C]onseiller?");
			reponse2 = scn.nextLine().charAt(0);
			
			if (reponse2 == 'A') {
				System.out.println("Lancement de l'Audit");
				// Audit entreprise
				
				
			}
			else if (reponse2 == 'C') {
				reponse=reponse2;
			}
			else {
				System.out.println("mauvaise reponse");
			}
		}
		scn.close();
	}

}
