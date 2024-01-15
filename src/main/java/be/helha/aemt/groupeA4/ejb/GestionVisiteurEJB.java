package be.helha.aemt.groupeA4.ejb;

import be.helha.aemt.groupeA4.dao.VisiteurDAO;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
public class GestionVisiteurEJB {

	@EJB
	private VisiteurDAO visDAO;
}
