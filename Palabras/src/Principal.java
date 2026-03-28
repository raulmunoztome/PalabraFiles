import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
	 GestionArchivo gestor = new GestionArchivo();
	 List<String> palabras = gestor.cargarPalabras("palabras.txt");
	 Scanner sc = new Scanner(System.in);
	 
	 Juego j1;
	 
	 try {
		
		
		
	 } catch (Exception e) {
		
		System.out.println(e.getMessage());
	 }
	
	 Set<Persona> jugadores = new HashSet<Persona>();
	 
	 String opcion = "";
	 System.out.println("introduce el numero de la opcion\n");
	 
	 while(!opcion.equals("0")) {
		pintarMenu();
		opcion = sc.nextLine();
		switch(Integer.parseInt(opcion)) {
		
		case 1:
			try {
				j1 = new Juego("Adivina la palabra", 5, "Cada turno puedes decir una letra, ganas tantos puntos como veces esté en la palabra!");
				Partida p1 = new Partida(j1, jugadores);
				
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
			break;
			
		case 2:
			
			break;
		}
		
	}
	
	 
	 
	}
	
	
	public static void pintarMenu() {
		System.out.println("0 -> SALIR");
		System.out.println("1 -> Jugar una partida");
		System.out.println("2 -> Info del juego");
		System.out.println("3 -> Añadir un usuario");
		System.out.println("4 -> Mi id de usuario");
		System.out.println("5 -> Registro de partidas\n");
	}
}
