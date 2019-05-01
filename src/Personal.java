
public class Personal {
	private static int contador = 0;
	private int identificador;
	private String nombre;
	private String puesto;
	public Personal(int identificador, String nombre, String puesto) {
		super();
		this.identificador = ++contador;
		this.nombre = nombre;
		this.puesto = puesto;
	}
	public int getIdentificador() {
		return identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public boolean esCelador() {
		return "Celador".equals(puesto)?true:false;
	}
	public boolean esPersonalHospital() {
		return nombre.startsWith("PERS-");
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Personal &&
				((Personal)obj).identificador == this.identificador &&
						((Personal)obj).nombre.equals(this.nombre) &&
						((Personal)obj).puesto.equals(this.puesto)) {
			return true;
		}
		return false;
				
	}
	
}
