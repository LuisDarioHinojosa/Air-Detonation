/*Nombre:Luis Dario Hinojosa
 * 000182411
 * VerSion 1.0
 *28/11/18
 * */
package libreria;

public class detonadores {
	private String nombre;
	private int puntosFlow;
	private int puntosEjecucion;
	private int puntosDificultad;
	private int puntosCreatividad;
	private int clave;
	private int  total;
	
	public detonadores(int total, int clave, String nombre) {
		this.total=total;
		this.clave=clave;
		this.nombre=nombre;
	}
	
	public detonadores(String nombre, int clave, int puntosFlow, int puntosEjecucion, int puntosDificultad,
			int puntosCreatividad) {
		super();
		this.nombre = nombre;
		this.clave=clave;
		this.puntosFlow = puntosFlow;
		this.puntosEjecucion = puntosEjecucion;
		this.puntosDificultad = puntosDificultad;
		this.puntosCreatividad = puntosCreatividad;
		this.total=0;	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getNombre() {
		return nombre;
	}


	public int getPuntosFlow() {
		return puntosFlow;
	}

	public int getPuntosEjecucion() {
		return puntosEjecucion;
	}

	public int getPuntosDificultad() {
		return puntosDificultad;
	}

	public int getPuntosCreatividad() {
		return puntosCreatividad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public void setPuntosFlow(int puntosFlow) {
		this.puntosFlow = puntosFlow;
	}

	public void setPuntosEjecucion(int puntosEjecucion) {
		this.puntosEjecucion = puntosEjecucion;
	}

	public void setPuntosDificultad(int puntosDificultad) {
		this.puntosDificultad = puntosDificultad;
	}

	public void setPuntosCreatividad(int puntosCreatividad) {
		this.puntosCreatividad = puntosCreatividad;
	}

	@Override
	public String toString() {
		return "detonadores [nombre=" + nombre + ", clave=" + clave + ", total=" + total + "]";
	}

	
	
	
}
