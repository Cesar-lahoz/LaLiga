
public class Equipo {

	private final int TOT_JUGADORES=26;
	private final int TOT_TECNICOS=2;
	private String nombre;
	private String estadio;
	public Jugador []Jugadores;
	public Entrenador []Entrenador;
	/*
	 * public Jugador []jugadores= new Jugador [TOT_JUGADORES];
	 * public Entrenador []entrenadores= new Entrenador [TOT_TECNICOS];
	 */
	public Equipo() {
		this.Jugadores = new Jugador [TOT_JUGADORES];
		this.Entrenador = new Entrenador[TOT_TECNICOS];
	}
	public Equipo(String nombre, String estadio) {
		this.nombre = nombre;
		this.estadio = estadio;
		this.Jugadores = new Jugador [TOT_JUGADORES];
		this.Entrenador = new Entrenador[TOT_TECNICOS];
	}
	
	public Equipo(String nombre, String estadio, Jugador[] jugadores, Entrenador[] entrenadores, int ultimotec) {
		super();
		this.nombre = nombre;
		this.estadio = estadio;
		this.Jugadores = jugadores;
		this.Entrenador = entrenadores;
	}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getEstadio() {return estadio;}
	public void setEstadio(String estadio) {this.estadio = estadio;}
	public Jugador[] getJugador() {return Jugadores;}
	public void setJugador(Jugador[] jugadores) {Jugadores = jugadores;}
	public Entrenador[] getEntrenadores() {return Entrenador;}
	public void setEntrenadores(Entrenador[] entrenadores) {Entrenador = entrenadores;}

}
