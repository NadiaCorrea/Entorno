package main.java.com.jacaranda.clase.registro;

import java.util.Objects;

public class Registro {
	private int numEmpleado;
	private String nombreEmpleado;
	private int mesesTrabajo;
	private char directivo;

	public Registro(int numEmpleado, String nombreEmpleado, int mesesTrabajo, char directivo) throws RegistroException {
		super();
		setNumEmpleado(numEmpleado);
		setNombreEmpleado(nombreEmpleado);
		setMesesTrabajo(mesesTrabajo);
		setDirectivo(directivo);
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	private void setNumEmpleado(int numEmpleado) throws RegistroException {
		if (numEmpleado <= 0 || numEmpleado > 999) {
			throw new RegistroException("El n�mero de empleado no puede ser menor o igual que 0 ni mayor que 999.");
		} else {
			this.numEmpleado = numEmpleado;
		}
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	private void setNombreEmpleado(String nombreEmpleado) throws RegistroException {
		if (nombreEmpleado == null || nombreEmpleado.equals("")) {
			throw new RegistroException("El nombre del empleado no puede ser nulo.");
		} else {
			if (nombreEmpleado.length() >= 10) {
				throw new RegistroException("El nombre del empleado no puede tener m�s de 10 caracteres.");
			} else {
				this.nombreEmpleado = nombreEmpleado;
			}
		}
	}

	public int getMesesTrabajo() {
		return mesesTrabajo;
	}

	private void setMesesTrabajo(int mesesTrabajo) throws RegistroException {
		if (mesesTrabajo < 0 || mesesTrabajo > 999) {
			throw new RegistroException("Los meses trabajados no pueden ser inferior a 0.");
		} else {
			this.mesesTrabajo = mesesTrabajo;
		}
	}

	public char getDirectivo() {
		return directivo;
	}

	private void setDirectivo(char directivo) throws RegistroException {
		if (directivo != '+' && directivo != '-') {
			throw new RegistroException("El caracter introducido no es v�lido.");
		} else {
			this.directivo = directivo;
		}
	}

	public String asignarPrima() {
		String result = "";
		if (this.getMesesTrabajo() >= 12) {
			if (this.getDirectivo() == '+') {
				result = "P1";
			} else {
				result = "P2";
			}
		} else {
			if (this.getDirectivo() == '+') {
				result = "P3";
			} else {
				result = "P4";
			}
		}
		return result;
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
		Registro other = (Registro) obj;
		return Objects.equals(nombreEmpleado, other.nombreEmpleado) && numEmpleado == other.numEmpleado;
	}

	@Override
	public String toString() {
		return "Registro: numEmpleado=" + numEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", mesesTrabajo="
				+ mesesTrabajo + ", directivo=" + directivo;
	}

}
