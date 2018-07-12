package logical;

import java.util.ArrayList;

public class Conferencia {
	private ArrayList<Equipo> misEquipos;
	private ArrayList<Jugador> misJugadores;
	private ArrayList<Juego> misJuegos;
	private static Conferencia conferencia = null;

	private Conferencia() {
		super();
		misEquipos = new ArrayList<>();
		misJugadores = new ArrayList<>();
		misJuegos = new ArrayList<>();
	}
	public static Conferencia getInsance() {
		if (conferencia == null) {
			conferencia = new Conferencia();
		}
		return conferencia;
	}
	public ArrayList<Equipo> getMisEquipos() {
		return misEquipos;
	}
	public void setMisEquipos(ArrayList<Equipo> misEquipos) {
		this.misEquipos = misEquipos;
	}
	public ArrayList<Jugador> getMisJugadores() {
		return misJugadores;
	}
	public void setMisJugadores(ArrayList<Jugador> misJugadores) {
		this.misJugadores = misJugadores;
	}
	public ArrayList<Juego> getMisJuegos() {
		return misJuegos;
	}
	public void setMisJuegos(ArrayList<Juego> misJuegos) {
		this.misJuegos = misJuegos;
	}
	
}
