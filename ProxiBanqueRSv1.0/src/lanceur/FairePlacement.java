package lanceur;
import java.util.ArrayList;

import domaine.*;


public class FairePlacement {

	public FairePlacement(ClientParticulier clt, double montant, String nomPlacement) {
		// TODO Auto-generated constructor stub
		double soldeTotal = (clt.getCompteCourant().getSolde()+clt.getCompteEpargne().getSolde());
		if (soldeTotal < 50000 ) {
			System.out.println("Le client n'est pas éligible pour faire des placements. Son solde (epargne+compte courant) est insuffisant");
			
		}
		else {

			if ( (clt.getCompteEpargne().getSolde() + clt.getCompteEpargne().getAutorisationDecouvert()) > montant ) {
				ArrayList<Placement> listTampon= new ArrayList<Placement>(); 
				listTampon=clt.getListPlacement();
				listTampon.add (new Placement(nomPlacement,montant));
				clt.setListPlacement(listTampon);
				double soldeTampon;
				soldeTampon=clt.getCompteEpargne().getSolde();
				clt.getCompteEpargne().setSolde(soldeTampon- montant);
				
				
		}
			else { System.out.println("Le solde du compte Epargne du client est trop bas pour permettre ce montant de placement"); }
	}
			
	
		}
}
