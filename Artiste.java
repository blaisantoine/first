package org.devatom.clubmusical;

public abstract class Artiste
{
	private String nom, prenom, style, role;
	private int anciennete;
	
	public Artiste(String prenom, String nom, int anciennete, String style, String role)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.anciennete = anciennete;
		this.style = style;
		this.role = role;
	}
	
	public String presenter()
	{
		return this.prenom+" "+this.nom+", qui est "+ this.role+" depuis " + this.anciennete + " ans, son style : " + this.style;
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
	
	public String getStyle()
	{
		return this.style;
	}
	
	public void setStyle(String style)
	{
		this.style = style;
	}
	
	public String getRole()
	{
		return this.role;
	}
	
	public void setRole(String role)
	{
		this.role = role;
	}
	
	public int getAnciennete()
	{
		return this.anciennete;
	}
	
	public void setAnciennete(int anciennete)
	{
		this.anciennete = anciennete;
	}

}
