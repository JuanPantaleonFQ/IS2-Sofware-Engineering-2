package DAOs;

import java.util.ArrayList;

import Usuarios.Usuario;

public interface IFachadaUsuariosDAO {
	public boolean existeUsuario(String id);
	public boolean addUsuario(Usuario us);
	public boolean deleteUsuario(Usuario us);
	public boolean modificaUsuario(Usuario us ,String email , String tlf);
	public Usuario consulta1Usuario(String id);
	public ArrayList<Usuario> consultaTodos(int num_citas);


	
}
