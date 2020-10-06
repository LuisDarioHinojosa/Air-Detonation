/*Nombre:Luis Dario Hinojosa
 * 000182411
 * VerSion 1.0
 *26/11/18
 * */
package libreria;
//Ideas matrizes comptetencuia (filas/competidores columnas puntos)
public class Traceur {
private String nombre;
private int edad;
private String equipo;
private double pago;
private boolean playera;
private boolean detonador;
private int clave;
private char talla;
private static int contador=1;




public Traceur (int clave) {
	this.clave=clave;
}

public Traceur () {
	this.clave=contador;
	contador++;
}



public Traceur(String nombre, int edad, String equipo, double pago, boolean playera, boolean detonador, char talla) {
	this();
	this.nombre = nombre;
	this.edad = edad;
	this.equipo = equipo;
	this.pago = pago;
	this.playera = playera;
	this.detonador = detonador;
	this.talla=talla;
	
	
}





public double getPago() {
	return pago;
}





public char getTalla() {
	return talla;
}





public void setPago(double pago) {
	this.pago = pago;
}





public boolean isPlayera() {
	return playera;
}





public void setPlayera(boolean playera) {
	this.playera = playera;
}











public boolean isDetonador() {
	return detonador;
}





public void setDetonador(boolean detonador) {
	this.detonador = detonador;
}





public String getNombre() {
	return nombre;
}





public int getEdad() {
	return edad;
}





public String getEquipo() {
	return equipo;
}





public int getClave() {
	return clave;
}










	@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + clave;
	return result;
}





@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Traceur other = (Traceur) obj;
	if (clave != other.clave)
		return false;
	return true;
}

public int compareTo (Traceur otro) {
	return this.clave-otro.clave;
}






	@Override
public String toString() {
	StringBuilder cad=new StringBuilder();
	cad.append("Nombre:" +nombre);
	cad.append("\n");
	cad.append("edad:" +edad);
	cad.append("\n");
	cad.append("equipo:" +equipo);
	cad.append("\n");
	cad.append("pago:" +pago);
	cad.append("\n");
	cad.append("playera:" +playera);
	cad.append("\n");
	cad.append("detonador:" +detonador);
	cad.append("\n");
	cad.append("clave:" +clave);
	cad.append("\n");
	cad.append("talla:"+talla);
	
	

	return cad.toString();
}}





	