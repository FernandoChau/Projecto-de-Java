import src.telas.funcionario;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JOptionPane;


public class _login1 implements ActionListener
{
	JPanel maiJPanel;
	JPanel direitoPanel;
	JPanel esquedoPanel;

	JPanel loginFuncionario;

    JTextField campoNomeFunc;
    JPasswordField campoPasswordFunc;

    JButton _btnLogin;
	JButton _btnCadastro;

    JButton btnFuncionario;
	JButton btnAdmin;
    
    public _login1()
    {
		
	
		_btnCadastro = new JButton("Cadastro");
		_btnCadastro.setFocusable(false);
		_btnCadastro.addActionListener(this);
	
		EsquedoPanelPanel();
		DireitoPanel();

        JFrame tela		= new JFrame();
		
		tela.setVisible(true);
		tela.setSize(400, 200);
		tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(new BorderLayout());
		tela.add(esquedoPanel,BorderLayout.WEST);
		tela.add(direitoPanel,BorderLayout.CENTER);
		
		
		// tela.add(labelNome);
		// tela.add(campoNomeFunc);
		// tela.add(labelPasscode);
		// tela.add(campoPasswordFunc);
		// tela.add(_btnCadastro);
		// tela.add(_btnLogin);

    }

	private void FuncionaLogin ()
	{
		loginFuncionario	= new JPanel();
		JPanel painel		= new JPanel();

		JLabel label		= new JLabel("Funcionario");
		JLabel labelNome	= new JLabel("Nome:");
		JLabel labelPasscode = new JLabel("Password:");

		campoNomeFunc = new JTextField();
		campoPasswordFunc = new JPasswordField();

		label.setFont(new Font("Calibre",Font.PLAIN,20));
		label.setBackground(new Color(0x333333));
		label.setOpaque(true);
		label.setPreferredSize(new Dimension(450,50));
		label.setForeground(new Color(0xa1a1a1));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		
		labelNome.setFont(new Font("Calibre",Font.PLAIN,20));
		labelNome.setForeground(new Color(0xf1f1f1));

		labelPasscode.setFont(new Font("Calibre",Font.PLAIN,20));
		labelPasscode.setForeground(new Color(0xf1f1f1));
		
		campoNomeFunc.setBorder(null);
		campoNomeFunc.setBackground(new Color(0xf1f1f1));
		campoNomeFunc.setPreferredSize(new Dimension(450,50));
		campoNomeFunc.setFont(new Font("",Font.PLAIN,17));
		
		campoPasswordFunc.setBorder(null);
		campoPasswordFunc.setBackground(new Color(0xf1f1f1));
		campoPasswordFunc.setPreferredSize(new Dimension(450,50));
		campoPasswordFunc.setFont(new Font("",Font.PLAIN,17));

		painel.setPreferredSize(new Dimension(500,400));
		painel.setLayout(new FlowLayout(FlowLayout.LEFT,25,20));
		painel.setBackground(new Color(0x3a3a3a));
		painel.add(label);
		painel.add(labelNome);
		painel.add(campoNomeFunc);
		painel.add(labelPasscode);
		painel.add(campoPasswordFunc);
		painel.add(_btnLogin);

		loginFuncionario.setPreferredSize(new Dimension(500,500));
		loginFuncionario.setLayout(new FlowLayout(FlowLayout.CENTER));
		loginFuncionario.setLayout(new FlowLayout(FlowLayout.CENTER));
		loginFuncionario.add(painel);
	}

	private void InicializarBtn ()
	{
		btnAdmin		= new JButton("Login Admin");
		btnFuncionario	= new JButton("Login Funcionairo");
		_btnLogin = new JButton("Login");
		
		_btnLogin.setFocusable(false);
		_btnLogin.setBackground(new Color(0xf9f9f9));
		_btnLogin.setFont(new Font("",Font.BOLD,15));
		_btnLogin.setPreferredSize(new Dimension(230,50));
		_btnLogin.addActionListener(this);

		btnAdmin.setBackground(new Color(0x444444));
		btnAdmin.setPreferredSize(new Dimension(190,50));
		btnAdmin.setFont(new Font("",Font.PLAIN,16));
		btnAdmin.setForeground(new Color(0xffffff));
		btnAdmin.setBorder(null);
		btnAdmin.setOpaque(true);
		btnAdmin.setFocusable(false);

		btnFuncionario.setBackground(new Color(0x444444));
		btnFuncionario.setPreferredSize(new Dimension(190,50));
		btnFuncionario.setFont(new Font("",Font.PLAIN,16));
		btnFuncionario.setForeground(new Color(0xffffff));
		btnFuncionario.setBorder(null);
		btnFuncionario.setOpaque(true);
		btnFuncionario.setFocusable(false);

		btnAdmin.addActionListener(this);
		btnFuncionario.addActionListener(this);
		_btnLogin.addActionListener(this);
	}

	private void EsquedoPanelPanel ()
	{
		InicializarBtn();

		esquedoPanel 	= new JPanel();

		esquedoPanel.setBackground(new Color(0x3A3A3A));
		esquedoPanel.setPreferredSize(new Dimension(200,200));
		esquedoPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		esquedoPanel.add(btnFuncionario);
		esquedoPanel.add(btnAdmin);
	}

	private void DireitoPanel ()
	{
		FuncionaLogin();

		direitoPanel 	= new JPanel();

		direitoPanel.setBackground(new Color(0xf1f1f1));
		direitoPanel.setLayout(new CardLayout());
		direitoPanel.add(loginFuncionario,"painel1");
		// direitoPanel.add(painel2,"painel2");
		// direitoPanel.add(painel3,"painel3");
	}
	
    public void actionPerformed (ActionEvent ae){
		String nome = campoNomeFunc.getText();
		String password = new String (campoPasswordFunc.getPassword());
			
		if(ae.getSource() == _btnLogin){
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaOportunidade","root","");
				String sql = "SELECT * FROM funcionario WHERE nomeFuncionario = ? AND passwordFuncionario = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				
				ps.setString(1, nome);
				ps.setString(2, password);
				
				ResultSet rs = ps.executeQuery();
				
				if(rs.next()) {
					JOptionPane.showMessageDialog(_btnLogin,"sucesso");
					System.out.println(rs);
					new funcionario();
				} else{
					System.out.println("Tambem Funciona");
					JOptionPane.showMessageDialog(_btnLogin, "Error", "Error", JOptionPane.ERROR_MESSAGE);
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
        new _login1();
    }  
}