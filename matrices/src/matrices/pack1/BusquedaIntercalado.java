package matrices.pack1;

public class BusquedaIntercalado {
	
	public static int BlancasFull (String[][] tabla) {
		
		int n = 0;
		boolean suiche = true;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (suiche && tabla[i][j].equals("F")) {
					n++;
					suiche = (j==7)?true:false;
				} else {
					suiche = (j==7)?false:true;
				}
			}
		}
		return n;
	}
}
