package Flore;

public class Carotte extends Vegetal {

	public Carotte(String[] dessin) {
		dessin[3] = "c";
		dessin[4] = "C";
	}

	@Override
	public String[] getDessin() {
		dessin[3] = "c";
		dessin[4] = "C";
		return super.getDessin();
	}
}
