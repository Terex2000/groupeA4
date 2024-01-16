package be.helha.aemt.groupeA4.dao;

import java.util.List;

/**
 * This class defines the signature of the basic methods of a DAO 
 * 
 * @author Ghislain
 *
 * @param <T> The entity concerned by the DAO
 */
public interface IDAO<T> {

	public T add(T t) ;

	public T findById(Integer id) ;

	public List<T> findAll() ;

	public T update(T t) ;

	public T delete(T t) ;

}
