package Flore;

public class Ail extends Vegetal {
	
	public void Vegetal() {
		dessin[3] = "a";
		dessin[4] = "A";
	}
	
@Override
public String[] getDessin() {
	dessin[3] = "a";
	dessin[4] = "A";
	return super.getDessin();
}
}
