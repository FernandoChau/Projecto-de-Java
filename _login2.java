import src.telas.funcionario;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.InetAddress;
import java.sql.*;
import javax.swing.JOptionPane;


public class _login2 implements ActionListener
{
	JPanel maiJPanel;
	JPanel direitoPanel;
	JPanel esquedoPanel;

	JPanel loginFuncionario;

    JTextField campoNomeFunc;
    JPasswordField campoPasswordFunc;
    JTextField campoIP;

    JButton _btnLogin;
	JButton _btnCadastro;

    JButton btnFuncionario;
	JButton btnAdmin;
    
	JLabel labelNome;
	JLabel labelIP;
	JLabel labelPasscode;

	public int tipUser;

    public _login2()
    {

		tipUser = 0;
		_btnCadastro 	= new JButton("Cadastro");
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
		tela.getContentPane().setBackground(Color.red);;
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
		loginFuncionario		= new JPanel();
		JPanel painel			= new JPanel();

		JLabel label			= new JLabel("LOGIN");
		labelNome		= new JLabel("Nome:");
		labelPasscode 	= new JLabel("Password:");
		labelIP		 	= new JLabel("IP:");

		campoNomeFunc 			= new JTextField();
		campoPasswordFunc 		= new JPasswordField();
		campoIP		 			= new JTextField();

		label.setFont(new Font("Calibre",Font.PLAIN,20));
		label.setBackground(new Color(0x191919));
		label.setOpaque(true);
		label.setPreferredSize(new Dimension(450,50));
		label.setForeground(new Color(0xa1a1a1));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		
		labelIP.setFont(new Font("Calibre",Font.PLAIN,20));
		labelIP.setForeground(new Color(0xf1f1f1));
		
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
		
		campoIP.setBorder(null);
		campoIP.setBackground(new Color(0xf1f1f1));
		campoIP.setPreferredSize(new Dimension(450,50));
		campoIP.setFont(new Font("",Font.PLAIN,17));

		painel.setPreferredSize(new Dimension(500,510));
		painel.setLayout(new FlowLayout(FlowLayout.LEFT,25,20));
		painel.setBackground(new Color(0x222222));
		painel.add(label);
		painel.add(labelNome);
		painel.add(campoNomeFunc);
		painel.add(labelPasscode);
		painel.add(campoPasswordFunc);
		painel.add(labelIP);
		painel.add(campoIP);
		painel.add(_btnLogin);

		loginFuncionario.setPreferredSize(new Dimension(500,500));
		loginFuncionario.setBackground(new Color(0x3a3a3a));
		loginFuncionario.setLayout(new GridBagLayout());
		loginFuncionario.add(painel);
	}

	private void InicializarBtn ()
	{
		btnAdmin		= new JButton("Login Admin");
		btnFuncionario	= new JButton("Login Funcionairo");
		_btnLogin 		= new JButton("Login");
		
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

		direitoPanel.setBackground(Color.red);
		direitoPanel.setLayout(new BorderLayout());
		direitoPanel.add(loginFuncionario,BorderLayout.CENTER);
		// direitoPanel.add(painel2,"painel2");
		// direitoPanel.add(painel3,"painel3");
	}
	
    public void actionPerformed (ActionEvent ae){
    String nome = campoNomeFunc.getText();
	String password = new String (campoPasswordFunc.getPassword());
    String iip = campoIP.getText();
	
	String nomeFuncionarios = new String();

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
				
				try
				{
					InetAddress ip = InetAddress.getByName(campoIP.getText());                                
					if(ip.isReachable(3000)){
						JOptionPane.showMessageDialog(_btnLogin,"sucesso");
						nomeFuncionarios = rs.getString(2)+ " " + rs.getString(3);
						new funcionario(rs.getInt(9),nomeFuncionarios);
					}else{
						labelIP.setForeground(new Color(0xf10000));
						labelNome.setForeground(new Color(0xf1f1f1));
						labelPasscode.setForeground(new Color(0xf1f1f1));
						// JOptionPane.showMessageDialog(_btnLogin, "Error", "Error", JOptionPane.ERROR_MESSAGE);
						// labelNaoEncontrado.setText("Impossivel aceder");
					}
				}
				catch (Exception ee)
				{
					System.out.println(ee.getMessage());
				}

			} else{
				labelIP.setForeground(new Color(0xf1f1f1));
				labelNome.setForeground(new Color(0xf10000));
				labelPasscode.setForeground(new Color(0xf10000));
				// JOptionPane.showMessageDialog(_btnLogin, "Error", "Error", JOptionPane.ERROR_MESSAGE);
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
        new _login2();
    }  
}