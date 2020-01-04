package mains;

public class TVAServiceMain {

	public static void main(String[] args) {
		TVAServices A = new TVAServices();
		A.setTauxTVA(20);
		int Result = A.calculer(1000);
		System.out.println(" "+Result);
	}

}
