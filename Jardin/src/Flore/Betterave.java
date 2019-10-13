package Flore;

public class Betterave extends Vegetal {

	public Betterave(String[] dessin) {
		dessin[3] = "b";
		dessin[4] = "B";
	}

	@Override
	public String[] getDessin() {
		dessin[3] = "b";
		dessin[4] = "B";
		return super.getDessin();
	}
	
}
