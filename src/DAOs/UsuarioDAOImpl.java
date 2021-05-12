package DAOs;

import java.io.*;
import java.util.*;

import Usuarios.*;

public class UsuarioDAOImpl implements IUsuariosDAO{
	private String dataBaseName="datos_usuarios.txt";
	private ArrayList<Usuario> listaUsuarios;
	
	@Override
	public boolean existeUsuario(String dni) {
		leerArchivo();
		int cont=0;
		boolean encontrado=false;
		while(cont<listaUsuarios.size() && !encontrado) {
			if(listaUsuarios.get(cont).get_DNI()==dni) {
				encontrado=true;
			}
			++cont;
		}
		return encontrado;
	}
	@Override
	public void addUsuario(Usuario us) {
		listaUsuarios.add(us);
		guardarArchivo();
	}
	@Override
	public void deleteUsuario(Usuario us) {
		boolean encontrado=false;
		int cont=0;
		while(cont<listaUsuarios.size() && !encontrado) {
			if(listaUsuarios.get(cont).get_DNI()==us.get_DNI()) {
				listaUsuarios.remove(cont);
				encontrado=true;
			}
			++cont;
		}
		guardarArchivo();
	}
	
	@Override
	public void modificaUsuario(Usuario us ,String email, String tlf) {
		boolean encontrado=false;
		int cont=0;
		while(cont<listaUsuarios.size() && !encontrado) {
			if(listaUsuarios.get(cont).get_DNI()==us.get_DNI()) {
				listaUsuarios.get(cont).set_Email(email);
				listaUsuarios.get(cont).set_Telefono(tlf);
				encontrado=true;
			}
			++cont;
		}
		guardarArchivo();
		
	}
	
	@Override
	public Usuario consulta1Usuario(String id) {
		Usuario us=null;
		boolean encontrado=false;
		int cont=0;
		while(cont<listaUsuarios.size() && !encontrado) {
			if(listaUsuarios.get(cont).get_DNI()==id) {
				us=listaUsuarios.get(cont);
				encontrado=true;
			}
			++cont;
		}
		return us;
	}
	@Override
	public ArrayList<Usuario> consultaTodos(int num_citas) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		int cont=0;
		while(cont<listaUsuarios.size()) {
			if(listaUsuarios.get(cont).get_num_citas()>=num_citas) {
				lista.add(listaUsuarios.get(cont));
			}
			++cont;
		}
		return lista;
	}
	
	private void leerArchivo() {
		BufferedReader br = null;
		try {
	         br = new BufferedReader(new FileReader(dataBaseName));
	         String linea;
	         while((linea=br.readLine())!=null) {
	        	 String[]parameters=linea.toLowerCase().trim().split(";");
	        	 if(parameters[0]=="m") {
	        		 listaUsuarios.add(new Medico(parameters[0],parameters[1], parameters[2], parameters[3],parameters[4],parameters[5], Integer.parseInt(parameters[6])));
	        	 }else {
	        		 listaUsuarios.add(new Paciente(parameters[0],parameters[1], parameters[2], parameters[3], parameters[4]));
	        	 }
	         }
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         try{                    
	            if( null != br ){   
	               br.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		
	}
	
	private void guardarArchivo() {
		BufferedWriter outChars=null;
		int cont=0;
		try {
			outChars=new BufferedWriter(new FileWriter(dataBaseName));
			while(cont<listaUsuarios.size()) {
				outChars.write(listaUsuarios.get(cont).serialize());
			}
			outChars.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}


}
