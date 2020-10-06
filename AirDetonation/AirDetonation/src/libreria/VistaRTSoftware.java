package libreria;
/*Nombre:Luis Dario Hinojosa
 * 000182411
 * VerSion 1.0
 *30/12/18
 * */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
public class VistaRTSoftware extends JFrame {
	private JPanel registro;
	private JLabel nombre, edad, equipo,  pago,  playera, detonador, talla;
	protected JTextField nom, ed,equ,pag,pl,det,tal, imp, info, elim, encontrar;
	protected JButton imprime, alta, baja, buscar, segunda, tercera;

	public VistaRTSoftware(String tit) {
		super(tit);
		nombre=new JLabel ("Nombre");
		edad=new JLabel ("edad");
		equipo=new JLabel ("equipo");
		pago=new JLabel ("pago");
		playera=new JLabel ("playera");
		detonador=new JLabel ("detonador");
		talla=new JLabel ("talla");
		
		imp=new JTextField(16);
		info=new JTextField (16);
		nom=new JTextField(16);
		ed=new JTextField(16);
		equ=new JTextField(16);
		pag=new JTextField(16);
		pl=new JTextField(16);
		det=new JTextField(16);
		tal=new JTextField(16);
		elim=new JTextField (16);
        elim.setText("Inserte clave del registro");
        encontrar=new JTextField (16);
        encontrar.setText("Inserte clave del usuario que desea buscar");
        
		imprime=new JButton("imprimir listas");
		alta=new JButton("Registrar");
		baja=new JButton("Eliminar del registro");
		buscar=new JButton ("Buscar usuario");
		segunda=new JButton ("Pantalla competencia");
		tercera=new JButton ("Pantalla info");
		
		registro=new JPanel();
		registro.setLayout(new GridLayout (12,3));
		//Border b=BorderFactory.createEmptyBorder(5,5,5,5);
		registro.add(nombre);
		registro.add(nom);
		registro.add(edad);
		registro.add(ed);
		registro.add(equipo);
		registro.add(equ);
		registro.add(pago);
		registro.add(pag);
		registro.add(playera);
		registro.add(pl);
		registro.add(detonador);
		registro.add(det);
		registro.add(talla);
		registro.add(tal);
		registro.add(imprime);
		registro.add(imp);
		registro.add(alta);
		registro.add(info);
		registro.add(baja);
		registro.add(elim);
		registro.add(buscar);
		registro.add(encontrar);
		registro.add(segunda);
		registro.add(tercera);
		this.add(registro);
		
	
		
		this.setBounds(500,500,500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VistaRTSoftware ad=new VistaRTSoftware("Air Detonation 2018 (Registro de listas)");
	}

}
