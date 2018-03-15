package ex1;

import java.util.Date;

/**
 * 
 * @author Valentin Lefebvre
 *
 */
public class Entreprise {

	/** siret : numéro de siret */
	private int siret;
	private String nom;
	private String adresse;
	private Date dateCreation;
	
	public static final int CAPITAL_MAX = 3000000;
	
	/**
	 * Methode pour afficher le statut de l'entreprise
	 */
	public void afficherEntreprise(){
		
	}

	/**
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
}
