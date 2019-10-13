import java.util.Scanner;

import Flore.Ail;
import Flore.Vegetal;

public class Terre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jardin j = new Jardin(5,4);
		j.ajouterPanier("Ail",2);
		System.out.println(j);
		
		System.out.println("1. Semer une graine");
		System.out.println("2. Récolter toutes les graines qui sont matures");
		System.out.println("3. Passer à la saison suivante (toutes les plantes grandissent");
		System.out.println("4. Quitter l'application.");
		Scanner scanner = new Scanner(System.in);
		int res = scanner.nextInt();
		
		switch(res) {
		case 1:
			System.out.println("x :");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			System.out.println("y :");
			Scanner scy = new Scanner(System.in);
			int y = scy.nextInt();
			j.semer(x, y);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
		System.out.println(j.toString());
	}

}
