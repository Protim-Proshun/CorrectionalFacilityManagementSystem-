import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ProfileJI extends JFrame implements ActionListener
{
	private JLabel ProfileJILablename,ProfileJILableID,ProfileJILablePassword,ProfileJILableAge,ProfileJILableGender,ProfileJILableDesignation,ProfileJILableActiveYears;
	private JButton ProfileJIbutton,ProfileJIContinuebutton,ProfileJICreate,ProfileJIDelete,ProfileJIUpdate;
	private JPanel ProfileJIPanel;
	
	public ProfileJI(String Name,String ID,String Password,int Age,String Gender,String Designation)
	{
		super("ProfileJI");
		this.setSize(1000,800);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		ProfileJIPanel=new JPanel();
		ProfileJIPanel.setLayout(null);
		
		ProfileJILablename = new JLabel("Name	:	"+Name);
		ProfileJILablename.setBounds(200, 100, 200, 30);
		ProfileJIPanel.add(ProfileJILablename);
		
		ProfileJILableID = new JLabel("ID:	"+ID);
		ProfileJILableID.setBounds(200, 150, 200, 30);
		ProfileJIPanel.add(ProfileJILableID);
		
		ProfileJILablePassword = new JLabel("Password	:	"+Password);
		ProfileJILablePassword.setBounds(200, 200, 200, 30);
		ProfileJIPanel.add(ProfileJILablePassword);
		
		ProfileJILableAge = new JLabel("Age	:	"+Age);
		ProfileJILableAge.setBounds(200, 250, 200, 30);
		ProfileJIPanel.add(ProfileJILableAge);
		
		ProfileJILableGender = new JLabel("Gender	:	"+Gender);
		ProfileJILableGender.setBounds(200, 300, 200, 30);
		ProfileJIPanel.add(ProfileJILableGender);
		
		ProfileJILableDesignation = new JLabel("Designation	:	"+Designation);
		ProfileJILableDesignation.setBounds(200, 350, 200, 30);
		ProfileJIPanel.add(ProfileJILableDesignation);
		
		
		/*ProfileJILable=new JLabel("Name:Z\nAge:32");
		ProfileJILable.setBounds(200,50,600,40);
		ProfileJILable.setBackground(Color.BLUE);
		ProfileJILable.setOpaque(true);
		ProfileJILable.setFont(new Font("Arial Unicode MS",0,20));
		ProfileJIPanel.add(ProfileJILable);*/ 
		
		ProfileJIbutton= new JButton("Log Out");
		ProfileJIbutton.setBounds(300, 400, 100, 50);
		ProfileJIbutton.setBackground(Color.RED);
		
		ProfileJIbutton.addActionListener(this);
		ProfileJIbutton.setActionCommand("Log out");
		ProfileJIPanel.add(ProfileJIbutton);
		
		ProfileJIContinuebutton= new JButton("Continue");
		ProfileJIContinuebutton.setBounds(200, 400, 100, 50);
		ProfileJIContinuebutton.setBackground(Color.GREEN);
		
		ProfileJIContinuebutton.addActionListener(this);
		ProfileJIContinuebutton.setActionCommand("Continue");
		ProfileJIPanel.add(ProfileJIContinuebutton);
		
		ProfileJICreate= new JButton("Create");
		ProfileJICreate.setBounds(200, 600, 100, 50);
		ProfileJICreate.setBackground(Color.GREEN);
		
		ProfileJICreate.addActionListener(this);
		ProfileJICreate.setActionCommand("Create");
		ProfileJIPanel.add(ProfileJICreate);
		
		ProfileJIDelete= new JButton("Delete");
		ProfileJIDelete.setBounds(300, 600, 100, 50);
		ProfileJIDelete.setBackground(Color.GREEN);
		
		ProfileJIDelete.addActionListener(this);
		ProfileJIDelete.setActionCommand("Delete");
		ProfileJIPanel.add(ProfileJIDelete);
		
		ProfileJIUpdate= new JButton("Update");
		ProfileJIUpdate.setBounds(400, 600, 100, 50);
		ProfileJIUpdate.setBackground(Color.GREEN);
		
		ProfileJIUpdate.addActionListener(this);
		ProfileJIUpdate.setActionCommand("Update");
		ProfileJIPanel.add(ProfileJIUpdate);
		
		
		
		this.add(ProfileJIPanel);
	
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
			ContinueJI c=new ContinueJI();
			c.setVisible(true);
		}
		else if(sq.equals("Create")){
			//dispose();
			CreateJI r=new CreateJI("s");
			r.setVisible(true);
		}
		else if(sq.equals("Delete")){
			//dispose();
			DeleteJI d=new DeleteJI("s");
			d.setVisible(true);
		}
		else if(sq.equals("Update")){
			//dispose();
			UpdateJI u=new UpdateJI("s");
			u.setVisible(true);
		}
	}
	
		
	
}