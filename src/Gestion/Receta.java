package Gestion;

import java.util.Calendar;
import java.util.Date;

public class Receta {
	private Calendar _FechaInicio;
	private Calendar _FechaFin;
	private String _Medicamento;
	private int _Cantidad;
	private String _ID;
	
	
	public Receta(Calendar fechaFin, String medicamento, int cantidad, String ID) {
		set_FechaInicio();
		set_FechaFin(fechaFin);
		set_Medicamento(medicamento);
		set_Cantidad(cantidad);
		set_ID(ID);
	}

	public Calendar get_FechaInicio() {
		return this._FechaInicio;
	}

	private void set_FechaInicio() {
		this._FechaInicio.getInstance();
	}

	public Calendar get_FechaFin() {
		return this._FechaFin;
	}

	private void set_FechaFin(Calendar FechaFin) {
		this._FechaFin = FechaFin;
	}

	public String get_Medicamento() {
		return this._Medicamento;
	}

	private void set_Medicamento(String Medicamento) {
		this._Medicamento = Medicamento;
	}

	public int get_Cantidad() {
		return _Cantidad;
	}

	private void set_Cantidad(int Catidad) {
		this._Cantidad = Catidad;
	}

	public String get_ID() {
		return _ID;
	}

	private void set_ID(String ID) {
		this._ID = ID;
	}
	
	
	
}
