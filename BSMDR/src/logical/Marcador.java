package logical;

public class Marcador {
	private int puntajeVisitante; 
	private int puntajeLocal;
	private float tiempoDelCuarto;
	private int cuartoActual;
	
	public Marcador(int puntajeVisitante, int puntajeLocal, float tiempoDelCuarto, int cuartoActual) {
		super();
		this.puntajeVisitante = puntajeVisitante;
		this.puntajeLocal = puntajeLocal;
		this.tiempoDelCuarto = tiempoDelCuarto;
		this.cuartoActual = cuartoActual;
	}
	public int getPuntajeVisitante() {
		return puntajeVisitante;
	}
	public void setPuntajeVisitante(int puntajeVisitante) {
		this.puntajeVisitante = puntajeVisitante;
	}
	public int getPuntajeLocal() {
		return puntajeLocal;
	}
	public void setPuntajeLocal(int puntajeLocal) {
		this.puntajeLocal = puntajeLocal;
	}
	public float getTiempoDelCuarto() {
		return tiempoDelCuarto;
	}
	public void setTiempoDelCuarto(float tiempoDelCuarto) {
		this.tiempoDelCuarto = tiempoDelCuarto;
	}
	public int getCuartoActual() {
		return cuartoActual;
	}
	public void setCuartoActual(int cuartoActual) {
		this.cuartoActual = cuartoActual;
	}
}
