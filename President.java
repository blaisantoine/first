package org.devatom.clubmusical;

public class President
{
	private String prenom, nom;
	
	public President(String prenom, String nom)
	{
		this.prenom = prenom;
		this.nom = nom;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public String getPrenom()
	{
		return this.prenom;
	}
	
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}
}
