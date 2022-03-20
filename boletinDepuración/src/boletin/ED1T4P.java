package boletin;

import java.util.Random;

public class ED1T4P {

	static Random rnd = new Random();

//	Cuarto programa: ejecuci�n aleatoria 
//	El programa aumenta y disminuye el valor de un iterador de un bucle. 
//	�Acaba el bucle o estamos ante otro bucle infinito? 
//	Usa �Step Into� para ver el comportamiento de las funciones. 
//	Plantea una soluci�n. 

	public static void main(String[] args) {
		int iterador = 0;
		while (iterador >= 0) {
			iterador = aumentar(iterador);
			iterador = disminuir(iterador);
		}
	}

	public static int aumentar(int a) {
		int aumento = rnd.nextInt(50); // num random 0 al 49
		System.out.println("Aumentando " + aumento);
		return (a + aumento);
	}

	public static int disminuir(int a) {
		int disminucion = rnd.nextInt(10); // num random 0 al 9
		System.out.println("Disminuyendo " + disminucion);
		return (a - disminucion);
	}

}

/*
 * Distribuci�n de breakpoints: Inicio del bucle, inicio de m�todos, en las
 * variable aumento y disminuci�n expresiones aumento, disminuci�nm a iterador.
 * En el primer m�todo se aument el iterador con un n�mero random del 0 al 49,
 * mienstras que el segundo m�todo disminuye el iterador con un n�mero aleatorio
 * del 0 al 9 por lo que i ir� aumentado y no ser� menor igual que cero. Para
 * solucionarlo podr�amos cambiar la condici�n den parada del bucle while o
 * aumentar el rango de los n�meros aleatorios del m�todo disminuir.
 */