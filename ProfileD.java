import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ProfileD extends JFrame implements ActionListener
{
	private JLabel ProfileDLablename,ProfileDLableID,ProfileDLablePassword,ProfileDLableAge,ProfileDLableGender,ProfileDLableDesignation,ProfileDLableActiveYears;
	private JButton ProfileDbutton,ProfileDContinuebutton,ProfileDCreate,ProfileDDelete,ProfileDUpdate;
	private JPanel ProfileDPanel;
	
	public ProfileD(String Name,String ID,String Password,int Age,String Gender,String Designation)
	{
		super("ProfileD");
		this.setSize(1000,800);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		ProfileDPanel=new JPanel();
		ProfileDPanel.setLayout(null);
		
		ProfileDLablename = new JLabel("Name	:	"+Name);
		ProfileDLablename.setBounds(200, 100, 200, 30);
		ProfileDPanel.add(ProfileDLablename);
		
		ProfileDLableID = new JLabel("ID:	"+ID);
		ProfileDLableID.setBounds(200, 150, 200, 30);
		ProfileDPanel.add(ProfileDLableID);
		
		ProfileDLablePassword = new JLabel("Password	:	"+Password);
		ProfileDLablePassword.setBounds(200, 200, 200, 30);
		ProfileDPanel.add(ProfileDLablePassword);
		
		ProfileDLableAge = new JLabel("Age	:	"+Age);
		ProfileDLableAge.setBounds(200, 250, 200, 30);
		ProfileDPanel.add(ProfileDLableAge);
		
		ProfileDLableGender = new JLabel("Gender	:	"+Gender);
		ProfileDLableGender.setBounds(200, 300, 200, 30);
		ProfileDPanel.add(ProfileDLableGender);
		
		ProfileDLableDesignation = new JLabel("Designation	:	"+Designation);
		ProfileDLableDesignation.setBounds(200, 350, 200, 30);
		ProfileDPanel.add(ProfileDLableDesignation);
		
		
		/*ProfileDLable=new JLabel("Name:Z\nAge:32");
		ProfileDLable.setBounds(200,50,600,40);
		ProfileDLable.setBackground(Color.BLUE);
		ProfileDLable.setOpaque(true);
		ProfileDLable.setFont(new Font("Arial Unicode MS",0,20));
		ProfileDPanel.add(ProfileDLable);*/ 
		
		ProfileDbutton= new JButton("Log Out");
		ProfileDbutton.setBounds(300, 400, 100, 50);
		ProfileDbutton.setBackground(Color.RED);
		
		ProfileDbutton.addActionListener(this);
		ProfileDbutton.setActionCommand("Log out");
		ProfileDPanel.add(ProfileDbutton);
		
		ProfileDContinuebutton= new JButton("Continue");
		ProfileDContinuebutton.setBounds(200, 400, 100, 50);
		ProfileDContinuebutton.setBackground(Color.GREEN);
		
		ProfileDContinuebutton.addActionListener(this);
		ProfileDContinuebutton.setActionCommand("Continue");
		ProfileDPanel.add(ProfileDContinuebutton);
		
		ProfileDCreate= new JButton("Create");
		ProfileDCreate.setBounds(200, 600, 100, 50);
		ProfileDCreate.setBackground(Color.GREEN);
		
		ProfileDCreate.addActionListener(this);
		ProfileDCreate.setActionCommand("Create");
		ProfileDPanel.add(ProfileDCreate);
		
		/*ProfileDDelete= new JButton("Delete");
		ProfileDDelete.setBounds(300, 600, 100, 50);
		ProfileDDelete.setBackground(Color.GREEN);
		
		ProfileDDelete.addActionListener(this);
		ProfileDDelete.setActionCommand("Delete");
		ProfileDPanel.add(ProfileDDelete);*/
		
		ProfileDUpdate= new JButton("Update");
		ProfileDUpdate.setBounds(400, 600, 100, 50);
		ProfileDUpdate.setBackground(Color.GREEN);
		
		ProfileDUpdate.addActionListener(this);
		ProfileDUpdate.setActionCommand("Update");
		ProfileDPanel.add(ProfileDUpdate);
		
		
		
		this.add(ProfileDPanel);
	
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
			ContinueD c=new ContinueD();
			c.setVisible(true);
		}
		else if(sq.equals("Create")){
			//dispose();
			CreateD r=new CreateD("s");
			r.setVisible(true);
		}
		/*else if(sq.equals("Delete")){
			//dispose();
			Delete d=new Delete("s");
			d.setVisible(true);
		}*/
		else if(sq.equals("Update")){
			//dispose();
			UpdateD u=new UpdateD("s");
			u.setVisible(true);
		}
	}
	
		
	
}