package src.telas.funcionario_BTN.dealsFuncoes.AddEdtRmv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Add implements ActionListener
{
    
    public JPanel painlAdd_contacto;
    public JPanel painlAdd_finalizado;
    public JPanel painlAdd_proposta;
    public JPanel painlAdd_oportunidade;

    public JPanel painlAdd_rep;
    public JPanel painlAdd_emp;
    public JPanel painlAdd_neg;
	public JPanel painlAdd_ativ;


    private		JTextField nomeRepresentante_rep;
    private		JTextField apelidoRepresentante_rep;
    private		JTextField idEmpresa_rep;
    private		JTextField emailRepresentante_rep;
    private		JTextField paisRepresentante_rep;
    private		JTextField cidadeRepresentante_rep;
    private		JTextField localRepresentante_rep;
    private		JTextField contactoRepresentante_rep;

    private		JTextField nomeEmpresa_emp;
    private		JTextField idRepresentante_emp;
    private		JTextField paisEmpresa_emp;
    private		JTextField cidadeEmpresa_emp;
    private		JTextField localEmpresa_emp;
    private		JTextField contactoEmpresa_emp;
    private		JTextField emailEmpresa_emp;
    
	private		JTextField idNegocio_neg;

	private		JTextField idNegocio_neg1;

	private		JTextField idNegocio_neg2;

	private		JTextField idNegocio_neg3;

    private		JTextField nomeNegocio_neg;
	private		JTextField idRepresentante_neg;
	private		JTextField idEmpresa_neg;
	private		JTextField valorNegocio_neg;

	private		JRadioButton 	chamadaRadio_atv;
	private		JRadioButton 	emailRadio_atv;
	private		JRadioButton 	reuniaoOnRadio_atv;
	private		JRadioButton 	reuniaoPresencialRadio_atv;
	private 	JTextArea 		notesArea_atv;
	private 	JTextField 		idNegocio_atv;
	private 	JTextField		dataAgenda_atv;

    private		JButton btncadastrarForm_rep;
    private		JButton btnlimparForm_rep;

    private		JButton btncadastrarForm_emp;
    private		JButton btnlimparForm_emp;

    private		JButton btncadastrarForm_neg;
    private		JButton btnlimparForm_neg;
    
	private		JButton btnAddForm_Oportunidade;
    private		JButton btnlimparForm_Oportunidade;

	private		JButton btnAddForm_Proposta;
    private		JButton btnlimparForm_Proposta;
	
	private		JButton btnAddForm_Contacto;
    private		JButton btnlimparForm_Contacto;
	
	private		JButton btnAddForm_Finalizado;
    private		JButton btnlimparForm_Finalizado;
	
	private		JButton btnAddForm_Atividade;
    private		JButton btnlimparForm_Atividade;
	
    public Add()
    {
        

        mainPanel();
    }

    private void btnsProposta ()
    {
        btnAddForm_Proposta   = new JButton("Adicionar");
        btnlimparForm_Proposta      = new JButton("Limpar");

		btnAddForm_Proposta.setForeground(new Color(0xffffff));
		btnAddForm_Proposta.setBackground(new Color(0x1de83b));//btn verde
		btnAddForm_Proposta.setFont(new Font("",Font.BOLD,15));
		btnAddForm_Proposta.setPreferredSize(new Dimension(230,50));

        btnAddForm_Proposta.addActionListener(this);
        btnlimparForm_Proposta.addActionListener(this);
    }
   
	private void btnsContacto ()
    {
        btnAddForm_Contacto   = new JButton("Adicionar");
        btnlimparForm_Contacto      = new JButton("Limpar");

		btnAddForm_Contacto.setForeground(new Color(0xffffff));
		btnAddForm_Contacto.setBackground(new Color(0x1de83b));//btn verde
		btnAddForm_Contacto.setFont(new Font("",Font.BOLD,15));
		btnAddForm_Contacto.setPreferredSize(new Dimension(230,50));

        btnAddForm_Contacto.addActionListener(this);
        btnlimparForm_Contacto.addActionListener(this);
    }
    
	private void btnsFinalizado ()
    {
        btnAddForm_Finalizado   = new JButton("Adicionar");
        btnlimparForm_Finalizado      = new JButton("Limpar");

		btnAddForm_Finalizado.setForeground(new Color(0xffffff));
		btnAddForm_Finalizado.setBackground(new Color(0x1de83b));//btn verde
		btnAddForm_Finalizado.setFont(new Font("",Font.BOLD,15));
		btnAddForm_Finalizado.setPreferredSize(new Dimension(230,50));

        btnAddForm_Finalizado.addActionListener(this);
        btnlimparForm_Finalizado.addActionListener(this);
    }
    
	private void btnsOportunidades ()
    {
        btnAddForm_Oportunidade   = new JButton("Adicionar");
        btnlimparForm_Oportunidade      = new JButton("Limpar");
		
		btnAddForm_Oportunidade.setForeground(new Color(0xffffff));
		btnAddForm_Oportunidade.setBackground(new Color(0x1de83b));//btn verde
		btnAddForm_Oportunidade.setFont(new Font("",Font.BOLD,15));
		btnAddForm_Oportunidade.setPreferredSize(new Dimension(230,50));
		//btnAddForm_Oportunidade.setBorder(null);
		

        btnAddForm_Oportunidade.addActionListener(this);
        btnlimparForm_Oportunidade.addActionListener(this);
    }
    
    private void btnsRepresentante ()
    {
        btncadastrarForm_rep   = new JButton("Cadastrar");
        btnlimparForm_rep      = new JButton("Limpar");

		btncadastrarForm_rep.setForeground(new Color(0xffffff));
		btncadastrarForm_rep.setBackground(new Color(0x1de83b));//btn verde
		btncadastrarForm_rep.setFont(new Font("",Font.BOLD,15));
		btncadastrarForm_rep.setPreferredSize(new Dimension(230,50));

		btnlimparForm_rep.setForeground(new Color(0xaaaaaa));
		btnlimparForm_rep.setBackground(new Color(0xffffff));//btn verde
		btnlimparForm_rep.setFont(new Font("",Font.BOLD,15));
		btnlimparForm_rep.setPreferredSize(new Dimension(230,50));

        btncadastrarForm_rep.addActionListener(this);
        btnlimparForm_rep.addActionListener(this);
    }
    
    private void btnsEmpresa ()
    {
        btncadastrarForm_emp   = new JButton("Cadastrar");
        btnlimparForm_emp      = new JButton("Limpar");
        
		btncadastrarForm_emp.setForeground(new Color(0xffffff));
		btncadastrarForm_emp.setBackground(new Color(0x1de83b));//btn verde
		btncadastrarForm_emp.setFont(new Font("",Font.BOLD,15));
		btncadastrarForm_emp.setPreferredSize(new Dimension(230,50));
        
		btnlimparForm_emp.setForeground(new Color(0xaaaaaa));
		btnlimparForm_emp.setBackground(new Color(0xffffff));//btn verde
		btnlimparForm_emp.setFont(new Font("",Font.BOLD,15));
		btnlimparForm_emp.setPreferredSize(new Dimension(230,50));

        btncadastrarForm_emp.addActionListener(this);
        btnlimparForm_emp.addActionListener(this);
    }
    
    private void btnsNegocio ()
    {

        btncadastrarForm_neg   = new JButton("Cadastrar");
        btnlimparForm_neg      = new JButton("Limpar");

		btncadastrarForm_neg.setForeground(new Color(0xffffff));
		btncadastrarForm_neg.setBackground(new Color(0x1de83b));//btn verde
		btncadastrarForm_neg.setFont(new Font("",Font.BOLD,15));
		btncadastrarForm_neg.setPreferredSize(new Dimension(230,50));

		btnlimparForm_neg.setForeground(new Color(0xaaaaaa));
		btnlimparForm_neg.setBackground(new Color(0xffffff));//btn verde
		btnlimparForm_neg.setFont(new Font("",Font.BOLD,15));
		btnlimparForm_neg.setPreferredSize(new Dimension(230,50));

        btncadastrarForm_neg.addActionListener(this);
        btnlimparForm_neg.addActionListener(this);
    }
    
    private void btnsActividade ()
    {

        btnAddForm_Atividade   		= new JButton("Cadastrar");
        btnlimparForm_Atividade     = new JButton("Limpar");

		btnAddForm_Atividade.setForeground(new Color(0xffffff));
		btnAddForm_Atividade.setBackground(new Color(0x1de83b));//btn verde
		btnAddForm_Atividade.setFont(new Font("",Font.BOLD,15));
		btnAddForm_Atividade.setPreferredSize(new Dimension(230,50));

		btnlimparForm_Atividade.setForeground(new Color(0xaaaaaa));
		btnlimparForm_Atividade.setBackground(new Color(0xffffff));//btn verde
		btnlimparForm_Atividade.setFont(new Font("",Font.BOLD,15));
		btnlimparForm_Atividade.setPreferredSize(new Dimension(230,50));

        btnAddForm_Atividade.addActionListener(this);
        btnlimparForm_Atividade.addActionListener(this);
    }

    private void inicializarProposta ()
    {
        btnsProposta();

        idNegocio_neg					= new JTextField();

        JLabel IdNegocio_neg 			= new JLabel("Id do negocio a adicionar: ");
		IdNegocio_neg.setFont(new Font("Calibre",Font.PLAIN,20));
		IdNegocio_neg.setHorizontalAlignment(JLabel.CENTER);
		
		idNegocio_neg.setBorder(null);
		idNegocio_neg.setBackground(new Color(0xc9c9c9));
		idNegocio_neg.setPreferredSize(new Dimension(450,50));
		idNegocio_neg.setFont(new Font("",Font.PLAIN,17));
		
		
        painlAdd_proposta.setBackground(new Color(0xffffff));
		painlAdd_proposta.setLayout(new GridLayout(1, 3, 5, 5));
		painlAdd_proposta.add(IdNegocio_neg);
		painlAdd_proposta.add(idNegocio_neg);
		painlAdd_proposta.add(btnAddForm_Proposta);
    }

    private void inicializarContacto ()
    {
        btnsContacto();

        idNegocio_neg1					= new JTextField();

        JLabel IdNegocio_neg 			= new JLabel("Id do negocio a adicionar: ");
		IdNegocio_neg.setFont(new Font("Calibre",Font.PLAIN,20));
		IdNegocio_neg.setHorizontalAlignment(JLabel.CENTER);
		
		idNegocio_neg1.setBorder(null);
		idNegocio_neg1.setBackground(new Color(0xc9c9c9));
		idNegocio_neg1.setPreferredSize(new Dimension(450,50));
		idNegocio_neg1.setFont(new Font("",Font.PLAIN,17));
		
		
        painlAdd_contacto.setBackground(new Color(0xffffff));
		painlAdd_contacto.setLayout(new GridLayout(1, 3, 5, 5));
		painlAdd_contacto.add(IdNegocio_neg);
		painlAdd_contacto.add(idNegocio_neg1);
		painlAdd_contacto.add(btnAddForm_Contacto);
    }

    private void inicializarFinalizado ()
    {
        btnsFinalizado();

        idNegocio_neg2					= new JTextField();

        JLabel IdNegocio_neg 			= new JLabel("Id do negocio a adicionar: ");
		IdNegocio_neg.setFont(new Font("Calibre",Font.PLAIN,20));
		IdNegocio_neg.setHorizontalAlignment(JLabel.CENTER);
		
		idNegocio_neg2.setBorder(null);
		idNegocio_neg2.setBackground(new Color(0xc9c9c9));
		idNegocio_neg2.setPreferredSize(new Dimension(450,50));
		idNegocio_neg2.setFont(new Font("",Font.PLAIN,17));
		
		
        painlAdd_finalizado.setBackground(new Color(0xffffff));
		painlAdd_finalizado.setLayout(new GridLayout(1, 3, 5, 5));
		painlAdd_finalizado.add(IdNegocio_neg);
		painlAdd_finalizado.add(idNegocio_neg2);
		painlAdd_finalizado.add(btnAddForm_Finalizado);
    }

    private void inicializarOportunidade ()
    {
        btnsOportunidades ();

        idNegocio_neg3					= new JTextField();

        JLabel IdNegocio_neg 			= new JLabel("Id do negócio a adicionar:");
		IdNegocio_neg.setFont(new Font("Calibre",Font.PLAIN,20));
		IdNegocio_neg.setHorizontalAlignment(JLabel.CENTER);
		
		idNegocio_neg3.setBorder(null);
		idNegocio_neg3.setBackground(new Color(0xc9c9c9));
		idNegocio_neg3.setPreferredSize(new Dimension(450,50));
		idNegocio_neg3.setFont(new Font("",Font.PLAIN,17));
		
		
        painlAdd_oportunidade.setBackground(new Color(0xffffff));
		painlAdd_oportunidade.setLayout(new GridLayout(1, 3, 5, 5));
		painlAdd_oportunidade.add(IdNegocio_neg);
		painlAdd_oportunidade.add(idNegocio_neg3);
		painlAdd_oportunidade.add(btnAddForm_Oportunidade);
		//painlAdd_oportunidade.add(btnlimparForm_Oportunidade);
    }

    private void inicializarRepresentante ()
    {
        btnsRepresentante();

        nomeRepresentante_rep			= new JTextField();
		apelidoRepresentante_rep		= new JTextField();
		idEmpresa_rep					= new JTextField();
		emailRepresentante_rep			= new JTextField();
		paisRepresentante_rep 			= new JTextField();
		cidadeRepresentante_rep 		= new JTextField();
		localRepresentante_rep	 		= new JTextField();
		contactoRepresentante_rep	 	= new JTextField();

        JLabel NomeRepresentante_rep 		    = new JLabel("Nome do Representante: ");
		JLabel ApelidoRepresentante_rep 	    = new JLabel("Apelido: ");
		JLabel IdEmpresa_rep 				    = new JLabel("Id da Empresa: ");
		JLabel EmailRepresentante_rep 		    = new JLabel("Email do: ");
		JLabel NacionalidadeRepresentante_rep   = new JLabel("Nacionalidade: ");
		JLabel CidadeRepresentante_rep		    = new JLabel("Cidade: ");
		JLabel ContactoRepresentante_rep	    = new JLabel("Contacto: ");
		JLabel LocalRepresentante_rep		    = new JLabel("localidade: ");
		JLabel espaco1JLabel				    = new JLabel("");


		NomeRepresentante_rep.setFont(new Font("Calibre",Font.PLAIN,20));

		ApelidoRepresentante_rep.setFont(new Font("Calibre",Font.PLAIN,20));

		IdEmpresa_rep.setFont(new Font("Calibre",Font.PLAIN,20));

		EmailRepresentante_rep.setFont(new Font("Calibre",Font.PLAIN,20));

		NacionalidadeRepresentante_rep.setFont(new Font("Calibre",Font.PLAIN,20));

		CidadeRepresentante_rep.setFont(new Font("Calibre",Font.PLAIN,20));

		ContactoRepresentante_rep.setFont(new Font("Calibre",Font.PLAIN,20));

		LocalRepresentante_rep.setFont(new Font("Calibre",Font.PLAIN,20));
		

		nomeRepresentante_rep.setBorder(null);
		nomeRepresentante_rep.setBackground(new Color(0xc9c9c9));
		nomeRepresentante_rep.setPreferredSize(new Dimension(450,50));
		nomeRepresentante_rep.setFont(new Font("",Font.PLAIN,17));
		nomeRepresentante_rep.setHorizontalAlignment(JLabel.CENTER);
		
		apelidoRepresentante_rep.setBorder(null);
		apelidoRepresentante_rep.setBackground(new Color(0xc9c9c9));
		apelidoRepresentante_rep.setPreferredSize(new Dimension(450,50));
		apelidoRepresentante_rep.setFont(new Font("",Font.PLAIN,17));
		apelidoRepresentante_rep.setHorizontalAlignment(JLabel.CENTER);
		
		idEmpresa_rep.setBorder(null);
		idEmpresa_rep.setBackground(new Color(0xc9c9c9));
		idEmpresa_rep.setPreferredSize(new Dimension(450,50));
		idEmpresa_rep.setFont(new Font("",Font.PLAIN,17));
		idEmpresa_rep.setHorizontalAlignment(JLabel.CENTER);
		
		emailRepresentante_rep.setBorder(null);
		emailRepresentante_rep.setBackground(new Color(0xc9c9c9));
		emailRepresentante_rep.setPreferredSize(new Dimension(450,50));
		emailRepresentante_rep.setFont(new Font("",Font.PLAIN,17));
		emailRepresentante_rep.setHorizontalAlignment(JLabel.CENTER);
		
		paisRepresentante_rep.setBorder(null);
		paisRepresentante_rep.setBackground(new Color(0xc9c9c9));
		paisRepresentante_rep.setPreferredSize(new Dimension(450,50));
		paisRepresentante_rep.setFont(new Font("",Font.PLAIN,17));
		paisRepresentante_rep.setHorizontalAlignment(JLabel.CENTER);
		
		cidadeRepresentante_rep.setBorder(null);
		cidadeRepresentante_rep.setBackground(new Color(0xc9c9c9));
		cidadeRepresentante_rep.setPreferredSize(new Dimension(450,50));
		cidadeRepresentante_rep.setFont(new Font("",Font.PLAIN,17));
		cidadeRepresentante_rep.setHorizontalAlignment(JLabel.CENTER);
		
		localRepresentante_rep.setBorder(null);
		localRepresentante_rep.setBackground(new Color(0xc9c9c9));
		localRepresentante_rep.setPreferredSize(new Dimension(450,50));
		localRepresentante_rep.setFont(new Font("",Font.PLAIN,17));
		localRepresentante_rep.setHorizontalAlignment(JLabel.CENTER);
		
		contactoRepresentante_rep.setBorder(null);
		contactoRepresentante_rep.setBackground(new Color(0xc9c9c9));
		contactoRepresentante_rep.setPreferredSize(new Dimension(450,50));
		contactoRepresentante_rep.setFont(new Font("",Font.PLAIN,17));
		contactoRepresentante_rep.setHorizontalAlignment(JLabel.CENTER);
		
    
        painlAdd_rep.setPreferredSize(new Dimension(200,200));
        painlAdd_rep.setBackground(Color.white);
		painlAdd_rep.setLayout(new GridLayout(5,4,5,5));
		painlAdd_rep.add(NomeRepresentante_rep);
		painlAdd_rep.add(nomeRepresentante_rep);
		painlAdd_rep.add(ApelidoRepresentante_rep);
		painlAdd_rep.add(apelidoRepresentante_rep);
		painlAdd_rep.add(EmailRepresentante_rep);
		painlAdd_rep.add(emailRepresentante_rep);
		painlAdd_rep.add(ContactoRepresentante_rep);
		painlAdd_rep.add(contactoRepresentante_rep);
		painlAdd_rep.add(NacionalidadeRepresentante_rep);
		painlAdd_rep.add(paisRepresentante_rep);
		painlAdd_rep.add(CidadeRepresentante_rep);
		painlAdd_rep.add(cidadeRepresentante_rep);
		painlAdd_rep.add(LocalRepresentante_rep);
		painlAdd_rep.add(localRepresentante_rep);
		painlAdd_rep.add(IdEmpresa_rep);
		painlAdd_rep.add(idEmpresa_rep);
		painlAdd_rep.add(espaco1JLabel);
		// painlAdd_rep.add(espaco2JLabel);
		painlAdd_rep.add(btnlimparForm_rep);
	    painlAdd_rep.add(btncadastrarForm_rep);
    }

    private void inicializarEmpresa ()
    {
        btnsEmpresa();

        nomeEmpresa_emp					= new JTextField();
		idRepresentante_emp				= new JTextField();
		paisEmpresa_emp					= new JTextField();
		cidadeEmpresa_emp				= new JTextField();
		localEmpresa_emp				= new JTextField();
		emailEmpresa_emp				= new JTextField();
		contactoEmpresa_emp				= new JTextField();

        JLabel NomeEmpresa_emp 			= new JLabel("Nome empresa");
		JLabel IdRepresentante_emp 		= new JLabel("Id do Representante");
		JLabel NacionalidadeEmp_emp 	= new JLabel("Nacionalidade da Empresa");
		JLabel CidadeEmpresa_emp 		= new JLabel("Cidade de Empresa");
		JLabel LocalEmpresa_emp			= new JLabel("LocalEmpresa");
		JLabel EmailEmpresa_emp			= new JLabel("Email empresa");
		JLabel ContactoEmpresa_emp		= new JLabel("Contacto empresa");
    
		
		NomeEmpresa_emp.setFont(new Font("Calibre",Font.PLAIN,20));

		IdRepresentante_emp.setFont(new Font("Calibre",Font.PLAIN,20));

		CidadeEmpresa_emp.setFont(new Font("Calibre",Font.PLAIN,20));

		NacionalidadeEmp_emp.setFont(new Font("Calibre",Font.PLAIN,20));

		LocalEmpresa_emp.setFont(new Font("Calibre",Font.PLAIN,20));

		EmailEmpresa_emp.setFont(new Font("Calibre",Font.PLAIN,20));

		ContactoEmpresa_emp.setFont(new Font("Calibre",Font.PLAIN,20));
		
		
		nomeEmpresa_emp.setBorder(null);
		nomeEmpresa_emp.setBackground(new Color(0xc9c9c9));
		nomeEmpresa_emp.setPreferredSize(new Dimension(450,50));
		nomeEmpresa_emp.setFont(new Font("",Font.PLAIN,17));
		nomeEmpresa_emp.setHorizontalAlignment(JLabel.CENTER);
		
		idRepresentante_emp.setBorder(null);
		idRepresentante_emp.setBackground(new Color(0xc9c9c9));
		idRepresentante_emp.setPreferredSize(new Dimension(450,50));
		idRepresentante_emp.setFont(new Font("",Font.PLAIN,17));
		idRepresentante_emp.setHorizontalAlignment(JLabel.CENTER);
		
		paisEmpresa_emp.setBorder(null);
		paisEmpresa_emp.setBackground(new Color(0xc9c9c9));
		paisEmpresa_emp.setPreferredSize(new Dimension(450,50));
		paisEmpresa_emp.setFont(new Font("",Font.PLAIN,17));
		paisEmpresa_emp.setHorizontalAlignment(JLabel.CENTER);
		
		cidadeEmpresa_emp.setBorder(null);
		cidadeEmpresa_emp.setBackground(new Color(0xc9c9c9));
		cidadeEmpresa_emp.setPreferredSize(new Dimension(450,50));
		cidadeEmpresa_emp.setFont(new Font("",Font.PLAIN,17));
		cidadeEmpresa_emp.setHorizontalAlignment(JLabel.CENTER);
		
		localEmpresa_emp.setBorder(null);
		localEmpresa_emp.setBackground(new Color(0xc9c9c9));
		localEmpresa_emp.setPreferredSize(new Dimension(450,50));
		localEmpresa_emp.setFont(new Font("",Font.PLAIN,17));
		localEmpresa_emp.setHorizontalAlignment(JLabel.CENTER);
		
		emailEmpresa_emp.setBorder(null);
		emailEmpresa_emp.setBackground(new Color(0xc9c9c9));
		emailEmpresa_emp.setPreferredSize(new Dimension(450,50));
		emailEmpresa_emp.setFont(new Font("",Font.PLAIN,17));
		emailEmpresa_emp.setHorizontalAlignment(JLabel.CENTER);
		
		contactoEmpresa_emp.setBorder(null);
		contactoEmpresa_emp.setBackground(new Color(0xc9c9c9));
		contactoEmpresa_emp.setPreferredSize(new Dimension(450,50));
		contactoEmpresa_emp.setFont(new Font("",Font.PLAIN,17));
		contactoEmpresa_emp.setHorizontalAlignment(JLabel.CENTER);
		

        painlAdd_emp.setBackground(Color.white);
		painlAdd_emp.setLayout(new GridLayout(4,2,5,5));
        painlAdd_emp.add(NomeEmpresa_emp);
		painlAdd_emp.add(nomeEmpresa_emp);
		painlAdd_emp.add(ContactoEmpresa_emp);
		painlAdd_emp.add(contactoEmpresa_emp);
		painlAdd_emp.add(EmailEmpresa_emp);
		painlAdd_emp.add(emailEmpresa_emp);
		painlAdd_emp.add(NacionalidadeEmp_emp);
		painlAdd_emp.add(paisEmpresa_emp);
		painlAdd_emp.add(LocalEmpresa_emp);
		painlAdd_emp.add(localEmpresa_emp);
		painlAdd_emp.add(CidadeEmpresa_emp);
		painlAdd_emp.add(cidadeEmpresa_emp);
		painlAdd_emp.add(IdRepresentante_emp);
		painlAdd_emp.add(idRepresentante_emp);
		painlAdd_emp.add(btnlimparForm_emp);
		painlAdd_emp.add(btncadastrarForm_emp);
    }

    private void inicializarNegocio ()
    {
        btnsNegocio();

        nomeNegocio_neg					= new JTextField();
		idRepresentante_neg				= new JTextField();
		idEmpresa_neg					= new JTextField();
		valorNegocio_neg				= new JTextField();

        JLabel NomeNegocio_neg 			= new JLabel("Designacao do Negocio");
		JLabel IdRepresentante_neg 		= new JLabel("Id do Representante");
		JLabel IdEmpresa_neg 			= new JLabel("Id da Empresa");
		JLabel ValorNegocio_neg			= new JLabel("Valor do Negocio");


		NomeNegocio_neg.setFont(new Font("Calibre",Font.PLAIN,20));

		IdRepresentante_neg.setFont(new Font("Calibre",Font.PLAIN,20));

		IdEmpresa_neg.setFont(new Font("Calibre",Font.PLAIN,20));

		ValorNegocio_neg.setFont(new Font("Calibre",Font.PLAIN,20));
		
		
		nomeNegocio_neg.setBorder(null);
		nomeNegocio_neg.setBackground(new Color(0xc9c9c9));
		nomeNegocio_neg.setPreferredSize(new Dimension(450,50));
		nomeNegocio_neg.setFont(new Font("",Font.PLAIN,17));
		nomeNegocio_neg.setHorizontalAlignment(JLabel.CENTER);
		
		idRepresentante_neg.setBorder(null);
		idRepresentante_neg.setBackground(new Color(0xc9c9c9));
		idRepresentante_neg.setPreferredSize(new Dimension(450,50));
		idRepresentante_neg.setFont(new Font("",Font.PLAIN,17));
		idRepresentante_neg.setHorizontalAlignment(JLabel.CENTER);
		
		idEmpresa_neg.setBorder(null);
		idEmpresa_neg.setBackground(new Color(0xc9c9c9));
		idEmpresa_neg.setPreferredSize(new Dimension(450,50));
		idEmpresa_neg.setFont(new Font("",Font.PLAIN,17));
		idEmpresa_neg.setHorizontalAlignment(JLabel.CENTER);
		
		valorNegocio_neg.setBorder(null);
		valorNegocio_neg.setBackground(new Color(0xc9c9c9));
		valorNegocio_neg.setPreferredSize(new Dimension(450,50));
		valorNegocio_neg.setFont(new Font("",Font.PLAIN,17));
		valorNegocio_neg.setHorizontalAlignment(JLabel.CENTER);
    
        painlAdd_neg.setBackground(Color.white);
		painlAdd_neg.setLayout(new GridLayout(5,2,5,5));
		painlAdd_neg.add(NomeNegocio_neg);
		painlAdd_neg.add(nomeNegocio_neg);
		painlAdd_neg.add(ValorNegocio_neg);
		painlAdd_neg.add(valorNegocio_neg);
		painlAdd_neg.add(IdRepresentante_neg);
		painlAdd_neg.add(idRepresentante_neg);
		painlAdd_neg.add(IdEmpresa_neg);
		painlAdd_neg.add(idEmpresa_neg);
		painlAdd_neg.add(btnlimparForm_neg);
		painlAdd_neg.add(btncadastrarForm_neg);
    }

    private void inicializarActividade ()
    {
        btnsActividade();

		JPanel leftPanel				= new JPanel();
		JPanel rigthPanel				= new JPanel();

        chamadaRadio_atv				= new JRadioButton("Chamada");
		emailRadio_atv					= new JRadioButton("E-mail");
		reuniaoOnRadio_atv				= new JRadioButton("Reuniao On-Line");
		reuniaoPresencialRadio_atv		= new JRadioButton("Reuniao Presencial");
		notesArea_atv					= new JTextArea();
		idNegocio_atv					= new JTextField();
		dataAgenda_atv					= new JTextField();

		JLabel topLabel		 			= new JLabel("Escolha uma Atividade:");
        JLabel NotesArea_atv 			= new JLabel("Deixe uma nota");
		JLabel IdNegocio_atv			= new JLabel("Id do Negocio");
		JLabel DataAgenda_atv 			= new JLabel("Data Agendada");
		JLabel spacLabel	 			= new JLabel("a");
		JLabel spacLabel1	 			= new JLabel("");
		JLabel spacLabel2	 			= new JLabel("");
		// JLabel ValorNegocio_neg			= new JLabel("Valor do Negocio");

		spacLabel.setForeground(Color.white);
		spacLabel.setFont(new Font("Calibre",Font.PLAIN,9));

		NotesArea_atv.setFont(new Font("Calibre",Font.PLAIN,20));
		// NotesArea_atv.setHorizontalAlignment(JLabel.LEFT);
		
		IdNegocio_atv.setFont(new Font("Calibre",Font.PLAIN,20));
		// IdNegocio_atv.setHorizontalAlignment(JLabel.LEFT);
		
		DataAgenda_atv.setFont(new Font("Calibre",Font.PLAIN,20));
		// DataAgenda_atv.setHorizontalAlignment(JLabel.LEFT);
		
		topLabel.setFont(new Font("Calibre",Font.BOLD,22));
		// NotesArea_atv.setHorizontalAlignment(JLabel.LEFT);

		chamadaRadio_atv.setFont(new Font("Calibre",Font.PLAIN,20));
		chamadaRadio_atv.setBackground(Color.white);
		chamadaRadio_atv.setPreferredSize(new Dimension(150,30));
		chamadaRadio_atv.setBackground(new Color(0xc9c9c9));
		// chamadaRadio_atv.setOpaque(true);
		
		emailRadio_atv.setFont(new Font("Calibre",Font.PLAIN,20));
		emailRadio_atv.setBackground(Color.white);
		emailRadio_atv.setPreferredSize(new Dimension(150,30));
		emailRadio_atv.setBackground(new Color(0xc9c9c9));
		// emailRadio_atv.setOpaque(true);
		
		reuniaoOnRadio_atv.setFont(new Font("Calibre",Font.PLAIN,20));
		reuniaoOnRadio_atv.setBackground(Color.white);
		reuniaoOnRadio_atv.setPreferredSize(new Dimension(150,30));
		reuniaoOnRadio_atv.setBackground(new Color(0xc9c9c9));
		// reuniaoOnRadio_atv.setOpaque(true);
		
		reuniaoPresencialRadio_atv.setFont(new Font("Calibre",Font.PLAIN,20));
		reuniaoPresencialRadio_atv.setBackground(Color.white);
		reuniaoPresencialRadio_atv.setPreferredSize(new Dimension(150,30));
		reuniaoPresencialRadio_atv.setBackground(new Color(0xc9c9c9));
		// reuniaoPresencialRadio_atv.setOpaque(true);
		
		dataAgenda_atv.setBorder(null);
		dataAgenda_atv.setBackground(new Color(0xc9c9c9));
		dataAgenda_atv.setPreferredSize(new Dimension(150,45));
		dataAgenda_atv.setFont(new Font("",Font.PLAIN,17));
		dataAgenda_atv.setHorizontalAlignment(JLabel.CENTER);
		
		idNegocio_atv.setBorder(null);
		idNegocio_atv.setBackground(new Color(0xc9c9c9));
		idNegocio_atv.setPreferredSize(new Dimension(150,45));
		idNegocio_atv.setFont(new Font("",Font.PLAIN,17));
		idNegocio_atv.setHorizontalAlignment(JLabel.CENTER);
		idNegocio_atv.setAlignmentY(JLabel.RIGHT_ALIGNMENT);
		
		notesArea_atv.setBorder(null);
		notesArea_atv.setBackground(new Color(0xc9c9c9));
		notesArea_atv.setPreferredSize(new Dimension(150,114));
		notesArea_atv.setFont(new Font("",Font.PLAIN,15));
		// notesArea_atv.setHorizontalAlignment(JLabel.CENTER);
    

		leftPanel.setLayout(new GridLayout(4,2,5,5));
		leftPanel.setBackground(Color.white);
		leftPanel.add(topLabel);
		leftPanel.add(spacLabel1);
		leftPanel.add(chamadaRadio_atv).setPreferredSize(new Dimension(100,50));
		leftPanel.add(emailRadio_atv).setPreferredSize(new Dimension(100,50));
		leftPanel.add(reuniaoOnRadio_atv);
		leftPanel.add(reuniaoPresencialRadio_atv);
		// leftPanel.add(spacLabel);
		// leftPanel.add(spacLabel2);
		leftPanel.add(btnlimparForm_Atividade);
		leftPanel.add(btnAddForm_Atividade);
		
		GridBagConstraints gbc		= new GridBagConstraints();

		rigthPanel.setLayout(new GridBagLayout());
		rigthPanel.setBackground(Color.white);
		gbc.gridx		= 0;
		gbc.gridy		= 0;
		rigthPanel.add(IdNegocio_atv,gbc);
		gbc.gridx		= 1;
		gbc.gridy		= 0;
		rigthPanel.add(idNegocio_atv,gbc);
		gbc.gridx		= 0;
		gbc.gridy		= 1;
		rigthPanel.add(DataAgenda_atv,gbc);
		gbc.gridx		= 1;
		gbc.gridy		= 1;
		rigthPanel.add(dataAgenda_atv,gbc);
		gbc.gridx		= 0;
		gbc.gridy		= 2;
		rigthPanel.add(NotesArea_atv,gbc);
		gbc.gridx		= 1;
		gbc.gridy		= 2;
		gbc.gridwidth 	= 1;
		gbc.fill		= 1;
		rigthPanel.add(notesArea_atv,gbc);



        painlAdd_ativ.setBackground(Color.white);
		painlAdd_ativ.setLayout(new GridLayout(1,2));
		painlAdd_ativ.add(rigthPanel);
		painlAdd_ativ.add(leftPanel);
		//painlAdd_ativ.add(ValorNegocio_neg);
		//painlAdd_ativ.add(valorNegocio_neg);
		//painlAdd_ativ.add(IdRepresentante_neg);
		//painlAdd_ativ.add(idRepresentante_neg);
		//painlAdd_ativ.add(IdEmpresa_neg);
		// painlAdd_neg.add(idEmpresa_neg);
		// painlAdd_neg.add(btnlimparForm_neg);
		// painlAdd_neg.add(btncadastrarForm_neg);
    }

    public void mainPanel ()
    {
		painlAdd_rep    = new JPanel();
        painlAdd_emp    = new JPanel();
        painlAdd_neg    = new JPanel();
        painlAdd_ativ    = new JPanel();

		painlAdd_oportunidade	= new JPanel();
		painlAdd_proposta		= new JPanel();
		painlAdd_finalizado		= new JPanel();
		painlAdd_contacto		= new JPanel();

		inicializarActividade();
        inicializarEmpresa();
        inicializarNegocio();
        inicializarRepresentante();
        inicializarOportunidade();
		inicializarContacto();
		inicializarProposta();
		inicializarFinalizado();
    }

    public void actionPerformed (ActionEvent ae)
    {
        if (ae.getSource() == btncadastrarForm_rep) 
        {
            try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaOportunidade","root","");
				String sql = "INSERT INTO representante (nomeRepresentante,apelidoRepresentante,contactoRepresentante,emailRepresentante,paisRepresentante,cidadeRepresentante,localRepresentante) VALUES (?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement stmt = con.prepareStatement(sql);

				stmt.setString(1,nomeRepresentante_rep.getText());
				stmt.setString(2,apelidoRepresentante_rep.getText());
				stmt.setString(3,contactoRepresentante_rep.getText());
				stmt.setString(4,emailRepresentante_rep.getText());
				stmt.setString(5,paisRepresentante_rep.getText());
				stmt.setString(6,cidadeRepresentante_rep.getText());
				stmt.setString(7,localRepresentante_rep.getText());
				//stmt.setString(8,idEmpresa.getText());

				int ret = stmt.executeUpdate();

				if(ret>0) 
				{
					System.out.println("Armazenador Cadastrado Com suceso");

					nomeRepresentante_rep.setText("");
					idEmpresa_rep.setText("");
					emailRepresentante_rep.setText("");
					apelidoRepresentante_rep.setText("");
					localRepresentante_rep.setText("");
					contactoRepresentante_rep.setText("");
					paisRepresentante_rep.setText("");
					cidadeRepresentante_rep.setText("");
					//BuscarNegocio();						
					//JOptionPane.showMessageDialog(this, "Cliente Cadastrado Com suceso");
				} 
				else{
					System.out.println("Falha ao cadastrar Armazenador");
				}
				stmt.close();
				con.close();

			}
            catch (Exception e) 
            {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
        }

        else if (ae.getSource() == btnlimparForm_rep)
        {
            nomeRepresentante_rep.setText("");
            idEmpresa_rep.setText("");
            emailRepresentante_rep.setText("");
            apelidoRepresentante_rep.setText("");
            localRepresentante_rep.setText("");
            contactoRepresentante_rep.setText("");
            paisRepresentante_rep.setText("");
            cidadeRepresentante_rep.setText("");
        }

        else if (ae.getSource() == btncadastrarForm_emp)
        {
            try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaOportunidade","root","");
				String sql = "INSERT INTO empresa (nomeEmpresa,paisEmpresa,cidadeEmpresa,localEmpresa,idRepresentante,contactoEmpresa,emailEmpresa) VALUES (?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement stmt = con.prepareStatement(sql);

				stmt.setString(1,nomeEmpresa_emp.getText());
				stmt.setString(2,paisEmpresa_emp.getText());
				stmt.setString(3,cidadeEmpresa_emp.getText());
				stmt.setString(4,localEmpresa_emp.getText());
				stmt.setInt(5,Integer.parseInt(idRepresentante_emp.getText()));
				stmt.setString(6,contactoEmpresa_emp.getText());
				stmt.setString(7,emailEmpresa_emp.getText());

				int ret = stmt.executeUpdate();

				if(ret>0) 
				{
					System.out.println("Armazenador Cadastrado Com suceso");

					nomeEmpresa_emp.setText("");
					paisEmpresa_emp.setText("");
					cidadeEmpresa_emp.setText("");
					idRepresentante_emp.setText("");
					localEmpresa_emp.setText("");
					contactoEmpresa_emp.setText("");
					emailEmpresa_emp.setText("");
					//BuscarNegocio();						
					//JOptionPane.showMessageDialog(this, "Cliente Cadastrado Com suceso");
				} 
				else{
					System.out.println("Falha ao cadastrar Armazenador");
				}
				stmt.close();
				con.close();
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
        }

        else if (ae.getSource() == btnlimparForm_emp)
        {
            nomeEmpresa_emp.setText("");
            paisEmpresa_emp.setText("");
            cidadeEmpresa_emp.setText("");
            idRepresentante_emp.setText("");
            localEmpresa_emp.setText("");
            contactoEmpresa_emp.setText("");
            emailEmpresa_emp.setText("");
        }

        else if (ae.getSource() == btncadastrarForm_neg)
        {
            try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaOportunidade","root","");
				String sql = "INSERT INTO negocio (designacaoNegocio,idRepresentante,idEmpresa,valorNegocio) VALUES (?, ?, ?, ?)";
				PreparedStatement stmt = con.prepareStatement(sql);

				stmt.setString(1,nomeNegocio_neg.getText());
				stmt.setString(2,idRepresentante_neg.getText());
				stmt.setString(3,idEmpresa_neg.getText());
				stmt.setString(4,valorNegocio_neg.getText());

				int ret = stmt.executeUpdate();

				if(ret>0) 
				{
					System.out.println("Armazenador Cadastrado Com suceso");

					nomeNegocio_neg.setText("");
					idEmpresa_neg.setText("");
					idRepresentante_neg.setText("");
					valorNegocio_neg.setText("");
					//BuscarNegocio();						
					//JOptionPane.showMessageDialog(this, "Cliente Cadastrado Com suceso");
				} 
				else{
					System.out.println("Falha ao cadastrar Armazenador");
				}
				stmt.close();
				con.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
        }

        else if (ae.getSource() == btnlimparForm_neg)
        {
            nomeNegocio_neg.setText("");
            idEmpresa_neg.setText("");
            idRepresentante_neg.setText("");
            valorNegocio_neg.setText("");
        }
		
		else if(ae.getSource() == btnAddForm_Oportunidade)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaOportunidade","root","");
				// String sql = "INSERT INTO negocio (designacaoNegocio,idRepresentante,idEmpresa,valorNegocio) VALUES (?, ?, ?, ?)";
				
				String sql 	= "INSERT INTO concurso (idNegocio) VALUES (?)";

				String sql2 = "DELETE FROM proposta WHERE idNegocio = ?";
				String sql3 = "DELETE FROM finalizado WHERE idNegocio = ?";
				String sql4 = "DELETE FROM aprovado WHERE idNegocio = ?";
				
				PreparedStatement stmt = con.prepareStatement(sql);
				PreparedStatement stmt2 = con.prepareStatement(sql2);
				PreparedStatement stmt3 = con.prepareStatement(sql3);
				PreparedStatement stmt4 = con.prepareStatement(sql4);

				stmt.setString(1,idNegocio_neg3.getText());
				stmt2.setString(1,idNegocio_neg3.getText());
				stmt3.setString(1,idNegocio_neg3.getText());
				stmt4.setString(1,idNegocio_neg3.getText());

				int ret = stmt.executeUpdate();
				stmt2.executeUpdate();
				stmt3.executeUpdate();
				stmt4.executeUpdate();

				if(ret>0) 
				{
					System.out.println("Armazenador Cadastrado Com suceso");

					idNegocio_neg3.setText("");
					// idEmpresa_neg.setText("");
					// idRepresentante_neg.setText("");
					// valorNegocio_neg.setText("");
					//BuscarNegocio();						
					//JOptionPane.showMessageDialog(this, "Cliente Cadastrado Com suceso");
				} 
				else{
					System.out.println("Falha ao cadastrar Armazenador");
				}
				stmt.close();
				con.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
		}
		
		else if(ae.getSource() == btnAddForm_Contacto)
		{
			System.out.println("EYa");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaOportunidade","root","");
				// String sql = "INSERT INTO negocio (designacaoNegocio,idRepresentante,idEmpresa,valorNegocio) VALUES (?, ?, ?, ?)";
				
				String sql 	= "INSERT INTO aprovado (idNegocio) VALUES (?)";

				String sql2 = "DELETE FROM proposta WHERE idNegocio = ?";
				String sql3 = "DELETE FROM finalizado WHERE idNegocio = ?";
				String sql4 = "DELETE FROM concurso WHERE idNegocio = ?";
				
				PreparedStatement stmt2 = con.prepareStatement(sql2);
				PreparedStatement stmt = con.prepareStatement(sql);
				PreparedStatement stmt3 = con.prepareStatement(sql3);
				PreparedStatement stmt4 = con.prepareStatement(sql4);

				stmt.setString(1,idNegocio_neg1.getText());
				stmt2.setString(1,idNegocio_neg1.getText());
				stmt3.setString(1,idNegocio_neg1.getText());
				stmt4.setString(1,idNegocio_neg1.getText());

				int ret = stmt.executeUpdate();
				stmt2.executeUpdate();
				stmt3.executeUpdate();
				stmt4.executeUpdate();

				if(ret>0) 
				{
					System.out.println("Armazenador Cadastrado Com suceso");

					idNegocio_neg1.setText("");
					// idEmpresa_neg.setText("");
					// idRepresentante_neg.setText("");
					// valorNegocio_neg.setText("");
					//BuscarNegocio();						
					//JOptionPane.showMessageDialog(this, "Cliente Cadastrado Com suceso");
				} 
				else{
					System.out.println("Falha ao cadastrar Armazenador");
				}
				stmt.close();
				con.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
		}

		else if(ae.getSource() == btnAddForm_Finalizado)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaOportunidade","root","");
				// String sql = "INSERT INTO negocio (designacaoNegocio,idRepresentante,idEmpresa,valorNegocio) VALUES (?, ?, ?, ?)";
				
				String sql 	= "INSERT INTO finalizado (idNegocio) VALUES (?)";

				String sql2 = "DELETE FROM proposta WHERE idNegocio = ?";
				String sql3 = "DELETE FROM concurso WHERE idNegocio = ?";
				String sql4 = "DELETE FROM aprovado WHERE idNegocio = ?";
				
				PreparedStatement stmt = con.prepareStatement(sql);
				PreparedStatement stmt2 = con.prepareStatement(sql2);
				PreparedStatement stmt3 = con.prepareStatement(sql3);
				PreparedStatement stmt4 = con.prepareStatement(sql4);

				stmt.setString(1,idNegocio_neg2.getText());
				stmt2.setString(1,idNegocio_neg2.getText());
				stmt3.setString(1,idNegocio_neg2.getText());
				stmt4.setString(1,idNegocio_neg2.getText());

				int ret = stmt.executeUpdate();
				stmt2.executeUpdate();
				stmt3.executeUpdate();
				stmt4.executeUpdate();

				if(ret>0) 
				{
					System.out.println("Armazenador Cadastrado Com suceso");

					idNegocio_neg2.setText("");
					// idEmpresa_neg.setText("");
					// idRepresentante_neg.setText("");
					// valorNegocio_neg.setText("");
					//BuscarNegocio();						
					//JOptionPane.showMessageDialog(this, "Cliente Cadastrado Com suceso");
				} 
				else{
					System.out.println("Falha ao cadastrar Armazenador");
				}
				stmt.close();
				con.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
		}

		else if(ae.getSource() == btnAddForm_Proposta)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaOportunidade","root","");
				// String sql = "INSERT INTO negocio (designacaoNegocio,idRepresentante,idEmpresa,valorNegocio) VALUES (?, ?, ?, ?)";
				
				String sql 	= "INSERT INTO Proposta (idNegocio) VALUES (?)";
				
				PreparedStatement stmt = con.prepareStatement(sql);
				
				stmt.setString(1,idNegocio_neg.getText());
				//try{
					String sql2 = "DELETE FROM concurso WHERE idNegocio = ?";
					PreparedStatement stmt2 = con.prepareStatement(sql2);
					stmt2.setString(1,idNegocio_neg.getText());
					
				//} catch(Exception e){}
				//try {
					String sql3 = "DELETE FROM finalizado WHERE idNegocio = ?";
					PreparedStatement stmt3 = con.prepareStatement(sql3);
					stmt3.setString(1,idNegocio_neg.getText());
					
				//} catch (Exception e) {}
				//try {
					String sql4 = "DELETE FROM aprovado WHERE idNegocio = ?";
					PreparedStatement stmt4 = con.prepareStatement(sql4);
					stmt4.setString(1,idNegocio_neg.getText());
					
				//} catch (Exception e) {}

				int ret = stmt.executeUpdate();
				stmt2.executeUpdate();
				stmt3.executeUpdate();
				stmt4.executeUpdate();
				
				if(ret>0) 
				{
					System.out.println("Armazenador Cadastrado Com suceso");

					idNegocio_neg.setText("");
					// idEmpresa_neg.setText("");
					// idRepresentante_neg.setText("");
					// valorNegocio_neg.setText("");
					//BuscarNegocio();						
					//JOptionPane.showMessageDialog(this, "Cliente Cadastrado Com suceso");
				} 
				else{
					System.out.println("Falha ao cadastrar Armazenador");
				}
				stmt.close();
				con.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
		}
    }
}