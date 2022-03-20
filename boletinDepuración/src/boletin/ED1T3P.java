package boletin;

public class ED1T3P {

//	 Tercer programa: contador de n�mero pares e impares 
//	 El programa muestra par o impar, unas 100 veces dependiendo del valor 
//	 de la variable �i� del bucle while. 
//	 El bucle es infinito. �C�mo resolverlo? �Qu� le ocurre a la variable �i�? 

	public static void main(String[] args) {
		int i;
		i = 0;
		// int countPar = 0;
		// int countImpar = 0;
		while (i < 100) {
			if (i % 2 == 0) {
				System.out.println("Par");
				// countPar++;
			} else {
				System.out.println("Impar");
				// countImpar++;
			}
			i++;
		}
	}
}

/*
 * Distribuci�n de los breakpoints: Primer breakpoint al inicio del bucle while
 * para saber el valor de i cada vez que pasa por el bucle. El segundo
 * breakpoint en la condici�n, y el tercero y cuarto breakpoint en los cambios
 * de valores de i. Cuando i es par se le suma 1 a su valor y cuando es impar se
 * le resta por lo que siempre est� en los valores de 0 y 1. Para resolver este
 * bucle infinito debemos aumentar el valor de i al salir de las condiciones.Y
 * si lo que quermos es contar cuantos n�mero pares e impares hay habr�a que
 * ponen un contador para cada caso al que habr�a que sumar 1 cada vez que
 * entrase en la condici�n.
 */
