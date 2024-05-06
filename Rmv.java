package src.telas.funcionario_BTN.dealsFuncoes.AddEdtRmv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Rmv implements ActionListener
{
    
    public JPanel painlAdd_rep;
    public JPanel painlAdd_emp;
    public JPanel painlAdd_neg;

    private		JTextField idRepresentante_rep;
    private		JTextField nomeRepresentante_rep;
    private		JTextField apelidoRepresentante_rep;
    private		JTextField idEmpresa_rep;
    private		JTextField emailRepresentante_rep;
    //private		JTextField dataNascimento_rep;
    private		JTextField paisRepresentante_rep;
    private		JTextField cidadeRepresentante_rep;
    private		JTextField localRepresentante_rep;
    private		JTextField contactoRepresentante_rep;

    private		JTextField idEmpresa_emp;
    private		JTextField nomeEmpresa_emp;
    private		JTextField idRepresentante_emp;
    private		JTextField paisEmpresa_emp;
    private		JTextField cidadeEmpresa_emp;
    private		JTextField localEmpresa_emp;
    private		JTextField contactoEmpresa_emp;
    private		JTextField emailEmpresa_emp;
    
    private		JTextField idNegocio_neg;
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

    public Rmv()
    {
        painlAdd_rep    = new JPanel();
        painlAdd_emp    = new JPanel();
        painlAdd_neg    = new JPanel();

        mainPanel();
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

    private void inicializarRepresentante ()
    {
        btnsRepresentante();

        idRepresentante_rep    			= new JTextField();
        nomeRepresentante_rep			= new JTextField();
		apelidoRepresentante_rep		= new JTextField();
		idEmpresa_rep					= new JTextField();
		emailRepresentante_rep			= new JTextField();
		paisRepresentante_rep 			= new JTextField();
		cidadeRepresentante_rep 		= new JTextField();
		localRepresentante_rep	 		= new JTextField();
		contactoRepresentante_rep	 	= new JTextField();

        JLabel IdRepresentante_rep 		        = new JLabel("Id do Representante");
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
		painlAdd_rep.setLayout(new GridLayout(10,2));
		painlAdd_rep.add(IdRepresentante_rep);
		painlAdd_rep.add(idRepresentante_rep);
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

        idEmpresa_emp					= new JTextField();
        nomeEmpresa_emp					= new JTextField();
		idRepresentante_emp				= new JTextField();
		paisEmpresa_emp					= new JTextField();
		cidadeEmpresa_emp				= new JTextField();
		localEmpresa_emp				= new JTextField();
		emailEmpresa_emp				= new JTextField();
		contactoEmpresa_emp				= new JTextField();

        JLabel IdEmpresa_emp 			= new JLabel("ID empresa");
        JLabel NomeEmpresa_emp 			= new JLabel("Nome empresa");
		JLabel IdRepresentante_emp 		= new JLabel("Id do Representante");
		JLabel NacionalidadeEmp_emp 	= new JLabel("Nacionalidade da Empresa");
		JLabel CidadeEmpresa_emp 		= new JLabel("Cidade de Empresa");
		JLabel LocalEmpresa_emp			= new JLabel("LocalEmpresa");
		JLabel EmailEmpresa_emp			= new JLabel("Email empresa");
		JLabel ContactoEmpresa_emp		= new JLabel("Contacto empresa");
    
        painlAdd_emp.setBackground(Color.red);
		painlAdd_emp.setLayout(new GridLayout(6,2));
        painlAdd_emp.add(IdEmpresa_emp);
        painlAdd_emp.add(idEmpresa_emp);
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

        idNegocio_neg					= new JTextField();
        nomeNegocio_neg					= new JTextField();
		idRepresentante_neg				= new JTextField();
		idEmpresa_neg					= new JTextField();
		valorNegocio_neg				= new JTextField();

        JLabel IdNegocio_neg 			= new JLabel("Id Negocio");
        JLabel NomeNegocio_neg 			= new JLabel("Designacao do Negocio");
		JLabel IdRepresentante_neg 		= new JLabel("Id do Representante");
		JLabel IdEmpresa_neg 			= new JLabel("Id da Empresa");
		JLabel ValorNegocio_neg			= new JLabel("Valor do Negocio");
    
        painlAdd_neg.setBackground(Color.red);
		painlAdd_neg.setLayout(new GridLayout(6,2));
		painlAdd_neg.add(IdNegocio_neg);
		painlAdd_neg.add(idNegocio_neg);
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
        
    }

    public void actionPerformed (ActionEvent ae)
    {
        if (ae.getSource() == btncadastrarForm_rep) 
        {
            try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaOportunidade","root","");
				//String sql = "INSERT INTO representante (nomeRepresentante,apelidoRepresentante,contactoRepresentante,emailRepresentante,paisRepresentante,cidadeRepresentante,localRepresentante) VALUES (?, ?, ?, ?, ?, ?, ?)";
				//String sql = "UPDATE empresa SET nomeEmpresa = ?, paisEmpresa = ?, cidadeEmpresa = ?, localEmpresa = ?, contactoEmpresa = ?, emailEmpresa = ?, idRepresentante = ? " + "WHERE idEmpresa = ?";
				String sql = "UPDATE representante SET nomeRepresentante = ?, apelidoRepresentante = ?, contactoRepresentante = ?, emailRepresentante = ?, paisRepresentante = ?, cidadeRepresentante = ?, localRepresentante = ? " + "WHERE idRepresentante = ?";
				PreparedStatement stmt = con.prepareStatement(sql);

				stmt.setString(1,nomeRepresentante_rep.getText());
				stmt.setString(2,apelidoRepresentante_rep.getText());
				stmt.setString(3,contactoRepresentante_rep.getText());
				stmt.setString(4,emailRepresentante_rep.getText());
				stmt.setString(5,paisRepresentante_rep.getText());
				stmt.setString(6,cidadeRepresentante_rep.getText());
				stmt.setString(7,localRepresentante_rep.getText());
				stmt.setString(8,idRepresentante_rep.getText());
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
					idRepresentante_rep.setText("");
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
            idRepresentante_rep.setText("");
        }
        else if (ae.getSource() == btncadastrarForm_emp)
        {
            try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaOportunidade","root","");
				//String sql = "INSERT INTO empresa (nomeEmpresa,paisEmpresa,cidadeEmpresa,localEmpresa,idRepresentante,contactoEmpresa,emailEmpresa) VALUES (?, ?, ?, ?, ?, ?, ?)";
				String sql = "UPDATE empresa SET nomeEmpresa = ?, paisEmpresa = ?, cidadeEmpresa = ?, localEmpresa = ?, idRepresentante = ?, contactoEmpresa = ?, emailEmpresa = ? " + "WHERE idEmpresa = ?";
                PreparedStatement stmt = con.prepareStatement(sql);

				stmt.setString(1,nomeEmpresa_emp.getText());
				stmt.setString(2,paisEmpresa_emp.getText());
				stmt.setString(3,cidadeEmpresa_emp.getText());
				stmt.setString(4,localEmpresa_emp.getText());
				stmt.setInt(5,Integer.parseInt(idRepresentante_emp.getText()));
				stmt.setString(6,contactoEmpresa_emp.getText());
				stmt.setString(7,emailEmpresa_emp.getText());
				stmt.setString(8,idEmpresa_emp.getText());

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
					idEmpresa_emp.setText("");
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
            idEmpresa_emp.setText("");
        }
        else if (ae.getSource() == btncadastrarForm_neg)
        {
            try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaOportunidade","root","");
				//String sql = "INSERT INTO negocio (designacaoNegocio,idRepresentante,idEmpresa,valorNegocio) VALUES (?, ?, ?, ?)";
                String sql = "UPDATE negocio SET designacaoNegocio = ?, idRepresentante = ?, idEmpresa = ?, valorNegocio = ? " + "WHERE idNegocio = ?";
                PreparedStatement stmt = con.prepareStatement(sql);

				stmt.setString(1,nomeNegocio_neg.getText());
				stmt.setString(2,idRepresentante_neg.getText());
				stmt.setString(3,idEmpresa_neg.getText());
				stmt.setString(4,valorNegocio_neg.getText());
				stmt.setString(4,idNegocio_neg.getText());

				int ret = stmt.executeUpdate();

				if(ret>0) 
				{
					System.out.println("Armazenador Cadastrado Com suceso");

					nomeNegocio_neg.setText("");
					idEmpresa_neg.setText("");
					idRepresentante_neg.setText("");
					valorNegocio_neg.setText("");
					idNegocio_neg.setText("");
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
            idNegocio_neg.setText("");
        }
    }
}
