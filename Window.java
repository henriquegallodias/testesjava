package Janela;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window extends JFrame {
	
	JLabel lblnome = new JLabel ("Nome:");
	JLabel lblend = new JLabel ("Endreço:");
	JLabel lbltel = new JLabel ("Telefone:");
	JLabel lblemail = new JLabel("Email:");
	JLabel lblrg = new JLabel ("RG:");
	JLabel lblcity = new JLabel ("Cidade:");
	
	JTextField txtnome = new JTextField();
	JTextField txtend = new JTextField();
	JTextField txttel = new JTextField();
	JTextField txtemail = new JTextField();
	JTextField txtrg = new JTextField();
	JTextField txtcity = new JTextField();
	
	
	
	public Window() {
		super("Cadastro Cliente");
		
		Container paine = this.getContentPane();
		
		paine.add(lblnome);
		lblnome.setBounds(20, 20, 100, 20);
		
		paine.add(txtnome);
		txtnome.setBounds(130, 20, 200, 20);
		
		paine.add(lblrg);
		lblrg.setBounds(20, 50, 100, 20);
		
		paine.add(txtrg);
		txtrg.setBounds(130, 50, 200, 20);
		
		paine.add(lbltel);
		lbltel.setBounds(20, 80, 100, 20);
		
		paine.add(txttel);
		txttel.setBounds(130, 80, 200, 20);
		
		paine.add(lblemail);
		lblemail.setBounds(20, 110, 100, 20);
		
		paine.add(txtemail);
		txtemail.setBounds(130, 110, 200, 20);
		
		paine.add(lblcity);
		lblcity.setBounds(20, 140, 100, 20);
		
		paine.add(txtcity);
		txtcity.setBounds(130, 140, 200, 20);
		
		paine.add(lblend);
		lblend.setBounds(20, 170, 100,20);
		
		paine.add(txtend);
		txtend.setBounds(130, 170, 200, 20);
		
		
		
		this.setLayout(null);
		this.setSize(400,400);
		this.setVisible(true);
		this.setResizable(false);
		
	}
	
	public static void main(String args[]) {
		Window a = new Window();
	}
	
	

}

