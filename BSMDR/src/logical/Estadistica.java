package logical;

public class Estadistica {
	private int puntosDeCampo;
	private int puntoDeTres;
	private int asistencias;
	private int rebotes;
	private int intentosDeCampo;
	private int intentosDeTres;
	private int numeroCamiseta;
	private float estatura;
	private float peso;
	
	public Estadistica(int puntosDeCampo, int puntoDeTres, int asistencias, int rebotes, int intentosDeCampo,
			int intentosDeTres, int numeroCamiseta, float estatura, float peso) {
		super();
		this.puntosDeCampo = puntosDeCampo;
		this.puntoDeTres = puntoDeTres;
		this.asistencias = asistencias;
		this.rebotes = rebotes;
		this.intentosDeCampo = intentosDeCampo;
		this.intentosDeTres = intentosDeTres;
		this.numeroCamiseta = numeroCamiseta;
		this.estatura = estatura;
		this.peso = peso;
	}
	
	public int getPuntosDeCampo() {
		return puntosDeCampo;
	}
	public void setPuntosDeCampo(int puntosDeCampo) {
		this.puntosDeCampo = puntosDeCampo;
	}
	public int getPuntoDeTres() {
		return puntoDeTres;
	}
	public void setPuntoDeTres(int puntoDeTres) {
		this.puntoDeTres = puntoDeTres;
	}
	public int getAsistencias() {
		return asistencias;
	}
	public void setAsistencias(int asistencias) {
		this.asistencias = asistencias;
	}
	public int getRebotes() {
		return rebotes;
	}
	public void setRebotes(int rebotes) {
		this.rebotes = rebotes;
	}
	public int getIntentosDeCampo() {
		return intentosDeCampo;
	}
	public void setIntentosDeCampo(int intentosDeCampo) {
		this.intentosDeCampo = intentosDeCampo;
	}
	public int getIntentosDeTres() {
		return intentosDeTres;
	}
	public void setIntentosDeTres(int intentosDeTres) {
		this.intentosDeTres = intentosDeTres;
	}
	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}
	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
}
