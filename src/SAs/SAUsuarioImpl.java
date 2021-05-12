package SAs;

import java.util.ArrayList;

import DAOs.IFachadaUsuariosDAO;
import Usuarios.Usuario;

public class SAUsuarioImpl implements ISAUsuario {
	
	
      private IFachadaUsuariosDAO ifUsuarioDAO;


	@Override
	public void addUsuario(Usuario us) {
		if(ifUsuarioDAO.existeUsuario(us.get_DNI()))
			System.out.println("[ERROR] al añadir usuario");
		else
			ifUsuarioDAO.addUsuario(us);
	}

	@Override
	public void deleteUsuario(Usuario us) {
                
		if(ifUsuarioDAO.existeUsuario(us.get_DNI()))
			ifUsuarioDAO.deleteUsuario(us);
		else
			System.out.println("[ERROR] Usuario inexistente");

		
	}

	@Override
	public Usuario consulta1Usuario(String id) {
		 
		 Usuario aux=null;
		if(!ifUsuarioDAO.existeUsuario(id))
			aux= ifUsuarioDAO.consulta1Usuario(id);
		else
			System.out.println("[ERROR] Usuario inexistente");
			
		return aux;
		
		
	}

	@Override
	public ArrayList<Usuario> consultaTodos(int num_citas) {

		return ifUsuarioDAO.consultaTodos(num_citas);
	}

	@Override
	public void modificaUsuario(Usuario us, String email, String tlf) {
	
		if(ifUsuarioDAO.existeUsuario(us.get_DNI()))
			ifUsuarioDAO.modificaUsuario(us, email, tlf);
		else
			System.out.println("[ERROR] Usuario inexistente");

		 
		
	}

}
