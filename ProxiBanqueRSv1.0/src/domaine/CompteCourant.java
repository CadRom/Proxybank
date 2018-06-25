/**
 * 
 */
package domaine;

/**
 * @author Adminl
 *
 */
public class CompteCourant extends CompteBancaire {

	/**
	 * @param numeroDeCompte
	 * @param solde
	 * @param dateOuverture
	 * @param autorisationDecouvert
	 * @param tauxRemuneration
	 * @param carte
	 */

	public CompteCourant(String numeroDeCompte, double solde, String dateOuverture, String carte) {
		super(numeroDeCompte, solde, dateOuverture, 1000, 0, carte);

		// TODO Auto-generated constructor stub
	}

}
