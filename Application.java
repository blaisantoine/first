package org.devatom.clubmusical;

public class Application {
	/**
	 * Un club musical possède un nom, un directeur et une collection d'adhérents.
	 * Les adhérents sont tous des artistes représentés par chaque classe présente dans le projet.
	 * Les classes possèdent des attributs que vous devez factoriser dans une classe Artiste.
	 * Cette classe ne doit pas pouvoir être instanciée et doit obliger les classes qui en héritent à implémenter la méthode "presenter()" qui permet à un artiste de se présenter.
	 * Chaque classe doit posséder les constructeurs et accesseurs / mutateurs.
	 * Dans ce projet, vous mettrez un point d'honneur à appliquer les trois principe de la POO : encapsulation, héritage et polymorphisme.
	 * 
	 * Le main ci-dessous ne doit plus provoquer d'erreur et son contenu doit rester tel quel.
	 * A l'exécution, la console doit afficher les informations du club, de son président et des artistes adhérents.
	 * 
	 * Bon courage.
	 */

	public static void main(String[] args) {
		ClubMusical monClub = new ClubMusical("Club Sportif du Sud Bassin");
		
		monClub.setPresident(new President("Encledesol", "CASONNEFORT"));
		monClub.add(new Bassiste("Quatrescordes", "POURPLUSDEBASSES", 15, "M�tal"));
		monClub.add(new Batteur("Macaisseclaire", "EXPLOSETOUT", 32, "Pop-Rock"));
		monClub.add(new Chanteur("Castafiore", "CASTRAIX", 4, "Lyrics"));
		monClub.add(new Compositeur("Surletrone", "JECRISMIEUX", 18, "M�tal Classique"));
		monClub.add(new Guitariste("Jegalere", "ENBARRE", 12, "Rock"));
		monClub.add(new Pianiste("Adeuxpieds", "CESTINTENSE", 17, "Classique"));
		
		monClub.afficher();
	}
}
