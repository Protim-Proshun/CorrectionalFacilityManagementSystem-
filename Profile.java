import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Profile extends JFrame implements ActionListener
{
	private JLabel profileLablename,profileLableID,profileLablePassword,profileLableAge,profileLableGender,profileLableDesignation,profileLableActiveYears;
	private JButton profilebutton,profileContinuebutton,profileCreate,profileDelete,profileUpdate;
	private JPanel profilePanel;
	
	public Profile(String Name,String ID,String Password,int Age,String Gender,String Designation)
	{
		super("Profile");
		this.setSize(1000,800);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		profilePanel=new JPanel();
		profilePanel.setLayout(null);
		
		profileLablename = new JLabel("Name	:	"+Name);
		profileLablename.setBounds(200, 100, 200, 30);
		profilePanel.add(profileLablename);
		
		profileLableID = new JLabel("ID:	"+ID);
		profileLableID.setBounds(200, 150, 200, 30);
		profilePanel.add(profileLableID);
		
		profileLablePassword = new JLabel("Password	:	"+Password);
		profileLablePassword.setBounds(200, 200, 200, 30);
		profilePanel.add(profileLablePassword);
		
		profileLableAge = new JLabel("Age	:	"+Age);
		profileLableAge.setBounds(200, 250, 200, 30);
		profilePanel.add(profileLableAge);
		
		profileLableGender = new JLabel("Gender	:	"+Gender);
		profileLableGender.setBounds(200, 300, 200, 30);
		profilePanel.add(profileLableGender);
		
		profileLableDesignation = new JLabel("Designation	:	"+Designation);
		profileLableDesignation.setBounds(200, 350, 200, 30);
		profilePanel.add(profileLableDesignation);
		
		
		/*profileLable=new JLabel("Name:Z\nAge:32");
		profileLable.setBounds(200,50,600,40);
		profileLable.setBackground(Color.BLUE);
		profileLable.setOpaque(true);
		profileLable.setFont(new Font("Arial Unicode MS",0,20));
		profilePanel.add(profileLable);*/ 
		
		profilebutton= new JButton("Log Out");
		profilebutton.setBounds(300, 400, 100, 50);
		profilebutton.setBackground(Color.RED);
		
		profilebutton.addActionListener(this);
		profilebutton.setActionCommand("Log out");
		profilePanel.add(profilebutton);
		
		profileContinuebutton= new JButton("Continue");
		profileContinuebutton.setBounds(200, 400, 100, 50);
		profileContinuebutton.setBackground(Color.GREEN);
		
		profileContinuebutton.addActionListener(this);
		profileContinuebutton.setActionCommand("Continue");
		profilePanel.add(profileContinuebutton);
		
		profileCreate= new JButton("Create");
		profileCreate.setBounds(200, 600, 100, 50);
		profileCreate.setBackground(Color.GREEN);
		
		profileCreate.addActionListener(this);
		profileCreate.setActionCommand("Create");
		profilePanel.add(profileCreate);
		
		profileDelete= new JButton("Delete");
		profileDelete.setBounds(300, 600, 100, 50);
		profileDelete.setBackground(Color.GREEN);
		
		profileDelete.addActionListener(this);
		profileDelete.setActionCommand("Delete");
		profilePanel.add(profileDelete);
		
		profileUpdate= new JButton("Update");
		profileUpdate.setBounds(400, 600, 100, 50);
		profileUpdate.setBackground(Color.GREEN);
		
		profileUpdate.addActionListener(this);
		profileUpdate.setActionCommand("Update");
		profilePanel.add(profileUpdate);
		
		
		
		this.add(profilePanel);
	
	}
	
	public void actionPerformed(ActionEvent p){
		String sq=p.getActionCommand();
		if(sq.equals("Log out")){
			dispose();
			LogIn l=new LogIn();
			l.setVisible(true);
		}
		else if(sq.equals("Continue")){
			//dispose();
			Continue c=new Continue();
			c.setVisible(true);
		}
		else if(sq.equals("Create")){
			//dispose();
			Create r=new Create("s");
			r.setVisible(true);
		}
		else if(sq.equals("Delete")){
			//dispose();
			Delete d=new Delete("s");
			d.setVisible(true);
		}
		else if(sq.equals("Update")){
			//dispose();
			Update u=new Update("s");
			u.setVisible(true);
		}
	}
	
		
	
}