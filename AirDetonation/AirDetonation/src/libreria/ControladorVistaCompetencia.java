package libreria;
/*Nombre:Luis Dario Hinojosa
 * 000182411
 * VerSion 1.0
 *3/12/18
 * */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ControladorVistaCompetencia extends VistaCompetencia{
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

	
	
	
	
	
public ControladorVistaCompetencia (String tit) {

	super(tit);
	BllenarDet.addActionListener( new escuchaLlenarDet());
	Bevaluar.addActionListener(new escuchaEvaluar());
	Bceros.addActionListener(new escuchaCeros());
	BimpDet.addActionListener(new escuchaimpDet());
	Bimprimir.addActionListener(new escuchaimprime());
	Btotales.addActionListener (new escuchatotal());
	Bordenar.addActionListener(new escuchaOrdena());
	Bdescalificar.addActionListener(new escuchaDesc());
	Bprimera.addActionListener(new escuchaVentas());

	
}
public class escuchaVentas implements ActionListener{
	public void actionPerformed (ActionEvent ae) {
		ControladorVistaVentas c= new ControladorVistaVentas("Pantalla de ventas");
	}
}




public class escuchaDesc implements ActionListener {
	public void actionPerformed (ActionEvent ae) {
		airDetonation.descalificar(Integer.parseInt(Tfdescalificar.getText()));
		
	}}

public class escuchaOrdena implements ActionListener {
	public void actionPerformed (ActionEvent ae) {
		String res=airDetonation.ordenarArreglosinrepetir();
		area2.setText(res);
		String res3=airDetonation.imprimenoombresDet2();
		area.setText(res3);
		String res2=airDetonation.totalFases();
		area3.setText(res2);
		
	}}
	



public class escuchatotal implements ActionListener {
	public void actionPerformed (ActionEvent ae) {
		String res=airDetonation.imprimenoombresDet2();
		area.setText(res);
		String res2=airDetonation.totalFases();
		area3.setText(res2);
	}
}
public class escuchaimprime implements ActionListener {
	public void actionPerformed (ActionEvent ae){
		airDetonation.imprimirmatriz();
		
	}}

public class escuchaimpDet implements ActionListener {
	public void actionPerformed (ActionEvent ae){
		String res=airDetonation.imprimenoombresDet();
		area2.setText(res);
	}}

public class escuchaCeros implements ActionListener {
	public void actionPerformed (ActionEvent ae){
		String res=airDetonation.iniciarMatriz();
		Tfceros.setText(res);
		airDetonation.imprimirmatriz();
		
	}
}

public class escuchaLlenarDet implements ActionListener{
	public void actionPerformed (ActionEvent ae) {
		String res=airDetonation.llenarDet();
		Tfcon.setText(res);
	}
}

public class escuchaEvaluar implements ActionListener{
	public void actionPerformed (ActionEvent ae) {
		airDetonation.evaluarCompetidor(Integer.parseInt(Tfclav.getText()) , Integer.parseInt(TfFlow.getText()), Integer.parseInt(TfEje.getText()),Integer.parseInt(TfCreat.getText()), Integer.parseInt(TfDif.getText()));
	String res=airDetonation.llenarMatrizCompetencia();
	Tfmatrizfull.setText(res);
	
	}
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControladorVistaCompetencia cc=new ControladorVistaCompetencia("controlador");
	}

}
