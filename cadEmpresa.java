package src.telas.funcionario_BTN;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

import src.telas.funcionario_BTN.dealsFuncoes.AddEdtRmv.*;

import java.awt.event.*;
import java.sql.*;

public class cadEmpresa implements ActionListener
{
	public		JPanel	mainPanel;

	private		JTable table;
	private		JScrollPane jsscroll;

	private		JPanel	southPanel;

	private		JPanel	btns;

    private     JPanel  formPanel;

	private     JPanel  painelAddOportunidade;
    private    	JPanel  painelEdtOportunidade;
    private     JPanel  painelRmvOportunidade;
	
	private		JButton	btnAddOportunidade;
	private		JButton btnRmvOportunidade;
	private		JButton btnEdtOportunidade;
	private		JButton btnAtualizar;
	
	private		JTextField idEmpresa;
	private		JTextField nomeEmpresa;
	private		JTextField idRepresentante;
	private		JTextField paisEmpresa;
	private		JTextField cidadeEmpresa;
	private		JTextField localEmpresa;
	private		JTextField contactoEmpresa;
	private		JTextField emailEmpresa;

	private		JButton btncadastrarForm;
	private		JButton btnlimparForm;
	
	DefaultTableModel model;

	Add		_add;
	Edt 	_edt;
	Rmv		_rmv;
	public cadEmpresa ()
	{
		MainPanel();
	}

	private void PainelAddOportunidade ()
	{
		painelAddOportunidade       = new JPanel();

		nomeEmpresa					= new JTextField();
		idRepresentante				= new JTextField();
		paisEmpresa					= new JTextField();
		cidadeEmpresa				= new JTextField();
		localEmpresa				= new JTextField();
		emailEmpresa				= new JTextField();
		contactoEmpresa				= new JTextField();

		JLabel NomeEmpresa 			= new JLabel("Nome empresa");
		JLabel IdRepresentante 		= new JLabel("Id do Representante");
		JLabel NacionalidadeEmp 	= new JLabel("Nacionalidade da Empresa");
		JLabel CidadeEmpresa 		= new JLabel("Cidade de Empresa");
		JLabel LocalEmpresa			= new JLabel("LocalEmpresa");
		JLabel EmailEmpresa			= new JLabel("Email empresa");
		JLabel ContactoEmpresa		= new JLabel("Contacto empresa");
		//JLabel NomeNegocio 			= new JLabel("");
		
		painelAddOportunidade.setBackground(Color.pink);
		painelAddOportunidade.setLayout(new GridLayout(8,2));
		painelAddOportunidade.add(NomeEmpresa);
		painelAddOportunidade.add(nomeEmpresa);
		painelAddOportunidade.add(ContactoEmpresa);
		painelAddOportunidade.add(contactoEmpresa);
		painelAddOportunidade.add(EmailEmpresa);
		painelAddOportunidade.add(emailEmpresa);
		painelAddOportunidade.add(NacionalidadeEmp);
		painelAddOportunidade.add(paisEmpresa);
		painelAddOportunidade.add(LocalEmpresa);
		painelAddOportunidade.add(localEmpresa);
		painelAddOportunidade.add(CidadeEmpresa);
		painelAddOportunidade.add(cidadeEmpresa);
		painelAddOportunidade.add(IdRepresentante);
		painelAddOportunidade.add(idRepresentante);
		painelAddOportunidade.add(btnlimparForm);
		painelAddOportunidade.add(btncadastrarForm);
	}

	private void PainelEdtOportunidade ()
	{
		painelEdtOportunidade       = new JPanel();
		
		idEmpresa					= new JTextField();
		nomeEmpresa					= new JTextField();
		idRepresentante				= new JTextField();
		paisEmpresa					= new JTextField();
		cidadeEmpresa				= new JTextField();
		localEmpresa				= new JTextField();
		emailEmpresa				= new JTextField();
		contactoEmpresa				= new JTextField();

		JLabel IdEmpresa 			= new JLabel("Nome empresa");
		JLabel NomeEmpresa 			= new JLabel("Nome empresa");
		JLabel IdRepresentante 		= new JLabel("Id do Representante");
		JLabel NacionalidadeEmp 	= new JLabel("Nacionalidade da Empresa");
		JLabel CidadeEmpresa 		= new JLabel("Cidade de Empresa");
		JLabel LocalEmpresa			= new JLabel("LocalEmpresa");
		JLabel EmailEmpresa			= new JLabel("Email empresa");
		JLabel ContactoEmpresa		= new JLabel("Contacto empresa");
		//JLabel NomeNegocio 			= new JLabel("");
		
		painelEdtOportunidade.setBackground(Color.yellow);
		painelEdtOportunidade.setLayout(new GridLayout(8,2));
		painelEdtOportunidade.add(IdEmpresa);
		painelEdtOportunidade.add(idEmpresa);
		painelEdtOportunidade.add(NomeEmpresa);
		painelEdtOportunidade.add(nomeEmpresa);
		painelEdtOportunidade.add(ContactoEmpresa);
		painelEdtOportunidade.add(contactoEmpresa);
		painelEdtOportunidade.add(EmailEmpresa);
		painelEdtOportunidade.add(emailEmpresa);
		painelEdtOportunidade.add(NacionalidadeEmp);
		painelEdtOportunidade.add(paisEmpresa);
		painelEdtOportunidade.add(LocalEmpresa);
		painelEdtOportunidade.add(localEmpresa);
		painelEdtOportunidade.add(CidadeEmpresa);
		painelEdtOportunidade.add(cidadeEmpresa);
		painelEdtOportunidade.add(IdRepresentante);
		painelEdtOportunidade.add(idRepresentante);
		painelEdtOportunidade.add(btnlimparForm);
		painelEdtOportunidade.add(btncadastrarForm);
	}

	private void PainelRmvOportunidade ()
	{
		painelRmvOportunidade       = new JPanel();

		painelRmvOportunidade.setBackground(Color.cyan);	
	}

    private void FormPanel ()
    {
		PainelAddOportunidade();
		PainelEdtOportunidade();
		PainelRmvOportunidade();
		formPanel			= new JPanel();

        formPanel.setLayout(new CardLayout());
        formPanel.setPreferredSize(new Dimension (200,220));
        formPanel.setBackground(Color.white);
        formPanel.add(_add.painlAdd_emp, "p1");
        formPanel.add(_edt.painlAdd_emp, "p2");
        formPanel.add(painelRmvOportunidade, "p3");
    }
	
	private void BtnsOportunidades ()
	{
		btns 				= new JPanel();
		
		btncadastrarForm 	= new  JButton("Cadastrar");
		btnlimparForm		= new JButton("limpar");

		btnAddOportunidade	= new JButton("Add Oportunidade");
		btnRmvOportunidade	= new JButton("Remover");
		btnEdtOportunidade	= new JButton("Edidar");
		btnAtualizar			= new JButton("Atualizar");


		btnAddOportunidade.setForeground(new Color(0xf9f9f9));
		btnAddOportunidade.setBackground(new Color(0x292929));
		btnAddOportunidade.setFont(new Font("",Font.BOLD,15));
		btnAddOportunidade.setPreferredSize(new Dimension(234,30));
		btnAddOportunidade.setFocusable(false);

		btnEdtOportunidade.setBackground(new Color(0xf9f9f9));
		btnEdtOportunidade.setForeground(new Color(0x494949));
		btnEdtOportunidade.setFont(new Font("",Font.BOLD,15));
		btnEdtOportunidade.setPreferredSize(new Dimension(234,30));
		btnEdtOportunidade.setFocusable(false);

		btnRmvOportunidade.setBackground(new Color(0xf9f9f9));
		btnRmvOportunidade.setForeground(Color.red);
		btnRmvOportunidade.setFont(new Font("",Font.BOLD,15));
		btnRmvOportunidade.setPreferredSize(new Dimension(234,30));
		btnRmvOportunidade.setFocusable(false);

		btnAtualizar.setBackground(new Color(0xf9f9f9));
		btnAtualizar.setForeground(new Color(0x494949));
		btnAtualizar.setFont(new Font("",Font.BOLD,15));
		btnAtualizar.setPreferredSize(new Dimension(234,30));
		btnAtualizar.setFocusable(false);



		btnAddOportunidade.addActionListener(this);
		btnRmvOportunidade.addActionListener(this);
		btnEdtOportunidade.addActionListener(this);
		btnAtualizar.addActionListener(this);
		btncadastrarForm.addActionListener(this);
		btnlimparForm.addActionListener(this);
		
		btns.setBackground(Color.white);

		
		btns.add(btnAddOportunidade);
		btns.add(btnEdtOportunidade);
		btns.add(btnRmvOportunidade);
		btns.add(btnAtualizar);
	}
	
	private void SouthPanel ()
	{
        BtnsOportunidades();
		FormPanel();

        southPanel 		= new JPanel();

        //southPanel.setPreferredSize(new Dimension (200,400));
        southPanel.setBackground(Color.blue);
        southPanel.setLayout(new BorderLayout());
        southPanel.add(btns,BorderLayout.SOUTH);
        southPanel.add(formPanel,BorderLayout.CENTER);
	}

	private void MainTable ()
	{
		model					= new DefaultTableModel(3,3);
		table					= new JTable(model);
		jsscroll 				= new JScrollPane(table);

		model.setColumnCount(0);
		model.setRowCount(0);
		model.addColumn("ID");
		model.addColumn("Nome da empresa");
		model.addColumn("Contacto");
		model.addColumn("Email");
		model.addColumn("Pais");
		model.addColumn("Cidade");
		model.addColumn("local");
		model.addColumn("Id do Representate");

		table.getColumnModel().getColumn(0).setMaxWidth(30);
		table.setForeground(new Color(0x123456));
		table.setFont(new Font("", Font.PLAIN, 15));
		table.setRowHeight(30);

		jsscroll.setPreferredSize(new Dimension(1130, 700));
		jsscroll.setOpaque(false);
		jsscroll.getViewport().setOpaque(false);
	}

	private void BuscarNegocio ()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/javaOportunidade","root","");
			String sql1 = "SELECT idEmpresa,nomeEmpresa,contactoEmpresa,emailEmpresa,paisEmpresa,cidadeEmpresa,localEmpresa,idRepresentante FROM empresa";
			PreparedStatement stmt1 = con1.prepareStatement(sql1);
			ResultSet rs = stmt1.executeQuery();
			
			model.setRowCount(0);

			while (rs.next()) {
				Object[] row = new Object[8];
				for (int i = 0; i < 8; i++) {
					row[i] = rs.getObject(i + 1);
				}
				model.addRow(row);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void MainPanel ()
	{	
		_add	= new Add();
		_edt	= new Edt();
		_rmv	= new Rmv();
		MainTable();
		SouthPanel();
		BuscarNegocio();


		mainPanel		= new JPanel();

		mainPanel.setBackground(Color.white);
		mainPanel.setPreferredSize(new Dimension(20,20));
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(jsscroll,BorderLayout.CENTER);
		mainPanel.add(southPanel,BorderLayout.SOUTH);
		
	}
	
	public void actionPerformed (ActionEvent botoesOportunidade)
	{
		if(botoesOportunidade.getSource() == btnAddOportunidade)
		{
			CardLayout cl = (CardLayout) (formPanel.getLayout());
            cl.show(formPanel, "p1");
			formPanel.setPreferredSize(new Dimension (200,220));

			btnAddOportunidade.setForeground(new Color(0xf9f9f9));
			btnAddOportunidade.setBackground(new Color(0x292929));

			btnEdtOportunidade.setBackground(new Color(0xf9f9f9));
			btnEdtOportunidade.setForeground(new Color(0x494949));
			btnRmvOportunidade.setBackground(new Color(0xf9f9f9));
			btnRmvOportunidade.setForeground(Color.red);
		}
		else if(botoesOportunidade.getSource() == btnEdtOportunidade)
		{
			CardLayout cl = (CardLayout) (formPanel.getLayout());
            cl.show(formPanel, "p2");
			formPanel.setPreferredSize(new Dimension (200,220));

			btnEdtOportunidade.setForeground(new Color(0xf9f9f9));
			btnEdtOportunidade.setBackground(new Color(0x292929));

			btnAddOportunidade.setBackground(new Color(0xf9f9f9));
			btnAddOportunidade.setForeground(new Color(0x00fa00));
			btnRmvOportunidade.setBackground(new Color(0xf9f9f9));
			btnRmvOportunidade.setForeground(Color.red);
        }
		else if(botoesOportunidade.getSource() == btnRmvOportunidade)
		{
			CardLayout cl = (CardLayout) (formPanel.getLayout());
            cl.show(formPanel, "p3");
			formPanel.setPreferredSize(new Dimension (200,220));

			btnRmvOportunidade.setBackground(new Color(0x292929));
			btnRmvOportunidade.setForeground(new Color(0xf9f9f9));

			btnEdtOportunidade.setBackground(new Color(0xf9f9f9));
			btnEdtOportunidade.setForeground(new Color(0x494949));
			btnAddOportunidade.setBackground(new Color(0xf9f9f9));
			btnAddOportunidade.setForeground(new Color(0x00fa00));
        }
		else if(botoesOportunidade.getSource() == btnAtualizar)
		{
			formPanel.setPreferredSize(new Dimension (200,0));
			System.out.println("click!");
			BuscarNegocio();
        }
		else if(botoesOportunidade.getSource() == btncadastrarForm)
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javaOportunidade","root","");
				String sql = "INSERT INTO empresa (nomeEmpresa,paisEmpresa,cidadeEmpresa,localEmpresa,idRepresentante,contactoEmpresa,emailEmpresa) VALUES (?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement stmt = con.prepareStatement(sql);

				stmt.setString(1,nomeEmpresa.getText());
				stmt.setString(2,paisEmpresa.getText());
				stmt.setString(3,cidadeEmpresa.getText());
				stmt.setString(4,localEmpresa.getText());
				stmt.setInt(5,Integer.parseInt(idRepresentante.getText()));
				stmt.setString(6,contactoEmpresa.getText());
				stmt.setString(7,emailEmpresa.getText());

				int ret = stmt.executeUpdate();

				if(ret>0) 
				{
					System.out.println("Armazenador Cadastrado Com suceso");

					nomeEmpresa.setText("");
					paisEmpresa.setText("");
					cidadeEmpresa.setText("");
					idRepresentante.setText("");
					localEmpresa.setText("");
					contactoEmpresa.setText("");
					emailEmpresa.setText("");
					BuscarNegocio();						
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
		else if(botoesOportunidade.getSource() == btnlimparForm)
		{
			nomeEmpresa.setText("");
			paisEmpresa.setText("");
			cidadeEmpresa.setText("");
			idRepresentante.setText("");
			localEmpresa.setText("");	
			contactoEmpresa.setText("");
			emailEmpresa.setText("");
        }
	}
}