package Gestion;

public class Recursos {
	private String _Recurso;
	private int _Cantidad;

	public Recursos( String recursos, int cantidad) {
		set_Recurso(recursos);
		set_Cantidad(cantidad);
		
	}

	public String get_Recurso() {
		return _Recurso;
	}

	public int get_Cantidad() {
		return _Cantidad;
	}

	private void set_Recurso(String Recurso) {
		this._Recurso = Recurso;
	}

	private void set_Cantidad(int Cantidad) {
		this._Cantidad = Cantidad;
	}
	
	

}
