package boletin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2. Segundo programa: funci�n m�gica El programa lee un n�mero por teclado 
//y luego realiza una operaci�n m�gica para devolver un resultado para mostrarlo por pantalla. 
//El resultado esperado es �1�. 

public class ED1T2P {
	public static void main(String[] args) throws IOException {
		int numero;
		double resultado;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame un n�mero:");
		numero = Integer.parseInt(lectura.readLine());
		resultado = funcionMagica(numero);
		System.out.println("El resultado obtenido es " + resultado);

	}

	public static double funcionMagica(int a) {
		double r;
		r = a / ((((((a * 2.0) * 5.0) * 3.0) / 2.0) / 5.0) / 3.0);
		return r;
	}
}

/*
 * Distribuci�n de breakpoints: Primer breakpoint en la variable numero. Segundo
 * breakpoint en el m�todo funcioMagica para saber el parametro que recibe.
 * Tercer breakpoint en la variable r para saber el resultado. A�ad� a
 * Expressions la operaci�n (((((((a * 2.0) * 5.0) * 3.0) / 2.0) / 5.0) / 3.0) -
 * a) cuyo resultado era 0. Como se esprea uq el resultado sea 0 lo que hice fue
 * eliminar el -a.
 */
