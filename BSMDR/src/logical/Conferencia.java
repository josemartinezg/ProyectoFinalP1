package logical;

<<<<<<< HEAD
import java.util.ArrayList;

public class Conferencia {
	private ArrayList<Juego> juegos;
	private ArrayList<Equipo> equipos;
	private static Conferencia conf = null;
	
	private Conferencia() {
		super();
		this.juegos = new ArrayList<Juego>();
		this.equipos = new ArrayList<Equipo>();
	}

	public ArrayList<Juego> getJuegos() {
		return juegos;
	}
	
	public ArrayList<Juego> getJuegos(FechaSimple fecha) {
		ArrayList<Juego> aux = new ArrayList<Juego>();
		for (Juego jg : juegos) {
			FechaSimple fechaJuego = jg.getFecha();
			if (fechaJuego.getMonth() == fecha.getMonth() &&
				fechaJuego.getYear() == fecha.getYear() &&
				fechaJuego.getDay() == fecha.getDay()) {
				aux.add(jg);
			}
		}
		return aux;
	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}
	
	public void insertJuego(Juego juego) {
		this.juegos.add(juego);
	}
	
	public void insertEquipo(Equipo equipo) {
		this.equipos.add(equipo);
	}
	
	public void removeJuego(Juego juego) {
		this.juegos.remove(juego);
	}
	
	public void removeEquipo(Equipo equipo) {
		this.equipos.remove(equipo);
	}
	
	public static Conferencia getInstance() {
		if (conf == null) {
			conf = new Conferencia();
		}
		return conf;
	}
	
	public ArrayList<Juego> getJuegosDelDia() {
		return this.getJuegos(new FechaSimple());
	}

