package DAOs;

import java.util.ArrayList;

import Usuarios.Usuario;

public class FachadaUsuariosDAO implements IFachadaUsuariosDAO{
	private IUsuariosDAO iUsuariosDAO;

	@Override
	public boolean existeUsuario(String id) {
		return iUsuariosDAO.existeUsuario(id);
	}

	@Override
	public boolean addUsuario(Usuario us) {
		boolean b=true;
		
		if(existeUsuario(us.get_DNI()))  b=false;
		return b;

	}

	@Override
	public boolean deleteUsuario(Usuario us) {
		boolean b=false;
		if(existeUsuario(us.get_DNI())) {
			b=true;
		}
		
		return b;
	}

	@Override
	public Usuario consulta1Usuario(String id) {
		return iUsuariosDAO.consulta1Usuario(id);
	}

	@Override
	public ArrayList<Usuario> consultaTodos(int num_citas) {
		return iUsuariosDAO.consultaTodos(num_citas);
	}

	@Override
	public boolean modificaUsuario(Usuario us, String email, String tlf) {
		boolean b=false;
		if(existeUsuario(us.get_DNI())) {
			b=true;
		}
		
		return b;
	}


	
}
