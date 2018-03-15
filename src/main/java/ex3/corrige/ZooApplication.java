package ex3.corrige;

public class ZooApplication {

	public static void main (String[] args){
		Zoo zoo = new Zoo("Zoo de la Flèche");
	
		zoo.addAnimal("Le lapin tueur", CategorieType.MAMMIFERE, CategorieComportement.CARNIVORE);
		zoo.addAnimal("Le loup pacifique", CategorieType.MAMMIFERE, CategorieComportement.HERBIVORE);
		zoo.addAnimal("Le dragon de Komodo sans dent", CategorieType.REPTILE, CategorieComportement.HERBIVORE);
		zoo.addAnimal("Le poisson clown serial killer", CategorieType.POISSON, CategorieComportement.CARNIVORE);
		
		zoo.addAnimal("La brebis galeuse pas si galeuse que ça", CategorieType.MAMMIFERE, CategorieComportement.CARNIVORE);
		zoo.addAnimal("Le lion au régime", CategorieType.MAMMIFERE, CategorieComportement.HERBIVORE);
		zoo.addAnimal( "Le brachiosaure cloné", CategorieType.REPTILE, CategorieComportement.HERBIVORE);
		zoo.addAnimal("La truite qui voulait n'en être plus une", CategorieType.POISSON, CategorieComportement.CARNIVORE);
		
		zoo.afficherListeAnimaux();
	}
}
