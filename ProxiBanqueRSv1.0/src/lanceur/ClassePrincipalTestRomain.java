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

			System.out.println(
					"Voulez vous réaliser un [A]udit de l'entreprise ou vous rendre sur un compte [C]onseiller?");
			reponse = scn.nextLine().charAt(0);
		}
		
	}

}
