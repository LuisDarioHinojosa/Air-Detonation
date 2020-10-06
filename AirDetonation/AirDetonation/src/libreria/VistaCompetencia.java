package libreria;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/*Nombre:Luis Dario Hinojosa
 * 000182411
 * VerSion 1.0
 *30/12/18
 * */
public class VistaCompetencia extends JFrame{
	private JLabel LbFlow;
	private JLabel LbEje, LbDif, LbCreat,Lbclav;
	private String [] nombre= {"primera fase","segunda fase","final"};
	protected JTextArea area3;
	protected JTextField TfFlow, TfEje, TfDif, TfCreat, Tfcon, Tfmatrizfull, Tfclav, Tfceros, Tfdescalificar;
	protected JTextArea area2;
	protected JTextArea area;
	protected JComboBox cbdescalificar;
	protected JButton Bceros, Bimprimir, Bevaluar, BllenarDet, BimpDet, Btotales,Bordenar,Bprimera, Bdescalificar;
	public VistaCompetencia(String tit){
		super(tit);
		area=new JTextArea("*********************************************");
		area2=new JTextArea("*********************************************");
		area3=new JTextArea("*********************************************");

		
		Bceros=new JButton("reiniciar");
		Bimprimir=new JButton("imprimir");
		Bevaluar =new JButton("llenar puntaje");
		BllenarDet = new JButton ("llenar detonadores");
		BimpDet = new JButton ("imprimir info");
		Btotales =new JButton ("total de puntos");
		Bordenar = new JButton ("ordenar");
		Bprimera=new JButton ("Pantalla Ventas");
		Bdescalificar=new JButton ("descalificar");

		
		LbFlow=new JLabel ("Puntos Fluides");
		LbEje=new JLabel ("Puntos Ejecucion");
		LbDif=new JLabel ("Puntos Dificultad");
		LbCreat=new JLabel ("Puntos Creatividad");
		Lbclav=new JLabel ("Clave");

		
		TfFlow=new JTextField("insertar puntaje");
		TfEje=new JTextField("insertar puntaje");
		TfDif=new JTextField("insertar puntaje");
		TfCreat=new JTextField("insertar puntaje");
		Tfclav=new JTextField();
		Tfcon=new JTextField ();
		Tfmatrizfull=new JTextField();
		Tfceros=new JTextField();
		Tfdescalificar=new JTextField("inserte la posicion");

		
		JPanel p3= new JPanel ();
		p3.setLayout(new GridLayout (2,2));
		p3.add(Btotales);
		p3.add(Bordenar);
		p3.add(Bdescalificar);
		p3.add(Tfdescalificar);

		JPanel p4= new JPanel ();
		p4.setLayout(new GridLayout (2,1));
		p4.add(area);
		p4.add(area3);

		
		
		

		
		
		
		JPanel p2=new JPanel ();
		p2.setLayout(new GridLayout(9,2));
		p2.setBackground(Color.CYAN);
		p2.add(BllenarDet);
		p2.add(Tfcon);
		p2.add(Lbclav);
		p2.add(Tfclav);
		p2.add(LbFlow);
		p2.add(TfFlow);
		p2.add(LbEje);
		p2.add(TfEje);
		p2.add(LbCreat);
		p2.add(TfCreat);
		p2.add(LbDif);
		p2.add(TfDif);
		p2.add(Bevaluar);
		p2.add(Tfmatrizfull);
		p2.add(Bceros);
		p2.add(Tfceros);
		p2.add(Bimprimir);
		p2.add(Bprimera);

		
		JPanel p1=new JPanel ();
		p1.setLayout(new GridLayout (2,1));
		p1.add(BimpDet);
		p1.add(area2);
		
		

		
		
		this.add(p2);
		this.add(p1);
		this.add(p3);
		this.add(p4);

		this.setLayout(new FlowLayout());
		this.setBounds(100,100,300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
VistaCompetencia vt=new VistaCompetencia("Competencia");
	}}