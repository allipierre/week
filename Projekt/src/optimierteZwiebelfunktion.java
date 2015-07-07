public class optimierteZwiebelfunktion {

	public static void main(String[] args) {
		int platzklasse[] = {2,2,3,210};// Das ist eine lagerplatzklasse
		int max[] = {31,31,211,211}; // Das ist die Menge der größte
										// Merkmalauspägungen über alle Merkmale
		int size = 4;// Das ist die maximaler Anzahl der Merkmale
		System.out.println(opt_z_goedel(platzklasse, size, max));

	}

	public static long opt_z_goedel(int platzklasse[], int size, int max[]) {

		long opt_z_goedelnummer;// das ist die optimierte Zwiebel goedelnummer
		double a = 1.0;
		double b = 0.0;
		double d;
		opt_z_goedelnummer = platzklasse[0];
		int j = 0;
		for (int i = 1; i < size; i++) {

			a *= max[j];
			j++;
			d = platzklasse[i] * a;
			b += d;

		}

		opt_z_goedelnummer += b;

		return opt_z_goedelnummer;

	}

}
