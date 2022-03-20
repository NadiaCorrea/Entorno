package boletin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2. Segundo programa: función mágica El programa lee un número por teclado 
//y luego realiza una operación mágica para devolver un resultado para mostrarlo por pantalla. 
//El resultado esperado es “1”. 

public class ED1T2P {
	public static void main(String[] args) throws IOException {
		int numero;
		double resultado;
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame un número:");
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
 * Distribución de breakpoints: Primer breakpoint en la variable numero. Segundo
 * breakpoint en el método funcioMagica para saber el parametro que recibe.
 * Tercer breakpoint en la variable r para saber el resultado. Añadí a
 * Expressions la operación (((((((a * 2.0) * 5.0) * 3.0) / 2.0) / 5.0) / 3.0) -
 * a) cuyo resultado era 0. Como se esprea uq el resultado sea 0 lo que hice fue
 * eliminar el -a.
 */
