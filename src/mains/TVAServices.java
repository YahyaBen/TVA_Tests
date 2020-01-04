package mains;

public class TVAServices {
	private int tauxTVA;
	public int calculer(int prix) {
		return prix*tauxTVA/100;
	}
	public int getTauxTVA() {
		return tauxTVA;
	}
	public void setTauxTVA(int tauxTVA) {
		this.tauxTVA = tauxTVA;
	}
	
}
