/*Nombre:Luis Dario Hinojosa
 * 000182411
 * VerSion 1.0
 *26/11/18
 * */
package libreria;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import libreria.ManejadorArregloGen;
//guardar detonadores en un arreglo
public class RT {




private String nombre;
private String lugar;
private Traceur [] ins;
private Playera[] pldisp;
private final int totalpl=12;
private int numpl;
private final int totalT=600;
private int numT;
private int [][] competencia;
private int [][]playeras;
private detonadores[] det;
private int total[];
private int numDet;
private double deuda;
private int ganancias;
private final int criterios=4;
private final int totaldet=18;
private final int marcas=3;
private final int tiposplayeras=4;
private double ventas;




public RT() {
	numT=0;
	ins=new Traceur [totalT];
	for (int i=0;i<totalT;i++) {
		ins[i]=null;}
	ventas=0;
	
	pldisp=new Playera[totalpl];
	numpl=0;
	playeras=new int [marcas][tiposplayeras];
	for (int i=0;i<marcas;i++)
		for (int j=0;j<tiposplayeras;j++)
			playeras[i][j]=200;
	
	
	ganancias=0;
	deuda=100000;
	
	competencia=new int [criterios][totaldet];
	for (int i=0;i<criterios;i++)
		for (int j=0;j<totaldet;j++)
			competencia[i][j]=0;
	
	det=new detonadores[totaldet];
			numDet=0;
			
			total=new int [totaldet];
}


public RT(String nombre, String lugar) {
	this();
	this.nombre = nombre;
	this.lugar = lugar;

}
public void leerArchivo() {
	Scanner archivo;
	int num=0;{
	try {
	archivo=new Scanner(new File("competidores.txt"));
	num=archivo.nextInt();
	int edad;
	String nombre;
	String equipo;
	double pago;
	boolean playera;
	boolean detonador;
	char talla;

	for (int i=0;i<num;i++) {
		nombre=archivo.next();
		edad=archivo.nextInt();
		equipo=archivo.next();
		pago=archivo.nextDouble();
		playera=archivo.nextBoolean();
		detonador=archivo.nextBoolean();
		talla=archivo.next().charAt(0);
	realizarRegistro(nombre, edad, equipo, pago, playera, detonador, talla);
		
		
	}
	}catch(FileNotFoundException fnfe) {
		System.out.print(fnfe);
		System.exit(-1);
	}}
	
}


public void imprimir2() {
	ManejadorMatrizes.imprimeMatriz(playeras, marcas, tiposplayeras);

}

public double ganacia() {
	return ganancias;
}


public double deuda() {
	return deuda;
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public String tallaChica() {//Numero de talla c
	String res="";
	int suma=0;
	for (int i=0;i<numT;i++) {
	if (ins[i].getTalla()=='s'&&ins[i].isPlayera()==true)
		suma++;
	res="las tallas chicas son:" + suma;
	}
	
	return res;
}


public String tallaMediana() {//Numero de talla m
	String res="";
	int suma=0;
	for (int i=0;i<numT;i++) {
	if (ins[i].getTalla()=='m'&&ins[i].isPlayera()==true)
		suma++;
	res="las tallas medianas son:" + suma;
	}
	
	return res;
}


public String tallaGrande() {//Numero de talla g
	String res="";
	int suma=0;
	for (int i=0;i<numT;i++) {
	if (ins[i].getTalla()=='l'&&ins[i].isPlayera()==true)
		suma++;
	res="las tallas grandes son:" + suma;
	}
	
	return res;
}


public String tallaExtraGrande() {//Numero de talla x
	String res="";
	int suma=0;
	for (int i=0;i<numT;i++) {
	if (ins[i].getTalla()=='x'&&ins[i].isPlayera()==true)
		suma++;
	res="las tallas extragrandes son:" + suma;
	}
	
	return res;
}


public double precioS(double precio) {//precio delas playeras de talla s
	double res=0;
	int suma=0;
	for (int i=0;i<numT;i++) {
	if (ins[i].getTalla()=='s'&&ins[i].isPlayera()==true)
		suma++;
	res=suma*precio;
	}
	return res;
}


public double precioM(double precio) {//precio delas playeras de talla m
	double res=0;
	int suma=0;
	for (int i=0;i<numT;i++) {
	if (ins[i].getTalla()=='m'&&ins[i].isPlayera()==true)
		suma++;
	res=suma*precio;
	}
	return res;
}


public double precioG(double precio) {//precio delas playeras de talla g
	double res=0;
	int suma=0;
	for (int i=0;i<numT;i++) {
	if (ins[i].getTalla()=='l'&&ins[i].isPlayera()==true)
		suma++;
	res=suma*precio;
	}
	return res;
}


public double precioX(double precio) {//precio delas playeras de talla x
	double res=0;
	int suma=0;
	for (int i=0;i<numT;i++) {
	if (ins[i].getTalla()=='x'&&ins[i].isPlayera()==true)
		suma++;
	res=suma*precio;
	}
	return res;
}


public String venderPlayera(String marca, int tipo) {//vende una playera dado su marca y tipo debe de estar ta como parecer en el archivo de playeras
	String res="no se vendio";
	int fila;
	int columa=tipo-1;
	int anterior;
	double venta;
	switch (marca) {
	case ("etrefort"):
		fila=0;
		anterior=playeras[fila][columa];
		if (anterior>0) {
		playeras[fila][columa]--;
		venta=buscarprecio(marca, tipo);
		ganancias+=venta;
		deuda-=ganancias;
		}
		if (playeras[fila][columa]!=anterior)
			res="venta exitosa";
	break;
	case("gup"):
		fila=1;
		anterior=playeras[fila][columa];
		if (anterior>0)
		playeras[fila][columa]--;
		if (playeras[fila][columa]!=anterior) {
			res="venta exitosa";
			venta=buscarprecio(marca, tipo);
			ganancias+=venta;
			deuda-=venta;
			
			}
	break;
	case("motus"):
		fila=2;
		anterior=playeras[fila][columa];
		if (anterior>0) {
		playeras[fila][columa]--;
		venta=buscarprecio(marca, tipo);
		ganancias+=venta;
		deuda-=venta;

		}
		if (playeras[fila][columa]!=anterior)
			res="venta exitosa";

	break;
	
		
	}
	return res;
}


public String registrarplayera (int tipo, String marca, double precio) {//da de alta un objeto playera en el arreglo de objetos Playera 
	String res="no se realizo el registro";
	int pos;
	Playera a=null;
	if (numT<totalT)
		a=new Playera (tipo, marca, precio);
	pos=ManejadorArregloGen.busqSecuencialDesordenada(pldisp, numpl, a);//cambiar ordenada
	if (pos<0) {
		pos=-pos-1;
		ManejadorArregloGen.corrimientosDer(pldisp, numpl, pos);
		pldisp[pos]=a;
		numpl++;
		res="registro exitoso" +pldisp[pos].getMarca()+ "precio" +pldisp[pos].getPrecio();
	}
	return res;
}

public void llenarpldisp () {//lee el archivo de objetos Playera y los da de alta en el arreglo. NO SIRVE EN CONTROLADOR
	Scanner archivo;
	int num=0;{
	try {
	archivo=new Scanner(new File("playeras.txt"));
	num=archivo.nextInt();
	int tipo;
	String marca;
	double precio;
	
	for (int i=0;i<num;i++) {
		tipo=archivo.nextInt();
		marca=archivo.next();
		precio=archivo.nextDouble();
	registrarplayera(tipo, marca, precio);
		
		
	}
	}catch(FileNotFoundException fnfe) {
		System.out.print(fnfe);
		System.exit(-1);
	}}
	
}
public double buscarprecio(String marca, int tipo) {//BUSCA EL PRECIO DE UNA PLAYERA DADA DE ALTA DADO SU TIPO Y MARCA
	double precio=0;
	for (int i=0;i<numpl;i++)
		if (pldisp[i].getMarca().equals(marca)&&pldisp[i].getTipo()==tipo)
			precio=pldisp[i].getPrecio();
	return precio;
}

public String realizarRegistro (String nombre, int edad, String equipo, double pago, boolean playera, boolean detonador, char talla) {
	String res="no se realizo el registro";//DA DE ALTA A UN ASITENTE EN LA LISTA (ARREGLO)
	int pos;
	Traceur a=null;
	if (numT<totalT)
		a=new Traceur ( nombre,  edad,  equipo,  pago,  playera,  detonador, talla);
	pos=ManejadorArregloGen.busqSecuencialDesordenada(ins, numT, a);//cambiar ordenada
	if (pos<0) {
		pos=-pos-1;
		ManejadorArregloGen.corrimientosDer(ins, numT, pos);
		ins[pos]=a;
		numT++;
		res="registro exitoso. Clave:" +ins[pos].getClave();
	}
	
	
	
	return res;
		
	
}





public String imprimirListas () {//imprime las listas de inscripcion con toda la informacion
	StringBuilder cad=new StringBuilder();
	for (int i=0;i<numT;i++) {
		cad.append("\n"+ ins[i].toString());
	cad.append("\n");}
	return cad.toString();
}

public String bajaDelRegistro (int clave) {//busca y elimina a un individuo de la lista de asitentes dada su clave unica
	String res="no se encontro el usuario";
	int pos=0;
	Traceur t= new Traceur (clave);
	pos=ManejadorArregloGen.busqSecuencialDesordenada(ins, numT, t);
	if (pos>0) {
		ManejadorArregloGen.corrimientosIzq(ins, numT, pos);
		numT--;
		ins[numT]=null;
		res="baja del registro correcta.";
	}
			return res;
}

public String encuentraPersona (int clave) {//REGRESA LA PERSONA DADA SU CLAVE DEL EVENTO
	String res="no se encontro el usuario";
	
		Traceur a= new Traceur (clave);
	int pos=0;
	pos=ManejadorArregloGen.busqSecuencialDesordenada(ins, numT, a);
	if (pos>0) {
		res=ins[pos].toString();
	}
	return res;
}




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////


 
public void imprimirmatriz () {///imprime la matriz de competencia//YA ESTAN
	ManejadorMatrizes.imprimeMatriz(competencia, criterios, totaldet);

			
	
}

public String iniciarMatriz () {//llena la matriz en cerosYA ESTAN
	String res="no se lleno";
	for(int i=0;i<numDet;i++) {
		competencia [0][i]= 0;
		competencia [1][i]= 0;
		competencia [2][i]= 0;
		competencia [3][i]= 0;
		}
		if(competencia[1][1]==0)
			res="inicio corectamente ";
	return res;
}



public String llenarDet () {//inicializa el arreglo paralelo de detonadoresYAESTA
	String res="no se lleno el arreglo";
	for (int i=0;i<numT;i++) {
	int pos=0; 
		if(ins[i].isDetonador()==true) {
			String nombre=ins[i].getNombre();
			int clave=ins[i].getClave();
			int flow=0;
			int dificultad=0;//int clave, int puntosFlow, int puntosEjecucion, int puntosDificultad,
			int creatividad=0;
			int eje=0;
			detonadores a=new detonadores (nombre, clave, flow, eje, creatividad,dificultad );
			if(numDet<totaldet)
				det[numDet]=a;
			numDet++;
			res="se lleno el arreglo";
		}}
	return res;
}
public String imprimenoombresDet() {//imprime los nombres de los competidores
	String res="";
	for (int i=0;i<numDet;i++)
		res=res+det[i].getNombre()+det[i].getClave()+"";
	return res;
}

public String imprimenoombresDet2() {//imprime los nombres de los competidores
	String res="";
	for (int i=0;i<numDet;i++)
		res=res+det[i].getNombre()+"";
	return res;
}

public String llenarMatrizCompetencia () {//llena la matriz y la actualiza con los nuevos valores de cada categoria
	String res="no se lleno";
	for(int i=0;i<numDet;i++) {
		competencia [0][i]= competencia [0][i]+det[i].getPuntosFlow();
		competencia [1][i]= competencia [1][i]+det[i].getPuntosEjecucion();
		competencia [2][i]= competencia [2][i]+det[i].getPuntosCreatividad();
		competencia [3][i]= competencia [3][i]+det[i].getPuntosDificultad();
		if(competencia[0][i]!=0)
			res="SE actualizo la matrizz correctamtne ";	
	}
		
	return res;
}
public void evaluarCompetidor (int clave, int flow, int eje, int creatividad, int dificultad) {//sirve para poner los nuevos datos de cada categoria de un competidos dada su clave
	int pos=0;
	for (int i=0; i<numDet;i++) {//llena una columna de la matriz con los puntajes del competidor
		if(det[i].getClave()==clave) {
		det[i].setPuntosFlow(flow);
		det[i].setPuntosEjecucion(eje);
		det[i].setPuntosCreatividad(creatividad);
		det[i].setPuntosDificultad(dificultad);
		}
}}
public String totalFases() {//arreglo de la suma de cada columa
	String res="";
	for (int i=0;i<numDet;i++) {
		total[i]=ManejadorMatrizes.sumaColumna(competencia, criterios, i);
		res= res + total[i] + "";
	}
	return res;
	
}
public String orden() {//ordena el arreglo total de mayor a menor
	String res="";
	ManejadorArregloGen.ordenaArreglo(total, numDet);
	for (int i=0;i<numDet;i++) {
		res= res + total[i] + "";}
	return res;
}

public void guardaTotales () {//guarda las sumas de columnas en el arreglo paralelo (al de competidores) de totales 
	for (int i=0;i<numDet;i++) {
		int tot=total[i];
		String nombre=det[i].getNombre();
		int clave=det[i].getClave();
		detonadores a=new detonadores(tot, clave, nombre);
		det[i]=a;
		System.out.println(det[i].toString());
		
}}
public void ordenaArregloDet(){//ordena el arreglo de competidores de mayor a menor segun la puntuacion total
	for (int i=0;i<numDet;i++) {
		detonadores a=null;
		for (int j=0;j<numDet;j++) {
			if(total[i]==det[j].getTotal()) {
				a=det[i];
				det[i]=det[j];
				det[j]=det[i];	
			}
				
		}
	}
}

public String ordenarArreglosinrepetir() {//chca si no hay totales repetidos antes de ordenar los arreglos paralelos
String res="";
int j=0;
			for (int i=0;i<numDet;i++) {
			do {
				if(total[i]!=total[j])
				res="se han ordenado los arreglos";
				else
					res="no puede haber empates";
			}while(res=="se han ordenado los arreglos"&&j<numDet);
			j++;
			
			}	
			
	if(res=="se han ordenado los arreglos")
		ordenaArregloDet();
	return res;
}















public void descalificar (int num) {//setea los atributos de los competidores del arreglo de detonadores en null a partir de una posicion dada
	if(num<numDet) {
		for (int i=num;i<numDet;i++) {
			det[i].setClave(0);
		det[i].setNombre("");
		det[i].setTotal(0);
		det[i].setPuntosCreatividad(0);
		det[i].setPuntosDificultad(0);
		det[i].setPuntosEjecucion(0);
		det[i].setPuntosFlow(0);
		
	}		
 numDet-=num;

		}
}



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
