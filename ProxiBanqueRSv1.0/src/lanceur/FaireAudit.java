package lanceur;
import domaine.*;

public class FaireAudit {

	public FaireAudit(Agence agc) {
		// TODO Auto-generated constructor stub
		
		for (Conseiller csl : agc.getCarnetConseiller()) {
			csl.AuditClients();
		}
	}

}
