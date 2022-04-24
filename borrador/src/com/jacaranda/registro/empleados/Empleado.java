package com.jacaranda.registro.empleados;

import java.util.Objects;

public class Empleado {
	private int numEmpleado;
	private String nombreEmpleado;
	private int mesesTrabajo;
	private char directivo;

	public Empleado(int numEmpleado, String nombreEmpleado, int mesesTrabajo, char directivo) throws EmpleadoException {
		super();
		setNumEmpleado(numEmpleado);
		setNombreEmpleado(nombreEmpleado);
		setMesesTrabajo(mesesTrabajo);
		setDirectivo(directivo);
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	private void setNumEmpleado(int numEmpleado) throws EmpleadoException {
		if (numEmpleado <= 0 || numEmpleado > 999) {
			throw new EmpleadoException("El número de empleado no puede ser menor o igula que 0 ni mayor que 999.");
		} else {
			this.numEmpleado = numEmpleado;
		}
	}

	public int getMesesTrabajo() {
		return mesesTrabajo;
	}

	private void setMesesTrabajo(int mesesTrabajo) throws EmpleadoException {
		if (mesesTrabajo < 0 || mesesTrabajo > 999) {
			throw new EmpleadoException("Los meses trabajados no pueden ser inferior a 0.");
		} else {
			this.mesesTrabajo = mesesTrabajo;
		}
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	private void setNombreEmpleado(String nombreEmpleado) throws EmpleadoException {
		if (nombreEmpleado == null) {
			throw new EmpleadoException("El nombre del empleado no puede ser nulo");
		} else {
			if (nombreEmpleado.length() > 10) {
				throw new EmpleadoException("El nombre del empleado no puede tener más de 10 caracteres.");
			} else {
				this.nombreEmpleado = nombreEmpleado;
			}
		}
	}

	public char getDirectivo() {
		return directivo;
	}

	private void setDirectivo(char directivo) throws EmpleadoException {
		if (directivo != '+' && directivo != '-') {
			throw new EmpleadoException("El caracter introducido no es válido.");
		} else {
			this.directivo = directivo;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreEmpleado, numEmpleado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(nombreEmpleado, other.nombreEmpleado) && numEmpleado == other.numEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [numEmpleado=" + numEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", mesesTrabajo="
				+ mesesTrabajo + ", directivo=" + directivo + "]";
	}

}
