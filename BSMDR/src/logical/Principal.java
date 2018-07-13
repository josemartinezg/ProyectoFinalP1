package logical;

import java.util.Calendar;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estadistica estadisticas = new Estadistica(0, 0, 0, 0, 0, 0, 0, 0, 0);
		Lesion lesion = new Lesion("mala", 10, Calendar.getInstance(), 20, Calendar.getInstance(), "una vaina feisima", true);
		Jugador jugador = new Jugador("juan", "jose", "123", Calendar.getInstance(), 152, "america", false, estadisticas);
		
	}

}
