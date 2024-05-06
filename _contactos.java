package src.telas.funcionario_BTN.dealsFuncoes;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

import src.telas.funcionario_BTN.dealsFuncoes.AddEdtRmv.*;

import java.awt.event.*;
import java.sql.*;

public class _contactos implements ActionListener
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
	private		JButton btnOcultar;
	
	private		JTextField nomeNegocio;
	private		JTextField idRepresentante;
	private		JTextField idEmpresa;
	private		JTextField idFuncionario;
	private		JTextField valorNegocio;

	private		JButton btncadastrarForm;
	private		JButton btnlimparForm;
	
	int rollFuncionario;

	DefaultTableModel model;

	Add		_add;
	Edt 	_edt;
	Rmv		_rmv;
	funcao		_rmv1;
	public _contactos (int roll)
	{
		MainPanel(roll);
	}

	private void PainelAddOportunidade ()
	{
		painelAddOportunidade       = new JPanel();

		nomeNegocio					= new JTextField();
		idRepresentante				= new JTextField();
		idEmpresa					= new JTextField();
		valorNegocio				= new JTextField();

		JLabel NomeNegocio 			= new JLabel("Designacao do Negocio");
		JLabel IdRepresentante 		= new JLabel("Id do Representante");
		JLabel IdEmpresa 			= new JLabel("Id da Empresa");
		JLabel ValorNegocio			= new JLabel("Valor do Negocio");

		
		painelAddOportunidade.setBackground(Color.pink);
		painelAddOportunidade.setLayout(new GridLayout(5,2));
		painelAddOportunidade.add(NomeNegocio);
		painelAddOportunidade.add(nomeNegocio);
		painelAddOportunidade.add(ValorNegocio);
		painelAddOportunidade.add(valorNegocio);
		painelAddOportunidade.add(IdRepresentante);
		painelAddOportunidade.add(idRepresentante);
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
        formPanel.setPreferredSize(new Dimension (200,50));
        formPanel.setBackground(Color.red);
        formPanel.add(_add.painlAdd_contacto, "p1");
        //formPanel.add(_edt.painlAdd_neg, "p2");
        formPanel.add(_rmv1.painlAdd_contacto, "p3");
    }
	
	private void BtnsOportunidades ()
	{
		btns 				= new JPanel();
		
		btncadastrarForm 	= new  JButton("Cadastrar");
		btnlimparForm		= new JButton("limpar");

		btnAddOportunidade	= new JButton("Add Oportunidade");
		btnRmvOportunidade	= new JButton("Remover");
		btnEdtOportunidade	= new JButton("Edidar");
		btnOcultar			= new JButton("Atualizar");
		
		btnAddOportunidade.addActionListener(this);
		btnRmvOportunidade.addActionListener(this);
		btnEdtOportunidade.addActionListener(this);	
		btnOcultar.addActionListener(this);

		btncadastrarForm.addActionListener(this);
		btnlimparForm.addActionListener(this);
		
		btns.setBackground(Color.white);

		btnAddOportunidade.setForeground(new Color(0xf9f9f9));
		btnAddOportunidade.setBackground(new Color(0x292929));
		btnAddOportunidade.setFont(new Font("",Font.BOLD,15));
		btnAddOportunidade.setPreferredSize(new Dimension(234,50));
		btnAddOportunidade.setFocusable(false);
		
		btnRmvOportunidade.setBackground(new Color(0xf9f9f9));
		btnRmvOportunidade.setForeground(Color.red);
		btnRmvOportunidade.setFont(new Font("",Font.BOLD,15));
		btnRmvOportunidade.setPreferredSize(new Dimension(234,50));
		btnRmvOportunidade.setFocusable(false);
		
		btnOcultar.setBackground(new Color(0xf9f9f9));
		btnOcultar.setForeground(new Color(0x494949));
		btnOcultar.setFont(new Font("",Font.BOLD,15));
		btnOcultar.setPreferredSize(new Dimension(234,50));
		btnOcultar.setFocusable(false);

		btnAddOportunidade.setPreferredSize(new Dimension(200,30));
		btnRmvOportunidade.setPreferredSize(new Dimension(200,30));
		btnEdtOportunidade.setPreferredSize(new Dimension(200,30));
		btnOcultar.setPreferredSize(new Dimension(150,30));
		
		btns.add(btnAddOportunidade);
		//btns.add(btnEdtOportunidade);
		btns.add(btnRmvOportunidade);
		btns.add(btnOcultar);
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
		model.addColumn("Titulo");
		model.addColumn("Valor");
		model.addColumn("Nome da empresa");
		model.addColumn("Empresa Contacto");

		table.getColumnModel().getColumn(0).setMaxWidth(30);
		table.setForeground(new Color(0x000000));
		table.setFont(new Font("", Font.PLAIN, 15));
		table.setRowHeight(30);
		table.setBackground(new Color(0xfdf7ed));

		jsscroll.setPreferredSize(new Dimension(1130, 700));
		jsscroll.setOpaque(false);
		jsscroll.getViewport().setOpaque(false);
	}

	private void BuscarNegocio ()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/javaOportunidade","root","");
			String sql1 = "SELECT negocio.idNegocio,negocio.designacaoNegocio,negocio.valorNegocio,empresa.nomeEmpresa,empresa.contactoEmpresa FROM aprovado c INNER JOIN (negocio INNER JOIN empresa ON negocio.idEmpresa = empresa.idEmpresa) ON c.idNegocio = negocio.idNegocio;";
			PreparedStatement stmt1 = con1.prepareStatement(sql1);
			ResultSet rs = stmt1.executeQuery();
			
			model.setRowCount(0);

			while (rs.next()) {
				Object[] row = new Object[5];
				for (int i = 0; i < 5; i++) {
					row[i] = rs.getObject(i + 1);
				}
				model.addRow(row);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void MainPanel (int roll)
	{	
		_add				= new Add();
		_edt				= new Edt();
		_rmv				= new Rmv();
		_rmv1				= new funcao();

		rollFuncionario		= roll;
		
		MainTable();
		SouthPanel();
		BuscarNegocio();

		mainPanel		= new JPanel();

		mainPanel.setBackground(new Color(0xfdf7ed));
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
			formPanel.setPreferredSize(new Dimension (200,50));
			btnAddOportunidade.setForeground(new Color(0xf9f9f9));
			btnAddOportunidade.setBackground(new Color(0x292929));
		
			btnRmvOportunidade.setBackground(new Color(0xf9f9f9));
			btnRmvOportunidade.setForeground(Color.red);
		}
		else if(botoesOportunidade.getSource() == btnEdtOportunidade)
		{
			CardLayout cl = (CardLayout) (formPanel.getLayout());
            cl.show(formPanel, "p2");
			formPanel.setPreferredSize(new Dimension (200,50));
        }
		else if(botoesOportunidade.getSource() == btnRmvOportunidade)
		{
			CardLayout cl = (CardLayout) (formPanel.getLayout());
            cl.show(formPanel, "p3");
			formPanel.setPreferredSize(new Dimension (200,50));

			btnRmvOportunidade.setForeground(new Color(0xf9f9f9));
			btnRmvOportunidade.setBackground(new Color(0x292929));
        
			btnAddOportunidade.setBackground(new Color(0xf9f9f9));
			btnAddOportunidade.setForeground(new Color(0x05ab1e));
        }
		else if(botoesOportunidade.getSource() == btnOcultar)
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
				String sql = "INSERT INTO negocio (nomeNegocio,idRepresentante,idEmpresa,idFuncionario,valorNegocio) VALUES (?, ?, ?, ?, ?)";
				PreparedStatement stmt = con.prepareStatement(sql);

				stmt.setString(1,nomeNegocio.getText());
				stmt.setString(2,idRepresentante.getText());
				stmt.setString(3,idEmpresa.getText());
				stmt.setString(4,idFuncionario.getText());
				stmt.setString(5,valorNegocio.getText());

				int ret = stmt.executeUpdate();

				if(ret>0) 
				{
					System.out.println("Armazenador Cadastrado Com suceso");

					nomeNegocio.setText("");
					idEmpresa.setText("");
					idFuncionario.setText("");
					idRepresentante.setText("");
					valorNegocio.setText("");
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
			nomeNegocio.setText("");
			idEmpresa.setText("");
			idFuncionario.setText("");
			idRepresentante.setText("");
			valorNegocio.setText("");	
        }
	}
}
