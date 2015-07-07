
public class Quersumme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(berechneQuersumme(421037));
	}
	/*
	 * Berechnet die Quersumme einer uebergebenen Zahl
	 * String s = Integer.toString( zahl);
	 */
	public static int berechneQuersumme(int zahl) {
		int summe = 0 ;
		while (zahl !=0) {
			// addiere die letzte ziffer der uebergebenen zahl zur summe
			summe = summe + (zahl % 10);
			System.out.println("summe"+summe);
			// entferne die letzte ziffer der uebergebenen zahl
			zahl = zahl / 10;
			System.out.println("zahl"+zahl);
		}
		return summe;
	}

}
