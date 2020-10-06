/*Nombre:Luis Dario Hinojosa
 * 000182411
 * VerSion 1.0
 *4/12/18
 * */
package libreria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ControladorGen extends VistaGen{
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
	
	
	
	public ControladorGen(String t) {
		super (t);
		BTalla.addActionListener(new escuchaTalla());
		
	}
	
	public class escuchaTalla implements ActionListener{
		public void actionPerformed (ActionEvent ae) {
			String res="";
			double precio=0;
			double total=airDetonation.precioS(Double.parseDouble(Tfcosto.getText()))+airDetonation.precioM(Double.parseDouble(Tfcosto.getText()))+airDetonation.precioG(Double.parseDouble(Tfcosto.getText()))+airDetonation.precioX(Double.parseDouble(Tfcosto.getText()));;;;
Tftot.setText(Double.toString(total));
			if (cbUno.getSelectedItem().equals("chica")) {
				res=airDetonation.tallaChica();
			precio=airDetonation.precioS(Double.parseDouble(Tfcosto.getText()));
			Tftallas.setText(res);
			Tfprecio.setText(Double.toString(precio));
			
		}else {
				if (cbUno.getSelectedItem().equals("mediana")) {
					res=airDetonation.tallaMediana();
				precio=airDetonation.precioM(Double.parseDouble(Tfcosto.getText()));
				Tftallas.setText(res);
				Tfprecio.setText(Double.toString(precio));
				
				}else {
					if (cbUno.getSelectedItem().equals("grande")) {
						res=airDetonation.tallaGrande();
					precio=airDetonation.precioG(Double.parseDouble(Tfcosto.getText()));
					Tftallas.setText(res);
					Tfprecio.setText(Double.toString(precio));
					

					}else {
						res=airDetonation.tallaExtraGrande();
						precio=airDetonation.precioX(Double.parseDouble(Tfcosto.getText()));
						Tftallas.setText(res);
						Tfprecio.setText(Double.toString(precio));
						
					}}}}}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ControladorGen cg=new ControladorGen ("informacion geneal");
	}

}
