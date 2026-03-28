import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GestionArchivo {

	public GestionArchivo() {
		
	}
	
	public void guardarXML(Partida terminada, String nomFitxer) throws FileNotFoundException {
		XMLEncoder e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(nomFitxer)));
		e.writeObject(terminada);
		e.close();
	}
	
	public List<String> cargarPalabras(String nomFitxer){
		File fitxer = new File(nomFitxer); // relatiu

		FileReader fReader = null; // Lector del fitxer

		String linia;
		List<String> palabras = new ArrayList();

		try (BufferedReader bReader = new BufferedReader(new FileReader(fitxer))) {
			while ((linia = bReader.readLine()) != null) {
				
				palabras.add(linia);
				
				}
			
		} catch (FileNotFoundException e) {
	
			System.out.println("Fitxer no existeix");
	
		} catch (IOException e) {
	
			System.out.println(e.getMessage());
	
		}
		return palabras;
		
	}
}
