package lanceur;
import domaine.*;

public class VirementCaC {

	public VirementCaC(CompteBancaire cptDeb, CompteBancaire cptCred, double montant) {
		
		/**
		 * On controle la legitimité de la transaction
		 *
		 */
		double control;
		control = cptDeb.getSolde()+cptDeb.getAutorisationDecouvert();
		if (control >= montant) {
			
		double newS1 = cptCred.getSolde()-montant; cptCred.setSolde(newS1);
		double newS2 = cptCred.getSolde()+montant; cptCred.setSolde(newS2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
