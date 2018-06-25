/**
 * 
 */
package domaine;

/**
 * @author Adminl
 *
 */
public class CompteEpargne extends CompteBancaire {

	/**
	 * @param numeroDeCompte
	 * @param solde
	 * @param dateOuverture
	 * @param autorisationDecouvert
	 * @param tauxRemuneration
	 * @param carte
	 */
	public CompteEpargne(String numeroDeCompte, double solde, String dateOuverture, double autorisationDecouvert,
			double tauxRemuneration, String carte) {
		super(numeroDeCompte, solde, dateOuverture, 0, 0.03, carte);
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne() {
		super("1123456", 10000, "un jour bleu", 0, 0.03, "non");
		// TODO Auto-generated constructor stub
	}
}
