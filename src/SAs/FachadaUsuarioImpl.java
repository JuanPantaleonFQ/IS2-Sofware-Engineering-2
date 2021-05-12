

import java.util.ArrayList;
import Usuarios.*;


public class FachadaUsuarioImpl  implements IFachadaUsuario{
	
	private ISAUsuario iUsuarios;

	@Override
	public void addUsuario(Usuario us) {
		
		 iUsuarios.addUsuario(us);
		
	}

	@Override
	public void deleteUsuario(Usuario us) {
		
		iUsuarios.deleteUsuario(us);
		
	}

	

	@Override
	public ArrayList<Usuario> consultaTodos(int num_citas) {
		
		return  iUsuarios.consultaTodos(num_citas);
	}

	@Override
	public void modificaUsuario(Usuario us, String email, String tlf) {
		  iUsuarios.modificaUsuario(us, email, tlf);	
	}

	

	@Override
	public Usuario consulta1Usuario(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
