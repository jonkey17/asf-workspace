package pr.vodafone.facade;

import java.util.List;

import pr.vodafone.entity.Lineas;

public class LineaFacade extends AbstractEntityFacade<Lineas> {

	public LineaFacade() {
		super(Lineas.class);
	}

	public List<Lineas> findAllByEstado(boolean activa) {
		return getEntityManager().createQuery(
				"select object(o) from Lineas as o where o.activa = " + activa)
				.getResultList();
	}

	public List<Lineas> findAllByNombre(String dni) {
		return getEntityManager().createQuery(
				"select object(o) from Lineas as o where o.dni = " + dni).getResultList();
	}

	public List<Lineas> findAllByNombreAndEstado(boolean activa, String dni) {
		return getEntityManager().createQuery(
				"select object(o) from Lineas as o where o.dni = " + dni + " and o.activa = "
						+ activa).getResultList();
	}
}
