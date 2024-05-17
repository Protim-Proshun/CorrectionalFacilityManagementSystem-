import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class CreateJI extends JFrame implements ActionListener
{
	//private JLabel nameLabel, numberLabel, initialBalanceLabel, idLabel, passwordLabel;
	private JLabel idLabel,passwordLabel,nameLabel,ageLabel,genderLabel,designationLabel,activeLabel,patientLabel,nocrimeLabel,punishmentLabel;
	//private JTextField nameTF, numberTF, initialBalanceTF, idTF;
	private JTextField idTF,nameTF,ageTF,genderTF,nocrimeTF,punishmentTF;
	private JPasswordField passwordPF;
	private JButton buttonBack,buttonInsert;
	private JPanel panel;
	private JRadioButton r1,r2,r3,r4,r5;
	private ButtonGroup bg1;
	
	public CreateJI(String msg)
	{
		super("CreateJI New Account Window");
		
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
		
		nameLabel = new JLabel("Enter Name : ");
		nameLabel.setBounds(100,100,150,30);
		panel.add(nameLabel);
		
		nameTF = new JTextField();
		nameTF.setBounds(260,100,100,30);
		panel.add(nameTF);
		
		ageLabel = new JLabel("Enter Age : ");
		ageLabel.setBounds(100,150,150,30);
		panel.add(ageLabel);
		
		ageTF = new JTextField();
		ageTF.setBounds(260,150,100,30);
		panel.add(ageTF);
		
		genderLabel = new JLabel("Enter Gender : ");
		genderLabel.setBounds(100,200,150,30);
		panel.add(genderLabel);
		
		genderTF = new JTextField();
		genderTF.setBounds(260,200,100,30);
		panel.add(genderTF);
		
		nocrimeLabel = new JLabel("Enter no of crime : ");
		nocrimeLabel.setBounds(100,250,150,30);
		panel.add(nocrimeLabel);
		
		nocrimeTF = new JTextField();
		nocrimeTF.setBounds(260,250,100,30);
		panel.add(nocrimeTF);
		
		punishmentLabel = new JLabel("Enter punishment : ");
		punishmentLabel.setBounds(100, 300, 150, 30);
		panel.add(punishmentLabel);
		
		punishmentTF =new JTextField();
		punishmentTF.setBounds(260, 300, 100, 30);
		panel.add(punishmentTF);
		
		/*activeLabel = new JLabel("Enter Active : ");
		activeLabel.setBounds(100, 350, 150, 30);
		panel.add(activeLabel);
		
		activeTF =new JTextField();
		activeTF.setBounds(260, 350, 100, 30);
		panel.add(activeTF);
		
		patientLabel = new JLabel("Enter Patient : ");
		patientLabel.setBounds(100, 400, 150, 30);
		panel.add(patientLabel);
		
		patientTF =new JTextField();
		patientTF.setBounds(260, 400, 100, 30);
		panel.add(patientTF);*/
		
		buttonBack = new JButton("Back");
		buttonBack.setBounds(100, 600, 80, 30);
		buttonBack.addActionListener(this);
		panel.add(buttonBack);
		
		buttonInsert = new JButton("Insert");
		buttonInsert.setBounds(190, 600, 80, 30);
		buttonInsert.addActionListener(this);
		panel.add(buttonInsert);
		
		/*buttonLogout = new JButton("Logout");
		buttonLogout.setBounds(280, 300, 80, 30);
		buttonLogout.addActionListener(this);
		panel.add(buttonLogout);*/
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String buttonClicked = ae.getActionCommand();
		
		if(buttonClicked.equals(buttonBack.getText()))
		{
			dispose();
		}
		else if(buttonClicked.equals(buttonInsert.getText()))
		{
			if(r1.isSelected()){
				insertIntoDB();
			}
			else if(r2.isSelected()){
				insertIntoDB2();
			}
			else if(r3.isSelected()){
				insertIntoDB3();
			}
			else if(r4.isSelected()){
				insertIntoDB4();
			}
			else if(r5.isSelected()){
				insertIntoDB5();
			}
			
			
			
		}
		/*else if(buttonClicked.equals(buttonLogout.getText()))
		{
			Login l = new Login();
			l.setVisible(true);
			this.setVisible(false);
		}*/
	}
	
	public void insertIntoDB()
	{
		String query = "INSERT INTO drugtrafficking VALUES ('"+idTF.getText()+"','"+nameTF.getText()+"',"+ageTF.getText()+",'"+genderTF.getText()+"',"+nocrimeTF.getText()+",'"+punishmentTF.getText()+"');";
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop1", "root", "");
			Statement stm = con.createStatement();
			stm.execute(query);
			stm.close();
			con.close();
					
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
    }
	
	public void insertIntoDB2()
	{
		String query = "INSERT INTO gunrunning VALUES ('"+idTF.getText()+"','"+nameTF.getText()+"',"+ageTF.getText()+",'"+genderTF.getText()+"',"+nocrimeTF.getText()+",'"+punishmentTF.getText()+"');";
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop1", "root", "");
			Statement stm = con.createStatement();
			stm.execute(query);
			stm.close();
			con.close();
					
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
    }
	
	public void insertIntoDB3()
	{
		String query = "INSERT INTO moneylaundering VALUES ('"+idTF.getText()+"','"+nameTF.getText()+"',"+ageTF.getText()+",'"+genderTF.getText()+"',"+nocrimeTF.getText()+",'"+punishmentTF.getText()+"');";
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop1", "root", "");
			Statement stm = con.createStatement();
			stm.execute(query);
			stm.close();
			con.close();
					
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
    }
	
	public void insertIntoDB4()
	{
		String query = "INSERT INTO extortion VALUES ('"+idTF.getText()+"','"+nameTF.getText()+"',"+ageTF.getText()+",'"+genderTF.getText()+"',"+nocrimeTF.getText()+",'"+punishmentTF.getText()+"');";
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop1", "root", "");
			Statement stm = con.createStatement();
			stm.execute(query);
			stm.close();
			con.close();
					
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
    }
	
	public void insertIntoDB5()
	{
		String query = "INSERT INTO murderforhire VALUES ('"+idTF.getText()+"','"+nameTF.getText()+"',"+ageTF.getText()+",'"+genderTF.getText()+"',"+nocrimeTF.getText()+",'"+punishmentTF.getText()+"');";
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop1", "root", "");
			Statement stm = con.createStatement();
			stm.execute(query);
			stm.close();
			con.close();
					
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
    }
}


