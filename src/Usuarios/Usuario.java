package Usuarios;

import java.util.List;



import Gestion.Cita;
import Gestion.Receta;

public abstract class Usuario {
	private String ocupacion;
	private String _Nombre;
	private String _Email;
	private String _DNI;
	private String _Telefono;
	private List<Cita> _Citas;
	private int _num_citas;
	
	

	public Usuario(String ocupacion, String nombre, String email, String dni, String telefono) {
		setOcupacion(ocupacion);
		set_Nombre (nombre);
		set_Email(email);
		set_DNI(dni);
		set_Telefono(telefono);
		_Citas=null;
		set_num_citas(0);
		
	}
	
	public String get_Nombre() {
		return _Nombre;
	}

	private void set_Nombre(String _Nombre) {
		this._Nombre = _Nombre;
	}

	public String get_Email() {
		return _Email;
	}

	public void set_Email(String _Email) {
		this._Email = _Email;
	}

	public String get_DNI() {
		return _DNI;
	}

	private void set_DNI(String _DNI) { //el unico set privado por que sumonemos que una vez creado el ID no puede ser cambiado asi evitamos problemas
		this._DNI = _DNI;
	}

	public String get_Telefono() {
		return _Telefono;
	}

	public void set_Telefono(String _Telefono) {
		this._Telefono = _Telefono;
	}
	
	public String get_Citas() {
		return _Citas.toString();
	}

	public void addCita(Cita Cita) {
		this._Citas.add(Cita);
		this.set_num_citas(this.get_num_citas() + 1);
	}
	abstract public void addReceta(Receta receta);
	

	public int get_num_citas() {
		return _num_citas;
	}

	public void set_num_citas(int _num_citas) {
		this._num_citas = _num_citas;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public abstract String serialize();
	
}
