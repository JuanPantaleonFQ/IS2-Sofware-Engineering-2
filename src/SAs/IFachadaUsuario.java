package SAs;

import java.util.ArrayList;

import Usuarios.Usuario;

public interface IFachadaUsuario {
	
	
	public void addUsuario(Usuario us);
	public void deleteUsuario(Usuario us);
	public void modificaUsuario(Usuario us ,String email , String tlf);
	public Usuario consulta1Usuario(String id);
	public ArrayList<Usuario> consultaTodos(int num_citas);

}
