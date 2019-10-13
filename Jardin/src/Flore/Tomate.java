package Flore;

public class Tomate extends Vegetal {

	public Tomate(String dessin[]) {
		dessin[3] = "t";
		dessin[4] = "T";
	}
	
@Override
	public String[] getDessin() {
	dessin[3] = "t";
	dessin[4] = "T";
	return super.getDessin();
	}
}
