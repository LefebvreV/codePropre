package ex3.corrige;

import java.util.ArrayList;
import java.util.List;

public abstract class ZoneStandard {

	/** animaux : la liste des animaux par zone */
	private List<Animal> animaux = new ArrayList<Animal>();
	
	/**
	 * Méthode pour ajouter un animal dans la zone
	 * @param animal
	 */
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}
	
	/**
	 * Méthode pour compter le nombre d'animaux dans la zone
	 * @return
	 */
	public int compterAnimaux(){
		return animaux.size();
	}
	
	abstract public boolean verifHabitat(Animal animal);
	
	/**
	 * Méthode pour récuperer le taux de nourriture par animal (selon la zone)
	 * @return TAUX_NOURRITURE
	 */
	abstract public double getTaux();
	
	/**
	 * Méthode qui calcule le total de nourriture par zone
	 * @return le total
	 */
	public double calculerKgsNourritureParJour(){
		return animaux.size() * getTaux();
	}
	
	/**
	 * Méthode pour récuperer le nomp de la zone à afficher
	 * @return le nom de la zone
	 */
	abstract public String getNomZone();
	
	/**
	 * Méthode pour afficher les animaux par zones
	 */
	public void afficherAnimaux(){
		System.out.println("Voici tous les animaux dans " + getNomZone() + " :\n");
		for (Animal animal: animaux){
			System.out.println(animal.getNom());
		}
		System.out.println("\nNombre de Kgs de nourriture par jour pour " + getNomZone() + " : " + calculerKgsNourritureParJour() );
		System.out.println("\n* * * * * * * * * * * * * * * *");
	}
}
