package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print(tilStreng(tabell));
	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		String tabellStreng = "[";
		for(int i = 0; i < tabell.length; i++) {
			if(i == 0)
				tabellStreng += tabell[i];
			else
				tabellStreng += "," + tabell[i];
		}
		tabellStreng += "]";
		return tabellStreng;
	}

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		for(int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for(int i = 0; i < tabell.length; i++) {
			if(tabell[i] == tall)
				return true;
		}
		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for(int i = 0; i < tabell.length; i++) {
			if(tabell[i] == tall)
				return i;
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] nyTabell = new int[tabell.length];
		
		for(int i = 0; i < tabell.length; i++) {
			nyTabell[tabell.length - i - 1] = tabell[i];
		}
		return nyTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		for(int i = 0; i < tabell.length - 1; i++) {
			if(tabell [i] > tabell[i+1])
				return false;
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] nyTabell = new int[tabell1.length + tabell2.length];
		
		for(int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		for(int i = tabell1.length; i < nyTabell.length; i++) {
			nyTabell[i] = tabell2[i - tabell1.length];
		}
		return nyTabell;

	}
}
