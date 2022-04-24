package com.jacaranda.registro.empleados;

import java.util.LinkedList;
import java.util.List;

public class Registro {
	private Empleado empleado;
	private String prima;
	List<Empleado> empleados = new LinkedList<>();

	public Registro(Empleado empleado) {
		super();
		this.empleado = empleado;
		setPrima();
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

	@Override
	public String toString() {
		return "Registro [empleado=" + empleado + ", prima=" + prima + "]";
	}

}
