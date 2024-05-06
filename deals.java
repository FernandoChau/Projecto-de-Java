package src.telas.funcionario_BTN;
//aaaaaaa
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import src.telas.funcionario_BTN.dealsFuncoes.*;
import src.telas.funcionario_BTN.dealsFuncoes.AddEdtRmv.*;

public class deals implements ActionListener
{
	public 		JPanel painelNegocio;
	private		JPanel painelFollowUp;
	private		JPanel menuTop;
	
	private 	JPanel oportunidadeCli;
	private 	JPanel contactoFeitoCli;
	private 	JPanel propostaFeitaCli;
	private 	JPanel negocioFeitoCli;
	
	private 	JButton btnOpenOportunidade;
	private 	JButton btnOpenContacto;
	private 	JButton btnOpenProposta;
	private 	JButton btnOpenNegocio;
	
	_oportunidades 	classOportunidade;
	_contactos		classContacto;
	_propostas		classPorposta;
	_negocios 		classNegocios;
	Rmv				_rmv;
	Add				_add;
	Edt				_edt;

	public deals(int roll)
	{
		classOportunidade 	= new _oportunidades(roll);
		classContacto		= new _contactos(roll);
		classPorposta		= new _propostas(roll);
		classNegocios		= new _negocios(roll);
		_add				= new Add();
		_edt				= new Edt();
		_rmv				= new Rmv();
		
		painelNegocio 		= new JPanel();
		painelFollowUp		= new JPanel();
		menuTop				= new JPanel();
		
		oportunidadeCli		= new JPanel();
		contactoFeitoCli	= new JPanel();
		propostaFeitaCli	= new JPanel();
		negocioFeitoCli		= new JPanel();
		
		btnOpenOportunidade	= new JButton("Concursos");
		btnOpenContacto		= new JButton("Aprovados");
		btnOpenProposta		= new JButton("Proposta de Cotação");
		btnOpenNegocio		= new JButton("Finalizados");

		btnOpenOportunidade.setForeground(new Color(0x1f7bec));
		btnOpenOportunidade.setBackground(new Color(0xdceafd));
		btnOpenOportunidade.setFont(new Font("",Font.BOLD,13));
		btnOpenOportunidade.setPreferredSize(new Dimension(150,25));
		btnOpenOportunidade.setBorder(null);
		btnOpenOportunidade.setFocusable(false);

		btnOpenContacto.setForeground(new Color(0xff9e01));
		btnOpenContacto.setBackground(new Color(0xfdf7ed));
		btnOpenContacto.setFont(new Font("",Font.BOLD,13));
		btnOpenContacto.setPreferredSize(new Dimension(150,25));
		btnOpenContacto.setBorder(null);
		btnOpenContacto.setFocusable(false);
		
		btnOpenProposta.setForeground(new Color(0xff4501));
		btnOpenProposta.setBackground(new Color(0xfff3ef));
		btnOpenProposta.setFont(new Font("",Font.BOLD,13));
		btnOpenProposta.setPreferredSize(new Dimension(200,25));
		btnOpenProposta.setBorder(null);
		btnOpenProposta.setFocusable(false);

		btnOpenNegocio.setForeground(new Color(0x0ee60a));
		btnOpenNegocio.setBackground(new Color(0xeeffee));
		btnOpenNegocio.setFont(new Font("",Font.BOLD,13));
		btnOpenNegocio.setPreferredSize(new Dimension(150,25));
		btnOpenNegocio.setBorder(null);
		btnOpenNegocio.setFocusable(false);
		
		btnOpenOportunidade.addActionListener(this);
		btnOpenProposta.addActionListener(this);
		btnOpenContacto.addActionListener(this);
		btnOpenNegocio.addActionListener(this);
		
		PNegocios();
	}
	
	private void OportunidadeCli ()
	{
		
		oportunidadeCli.setPreferredSize(new Dimension(200,200));
		oportunidadeCli.setBackground(new Color(0xf9f9f9));
		oportunidadeCli.setLayout(new BorderLayout());
		oportunidadeCli.add(classOportunidade.mainPanel,BorderLayout.CENTER);
		oportunidadeCli.setOpaque(true);
	}
	
	private void ContactoFeitoCli ()
	{
		contactoFeitoCli.setPreferredSize(new Dimension(200,200));
		contactoFeitoCli.setBackground(new Color(0xffffff));
		contactoFeitoCli.setLayout(new BorderLayout());
		contactoFeitoCli.add(classContacto.mainPanel,BorderLayout.CENTER);
		contactoFeitoCli.setOpaque(true);
	}
	
	private void PropostaFeitaCli ()
	{
		propostaFeitaCli.setPreferredSize(new Dimension(200,200));
		propostaFeitaCli.setBackground(new Color(0xffffff));
		propostaFeitaCli.setLayout(new BorderLayout());
		propostaFeitaCli.add(classPorposta.mainPanel,BorderLayout.CENTER);
		propostaFeitaCli.setOpaque(true);
	}
	
	private void NegocioFeitoCli ()
	{
		negocioFeitoCli.setPreferredSize(new Dimension(200,200));
		negocioFeitoCli.setBackground(new Color(0xffffff));
		negocioFeitoCli.setLayout(new BorderLayout());
		negocioFeitoCli.add(classNegocios.mainPanel,BorderLayout.CENTER);
		negocioFeitoCli.setOpaque(true);
	}
	
	private void MenuTop ()
	{
		menuTop.setPreferredSize(new Dimension(30, 30));
		menuTop.setBackground(new Color(0x121212));
		menuTop.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuTop.setOpaque(true);
		menuTop.add(btnOpenOportunidade);
		menuTop.add(btnOpenContacto);
		menuTop.add(btnOpenProposta);
		menuTop.add(btnOpenNegocio);
	}
	
	private void PainelFollowUp ()
	{
		painelFollowUp.setPreferredSize(new Dimension(200,200));
		painelFollowUp.setBackground(Color.white);
		painelFollowUp.setLayout(new CardLayout());
		painelFollowUp.add(oportunidadeCli,"OportunidadeCli");
		painelFollowUp.add(contactoFeitoCli,"ContactoFeitoCli");
		painelFollowUp.add(propostaFeitaCli,"PropostaFeitaCli");
		painelFollowUp.add(negocioFeitoCli,"NegocioFeitoCli");
	}
	
	private void PNegocios()
	{
		OportunidadeCli();
		ContactoFeitoCli();
		PropostaFeitaCli();
		NegocioFeitoCli();
		MenuTop();
		PainelFollowUp();
		
		painelNegocio.setPreferredSize (new Dimension(200,200));
		painelNegocio.setLayout(new BorderLayout());
		painelNegocio.setBackground (new Color(0xf1f1f1));
		painelNegocio.setOpaque (true);
		painelNegocio.add(menuTop,BorderLayout.NORTH);
		painelNegocio.add(painelFollowUp,BorderLayout.CENTER);
	}
	
	public void actionPerformed (ActionEvent botoes)
	{
		if (botoes.getSource() == btnOpenOportunidade)
		{
			CardLayout cl = (CardLayout) (painelFollowUp.getLayout());
			cl.show(painelFollowUp,"OportunidadeCli");
			
			btnOpenOportunidade.setForeground(new Color(0x1f7bec));
			btnOpenOportunidade.setBackground(new Color(0xdceafd));

			btnOpenContacto.setForeground(new Color(0xff9e01));
			btnOpenContacto.setBackground(new Color(0xffffff));
			btnOpenProposta.setForeground(new Color(0xff4501));
			btnOpenProposta.setBackground(new Color(0xffffff));
			btnOpenNegocio.setForeground(new Color(0x0ee60a));
			btnOpenNegocio.setBackground(new Color(0xffffff));
		}
		else if (botoes.getSource() == btnOpenContacto)
		{
			CardLayout cl = (CardLayout) (painelFollowUp.getLayout());
			cl.show(painelFollowUp,"ContactoFeitoCli");
			
			btnOpenContacto.setForeground(new Color(0xff9e01));
			btnOpenContacto.setBackground(new Color(0xfdf7ed));

			btnOpenOportunidade.setForeground(new Color(0x1f7bec));
			btnOpenOportunidade.setBackground(new Color(0xffffff));
			btnOpenProposta.setForeground(new Color(0xff4501));
			btnOpenProposta.setBackground(new Color(0xffffff));
			btnOpenNegocio.setForeground(new Color(0x0ee60a));
			btnOpenNegocio.setBackground(new Color(0xffffff));
		}
		else if (botoes.getSource() == btnOpenProposta)
		{
			CardLayout cl = (CardLayout) (painelFollowUp.getLayout());
			cl.show(painelFollowUp,"PropostaFeitaCli");
			
			btnOpenProposta.setForeground(new Color(0xff4501));
			btnOpenProposta.setBackground(new Color(0xfff3ef));

			btnOpenContacto.setForeground(new Color(0xff9e01));
			btnOpenContacto.setBackground(new Color(0xffffff));
			btnOpenOportunidade.setForeground(new Color(0x1f7bec));
			btnOpenOportunidade.setBackground(new Color(0xffffff));
			btnOpenNegocio.setForeground(new Color(0x0ee60a));
			btnOpenNegocio.setBackground(new Color(0xffffff));
		}
		else if (botoes.getSource() == btnOpenNegocio)
		{
			CardLayout cl = (CardLayout) (painelFollowUp.getLayout());
			cl.show(painelFollowUp,"NegocioFeitoCli");
			
			btnOpenNegocio.setForeground(new Color(0x0ee60a));
			btnOpenNegocio.setBackground(new Color(0xeeffee));

			btnOpenProposta.setForeground(new Color(0xff4501));
			btnOpenProposta.setBackground(new Color(0xffffff));
			btnOpenContacto.setForeground(new Color(0xff9e01));
			btnOpenContacto.setBackground(new Color(0xffffff));
			btnOpenOportunidade.setForeground(new Color(0x1f7bec));
			btnOpenOportunidade.setBackground(new Color(0xffffff));
			
		}
	}
}