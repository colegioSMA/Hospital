import java.util.ArrayList;
import java.util.List;

public class Sistema {

	private List<Paciente> listaPacientes = 
			new ArrayList<>();
	private List<Personal> listaPersonal = 
			new ArrayList<>();
	public Sistema(List<Paciente> listaPacientes, List<Personal> listaPersonal) {
		super();
		this.listaPacientes = listaPacientes;
		this.listaPersonal = listaPersonal;
	}
	public void anadePaciente(Paciente paciente) {
		if (!listaPacientes.contains(paciente)) {
			listaPacientes.add(paciente);
		}
		else {
			throw new IllegalArgumentException();
		}		
	}
	public void anadePersonal(Personal personal) {
		if (!listaPersonal.contains(personal)) {
			listaPersonal.add(personal);
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	public boolean hayMasPersonalQuePacientes() {
		return listaPacientes.size() > 
			listaPersonal.size();
	}
}
