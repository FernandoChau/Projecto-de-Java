package src.telas.funcionario_BTN;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.sql.*;

import src.telas.funcionario_BTN.dealsFuncoes.AddEdtRmv.*;

public class criarAtividade implements ActionListener
{
	public		JPanel	mainPanel;

	private		JTable table;
	private		JScrollPane jsscroll;
	private		DefaultTableModel model;

	private		JPanel	southPanel;
	private		JPanel	crudPanel;
    private     JPanel  formPanel;
	
	private		JButton	btnAddAtividade;
	private		JButton btnRmvAtividade;
	private		JButton btnEdtAtividade;
	private		JButton btnAtualizar;
	
	Add 	_add;
	Edt		_edt;
	Rmv		_rmv;

	public criarAtividade ()
	{
		MainPanel();
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

    private void FormPanel ()
    {

		formPanel			= new JPanel();

        formPanel.setLayout(new CardLayout());
        formPanel.setPreferredSize(new Dimension (200,220));
        formPanel.setBackground(Color.red);
        formPanel.add(_add.painlAdd_ativ, "p4");
        formPanel.add(_edt.painlAdd_rep, "p2");
        //formPanel.add(painelRmvOportunidade, "p3");
    }
	
	private void BtnAddAtividade ()
	{
		btnAddAtividade	= new JButton("Criar Atividade");

		btnAddAtividade.setForeground(new Color(0xf9f9f9));
		btnAddAtividade.setBackground(new Color(0x292929));
		btnAddAtividade.setFont(new Font("",Font.BOLD,15));
		btnAddAtividade.setPreferredSize(new Dimension(234,30));
		btnAddAtividade.setFocusable(false);
		
		btnAddAtividade.addActionListener(this);
	}
	
	private void BtnEdtAtividade ()
	{
		btnEdtAtividade	= new JButton("Edidar");

		btnEdtAtividade.setBackground(new Color(0xf9f9f9));
		btnEdtAtividade.setForeground(new Color(0x494949));
		btnEdtAtividade.setFont(new Font("",Font.BOLD,15));
		btnEdtAtividade.setPreferredSize(new Dimension(234,30));
		btnEdtAtividade.setFocusable(false);
		
		btnEdtAtividade.addActionListener(this);
	}
	
	private void BtnRmvAtividade ()
	{
		btnRmvAtividade	= new JButton("Remover");

		btnRmvAtividade.setBackground(new Color(0xf9f9f9));
		btnRmvAtividade.setForeground(Color.red);
		btnRmvAtividade.setFont(new Font("",Font.BOLD,15));
		btnRmvAtividade.setPreferredSize(new Dimension(234,30));
		btnRmvAtividade.setFocusable(false);
		
		btnRmvAtividade.addActionListener(this);
	}
	
	private void BtnAtualizar ()
	{
		btnAtualizar	= new JButton("Atulizar");

		btnAtualizar.setBackground(new Color(0xf9f9f9));
		btnAtualizar.setForeground(new Color(0x494949));
		btnAtualizar.setFont(new Font("",Font.BOLD,15));
		btnAtualizar.setPreferredSize(new Dimension(234,30));
		btnAtualizar.setFocusable(false);
		
		btnAtualizar.addActionListener(this);
	}

	private void CrudPanel ()
	{
		BtnAddAtividade();
		BtnEdtAtividade();
		BtnRmvAtividade();
		BtnAtualizar();

		crudPanel 				= new JPanel();
		
		crudPanel.setBackground(Color.white);
		
		crudPanel.add(btnAddAtividade);
		crudPanel.add(btnEdtAtividade);
		crudPanel.add(btnRmvAtividade);
		crudPanel.add(btnAtualizar);
	}
	
	private void SouthPanel ()
	{
        CrudPanel();
		FormPanel();

        southPanel 		= new JPanel();

        //southPanel.setPreferredSize(new Dimension (200,400));
        southPanel.setBackground(Color.blue);
        southPanel.setLayout(new BorderLayout());
        southPanel.add(crudPanel,BorderLayout.SOUTH);
        southPanel.add(formPanel,BorderLayout.CENTER);
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
		_add			= new Add();
		_edt			= new Edt();
		_rmv			= new Rmv();

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
		if(botoesOportunidade.getSource() == btnAddAtividade)
		{
			CardLayout cl = (CardLayout) (formPanel.getLayout());
            cl.show(formPanel, "p4");
			formPanel.setPreferredSize(new Dimension (200,220));

			btnAddAtividade.setForeground(new Color(0xf9f9f9));
			btnAddAtividade.setBackground(new Color(0x292929));

			btnEdtAtividade.setBackground(new Color(0xf9f9f9));
			btnEdtAtividade.setForeground(new Color(0x494949));
			btnRmvAtividade.setBackground(new Color(0xf9f9f9));
			btnRmvAtividade.setForeground(Color.red);
			
		}
		else if(botoesOportunidade.getSource() == btnEdtAtividade)
		{
			CardLayout cl = (CardLayout) (formPanel.getLayout());
            cl.show(formPanel, "p2");
			formPanel.setPreferredSize(new Dimension (200,220));

			btnEdtAtividade.setForeground(new Color(0xf9f9f9));
			btnEdtAtividade.setBackground(new Color(0x292929));

			btnAddAtividade.setBackground(new Color(0xf9f9f9));
			btnAddAtividade.setForeground(new Color(0x00fa00));
			btnRmvAtividade.setBackground(new Color(0xf9f9f9));
			btnRmvAtividade.setForeground(Color.red);
        }
		else if(botoesOportunidade.getSource() == btnRmvAtividade)
		{
			CardLayout cl = (CardLayout) (formPanel.getLayout());
            cl.show(formPanel, "p3");
			formPanel.setPreferredSize(new Dimension (200,220));

			btnRmvAtividade.setBackground(new Color(0x292929));
			btnRmvAtividade.setForeground(new Color(0xf9f9f9));

			btnEdtAtividade.setBackground(new Color(0xf9f9f9));
			btnEdtAtividade.setForeground(new Color(0x494949));
			btnAddAtividade.setBackground(new Color(0xf9f9f9));
			btnAddAtividade.setForeground(new Color(0x00fa00));
        }
		else if(botoesOportunidade.getSource() == btnAtualizar)
		{
			formPanel.setPreferredSize(new Dimension (200,0));
			System.out.println("click!");
			BuscarNegocio();
        }
	}
}