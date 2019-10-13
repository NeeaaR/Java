import Flore.Vegetal;

public class Emplacement {
	
private Vegetal vegetal;

public Vegetal getVegetal() {
	return vegetal;
}

public void setVegetal(Vegetal vegetal) {
	this.vegetal = vegetal;
}

public Emplacement(Vegetal vegetal) {
	this.vegetal = vegetal;
}

@Override
	public String toString() {
	if(String.valueOf(getVegetal().getEtat()) == "GRAINE") {
		return String.valueOf(getVegetal().getDessin()[0]);	
	}
	if(String.valueOf(getVegetal().getEtat()) == "GERME") {
		return String.valueOf(getVegetal().getDessin()[1]);	
	}
	if(String.valueOf(getVegetal().getEtat()) == "TIGE") {
		return String.valueOf(getVegetal().getDessin()[2]);	
	}
	if(String.valueOf(getVegetal().getEtat()) == "FEUILLE") {
		return String.valueOf(getVegetal().getDessin()[3]);	
	}
	if(String.valueOf(getVegetal().getEtat()) == "FLEUR") {
		return String.valueOf(getVegetal().getDessin()[4]);	
	}
	if(String.valueOf(getVegetal().getEtat()) == "MORT") {
		return String.valueOf(getVegetal().getDessin()[5]);	
	}
	return null;
}
}

