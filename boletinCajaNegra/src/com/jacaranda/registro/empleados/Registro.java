package com.jacaranda.registro.empleados;

import java.util.LinkedList;
import java.util.List;

public class Registro {
	private String prima;
	private Empleado empleado;
	List<Empleado> empleados;

	public Registro(Empleado empleado) {
		super();
		setPrima();
		this.empleado = empleado;
		this.empleados = new LinkedList<>();
	}

	public String getPrima() {
		return prima;
	}

	private String setPrima() {
		String result = null;
		if (this.empleado.getMesesTrabajo() >= 12) {
			if (this.empleado.getDirectivo() == '+') {
				result = "P1";
			} else {
				result = "P2";
			}
		} else {
			if (this.empleado.getDirectivo() == '+') {
				result = "P3";
			} else {
				result = "P4";
			}
		}
		return result;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

}
