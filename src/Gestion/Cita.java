package Gestion;

import java.util.Calendar;;

public class Cita {
	private Calendar _Fecha;
	public Cita( Calendar fecha) {
		set_Fecha(fecha);
	}
	public Calendar get_Fecha() {
		return _Fecha;
	}
	public void set_Fecha(Calendar Fecha) {
		this._Fecha = Fecha;
	}

}
