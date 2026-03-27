
public class Juego {
	
	protected String nombre, descrip;
	protected int cantidadJugadores;
	protected int cantidadJuegos = 0;
	
	public Juego(String nombre, int cantidadJugadores) throws Exception {
		
		if(nombre.isBlank() || cantidadJugadores < 1) throw new Exception("Error en los datos básicos del juego");
		this.nombre = nombre;
		this.cantidadJugadores = cantidadJugadores;
		cantidadJuegos++;
	}
	public Juego(String nombre, int cantidadJugadores, String des) throws Exception {
		this(nombre, cantidadJugadores);
		descrip = des;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(!nombre.isBlank())this.nombre = nombre;
	}

	public int getCantidadJugadores() {
		return cantidadJugadores;
	}

	public void setCantidadJugadores(int cantidadJugadores) {
		if(cantidadJugadores > 0)this.cantidadJugadores = cantidadJugadores;
	}

	public int getCantidadJuegos() {
		return cantidadJuegos;
	}

	public void setCantidadJuegos(int cantidadJuegos) {
		this.cantidadJuegos = cantidadJuegos;
	}
	
	
}
