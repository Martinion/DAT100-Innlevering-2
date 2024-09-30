package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		System.out.print(tilStreng(matrise));
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String matriseStreng = "";
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				matriseStreng += matrise[i][j] + " ";
			}
			matriseStreng += "\n";
		}
		return matriseStreng;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][];
		for(int i = 0; i < matrise.length; i++) {
			nyMatrise[i] = new int[matrise[i].length];
			for(int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if(a.length != b.length)
			return false;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i].length != b[i].length)
				return false;
			
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] != b[i][j])
					return false;
			}
		}
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int[][] nyMatrise = new int[matrise.length][matrise.length];
		
		for(int i = 0; i < matrise.length; i++) {
			for(int j  = 0; j < matrise.length; j++) {
				nyMatrise[j][i] = matrise[i][j];
			}
		}
		return nyMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int[][] nyMatrise = new int[a.length][b[0].length];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				for(int k = 0; k < b.length; k++) {
					nyMatrise[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return nyMatrise;
	}
}
