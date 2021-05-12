package Usuarios;



import Gestion.Receta;

public class Medico extends Usuario{
	private String _Especialidad;
	private int _Consulta;
	public Medico(String ocupacion, String nombre, String email, String DNI, String telefono,String especialidad,int consulta) {
		super(ocupacion,nombre,email,DNI,telefono);
		set_Especialidad(especialidad);
		set_Consulta(consulta);
	}
	public String get_Especialidad() {
		return _Especialidad;
	}
	private void set_Especialidad(String especialidad) {
		this._Especialidad = especialidad;
	}
	public int get_Consulta() {
		return _Consulta;
	}
	private void set_Consulta(int consulta) {
		this._Consulta = consulta;
	}
	@Override
	public void addReceta(Receta receta) {//añade receta a un paciente (se usara mas tarde)
		
		
	}
    
	@Override
	public String serialize() {
		String s=getOcupacion()+";"+get_Nombre()+";"+get_Email()+";"+get_Telefono()+";"+get_Especialidad()+";"+get_Consulta();
		return s;
	}
	
}
