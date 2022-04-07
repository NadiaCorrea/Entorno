package com.jacaranda.main.registro;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.jacaranda.clase.registro.Registro;
import com.jacaranda.clase.registro.RegistroException;

public class MainRegistro {

	public static void main(String[] args) {

		List<Registro> registros = new LinkedList<>();
		Registro reg1;
		Registro reg2;
		Registro reg3;
		Registro reg4;
		Registro reg5;
		Registro reg6;

		try {
			reg1 = new Registro(998, "Loudovicoo", 13, '+');
			registros.add(reg1);
			reg2 = new Registro(999, "Carla Sanz", 15, '-');
			registros.add(reg2);
			reg3 = new Registro(8, "Loudo Vico", 11, '+');
			registros.add(reg3);
			reg4 = new Registro(8, "Laura Vera", 1, '-');
			registros.add(reg4);
			System.out.println(asignarPrimas(registros));

		} catch (RegistroException e) {
			System.out.println("No se puedo crear el registro. " + e.getMessage());
		}

		try {
			reg5 = new Registro(0, "JuanFrank", 12, '+');
		} catch (RegistroException e) {
			System.out.println("No se puedo crear el registro. " + e.getMessage());
		}

		try {
			reg6 = new Registro(1000, "JuanFrank", 12, '+');
		} catch (RegistroException e) {
			System.out.println("No se puedo crear el registro. " + e.getMessage());
		}

	}

	public static String asignarPrimas(List<Registro> registros) {
		StringBuilder result = new StringBuilder();

		Iterator<Registro> iterator = registros.iterator();
		Registro iRegistro;

		while (iterator.hasNext()) {
			iRegistro = iterator.next();
			result.append(asignarPrima(iRegistro) + "\n");
		}
		return result.toString();

	}

	public static String asignarPrima(Registro empl) {
		String result = empl.toString();
		if (empl.getMesesTrabajo() >= 12) {
			if (empl.getDirectivo() == '+') {
				result += ", prima=P1";
			} else {
				result += ", prima=P2";
			}
		} else {
			if (empl.getDirectivo() == '+') {
				result += ", prima=P3";
			} else {
				result += ", prima=P4";
			}
		}
		return result;
	}
}
