package be.helha.aemt.groupeA4.control;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@RequestScoped //Définit la visibilité optimale => il doit tjrs être mis afin de faciliter l'accès au controller
@Named
public class BonjourControl {

	private String nom;
	// Classe qui permet d'effectuer la navigation entre les pages
	// Toutes les methodes commençant seront tjrs dans le controller
	public String doNext() {
		//return "next.xhtml";
		return "next?faces-redirect=true";
	}
	public String getNom() {
		System.out.println("*********************************GETTER");
		return nom;
	}
	
	public void setNom(String nom) {
		System.out.println("*********************************SETTER");
		this.nom = nom;
	}
}
