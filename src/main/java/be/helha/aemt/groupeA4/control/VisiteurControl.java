package be.helha.aemt.groupeA4.control;

import be.helha.aemt.groupeA4.ejb.GestionVisiteurEJB;
import be.helha.aemt.groupeA4.entities.Visiteur;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@RequestScoped
@Named
public class VisiteurControl {

	@Inject
	private GestionVisiteurEJB beanGestion;
	
	public String doFindAll() {
		return null;
		
	}
	
	
	public String doAdd(Visiteur v) {
		return null;
		
	}
	
}
