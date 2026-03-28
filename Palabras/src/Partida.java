import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Partida{

	private Juego juego;
	private Set<Persona> jugadores;
	private List<String> puntos;
	private List<String> idJugadores;
	
	public Partida(Juego juego, Set<Persona> jugadores) throws Exception {
		
		this.juego = juego;
		if( this.juego.getCantidadJugadores() < jugadores.size() ) {
			throw new Exception("Sois demasiados jugadores");
		}
		this.jugadores = jugadores;
		
		puntos = new ArrayList();
		idJugadores = new ArrayList();
		
		for(Persona p : jugadores) {
			
			idJugadores.add(p.getNom()+String.valueOf(p.getCode()));
		}

	}
	
	public char[] turnoActual(String palabra, String cadena, char letra, String id) {
			char[] envio = new char[palabra.length()];
			char[] intento = cadena.toCharArray();
			int i = 0;
			int punt = 0;
			
			for(char c : palabra.toCharArray()) {
				if(c == letra) {
					envio[i] = letra;
					punt++;
				}
				else {
					envio[i] = intento[i];
				}
				++i;
			}
			puntos.add(id+"|"+String.valueOf(punt)+"|Letra"+letra);
			// Añado '|' para luego hacer split de los datos (id del jugador + los puntos + la letra adivinada)
			//por cada turno
			return envio;
	}


}
