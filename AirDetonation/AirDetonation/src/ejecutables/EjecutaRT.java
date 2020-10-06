package ejecutables;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import libreria.RT;

public class EjecutaRT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RT ad= new RT ();
Scanner archivo;
int num=0;
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
ad.realizarRegistro(nombre, edad, equipo, pago, playera, detonador, talla);
	
	
}
}catch(FileNotFoundException fnfe) {
	System.out.print(fnfe);
	System.exit(-1);
}




System.out.println(ad.imprimirListas());
System.out.println(ad.encuentraPersona(3));

System.out.println(ad.llenarDet());
System.out.println(ad.imprimenoombresDet());
System.out.println(ad.llenarMatrizCompetencia());

ad.imprimirmatriz();
int flow=40;
int eje=30;
int dif=60;
int creat=50;
int flow1=80;
int eje1=30;
int dif1=90;
int creat1=68;
int flow2=50;
int eje2=20;
int dif2=100;
int creat2=67;
int flow3=77;
int eje3=777;
int dif3=456;
int crea3=59;
ad.evaluarCompetidor(1, flow1, eje1 , creat1, dif1);
ad.evaluarCompetidor(2, flow, eje, creat, dif);
ad.evaluarCompetidor(3, flow1, eje1 , creat1, dif1);
ad.evaluarCompetidor(4, flow2, eje2, creat2, dif2);
ad.evaluarCompetidor(5, flow3, eje1 , creat1, dif1);
ad.evaluarCompetidor(6, flow1, eje1 , creat2, dif);
ad.evaluarCompetidor(7, flow1, eje3 , creat2, dif1);
ad.evaluarCompetidor(8, flow1, eje1 , creat1, dif1);
ad.evaluarCompetidor(9, flow, eje1, creat2, dif);
ad.evaluarCompetidor(10, flow, eje3 , creat1, dif1);
ad.evaluarCompetidor(11, flow2, eje3, creat, dif2);
ad.evaluarCompetidor(12, flow3, eje1 , creat1, dif3);
ad.evaluarCompetidor(13, flow1, eje3 , creat2, dif2);
ad.evaluarCompetidor(14, flow3, eje , creat2, dif3);
ad.evaluarCompetidor(11, flow2, eje3, creat, dif2);
ad.evaluarCompetidor(12, flow3, eje1 , creat1, dif3);


System.
out.println(ad.llenarMatrizCompetencia());

ad.imprimirmatriz();
System.out.println(ad.imprimenoombresDet());
System.out.println(ad.totalFases());
String res=ad.iniciarMatriz();

ad.evaluarCompetidor(13, flow2, eje2 , creat2, dif2);
String imm=ad.llenarMatrizCompetencia();
System.out.println(imm);
ad.guardaTotales();
System.out.println(ad.orden());
//ad.ordenaArregloDet();
System.out.println(ad.ordenarArreglosinrepetir());
System.out.println(ad.imprimenoombresDet2());
ad.descalificar(6);
System.out.println(ad.imprimenoombresDet2());
System.out.println(ad.tallaChica());
System.out.println(ad.precioG(58));
ad.imprimir2();
ad.llenarpldisp();
System.out.println(ad.venderPlayera("motus", 1));
ad.imprimir2();
System.out.println(ad.ganacia());
System.out.println(ad.deuda());
System.out.println(ad.tallaChica());
System.out.println(ad.precioS(12));







	







	}

}
