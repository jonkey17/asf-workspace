package pr.vodafone.persistenceunitsingleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Singleton {

	private static EntityManagerFactory emf;

	protected Singleton() {
		// Exists only to defeat instantiation.
	}

	public static EntityManagerFactory getInstance() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("VodafonePU");
		}
		return emf;
	}

	public static void close() {
		emf.close();
		emf=null;
	}

}
