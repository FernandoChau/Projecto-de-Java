package src.telas.funcionario_BTN;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.sql.*;

import src.telas.funcionario_BTN.dealsFuncoes.AddEdtRmv.*;

public class cadRepresentante implements ActionListener
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
	
	private		JTextField nomeRepresentante;
	private		JTextField apelidoRepresentante;
	private		JTextField idEmpresa;
	private		JTextField emailRepresentante;
	private		JTextField dataNascimento;
	private		JTextField paisRepresentante;
	private		JTextField cidadeRepresentante;
	private		JTextField localRepresentante;
	private		JTextField contactoRepresentante;
	

	private		JButton btncadastrarForm;
	private		JButton btnlimparForm;
	
	DefaultTableModel model;

	Add 	_add;
	Edt		_edt;
	Rmv		_rmv;
	public cadRepresentante ()
	{
		_add			= new Add();
		_edt			= new Edt();
		_rmv			= new Rmv();
		MainPanel();
	}

	private void PainelAddOportunidade ()
	{
		painelAddOportunidade       = new JPanel();

		nomeRepresentante			= new JTextField();
		apelidoRepresentante		= new JTextField();
		idEmpresa					= new JTextField();
		emailRepresentante			= new JTextField();
		paisRepresentante 			= new JTextField();
		cidadeRepresentante 		= new JTextField();
		localRepresentante	 		= new JTextField();
		contactoRepresentante	 	= new JTextField();


		JLabel NomeRepresentante 		= new JLabel("Nome do Representante");
		JLabel ApelidoRepresentante 	= new JLabel("Apelido");
		JLabel IdEmpresa 				= new JLabel("Id da Empresa");
		JLabel EmailRepresentante 		= new JLabel("Email do");
		JLabel NacionalidadeRepresentante= new JLabel("Nacionalidade");
		JLabel CidadeRepresentante		= new JLabel("Cidade");
		JLabel ContactoRepresentante	= new JLabel("Contacto");
		JLabel LocalRepresentante		= new JLabel("localidade");
		//JLabel NomeNegocio 			= new JLabel("");
		
		painelAddOportunidade.setBackground(Color.pink);
		painelAddOportunidade.setLayout(new GridLayout(9,2));
		painelAddOportunidade.add(NomeRepresentante);
		painelAddOportunidade.add(nomeRepresentante);
		painelAddOportunidade.add(ApelidoRepresentante);
		painelAddOportunidade.add(apelidoRepresentante);
		painelAddOportunidade.add(EmailRepresentante);
		painelAddOportunidade.add(emailRepresentante);
		painelAddOportunidade.add(ContactoRepresentante);
		painelAddOportunidade.add(contactoRepresentante);
		painelAddOportunidade.add(NacionalidadeRepresentante);
		painelAddOportunidade.add(paisRepresentante);
		painelAddOportunidade.add(CidadeRepresentante);
		painelAddOportunidade.add(cidadeRepresentante);
		painelAddOportunidade.add(LocalRepresentante);
		painelAddOportunidade.add(localRepresentante);
		painelAddOportunidade.add(IdEmpresa);
		painelAddOportunidade.add(idEmpresa);
		painelAddOportunidade.add(btnlimparForm);
		painelAddOportunidade.add(btncadastrarForm);
	}

	private void PainelEdtOportunidade ()
	{
		painelEdtOportunidade       = new JPanel();

		painelEdtOportunidade.setBackground(Color.yellow);	
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
        formPanel.add(_add.painlAdd_rep, "p4");
        formPanel.add(_edt.painlAdd_rep, "p2");
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
		btnAtualizar			= new JButton("Atulizar");
		

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
		model.addColumn("Nome");
		model.addColumn("Apelido");
		model.addColumn("email representante");
		model.addColumn("contacto representante");
		model.addColumn("Pais");
		model.addColumn("Cidade");
		model.addColumn("Localidade");
		model.addColumn("id empresa");

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
			String sql1 = "SELECT * FROM representante";
			PreparedStatement stmt1 = con1.prepareStatement(sql1);
			ResultSet rs = stmt1.executeQuery();
			
			model.setRowCount(0);

			while (rs.next()) {
				Object[] row = new Object[9];
				for (int i = 0; i < 9; i++) {
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
            cl.show(formPanel, "p4");
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
				String sql = "INSERT INTO representante (nomeRepresentante,apelidoRepresentante,contactoRepresentante,emailRepresentante,paisRepresentante,cidadeRepresentante,localRepresentante) VALUES (?, ?, ?, ?, ?, ?, ?)";
				PreparedStatement stmt = con.prepareStatement(sql);

				stmt.setString(1,nomeRepresentante.getText());
				stmt.setString(2,apelidoRepresentante.getText());
				stmt.setString(3,contactoRepresentante.getText());
				stmt.setString(4,emailRepresentante.getText());
				stmt.setString(5,paisRepresentante.getText());
				stmt.setString(6,cidadeRepresentante.getText());
				stmt.setString(7,localRepresentante.getText());
				//stmt.setString(8,idEmpresa.getText());

				int ret = stmt.executeUpdate();

				if(ret>0) 
				{
					System.out.println("Armazenador Cadastrado Com suceso");

					nomeRepresentante.setText("");
					idEmpresa.setText("");
					emailRepresentante.setText("");
					apelidoRepresentante.setText("");
					localRepresentante.setText("");
					contactoRepresentante.setText("");
					paisRepresentante.setText("");
					cidadeRepresentante.setText("");
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
			nomeRepresentante.setText("");
			idEmpresa.setText("");
			emailRepresentante.setText("");
			apelidoRepresentante.setText("");
			localRepresentante.setText("");
			contactoRepresentante.setText("");
			paisRepresentante.setText("");
			cidadeRepresentante.setText("");	
        }
	}
}