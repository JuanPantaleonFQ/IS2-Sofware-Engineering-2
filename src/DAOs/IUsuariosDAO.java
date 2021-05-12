package DAOs;

import java.util.ArrayList;

import Usuarios.Usuario;

public interface IUsuariosDAO {

	public boolean existeUsuario(String dni);
	public void addUsuario(Usuario us);
	public void modificaUsuario(Usuario us ,String email , String tlf);
	public void deleteUsuario(Usuario us);
	public Usuario consulta1Usuario(String id);
	public ArrayList<Usuario> consultaTodos(int num_citas);

	

}
