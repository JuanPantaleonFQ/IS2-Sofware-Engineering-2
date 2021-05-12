import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.cli.ParseException;

public class main {
	private static OutputStream _outFile = null; //cambiar null por un valor por defecto en caso de no meeter una entrada
	private static String _inFile = null;
	private static InputStream _in = null;
	
	
	public static void CargaDatos(String[] args) {
		try {
			String line = "salida/generadaAuto.json";
			if(args[0]!= null) {
				 line = args[0];
			}
			parseInFileOption(line);
			if(args[1]!= null) {
				 line = args[1];
			}
			parseOutFileOption(line);
			
			
		} catch (ParseException e) {
			System.err.println(e.getLocalizedMessage());
			System.exit(1);
		}
		
	}
	
	private static void parseInFileOption(String line) throws ParseException {
		_inFile = line;
		try {
			_in = new FileInputStream(new File(line));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			_inFile = "salida/generadaAuto.json";
		}
	}
	
	private static void parseOutFileOption(String line){
		if (line!=null){
			try {
				_outFile = new FileOutputStream(new File(line));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else {
			try {
				_outFile = new FileOutputStream(new File(_inFile));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
