package Hospital;

public class Paciente {

	private static int contador = 0;
	private int identificador;
	private String nombre;
	private int edad;
	private String telefono;
	private String numeroSeguridadSocial;
	public Paciente(int identificador, String nombre, int edad, String telefono, String numeroSeguridadSocial) {
		this.identificador = ++contador;
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador)  {
		throw new NullPointerException();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}
	public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Paciente && 
				((Paciente)obj).edad == this.edad &&
				((Paciente)obj).identificador == this.identificador &&
				((Paciente)obj).nombre.equals(this.nombre) &&
				((Paciente)obj).numeroSeguridadSocial.equals(this.numeroSeguridadSocial) &&
				((Paciente)obj).telefono.equals(this.telefono)) {
			return true;
		}
		return false;		
	}
	public boolean esNumeroSSValido() {
		if (this.numeroSeguridadSocial.length() == 11) {
			return true;
		}
		return false;
	}
	public boolean esMayorEdad() {
		return edad>=18?true:false;
	}
}
