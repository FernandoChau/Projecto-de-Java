import src.telas.*;

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.sql.*;

public class _login extends JFrame implements ActionListener
{
    JTextField campoNome;
    JPasswordField campoPassword;
    JButton _btnLogin;
	JButton _btnCadastro;
    
    public _login()
    {
        JLabel labelNome = new JLabel("Nome:");
		JLabel labelPasscode = new JLabel("Password:");
		campoNome = new JTextField();
		campoPassword = new JPasswordField();
	
		_btnLogin = new JButton("Login");
		_btnLogin.setFocusable(false);
		_btnLogin.addActionListener(this);
	
		_btnCadastro = new JButton("Cadastro");
		_btnCadastro.setFocusable(false);
		_btnCadastro.addActionListener(this);
	
        
		add(labelNome);
		add(campoNome);
		add(labelPasscode);
		add(campoPassword);
		add(_btnCadastro);
		add(_btnLogin);
	
		setVisible(true);
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 2));
    }
	
    public void actionPerformed (ActionEvent ae){
    String nome = campoNome.getText();
	String password = new String (campoPassword.getPassword());
	
	if(ae.getSource()==_btnCadastro)
	{
		dispose();
		new funcionario();
	}
		
	if(ae.getSource() == _btnLogin){
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaOportunidade","root","");
			Statement stm = con.createStatement();
			String sql = "SELECT * FROM funcionario WHERE nomeFuncionario = '"+nome+"'AND passwordFuncionario = '"+password+"';";
			ResultSet rs = stm.executeQuery(sql);
			
			if(rs.next()) {
				JOptionPane.showMessageDialog(this, "Sucesso");
				dispose();
				new funcionario();
			} else{
				//System.out.println("Tambem Funciona");
				JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE);
			}
			con.close();
			}	
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
        new _login();
    }  
}