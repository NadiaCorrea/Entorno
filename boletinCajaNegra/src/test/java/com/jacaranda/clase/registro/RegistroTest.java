package com.jacaranda.clase.registro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

class RegistroTest {

	// Prueba Prima P1
	@Test
	void testAsignarPrimaP1() throws RegistroException {
		Registro registro = new Registro(1, "Juan", 12, '+');
		String primaEsperada = "P1";

		String prima = registro.asignarPrima();

		assertEquals("La prima esperada no es la prima obtenida", primaEsperada, prima);
	}

	// Prueba Prima P2
	@Test
	void testAsignarPrimaP2() throws RegistroException {
		Registro registro = new Registro(1, "Juan", 12, '-');
		String resultadoEsperado = "P2";

		String resultado = registro.asignarPrima();

		assertEquals("La prima esperada no es la prima obtenida", resultadoEsperado, resultado);

	}

	// Prueba Prima P3
	@Test
	void testAsignarPrimaP3() throws RegistroException {
		Registro registro = new Registro(1, "Juan", 11, '+');
		String resultadoEsperado = "P3";

		String resultado = registro.asignarPrima();

		assertEquals("La prima esperada no es la prima obtenida", resultadoEsperado, resultado);

	}

	// Prueba Prima P4
	@Test
	void testAsignarPrimaP4() throws RegistroException {
		Registro registro = new Registro(1, "Juan", 11, '-');
		String resultadoEsperado = "P4";

		String resultado = registro.asignarPrima();

		assertEquals("La prima esperada no es la prima obtenida", resultadoEsperado, resultado);

	}

	// Prueba N� empleado valores menores iguales a 0
	@Test
	public void testNumEmpleadoNegativos() {

		try {
			Registro registro = new Registro(0, "Juan Frank", 12, '+');
			fail("ERROR, deber�a haber lanzado excepci�n por valor igual menor que 0.");
		} catch (RegistroException e) {
			System.out.println("Excepci�n por valores menores igual que 0 tal y como se esperaba: " + e.getMessage());
		}

	}

	// Prueba N� empleado valores positivos pero fuera de rango
	@Test
	public void testNumEmpleadoPositivosFuera() {

		try {
			Registro registro = new Registro(1000, "Juan Frank", 12, '+');
			fail("ERROR, deber�a haber lanzado excepci�n por valor mayor que 999.");
		} catch (RegistroException e) {
			System.out.println("Excepci�n por valores mayores a 999 tal y como se esperaba: " + e.getMessage());
		}

	}

//Prueba nombre de empleado con cadena de 0		

	@Test
	public void testNombreEmpleadoEmpty() {

		try {
			Registro registro = new Registro(998, "", 12, '+');
			fail("ERROR, deber�a haber lanzado excepci�n por nombre vac�o.");
		} catch (RegistroException e) {
			System.out.println("Excepci�n por nombre vac�o tal y como se esperaba: " + e.getMessage());
		}

	}

	// Prueba nombre de empleado con extesi�n superior a la permitida

	@Test
	public void testNombreEmpleadoLargo() {

		try {
			Registro registro = new Registro(998, "Gloria Flor de Maria Morales", 12, '+');
			fail("ERROR, deber�a haber lanzado excepci�n por extensi�n superior del nombre.");
		} catch (RegistroException e) {
			System.out.println("Excepci�n por nombre extensi�n superior tal y como se esperaba: " + e.getMessage());
		}

	}

	// Prueba meses trabajados con valor negativo

	@Test
	public void testMesesTrabajadoNegativos() {

		try {
			Registro registro = new Registro(001, "Gloria", -11, '-');
			fail("ERROR, deber�a haber lanzado excepci�n por meses trabajados con valor negativo.");
		} catch (RegistroException e) {
			System.out.println(
					"Excepci�n por por meses trabajados con valor negativo tal y como se esperaba: " + e.getMessage());
		}

	}

	// Prueba meses trabajados con valores positivos no v�lidos

	@Test
	public void testMesesTrabajadoPositivosNoValidos() {

		try {
			Registro registro = new Registro(001, "Gloria", 1111, '-');
			fail("ERROR, deber�a haber lanzado excepci�n por meses trabajados con valor positivo no v�lido.");
		} catch (RegistroException e) {
			System.out
					.println("Excepci�n por por meses trabajados con valor positivo no v�lido tal y como se esperaba: "
							+ e.getMessage());
		}

	}

	// Prueba directivo no valido

	@Test
	public void testDirectivoNoValido() {

		try {
			Registro registro = new Registro(001, "Gloria", 111, '�');
			fail("ERROR, deber�a haber lanzado excepci�n por valor de directivo no v�lido.");
		} catch (RegistroException e) {
			System.out.println(
					"Excepci�n por por meses trabajados con valor de directivo no v�lido tal y como se esperaba: "
							+ e.getMessage());
		}

	}

	/*
	 * � assertEquals: permite comparar dos valores num�ricos, incluyendo un margen
	 * de error. � assertNull / assertNotNull: permite comparar con NULL. �
	 * assertTrue / assertFalse: permite realizar una comparaci�n l�gica. �
	 * assertSame / assertNotSame: permite comparar la igualdad de objetos. �
	 * assertArrayEquals: similar a assertEquals, pero comparando arrays.
	 */
}
