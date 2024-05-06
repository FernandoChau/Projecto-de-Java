package src.telas.funcionario_BTN.dealsFuncoes.AddEdtRmv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class funcao implements ActionListener
{
    
    public JPanel painlAdd_contacto;
    public JPanel painlAdd_finalizado;
    public JPanel painlAdd_proposta;
    public JPanel painlAdd_oportunidade;
    public JPanel painlAdd_rep;
    public JPanel painlAdd_emp;
    public JPanel painlAdd_neg;

    private		JTextField nomeRepresentante_rep;
    private		JTextField apelidoRepresentante_rep;
    private		JTextField idEmpresa_rep;
    private		JTextField emailRepresentante_rep;
    //private		JTextField dataNascimento_rep;
    private		JTextField paisRepresentante_rep;
    private		JTextField cidadeRepresentante_rep;
    private		JTextField localRepresentante_rep;
    private		JTextField contactoRepresentante_rep;

    //private		JTextField idEmpresa_emp;
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
	
    public funcao()
    {
        painlAdd_rep    = new JPanel();
        painlAdd_emp    = new JPanel();
        painlAdd_neg    = new JPanel();
		painlAdd_oportunidade	= new JPanel();
		painlAdd_proposta		= new JPanel();
		painlAdd_finalizado		= new JPanel();
		painlAdd_contacto		= new JPanel();

        mainPanel();
    }

    private void btnsProposta ()
    {
        btnAddForm_Proposta   = new JButton("Remover");
        btnlimparForm_Proposta      = new JButton("Limpar");

		btnAddForm_Proposta.setForeground(new Color(0xffffff));
		btnAddForm_Proposta.setBackground(new Color(0xe81d1d));//btn vermelho
		btnAddForm_Proposta.setFont(new Font("",Font.BOLD,15));
		btnAddForm_Proposta.setPreferredSize(new Dimension(50,50));

        btnAddForm_Proposta.addActionListener(this);
        btnlimparForm_Proposta.addActionListener(this);
    }
    private void btnsContacto ()
    {
        btnAddForm_Contacto   = new JButton("Remover");
        btnlimparForm_Contacto      = new JButton("Limpar");

		btnAddForm_Contacto.setForeground(new Color(0xffffff));
		btnAddForm_Contacto.setBackground(new Color(0xe81d1d));//btn vermelho
		btnAddForm_Contacto.setFont(new Font("",Font.BOLD,15));
		btnAddForm_Contacto.setPreferredSize(new Dimension(50,50));

        btnAddForm_Contacto.addActionListener(this);
        btnlimparForm_Contacto.addActionListener(this);
    }
    private void btnsFinalizado ()
    {
        btnAddForm_Finalizado   = new JButton("Remover");
        btnlimparForm_Finalizado      = new JButton("Limpar");

		btnAddForm_Finalizado.setForeground(new Color(0xffffff));
		btnAddForm_Finalizado.setBackground(new Color(0xe81d1d));//btn vermelho
		btnAddForm_Finalizado.setFont(new Font("",Font.BOLD,15));
		btnAddForm_Finalizado.setPreferredSize(new Dimension(50,50));

        btnAddForm_Finalizado.addActionListener(this);
        btnlimparForm_Finalizado.addActionListener(this);
    }
    private void btnsOportunidades ()
    {
        btnAddForm_Oportunidade   = new JButton("Remover");
        btnlimparForm_Oportunidade      = new JButton("Limpar");

		btnAddForm_Oportunidade.setForeground(new Color(0xffffff));
		btnAddForm_Oportunidade.setBackground(new Color(0xe81d1d));//btn vermelho
		btnAddForm_Oportunidade.setFont(new Font("",Font.BOLD,15));
		btnAddForm_Oportunidade.setPreferredSize(new Dimension(50,50));

        btnAddForm_Oportunidade.addActionListener(this);
        btnlimparForm_Oportunidade.addActionListener(this);
    }
    
    private void btnsRepresentante ()
    {
        btncadastrarForm_rep   = new JButton("Cadastrar");
        btnlimparForm_rep      = new JButton("Limpar");

        btncadastrarForm_rep.addActionListener(this);
        btnlimparForm_rep.addActionListener(this);
    }
    
    private void btnsEmpresa ()
    {
        btncadastrarForm_emp   = new JButton("Cadastrar");
        btnlimparForm_emp      = new JButton("Limpar");
        
        btncadastrarForm_emp.addActionListener(this);
        btnlimparForm_emp.addActionListener(this);
    }
    
    private void btnsNegocio ()
    {

        btncadastrarForm_neg   = new JButton("Cadastrar");
        btnlimparForm_neg      = new JButton("Limpar");

        btncadastrarForm_neg.addActionListener(this);
        btnlimparForm_neg.addActionListener(this);
    }

    private void inicializarProposta ()
    {
        btnsProposta();

        idNegocio_neg					= new JTextField();

        JLabel IdNegocio_neg 			= new JLabel("Id do negócio a remover: ");
		IdNegocio_neg.setFont(new Font("Calibre",Font.PLAIN,20));
		IdNegocio_neg.setHorizontalAlignment(JLabel.CENTER);

		idNegocio_neg.setBorder(null);
		idNegocio_neg.setBackground(new Color(0xc9c9c9));
		idNegocio_neg.setPreferredSize(new Dimension(50,50));
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

        JLabel IdNegocio_neg 			= new JLabel("Id do negócio a remover: ");
		IdNegocio_neg.setFont(new Font("Calibre",Font.PLAIN,20));
		IdNegocio_neg.setHorizontalAlignment(JLabel.CENTER);

		idNegocio_neg1.setBorder(null);
		idNegocio_neg1.setBackground(new Color(0xc9c9c9));
		idNegocio_neg1.setPreferredSize(new Dimension(50,50));
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

        JLabel IdNegocio_neg 			= new JLabel("Id do negócio a remover: ");
		IdNegocio_neg.setFont(new Font("Calibre",Font.PLAIN,20));
		IdNegocio_neg.setHorizontalAlignment(JLabel.CENTER);

		idNegocio_neg2.setBorder(null);
		idNegocio_neg2.setBackground(new Color(0xc9c9c9));
		idNegocio_neg2.setPreferredSize(new Dimension(50,50));
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

        JLabel IdNegocio_neg 			= new JLabel("Id do negócio a remover: ");
		IdNegocio_neg.setFont(new Font("Calibre",Font.PLAIN,20));
		IdNegocio_neg.setHorizontalAlignment(JLabel.CENTER);

		idNegocio_neg3.setBorder(null);
		idNegocio_neg3.setBackground(new Color(0xc9c9c9));
		idNegocio_neg3.setPreferredSize(new Dimension(50,50));
		idNegocio_neg3.setFont(new Font("",Font.PLAIN,17));
		
        painlAdd_oportunidade.setBackground(new Color(0xffffff));
		painlAdd_oportunidade.setLayout(new GridLayout(1, 3, 5, 5));
		painlAdd_oportunidade.add(IdNegocio_neg);
		painlAdd_oportunidade.add(idNegocio_neg3);
		painlAdd_oportunidade.add(btnAddForm_Oportunidade);
		
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

        JLabel NomeRepresentante_rep 		    = new JLabel("Nome do Representante");
		JLabel ApelidoRepresentante_rep 	    = new JLabel("Apelido");
		JLabel IdEmpresa_rep 				    = new JLabel("Id da Empresa");
		JLabel EmailRepresentante_rep 		    = new JLabel("Email do");
		JLabel NacionalidadeRepresentante_rep   = new JLabel("Nacionalidade");
		JLabel CidadeRepresentante_rep		    = new JLabel("Cidade");
		JLabel ContactoRepresentante_rep	    = new JLabel("Contacto");
		JLabel LocalRepresentante_rep		    = new JLabel("localidade");
    
        painlAdd_rep.setPreferredSize(new Dimension(200,200));
        painlAdd_rep.setBackground(Color.red);
		painlAdd_rep.setLayout(new GridLayout(9,2));
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
    
        painlAdd_emp.setBackground(Color.red);
		painlAdd_emp.setLayout(new GridLayout(5,2));
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
    
        painlAdd_neg.setBackground(Color.red);
		painlAdd_neg.setLayout(new GridLayout(5,2));
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

    public void mainPanel ()
    {
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

				String sql = "DELETE FROM concurso WHERE idNegocio = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1,idNegocio_neg3.getText());
				int ret = stmt.executeUpdate();
				

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
				
				String sql = "DELETE FROM aprovado WHERE idNegocio = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1,idNegocio_neg1.getText());
				int ret = stmt.executeUpdate();

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
				
				String sql = "DELETE FROM finalizado WHERE idNegocio = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1,idNegocio_neg2.getText());
				int ret = stmt.executeUpdate();

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
				
				String sql = "DELETE FROM proposta WHERE idNegocio = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1,idNegocio_neg.getText());
				int ret = stmt.executeUpdate();
				
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