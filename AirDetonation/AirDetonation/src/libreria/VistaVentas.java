/*Nombre:Luis Dario Hinojosa
 * 000182411
 * VerSion 1.0
 *5/12/18
 * */
package libreria;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class VistaVentas extends JFrame{
	private String [] marcas= {"gup", "etrefort", "motus"};
	private JLabel Ltipo, Lmarca, Lprecio, Lganancia, Ldeuda;
	protected JButton Bventa, Bimp;
	protected JTextField Tftipo,  Tftotal,  Tfventa, Tfprecio, Tfdeuda;
	protected JComboBox cbmarca;
	public VistaVentas (String tit){
		super (tit);
		Ltipo=new JLabel ("tipo");
		Lmarca=new JLabel ("marca");
		Lprecio=new JLabel ("precio");
		Lganancia=new JLabel ("ganancias");
		Ldeuda=new JLabel ("DEUDA");
		
		
		cbmarca=new JComboBox (marcas);
		
		Bventa= new JButton ("vender");
		Bimp=new JButton ("imprimir");
		
		Tftipo= new JTextField ("tipo de playera (1,2,3,4)");
		Tftotal= new JTextField (10);
		Tfventa= new JTextField (10);
		Tfprecio= new JTextField (10);
		Tfdeuda=new JTextField(10);
		
		JPanel p1= new JPanel ();
		p1.setLayout(new GridLayout (7,2));
		p1.add(Lganancia);
		p1.add(Tftotal);
		p1.add(Ldeuda);
		p1.add(Tfdeuda);
		p1.add(Lmarca);
		p1.add(cbmarca);
		p1.add(Ltipo);
		p1.add(Tftipo);
		p1.add(Lprecio);
		p1.add(Tfprecio);
		p1.add(Bventa);
		p1.add(Tfventa);
		p1.add(Bimp);
		this.add(p1);
		this.setLayout(new FlowLayout());
		this.setBounds(100,100,300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
VistaVentas vt=new VistaVentas("");
	}
	}



