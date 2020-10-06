/*Nombre:Luis Dario Hinojosa
 * 000182411
 * VerSion 1.0
 *5/12/18
 * */
package libreria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ControladorVistaVentas extends VistaVentas{
	RT airDetonation=new RT ("Air Detonation","Skatepark La Fuente");
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
	airDetonation.registrarplayera(tipo, marca, precio);
		
		
	}
	}catch(FileNotFoundException fnfe) {
		System.out.print(fnfe);
		System.exit(-1);
	}}
	
	public ControladorVistaVentas (String tit) {
		super (tit);
		Bimp.addActionListener(new escuchaImprimir());
		Bventa.addActionListener(new escuchaVentas());
		
		
	}
	
	
	
	public class escuchaImprimir implements ActionListener{
		public void actionPerformed (ActionEvent ae) {
			airDetonation.imprimir2();
			
		}
	}
	public class escuchaVentas implements ActionListener{
		public void actionPerformed (ActionEvent ae) {
			if (cbmarca.getSelectedItem().equals("gup")) {
				String res=airDetonation.venderPlayera("gup", Integer.parseInt(Tftipo.getText()));
				double precio=airDetonation.buscarprecio("gup", Integer.parseInt(Tftipo.getText()));
				Tfprecio.setText(Double.toString(precio));
				Tfventa.setText(res);
				double total=airDetonation.ganacia();
				Tftotal.setText(Double.toString(total));
				double deuda=airDetonation.deuda();
				Tfdeuda.setText(Double.toString(deuda));
			}else {
			if (cbmarca.getSelectedItem().equals("etrefort")) {
				double precio=airDetonation.buscarprecio("etrefort", Integer.parseInt(Tftipo.getText()));
				Tfprecio.setText(Double.toString(precio));
				String res=airDetonation.venderPlayera("etrefort", Integer.parseInt(Tftipo.getText()));
				Tfventa.setText(res);
				double total=airDetonation.ganacia();
				Tftotal.setText(Double.toString(total));
				double deuda=airDetonation.deuda();
				Tfdeuda.setText(Double.toString(deuda));
			}else {
				double precio=airDetonation.buscarprecio("motus", Integer.parseInt(Tftipo.getText()));
				Tfprecio.setText(Double.toString(precio));
				String res=airDetonation.venderPlayera("motus", Integer.parseInt(Tftipo.getText()));
				Tfventa.setText(res);	
				double total=airDetonation.ganacia();
				Tftotal.setText(Double.toString(total));
				double deuda=airDetonation.deuda();
				Tfdeuda.setText(Double.toString(deuda));
			}
				
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControladorVistaVentas ad=new ControladorVistaVentas("Air Detonation 2018");
	}

}
