package matrices.pack1;

public class STRINGP {
	public static void main(String[] args) {
		int columnas = 8;
		int filas = 8;
		
		String[][] tabla1 = new String[filas][columnas];
		System.out.println("tabla 1");
		llenadoTabla(tabla1, filas, columnas);
		imprimir(tabla1, filas, columnas);
		
		
		String[][] tabla2 = new String[filas][columnas];
		System.out.println("\ntabla 2");
		llenadoTablaFull(tabla2, filas, columnas);
		imprimir(tabla2, filas, columnas);
		
		
		String[][] tabla3 = new String[filas][columnas];
		System.out.println("\ntabla 3");
		llenadoTabla(tabla3, filas, columnas);
		tabla3[7][7] = "F";
		tabla3[3][3] = "F";
		imprimir(tabla3, filas, columnas);
		
		
		String[][] tabla4 = new String[filas][columnas];
		System.out.println("\ntabla 4");
		llenadoTabla(tabla4, filas, columnas);
		tabla4[0][0] = "F";
		tabla4[7][7] = "F";
		tabla4[3][3] = "F";
		tabla4[5][5] = "F";
		imprimir(tabla4, filas, columnas);
		
		//BuscarChar b1 = new BuscarChar();
		//BuscarChar b2 = new BuscarChar();
		//BuscarChar b3 = new BuscarChar();
		//BuscarChar b4 = new BuscarChar();
		
		BusquedaIntercalado b1 = new BusquedaIntercalado();
		BusquedaIntercalado b2 = new BusquedaIntercalado();
		BusquedaIntercalado b3 = new BusquedaIntercalado();
		BusquedaIntercalado b4 = new BusquedaIntercalado();
		
		System.out.println("\nresultado en la prueba:");
		System.out.println("0 = "+b1.BlancasFull(tabla1));
		System.out.println("32 = "+b2.BlancasFull(tabla2));
		System.out.println("2 = "+b3.BlancasFull(tabla3));
		System.out.println("4 = "+b4.BlancasFull(tabla4));
		
	}
	
	
	static void imprimir (String[][] tabla, int filas, int columnas) {
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(tabla[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	static String[][] llenadoTabla (String[][] tabla, int filas, int columnas){
		boolean bandera = true;
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {	
				if(bandera) {
					tabla[i][j] = ".";
					bandera = (j==columnas-1)?true:false;
				}else {
					tabla[i][j] = "N";
					bandera = (j==columnas-1)?false:true;
				}
			}
		}
		return tabla;
	}
	
	static String[][] llenadoTablaFull (String[][] tabla, int filas, int columnas){
		boolean bandera = true;
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {	
				if(bandera) {
					tabla[i][j] = "F";
					bandera = (j==columnas-1)?true:false;
				}else {
					tabla[i][j] = "N";
					bandera = (j==columnas-1)?false:true;
				}
			}
		}
		return tabla;
	}
}

class BuscarChar {
	
	public int BlancasFull (String[][] tabla) {
		int n = 0;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (tabla[i][j].equals("F")) {
					n++;
				}
			}
		}
		
		return n;
	}
}
