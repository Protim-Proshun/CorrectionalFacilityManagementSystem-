import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class Delete extends JFrame implements ActionListener
{
	private JLabel IDLabel;
	private JTextField IDTF;
	private JButton buttonBack,buttonDelete;
	private JRadioButton r1,r2,r3,r4;
	private ButtonGroup bg1;
	private JPanel panel;
	
	public Delete(String msg)
	{
		super("Delete Account");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		r1 = new JRadioButton("JailInspector");
		r1.setBounds(400, 50, 200, 30);
		panel.add(r1);
		
		r2 = new JRadioButton("Doctor");
		r2.setBounds(400, 100, 200, 30);
		panel.add(r2);
		
		r3 = new JRadioButton("ITTecnician");
		r3.setBounds(400, 150, 200, 30);
		panel.add(r3);
		
		r4 = new JRadioButton("Guard");
		r4.setBounds(400, 200, 200, 30);
		panel.add(r4);
		
		bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);
		bg1.add(r4);
		
		IDLabel = new JLabel("Enter ID Number : ");
		IDLabel.setBounds(100,100,150,30);
		panel.add(IDLabel);
		
		IDTF = new JTextField();
		IDTF.setBounds(260,100,100,30);
		panel.add(IDTF);
		
		buttonBack = new JButton("Back");
		buttonBack.setBounds(100, 300, 80, 30);
		buttonBack.addActionListener(this);
		panel.add(buttonBack);
		
		buttonDelete = new JButton("Delete");
		buttonDelete.setBounds(190, 300, 80, 30);
		buttonDelete.addActionListener(this);
		panel.add(buttonDelete);
		
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
		else if(buttonClicked.equals(buttonDelete.getText()))
		{
			if(r1.isSelected()){
				deleteFromDB2();
			}
			else if(r2.isSelected()){
				deleteFromDB3();
			}
			else if(r3.isSelected()){
				deleteFromDB();
			}
			else if(r4.isSelected()){
				deleteFromDB4();
			}
		}
		/*else if(buttonClicked.equals(buttonLogout.getText()))
		{
			Login l = new Login();
			l.setVisible(true);
			this.setVisible(false);
		}*/
	}
	
	public void deleteFromDB()
	{
		String query = "DELETE from ittechnician where ID='"+IDTF.getText()+"';";
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
	
	public void deleteFromDB2()
	{
		String query = "DELETE from jailinspector where ID='"+IDTF.getText()+"';";
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
	
	public void deleteFromDB3()
	{
		String query = "DELETE from doctor where ID='"+IDTF.getText()+"';";
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
	
	public void deleteFromDB4()
	{
		String query = "DELETE from guard where ID='"+IDTF.getText()+"';";
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
