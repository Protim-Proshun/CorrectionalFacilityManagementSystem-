import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LogIn extends JFrame implements ActionListener,MouseListener
{
	private JLabel loginLable;
	private JTextField loginTextField;
	private JPasswordField loginPasswordField;
	private JButton loginbutton;
	private JPanel loginPanel;
	private boolean flag;
	
	public LogIn(){
		super("Log In");
		//setVisible(true);
		this.setSize(500,350);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		loginPanel=new JPanel();
		loginPanel.setLayout(null);
		
		loginLable = new JLabel("Enter your Log In ID");
		loginLable.setBounds(100, 30, 300, 30);
		loginLable.setBackground(Color.BLUE);
		//0loginLable.setOpaque(true);
		loginLable.setFont(new Font("Arial Unicode MS", 0, 20));
		loginPanel.add(loginLable);
		
		loginTextField = new JTextField();
		loginTextField.setBounds(100, 80, 300, 40);
		loginTextField.setBackground(Color.YELLOW);
		loginPanel.add(loginTextField);
		
		loginPasswordField = new JPasswordField();
		loginPasswordField.setBounds(100, 150, 300, 40);
		loginPasswordField.setEchoChar('?');
		loginPasswordField.setBackground(Color.CYAN);
		loginPanel.add(loginPasswordField);
		
		loginbutton= new JButton("Sign IN");
		loginbutton.setBounds(100, 200, 100, 50);
		loginbutton.setBackground(Color.GREEN);
		
		loginbutton.addActionListener(this);
		loginbutton.setActionCommand("Sign IN");
		loginPanel.add(loginbutton);
		
		this.add(loginPanel);
	}
	
	public void mouseClicked(MouseEvent q){}
	public void mousePressed(MouseEvent q){}
	public void mouseReleased(MouseEvent q){}
	public void mouseEntered(MouseEvent q){
		System.out.println("Entered");
		loginbutton.setBackground(Color.RED);
	}
	public void mouseExited(MouseEvent q){
		System.out.println("Exited");
		loginbutton.setBackground(Color.YELLOW);
	}
	
	public void actionPerformed(ActionEvent b){
		String ss=b.getActionCommand();
		if(ss.equals("Sign IN")){
			check();
			
		}
	}
	
	public void check()
	{
        int i=Integer.parseInt(loginTextField.getText());			
		
		if(i>1000 && i<1999){
			String query= "SELECT * FROM `jailinspector` WHERE 1;";
		
		
		//String query = "SELECT * FROM `ittechnician` WHERE 1;";
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
                String Password = rs.getString("Password");
				String Name=rs.getString("Name");
				int Age=rs.getInt("Age");
				String Designation=rs.getString("Designation");
				String Gender=rs.getString("Gender");
				
				//int accountNumber = rs.getInt("AccountNumber");
				//String accountHolderName = rs.getString("AccountHolderName");
				//double balance = rs.getDouble("Balance");
				
				if(ID.equals(loginTextField.getText()))
				{
					flag=false;
					if(Password.equals(loginPasswordField.getText()))
					{
						dispose();
						ProfileJI pj = new ProfileJI(Name,ID,Password,Age,Gender,Designation);
						pj.setVisible(true);
						
						/*if(radioUser.isSelected())
						{
							UserHome ush = new UserHome(userId,password,accountNumber,accountHolderName,balance);
							this.setVisible(false);
							ush.setVisible(true);
						}
						else if(radioAdmin.isSelected())
						{
							AdminHome adh = new AdminHome(userId,password,accountNumber,accountHolderName,balance);
							this.setVisible(false);
							adh.setVisible(true);
						}*/
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Invalid pass"); 
					}
				}			
			}
			if(flag){JOptionPane.showMessageDialog(this,"Invalid name"); }
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
        finally
		{
            try
			{
                if(rs!=null)
					rs.close();

                if(st!=null)
					st.close();

                if(con!=null)
					con.close();
            }
            catch(Exception ex){}
        }
		}
		else if(i>2000 && i<2999){
			String query= "SELECT * FROM `doctor` WHERE 1;";
		
		
		//String query = "SELECT * FROM `ittechnician` WHERE 1;";
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
                String Password = rs.getString("Password");
				String Name=rs.getString("Name");
				int Age=rs.getInt("Age");
				String Designation=rs.getString("Designation");
				String Gender=rs.getString("Gender");
				
				//int accountNumber = rs.getInt("AccountNumber");
				//String accountHolderName = rs.getString("AccountHolderName");
				//double balance = rs.getDouble("Balance");
				
				if(ID.equals(loginTextField.getText()))
				{
					flag=false;
					if(Password.equals(loginPasswordField.getText()))
					{
						dispose();
						ProfileD pd = new ProfileD(Name,ID,Password,Age,Gender,Designation);
						pd.setVisible(true);
						
						/*if(radioUser.isSelected())
						{
							UserHome ush = new UserHome(userId,password,accountNumber,accountHolderName,balance);
							this.setVisible(false);
							ush.setVisible(true);
						}
						else if(radioAdmin.isSelected())
						{
							AdminHome adh = new AdminHome(userId,password,accountNumber,accountHolderName,balance);
							this.setVisible(false);
							adh.setVisible(true);
						}*/
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Invalid pass"); 
					}
				}			
			}
			if(flag){JOptionPane.showMessageDialog(this,"Invalid name"); }
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
        finally
		{
            try
			{
                if(rs!=null)
					rs.close();

                if(st!=null)
					st.close();

                if(con!=null)
					con.close();
            }
            catch(Exception ex){}
        }
		}
		else if(i>3000 && i<3999){
			String query= "SELECT * FROM `ittechnician` WHERE 1;";
		
		
		//String query = "SELECT * FROM `ittechnician` WHERE 1;";
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
                String Password = rs.getString("Password");
				String Name=rs.getString("Name");
				int Age=rs.getInt("Age");
				String Designation=rs.getString("Designation");
				String Gender=rs.getString("Gender");
				
				//int accountNumber = rs.getInt("AccountNumber");
				//String accountHolderName = rs.getString("AccountHolderName");
				//double balance = rs.getDouble("Balance");
				
				if(ID.equals(loginTextField.getText()))
				{
					flag=false;
					if(Password.equals(loginPasswordField.getText()))
					{
						dispose();
						Profile p = new Profile(Name,ID,Password,Age,Gender,Designation);
						p.setVisible(true);
						
						/*if(radioUser.isSelected())
						{
							UserHome ush = new UserHome(userId,password,accountNumber,accountHolderName,balance);
							this.setVisible(false);
							ush.setVisible(true);
						}
						else if(radioAdmin.isSelected())
						{
							AdminHome adh = new AdminHome(userId,password,accountNumber,accountHolderName,balance);
							this.setVisible(false);
							adh.setVisible(true);
						}*/
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Invalid pass"); 
					}
				}			
			}
			if(flag){JOptionPane.showMessageDialog(this,"Invalid name"); }
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
        finally
		{
            try
			{
                if(rs!=null)
					rs.close();

                if(st!=null)
					st.close();

                if(con!=null)
					con.close();
            }
            catch(Exception ex){}
        }
		}
    } 

}