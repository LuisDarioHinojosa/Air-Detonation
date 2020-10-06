package libreria;
/*Nombre:Luis Dario Hinojosa
 * 000182411
 * VerSion 1.0
 *30/11/18
 * */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ControladorRegistro extends VistaRTSoftware {
RT airDetonation=new RT ("Air Detonation","Skatepark La Fuente");
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
airDetonation.realizarRegistro(nombre, edad, equipo, pago, playera, detonador, talla);
	
	
}
}catch(FileNotFoundException fnfe) {
	System.out.print(fnfe);
	System.exit(-1);
}}

 public ControladorRegistro (String tit) {
	 super(tit);
	 alta.addActionListener(new escuchaAlta());
	 imprime.addActionListener(new escuchaImprime());
	 baja.addActionListener(new escuchaBaja());
	 buscar.addActionListener(new escuchaBuscar());
	 segunda.addActionListener(new escuchaSegundaPan());
	 tercera.addActionListener(new escuchaTercerPan());

	 
 }
 
 private class escuchaTercerPan implements ActionListener  {
		public void actionPerformed (ActionEvent ae) {
			ControladorGen vs=new ControladorGen("caluladora de lebaoracion de playeras");
			
			
		}


}
 
 
 public class escuchaAlta implements ActionListener{
	 public void actionPerformed (ActionEvent ae){
	String res="no se dio de alta";
	
	
	
	
	
	res=airDetonation.realizarRegistro(nom.getText(),Integer.parseInt(ed.getText()),equ.getText(), Double.parseDouble(pag.getText()), pl.getAutoscrolls(), det.getAutoscrolls(),tal.getFocusAccelerator());//nom, ed,equ,pag,pl,det,tal, imp;
	if (res.equals("no se dio de alta")==true) {
		info.setText("no se dio de alta");}
	 else {
		info.setText(res); 
	 }}}
 public class escuchaImprime implements ActionListener{
	public void actionPerformed (ActionEvent ae) {
	String res=airDetonation.imprimirListas();
	imp.setText(res);
	
	}} 
 public class escuchaBaja implements ActionListener  {
	 public void actionPerformed (ActionEvent ae) {
		String res="el usuario no se dio de baja";
		res=airDetonation.bajaDelRegistro(Integer.parseInt(elim.getText()));
		if (res.equals("no se encontro el usuario")==true)
			elim.setText(res);
		else
			elim.setText("BAJA EXITOSA");
	 }
 }
 
 private class escuchaSegundaPan implements ActionListener  {
		public void actionPerformed (ActionEvent ae) {
			ControladorVistaCompetencia vs=new ControladorVistaCompetencia("");
			
			
		}


}
 
 public class escuchaBuscar implements ActionListener{
		public void actionPerformed (ActionEvent ae) {
			String res="";
			res=airDetonation.encuentraPersona(Integer.parseInt(encontrar.getText()));
			encontrar.setText(res);
		}
 }
public static void main(String[] args) {
	// TODO Auto-generated method stub
	ControladorRegistro ad=new ControladorRegistro("Air Detonation 2018");
}
 }

