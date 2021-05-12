package Usuarios;

import java.util.ArrayList;
import java.util.List;


import Gestion.Receta;

public class Paciente extends Usuario{
	private List<Receta> recetas;
	
	public Paciente(String ocupacion,String nombre, String email, String DNI, String telefono) {
		super(ocupacion,nombre,email,DNI,telefono);
		recetas = new ArrayList<>();
	}
	@Override
	public void addReceta(Receta receta) {
		recetas.add(receta);
		
	}
	@Override
	public String serialize() {
		String s=getOcupacion()+";"+get_Nombre()+";"+get_Email()+";"+get_Telefono();
		return s;
	}

	
}
