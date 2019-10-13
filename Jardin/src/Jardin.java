import java.util.HashMap;
import java.util.Map;

import Flore.Ail;

public class Jardin {
	private int largeur;
	private int longueur;
	private Emplacement emplacement[][];
	private HashMap<String, Integer> panier;
	
	public int getLargeur() {
		return largeur;
	}
	
	public int getLongueur() {
		return longueur;
	}
	
	public HashMap<String, Integer> getPanier() {
		return panier;
	}
	
	public Emplacement[][] getEmplacement() {
		return emplacement;
	}
	
	public Jardin (int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.panier = new HashMap<String, Integer>();
		emplacement = new Emplacement[longueur][largeur];
	}
	
	public void ajouterPanier(String nomDuVegetal, int quantite) {
		this.panier.put(nomDuVegetal, quantite);
	}
	
	public void semer(int x, int y) {
			this.emplacement[x][y] = new Emplacement(new Ail());
			/*System.out.println(this.emplacement[x][y]); */
}
	
	
	@Override
	public String toString() {
		System.out.println("Voici notre jardin :");
		for (int x = 0; x < longueur; x++) {
			System.out.print("o");
			for (int y = 1; y < largeur; y++) {
				System.out.print("o");
			}
			System.out.println("");
		}
		System.out.println("Et notre panier contient :");
		for (String x : panier.keySet() ) {
			System.out.println(x + " : " + panier.get(x) + " graine(s)" );
		}
	return null;
	}
}
