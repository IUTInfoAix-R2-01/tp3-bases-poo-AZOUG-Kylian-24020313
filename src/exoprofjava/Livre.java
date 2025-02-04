package exoprofjava;

public class Livre {
	private String name;
	private double price;
	private int quantite;
	
	public Livre ( String name, double price, int quantite)  {
		this.name = name;
		this.price = price;
		this.quantite = quantite;
	}
	
	public String getName() {
		return name;
		
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public String toString() {
		return "Le nom de ce livre est : " + name + ", le prix pour ce livre est de " + price + " $ nous avons " + quantite + " examplaire(s) de ce livre ";
	}
}
