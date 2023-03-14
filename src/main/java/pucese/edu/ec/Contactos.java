package pucese.edu.ec;

public class Contactos {
	private String nombre, apellido, telefono, id;
	private int edad;
	private double sueldo;

	public Contactos() {
		
	}
	

	
	//getters and setters

	public Contactos(String nombre, String apellido, String telefono, String id, int edad, double sueldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.id = id;
		this.edad = edad;
		this.sueldo = sueldo;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}



	@Override
	public String toString() {
		return "Contactos [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", id=" + id
				+ ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}


	

}
