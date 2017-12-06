

public class GoldenerSchnitt {
	public static void main(String[] args) {
		double zaehler=1;
		double nenner=1;
		double ergebnis=1;
		for (int a=1;a<500; ergebnis=zaehler/nenner)
			{
			System.out.println(ergebnis);
			double zwischen=zaehler;
			zaehler=nenner;
			nenner=nenner+zwischen;
			a=a+1;
			}
	}
}	

