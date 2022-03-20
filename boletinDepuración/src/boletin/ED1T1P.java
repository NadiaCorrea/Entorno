package boletin;

import java.util.Random;

public class ED1T1P {
	static Random rnd = new Random();

	public static void main(String[] args) {
		int veces;
		int contador = 0;
		int numeroAMostrar;
		veces = rnd.nextInt(100) + 1; // first breakpoint to know the number generated - random number from 1 to 100

		for (int i = 0; i < veces; i++) {
			// contador = 0; // Second breakpoint (initializes the counter at 0)
			numeroAMostrar = rnd.nextInt(50);
			System.out.println(numeroAMostrar); // generates a random number from 1 to 49
			contador++; // Third breakpoint (Adds one to the counter of numbers)
		}

		System.out.println("Se han generado " + contador + " números aleatorios");

	}
}

/*
 * Para la comprobación del ejecicio puse el primero de los breakpoints en la
 * variable veces saber el número que se le asignaba. El segundo y el tercer
 * breakpoint los puse dentro del bucle for en los contadores. El problema era
 * que el contador se incializaba a 0 cada vez que vovía a empezar el bucle, por
 * lo que se eliminaba el aumento del contador que se realizaba al final del
 * bucle. Como solución opté por eliminar primer contador, y también puse en una
 * variable al genarador del número a imprimir.
 */
