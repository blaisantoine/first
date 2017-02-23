package org.devatom.clubmusical;

import java.util.ArrayList;

public class ClubMusical {
	public String nom;
	ArrayList<Artiste> artistes;
	private President president;
	
	public ClubMusical()
	{
		this.nom = "";
		this.artistes = new ArrayList<Artiste>();
	}
	
	public ClubMusical(String nom)
	{
		this.nom = nom;
		this.artistes = new ArrayList<Artiste>();
	}
	
	public void add(Artiste artiste)
	{
		this.artistes.add(artiste);
	}

	public void afficher()
	{
		System.out.println("Le club " + this.nom + " dirigé par " + this.president.getPrenom()+" "+ this.president.getNom() + " accueille :");
		for (Artiste artiste : this.artistes){
			System.out.println(artiste.presenter());
		}
	}

	public void setPresident(President president)
	{
		this.president = president;
	}
	
	public President getPresident()
	{
		return this.president;
	}
}
