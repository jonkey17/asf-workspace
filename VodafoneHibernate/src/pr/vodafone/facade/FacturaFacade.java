package pr.vodafone.facade;

import java.util.List;

import pr.vodafone.entity.Facturas;

public class FacturaFacade extends AbstractEntityFacade<Facturas> {

	public FacturaFacade() {
		super(Facturas.class);
	}

	public List<Facturas> findAllByLinea(String telefono) {
		return getEntityManager().createQuery(
				"select * from facturas where telefono = " + telefono).getResultList();
	}
}
