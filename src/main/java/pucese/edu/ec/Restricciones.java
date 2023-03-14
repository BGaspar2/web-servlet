package pucese.edu.ec;

public class Restricciones {

	String id, nombre, apellido, telefono, edad, sueldo;
	

	public Restricciones(String id, String nombre, String apellido, String telefono, String edad, String sueldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.edad = edad;
		this.sueldo = sueldo;
	}


	public boolean validarSoloNumInt(String num) {
		return num.matches("[0-9]");
	}
	public boolean validarSalario(String salario) {
		return salario.matches("[0-9]*.[0-9]*");
	}
	public boolean validarTexto(String text) {
		return text.matches("[a-z]*[A-Z]");
	}
	
	
	
}
