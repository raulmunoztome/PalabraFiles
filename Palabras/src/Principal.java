import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	 GestionArchivo gestor = new GestionArchivo();
	 List<String> palabras = gestor.cargarPalabras("palabras.txt");
	 Scanner sc = new Scanner(System.in);
	 
	}
	public void pintarMenu() {
		System.out.println("0 -> SALIR");
		System.out.println("1 -> Jugar una partida");
		System.out.println("2 -> Info del juego");
		System.out.println("3 -> Añadir un usuario");
		System.out.println("4 -> Mi id de usuario");
		System.out.println("5 -> Registro de partidas");
	}
}
