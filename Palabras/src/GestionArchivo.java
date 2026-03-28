import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GestionArchivo {

	public GestionArchivo() {
		
	}
	public void guardar() {
		
	}
	public List<String> cargarPalabras(String nomFitxer){
		File fitxer = new File(nomFitxer); // Adreçament relatiu

		FileReader fReader = null; // Lector del fitxer

		String linia;
		List<String> palabras = new ArrayList();

		try (BufferedReader bReader = new BufferedReader(new FileReader(fitxer))) {
			String info;
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
