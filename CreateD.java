import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class CreateD extends JFrame implements ActionListener
{
	
	private JLabel idLabel,reportLabel;
	
	private JTextField idTF,reportTF;
	private JButton buttonBack,buttonCreate;
	private JRadioButton r1,r2,r3,r4,r5;
	private ButtonGroup bg1;
	private JPanel panel;
	public CreateD(String msg)
	{
		super("Create report");
		
		this.setSize(1000, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		r1 = new JRadioButton("Drug Trafficking");
		r1.setBounds(400, 50, 200, 30);
		panel.add(r1);
		
		r2 = new JRadioButton("Gun Running");
		r2.setBounds(400, 100, 200, 30);
		panel.add(r2);
		
		r3 = new JRadioButton("Money Laundering");
		r3.setBounds(400, 150, 200, 30);
		panel.add(r3);
		
		r4 = new JRadioButton("Extortion");
		r4.setBounds(400, 200, 200, 30);
		panel.add(r4);
		
		r5 = new JRadioButton("Murder for hire");
		r5.setBounds(400, 250, 200, 30);
		panel.add(r5);
		
		bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);
		bg1.add(r4);
		bg1.add(r5);
		
		idLabel = new JLabel("Enter ID : ");
		idLabel.setBounds(100,50,150,30);
		panel.add(idLabel);
		
		idTF = new JTextField();
		idTF.setBounds(260,50,100,30);
		panel.add(idTF);
		
		reportLabel = new JLabel("Enter report : ");
		reportLabel.setBounds(100,100,150,30);
		panel.add(reportLabel);
		
		reportTF = new JTextField();
		reportTF.setBounds(260,100,100,30);
		panel.add(reportTF);
		
		buttonBack = new JButton("Back");
		buttonBack.setBounds(100, 600, 80, 30);
		buttonBack.addActionListener(this);
		panel.add(buttonBack);
		
		buttonCreate = new JButton("Create");
		buttonCreate.setBounds(190, 600, 80, 30);
		buttonCreate.addActionListener(this);
		panel.add(buttonCreate);
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String buttonClicked = ae.getActionCommand();
		
		if(buttonClicked.equals(buttonBack.getText()))
		{
			dispose();
		}
		else if(buttonClicked.equals(buttonCreate.getText()))
		{
			if(r1.isSelected()){
				updateInDB();
			}
			else if(r2.isSelected()){
				updateInDB2();
			}
			else if(r3.isSelected()){
				updateInDB3();
			}
			else if(r4.isSelected()){
				updateInDB4();
			}
			else if(r5.isSelected()){
				updateInDB5();
			}
		}
		
	}
	public void updateInDB()
	{
		String newreport="";
		
		String query = "SELECT * FROM `drugtrafficking` WHERE 1;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop1","root","");
			System.out.println("connection done");//connection with database established
			st = con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(query);//getting result
			System.out.println("results received");
					
			while(rs.next())
			{
                String ID = rs.getString("ID");
                
				
				if(ID.equals(idTF.getText())){
					
					System.out.println("Created");
					
					System.out.println("Start Created");
						
					newreport=reportTF.getText();
					System.out.println("End Created");
					
				}
				else{
					System.out.println("Invalid User");
				}
				
			}
		}
		catch(Exception e){}
		try
		{
			System.out.println(".");
			
			query="Update drugtrafficking SET MedicalReport='"+newreport+"' where ID="+idTF.getText();
			
			st.executeUpdate(query);
			
		
			st.close();
			con.close();
			rs.close();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	
	public void updateInDB2()
	{
		String newreport="";
		
		String query = "SELECT * FROM `gunrunning` WHERE 1;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop1","root","");
			System.out.println("connection done");//connection with database established
			st = con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(query);//getting result
			System.out.println("results received");
					
			while(rs.next())
			{
                String ID = rs.getString("ID");
                
				
				if(ID.equals(idTF.getText())){
					
					System.out.println("Created");
					
					System.out.println("Start Created");
						
					newreport=reportTF.getText();
					System.out.println("End Created");
					
				}
				else{
					System.out.println("Invalid User");
				}
				
			}
		}
		catch(Exception e){}
		try
		{
			System.out.println(".");
			
			query="Update gunrunning SET MedicalReport='"+newreport+"' where ID="+idTF.getText();
			
			st.executeUpdate(query);
			
		
			st.close();
			con.close();
			rs.close();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	
	public void updateInDB3()
	{
		String newreport="";
		
		String query = "SELECT * FROM `moneylaundering` WHERE 1;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop1","root","");
			System.out.println("connection done");//connection with database established
			st = con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(query);//getting result
			System.out.println("results received");
					
			while(rs.next())
			{
                String ID = rs.getString("ID");
                
				
				if(ID.equals(idTF.getText())){
					
					System.out.println("Created");
					
					System.out.println("Start Created");
						
					newreport=reportTF.getText();
					System.out.println("End Created");
					
				}
				else{
					System.out.println("Invalid User");
				}
				
			}
		}
		catch(Exception e){}
		try
		{
			System.out.println(".");
			
			query="Update moneylaundering SET MedicalReport='"+newreport+"' where ID="+idTF.getText();
			
			st.executeUpdate(query);
			
		
			st.close();
			con.close();
			rs.close();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	public void updateInDB4()
	{
		String newreport="";
		
		String query = "SELECT * FROM `extortion` WHERE 1;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop1","root","");
			System.out.println("connection done");//connection with database established
			st = con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(query);//getting result
			System.out.println("results received");
					
			while(rs.next())
			{
                String ID = rs.getString("ID");
                
				
				if(ID.equals(idTF.getText())){
					
					System.out.println("Created");
					
					System.out.println("Start Created");
						
					newreport=reportTF.getText();
					System.out.println("End Created");
					
				}
				else{
					System.out.println("Invalid User");
				}
				
			}
		}
		catch(Exception e){}
		try
		{
			System.out.println(".");
			
			query="Update extortion SET MedicalReport='"+newreport+"' where ID="+idTF.getText();
			
			st.executeUpdate(query);
			
		
			st.close();
			con.close();
			rs.close();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
	
	public void updateInDB5()
	{
		String newreport="";
		
		String query = "SELECT * FROM `murderforhire` WHERE 1;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop1","root","");
			System.out.println("connection done");//connection with database established
			st = con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(query);//getting result
			System.out.println("results received");
					
			while(rs.next())
			{
                String ID = rs.getString("ID");
                
				
				if(ID.equals(idTF.getText())){
					
					System.out.println("Created");
					
					System.out.println("Start Created");
						
					newreport=reportTF.getText();
					System.out.println("End Created");
					
				}
				else{
					System.out.println("Invalid User");
				}
				
			}
		}
		catch(Exception e){}
		try
		{
			System.out.println(".");
			
			query="Update murderforhire SET MedicalReport='"+newreport+"' where ID="+idTF.getText();
			
			st.executeUpdate(query);
			
		
			st.close();
			con.close();
			rs.close();
		}
		catch(Exception e){System.out.println(e.getMessage());}
	}
}