package src.telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import src.telas.funcionario_BTN.*;


public class funcionario implements ActionListener
{
	JPanel mianPanel;

	JPanel painelE;
	JPanel painelD;
	JPanel painel1;
	JPanel painel2;
	JPanel painel3;
	JPanel painel4;
	JPanel painel5;
	JPanel painel6;

	JButton btn0;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;

	int rollFuncionario;

	JLabel perfilUser;

	deals 				_deals;
	cadEmpresa 			_cadEmpresa;
	cadRepresentante	_cadRepresentante;
	regNegocio			_regNegocio;
	criarAtividade		_criarAtividade;

	public funcionario(int roll, String fullName)
	{
		_cadEmpresa			= new cadEmpresa();
		_cadRepresentante   = new cadRepresentante();
		_regNegocio			= new regNegocio();
		_criarAtividade		= new criarAtividade();
		_deals 				= new deals(roll);

		painelE 	= new JPanel();
		painelD 	= new JPanel();

		painel1 	= new JPanel();
		painel2 	= new JPanel();
		painel3 	= new JPanel();
		painel4 	= new JPanel();
		painel5 	= new JPanel();
		painel6 	= new JPanel();
		
		// System.out.println(rollFuncionario);
		rollFuncionario = roll;
		// System.out.println(rollFuncionario);
		
		if (rollFuncionario == 2) {
			perfilUser 	= new JLabel("Funcionario "+ fullName);
			// System.out.println("l2");
			
		} else {
			
			perfilUser 	= new JLabel("Admin "+fullName);
			// System.out.println("l1");
		}
		
		btn0 	= new JButton("Botões");
		btn1 	= new JButton("Negociações");
		btn2 	= new JButton("Cadastrar Representante");
		btn3 	= new JButton("Registar Empresa");
		btn4 	= new JButton("Registar Negocio");
		btn5 	= new JButton("Criar Atividade");
		btn6 	= new JButton("...");
		
		btnPainelEsquerdo ();
		
		perfilUser.setBackground(new Color(0x333333));
		perfilUser.setForeground(new Color(0xffffff));
		perfilUser.setFont(new Font("",Font.BOLD,20));
		perfilUser.setVerticalAlignment(JLabel.CENTER);
		perfilUser.setHorizontalAlignment(JLabel.CENTER);
		perfilUser.setPreferredSize(new Dimension(200,40));
		perfilUser.setOpaque(true);

		MainPanel();

		JFrame tela = new JFrame();
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.getContentPane().setBackground(new Color(0xffffff));
		tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		tela.setLayout(new BorderLayout());
		tela.add(mianPanel, BorderLayout.CENTER);

		
		painelDireito();	
		painelEsquerdo();	
	}

	private void MainPanel ()
	{
		mianPanel	= new JPanel();

		mianPanel.setPreferredSize(new Dimension(200,200));
		mianPanel.setLayout(new BorderLayout());
		mianPanel.add(perfilUser, BorderLayout.NORTH);
		mianPanel.add(painelE,BorderLayout.WEST);
		mianPanel.add(painelD);
	}

	public void btnPainelEsquerdo ()
	{

		btn0.setBackground(new Color(0x3a3a3a));
		btn0.setPreferredSize(new Dimension(190,21));
		btn0.setFont(new Font("",Font.PLAIN,14));
		btn0.setForeground(new Color(0xf1f1f1));
		btn0.setBorder(null);
		btn0.setOpaque(true);
		btn0.setFocusable(false);

		btn1.setBackground(new Color(0x444444));
		btn1.setPreferredSize(new Dimension(190,50));
		btn1.setFont(new Font("",Font.PLAIN,16));
		btn1.setForeground(new Color(0xffffff));
		btn1.setBorder(null);
		btn1.setOpaque(true);
		btn1.setFocusable(false);
		
		btn2.setBackground(new Color(0x444444));
		btn2.setPreferredSize(new Dimension(190,50));
		btn2.setFont(new Font("",Font.PLAIN,16));
		btn2.setForeground(new Color(0xffffff));
		btn2.setBorder(null);
		btn2.setOpaque(true);
		btn2.setFocusable(false);
		
		btn3.setBackground(new Color(0x444444));
		btn3.setPreferredSize(new Dimension(190,50));
		btn3.setFont(new Font("",Font.PLAIN,16));
		btn3.setForeground(new Color(0xffffff));
		btn3.setBorder(null);
		btn3.setOpaque(true);
		btn3.setFocusable(false);
		
		btn4.setBackground(new Color(0x444444));
		btn4.setPreferredSize(new Dimension(190,50));
		btn4.setFont(new Font("",Font.PLAIN,16));
		btn4.setForeground(new Color(0xffffff));
		btn4.setBorder(null);
		btn4.setOpaque(true);
		btn4.setFocusable(false);
		
		btn5.setBackground(new Color(0x444444));
		btn5.setPreferredSize(new Dimension(190,50));
		btn5.setFont(new Font("",Font.PLAIN,16));
		btn5.setForeground(new Color(0xffffff));
		btn5.setBorder(null);
		btn5.setOpaque(true);
		btn5.setFocusable(false);
		
		btn6.setBackground(new Color(0x444444));
		btn6.setPreferredSize(new Dimension(190,50));
		btn6.setFont(new Font("",Font.PLAIN,16));
		btn6.setForeground(new Color(0xffffff));
		btn6.setBorder(null);
		btn6.setOpaque(true);
		btn6.setFocusable(false);
	
		if (rollFuncionario == 2) {
			
			// btn1.setForeground(new Color(0x999999));
			btn2.setForeground(new Color(0x999999));
			btn3.setForeground(new Color(0x999999));
			btn4.setForeground(new Color(0x999999));
			btn5.setForeground(new Color(0x999999));
			btn6.setForeground(new Color(0x999999));
			btn1.addActionListener(this);
			// System.out.println("i2");	
		} else {
			// System.out.println("i1");	
			btn1.addActionListener(this);
			btn2.addActionListener(this);
			btn3.addActionListener(this);
			btn4.addActionListener(this);
			btn5.addActionListener(this);
			btn6.addActionListener(this);
		}

	}


	public void _painel01 ()
	{
		painel1.setPreferredSize(new Dimension(200,200));
		painel1.setLayout(new BorderLayout());
		painel1.setBackground(new Color(0xffffff));
		painel1.add(_deals.painelNegocio,BorderLayout.CENTER);
	}

	public void _painel02 ()
	{
		painel2.setPreferredSize(new Dimension(200,200));
		painel2.setLayout(new BorderLayout());
		painel2.setBackground(new Color(0xffffff));
		painel2.add(_cadRepresentante.mainPanel,BorderLayout.CENTER);
	}
	public void _painel03 ()
	{
		painel3.setPreferredSize(new Dimension(200,200));
		painel3.setLayout(new BorderLayout());
		painel3.setBackground(new Color(0xffffff));
		painel3.add(_cadEmpresa.mainPanel,BorderLayout.CENTER);
	}

	public void _painel04 ()
	{
		painel4.setPreferredSize(new Dimension(200,200));
		painel4.setLayout(new BorderLayout());
		painel4.setBackground(new Color(0xffffff));
		painel4.add(_regNegocio.mainPanel,BorderLayout.CENTER);
	}

	public void _painel05 ()
	{
		painel5.setPreferredSize(new Dimension(200,200));
		painel5.setLayout(new BorderLayout());
		painel5.setBackground(new Color(0xffffff));
		painel5.add(_criarAtividade.mainPanel,BorderLayout.CENTER);
	}

	public void _painel06 ()
	{
		painel6.setPreferredSize(new Dimension(200,200));
		painel6.setLayout(new BorderLayout());
		painel6.setBackground(new Color(0xffffff));
		//painel6.add(_regNegocio.mainPanel,BorderLayout.CENTER);
	}
	

	public void painelDireito()
	{
		painelD.setBackground(new Color(0xf1f1f1));
		painelD.setLayout(new CardLayout());
		painelD.add(painel1,"painel1");
		painelD.add(painel2,"painel2");
		painelD.add(painel3,"painel3");
		painelD.add(painel4,"painel4");
		painelD.add(painel5,"painel5");
		painelD.add(painel6,"painel6");
		
	}
	public void painelEsquerdo()
	{
		painelE.setBackground(new Color(0x3A3A3A));
		painelE.setPreferredSize(new Dimension(200,200));
		painelE.setLayout(new FlowLayout(FlowLayout.CENTER));
		painelE.add(btn0);
		painelE.add(btn1);
		painelE.add(btn2);
		painelE.add(btn3);
		painelE.add(btn4);
		painelE.add(btn5);
		painelE.add(btn6);
	}
	public void actionPerformed(ActionEvent aaa)
	{
		if (aaa.getSource() == btn1)
		{
			btn1.setBackground(new Color(0xffffff));
			btn1.setForeground(new Color(0x222222));
			
			if (rollFuncionario == 2) {
				btn2.setForeground(new Color(0x999999));	
				btn3.setForeground(new Color(0x999999));	
				btn4.setForeground(new Color(0x999999));	
				btn5.setForeground(new Color(0x999999));	
				btn6.setForeground(new Color(0x999999));	
				System.out.println(".2");
			} else {
				System.out.println(".1");
				btn2.setBackground(new Color(0x444444));
				btn2.setForeground(new Color(0xffffff));
				btn3.setBackground(new Color(0x444444));
				btn3.setForeground(new Color(0xffffff));
				btn4.setBackground(new Color(0x444444));
				btn4.setForeground(new Color(0xffffff));
				btn5.setBackground(new Color(0x444444));
				btn5.setForeground(new Color(0xffffff));
				btn6.setBackground(new Color(0x444444));
				btn6.setForeground(new Color(0xffffff));	
			}
			
			
			_painel01();
			perfilUser.setText("Vendedor - Deals");
			CardLayout cl = (CardLayout)(painelD.getLayout());
			cl.show(painelD,"painel1");
		}
		else if (aaa.getSource() == btn2)
		{
			btn2.setBackground(new Color(0xffffff));
			btn2.setForeground(new Color(0x222222));
			
			btn1.setBackground(new Color(0x444444));
			btn1.setForeground(new Color(0xffffff));
			btn3.setBackground(new Color(0x444444));
			btn3.setForeground(new Color(0xffffff));
			btn4.setBackground(new Color(0x444444));
			btn4.setForeground(new Color(0xffffff));
			btn5.setBackground(new Color(0x444444));
			btn5.setForeground(new Color(0xffffff));
			btn6.setBackground(new Color(0x444444));
			btn6.setForeground(new Color(0xffffff));
			
		

			_painel02();
			perfilUser.setText("Vendedor - cadastrar Representate");
			CardLayout cl = (CardLayout)(painelD.getLayout());
			cl.show(painelD,"painel2");
		}
		else if (aaa.getSource() == btn3)
		{
			btn3.setBackground(new Color(0xffffff));
			btn3.setForeground(new Color(0x222222));
			
			btn2.setBackground(new Color(0x444444));
			btn2.setForeground(new Color(0xffffff));
			btn1.setBackground(new Color(0x444444));
			btn1.setForeground(new Color(0xffffff));
			btn4.setBackground(new Color(0x444444));
			btn4.setForeground(new Color(0xffffff));
			btn5.setBackground(new Color(0x444444));
			btn5.setForeground(new Color(0xffffff));
			btn6.setBackground(new Color(0x444444));
			btn6.setForeground(new Color(0xffffff));
			
		
			
			_painel03();
			perfilUser.setText("Vendedor - Registar Empresa");
			CardLayout cl = (CardLayout)(painelD.getLayout());
			cl.show(painelD,"painel3");
		}
		else if (aaa.getSource() == btn4)
		{
			btn4.setBackground(new Color(0xffffff));
			btn4.setForeground(new Color(0x222222));
			
			btn2.setBackground(new Color(0x444444));
			btn2.setForeground(new Color(0xffffff));
			btn1.setBackground(new Color(0x444444));
			btn1.setForeground(new Color(0xffffff));
			btn3.setBackground(new Color(0x444444));
			btn3.setForeground(new Color(0xffffff));
			btn5.setBackground(new Color(0x444444));
			btn5.setForeground(new Color(0xffffff));
			btn6.setBackground(new Color(0x444444));
			btn6.setForeground(new Color(0xffffff));
		
			
			_painel04();
			perfilUser.setText("Vendedor - Registar Empresa");
			CardLayout cl = (CardLayout)(painelD.getLayout());
			cl.show(painelD,"painel4");
		}
		else if (aaa.getSource() == btn5)
		{
			btn5.setBackground(new Color(0xffffff));
			btn5.setForeground(new Color(0x222222));
			
			btn2.setBackground(new Color(0x444444));
			btn2.setForeground(new Color(0xffffff));
			btn1.setBackground(new Color(0x444444));
			btn1.setForeground(new Color(0xffffff));
			btn3.setBackground(new Color(0x444444));
			btn3.setForeground(new Color(0xffffff));
			btn4.setBackground(new Color(0x444444));
			btn4.setForeground(new Color(0xffffff));
			btn6.setBackground(new Color(0x444444));
			btn6.setForeground(new Color(0xffffff));
			
		
			
			_painel05();
			perfilUser.setText("Vendedor - Criar Atividade");
			CardLayout cl = (CardLayout)(painelD.getLayout());
			cl.show(painelD,"painel5");
		}
		else if (aaa.getSource() == btn6)
		{
			btn6.setBackground(new Color(0xffffff));
			btn6.setForeground(new Color(0x222222));
			
			btn2.setBackground(new Color(0x444444));
			btn2.setForeground(new Color(0xffffff));
			btn1.setBackground(new Color(0x444444));
			btn1.setForeground(new Color(0xffffff));
			btn3.setBackground(new Color(0x444444));
			btn3.setForeground(new Color(0xffffff));
			btn4.setBackground(new Color(0x444444));
			btn4.setForeground(new Color(0xffffff));
			btn5.setBackground(new Color(0x444444));
			btn5.setForeground(new Color(0xffffff));
		
			
			_painel06();
			perfilUser.setText("Vendedor - Registar Empresa");
			CardLayout cl = (CardLayout)(painelD.getLayout());
			cl.show(painelD,"painel6");
		}

	}
	// public static void main (String args[])
	// {
	// 	new funcionario(args[0],args[1]);
	// }
}