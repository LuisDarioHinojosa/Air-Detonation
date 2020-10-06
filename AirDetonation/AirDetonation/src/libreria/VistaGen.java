package libreria;
/*Nombre:Luis Dario Hinojosa
 * 000182411
 * VerSion 1.0
 *4/12/18
 * */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class VistaGen extends JFrame{
	protected JComboBox cbUno;
	protected JTextField Tftallas, Tfprecio, Tfcosto, Tftot;
	protected JButton BTalla;
	private JLabel LbTallas ,Lbnumero ,Lbprecio, Lbtot;
	private String [] talla= {"chica","mediana","grande", "extragrande"};
	public VistaGen(String tit) {
		super(tit);
		cbUno=new JComboBox (talla);
		Tftallas=new JTextField (16);
		Tfprecio=new JTextField (16);
		Tfcosto=new JTextField ("insertar precio del probedor");
		Tftot=new JTextField (16);
	
		
		LbTallas=new JLabel ("Tallas");
		LbTallas.setBackground(Color.blue);
		Lbnumero=new JLabel ("numero");
		Lbprecio= new JLabel ("precio");
		Lbtot=new JLabel ("total");
		BTalla = new JButton ("Calcular");
		
		
		
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout (4,1));
		p1.add(LbTallas);
		p1.add(cbUno);
		p1.add(BTalla);
		p1.add(Tfcosto);

				
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout (3,2));
		p2.add(Lbtot);
		p2.add(Tftot);
		p2.add(Lbnumero);
		p2.add(Lbprecio);
		p2.add(Tftallas);
		p2.add(Tfprecio);

		this.add(p1);
		this.add(p2);
		this.setLayout(new FlowLayout());
		this.setBounds(100,100,300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
VistaGen vt=new VistaGen("");
	}

}
