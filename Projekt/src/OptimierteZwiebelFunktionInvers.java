public class OptimierteZwiebelFunktionInvers {

	public static void main(String[] args) {
		long y = 42584857;
		int size = 4;
		int m[] = {31,31,211,211};

		int t[] = opt_Zwiebel_Invers(m, size, y);

		System.out.print("PlatzKlasse=[");
		for (int t1 = 0; t1 < size - 1; t1++) {
			System.out.print((int) t[t1] + "\b,");
		}
		System.out.print((int) t[size - 1] + "]");

	}

	public static int[] opt_Zwiebel_Invers(int m[], int size, long y) {

		int[] x = new int[size];
		double ergebnis;
		double t[] = new double[size];

		int multarray[] = new int[size];
		multarray[0] = m[0];
		for (int i = 1; i < size - 1; i++) {
			multarray[i] = multarray[i - 1] * m[i];

		}

		x[0] = (int) (y % m[0]);
		x[1] = (int) (((1.0 / multarray[0]) * (y - x[0] ) )% m[1]);

		ergebnis = 0;
		int k = 2;
		int j = 1;
		for (int i = 2; i < size; i++) {

			ergebnis += (x[k - 1] * multarray[k - 2]);

			t[i] = ergebnis;
			x[i] = (int) (((1.0 / multarray[j]) * (y - x[0] - t[i])) % m[k]);
			k++;
			j++;

		}

		return x;

	}
}
