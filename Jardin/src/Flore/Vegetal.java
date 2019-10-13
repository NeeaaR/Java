package Flore;

public abstract class Vegetal {

protected Etat etat;
protected String dessin[] = new String[6];

public Etat getEtat() {
	return etat;
}

public String[] getDessin() {
	return dessin;
}
public Vegetal() {
  dessin[0] = "_";
  dessin[1] = ".";
  dessin[2] = "|";
  dessin[5] = "#";

  this.etat = Etat.GRAINE;
}
}