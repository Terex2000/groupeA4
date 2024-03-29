package be.helha.aemt.groupeA4.dao;

import java.util.List;

import be.helha.aemt.groupeA4.entities.Utilisateur;
import jakarta.ejb.EJB;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.TypedQuery;

@Stateless//Used to do independent operations, it does not have any associated client state
@LocalBean
public class UtilisateurDAO extends AbstractDAO<Utilisateur> {
	
//	@EJB
//	private SectionDAO sectionDAO;
	
	public UtilisateurDAO() {
		super(Utilisateur.class);
	}
	
	@Override
	/**
	 * Redefinition of the method to add a condition to check that there are no duplicates on the email,
	 * no duplicates with the section
	 */
	public Utilisateur add(Utilisateur utilisateur) {
		if(utilisateur == null) return null ;

		if(find(utilisateur) != null) return null ;
		
		return super.add(utilisateur);
	}
	
	@Override
	/**
	 * Redefinition of the method to add a condition to check that there are no duplicates on the email
	 */
	public Utilisateur update(Utilisateur utilisateur) {
		Utilisateur oldUtilisateur = findById(utilisateur.getId()) ;
		if(oldUtilisateur == null) return null ;
		
		if(oldUtilisateur.getEmail().equals(utilisateur.getEmail()))
			return super.update(utilisateur);

		if(find(utilisateur) == null)
			return super.update(utilisateur);
		
		return null ;
	}

	
	
	/**
	 * Find the user based on his email
	 * 
	 * @return the user or null if not found
	 */
	public Utilisateur find(Utilisateur utilisateur) {
		if(utilisateur == null) return null ;

		String rq = "SELECT u FROM Utilisateur u where u.email = ?1" ;
		
		TypedQuery<Utilisateur> query = em.createQuery(rq, Utilisateur.class);
		query.setParameter(1, utilisateur.getEmail()) ;

		List<Utilisateur> result = query.getResultList() ;

		if(result.isEmpty()) return null ;

		return result.get(0) ; 
	}

}
