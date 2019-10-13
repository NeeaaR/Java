import java.io.InputStream;

public class Scanner {

	public Scanner(InputStream in) {
		System.out.println("1. Semer une graine");
		System.out.println("2. Récolter toutes les graines qui sont matures");
		System.out.println("3. Passer à la saison suivante (toutes les plantes grandissent");
		System.out.println("4. Quitter l'application.");
		Scanner scanner = new Scanner(System.in);
		int res = scanner.nextInt();
		
		switch(res) {
		case 1:
			System.out.println("Test 1");
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
	}

	private int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}
}
