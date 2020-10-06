/*Nombre:Luis Dario Hinojosa
 * 000182411
 * VerSion 1.0
 *3/12/18
 * */
package libreria;
public class Playera {
	private int tipo;//1 manga corta, 2 manga larga
	private String marca; //etrefort gup motus
	private double precio;
	public Playera(int tipo, String marca, double precio) {
		
		this.tipo = tipo;
		this.marca = marca;
		this.precio=precio;
	}
	
	public int getTipo() {
		return tipo;
	}
	public String getMarca() {
		return marca;
	}

	public double getPrecio() {
		return precio;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + tipo;
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
		Playera other = (Playera) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return "Playera [tipo=" + tipo + ", marca=" + marca + ", precio=" + precio + "]";
	}
	
	
	
	
	
	

}
