package com.jacaranda.main.registro;

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

		try {
//			reg1 = new Registro(000, "JuanFrank", 12, '+');
//			reg1 = new Registro(1000, "JuanFrank", 12, '+');
			reg2 = new Registro(998, "Loudovicoo", 13, '+');
			registros.add(reg2);
//			reg3 = new Registro(999, "Loudovicoos", 13, '-');
			System.out.println(asignarPrima(reg2));
//			reg4 = new Registro(999, "Loudovicoos", 13, '-');
		} catch (RegistroException e) {

			System.out.println("No se puedo crear el resgistro" + e.getMessage());
		}

	}

	//

	public static String asignarPrima(Registro empl) {// cambiar esto para que recorra la lista de empleado e imprima la
														// prima
		String result = empl.toString();
		if (empl.getMesesTrabajo() >= 12) {
			if (empl.getDirectivo() == '+') {
				result += "prima=P1";
			} else {
				result += "prima=P2";
			}
		} else {
			if (empl.getDirectivo() == '+') {
				result += "prima=P3";
			} else {
				result += "prima=P4";
			}
		}
		return result;
	}
}
