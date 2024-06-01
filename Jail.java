import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Jail extends JFrame implements ActionListener,MouseListener
{
	private JLabel Lable1;
	private JButton Button1;
	private JPanel Panel;
	
	public Jail()
	{
		super("User Confirmation");
		this.setSize(1000,800);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		Panel=new JPanel();
		Panel.setLayout(null);
		
		Lable1=new JLabel("Central Jail");
		Lable1.setBounds(200,50,600,40);
		Lable1.setBackground(Color.BLUE);
		//Lable1.setOpaque(true);
		Lable1.setFont(new Font("Arial Unicode MS",0,20));
		Panel.add(Lable1);
		
		Button1=new JButton("Click to Continue");
		Button1.setBounds(500,300,300,50);
		Button1.addActionListener(this);
		Button1.setActionCommand("Click to Continue");
		Panel.add(Button1);
	
		
		
		
		this.add(Panel);
	}
	
	public void mouseClicked(MouseEvent m){}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseEntered(MouseEvent m){
		System.out.println("Entered");
		Button1.setBackground(Color.RED);
	}
	public void mouseExited(MouseEvent m){
		System.out.println("Exited");
		Button1.setBackground(Color.YELLOW);
	}
	
	public void actionPerformed(ActionEvent a){
		String rs=a.getActionCommand();
		if(rs.equals("Click to Continue")){
			dispose();
			LogIn l = new LogIn();
			l.setVisible(true);
			System.out.println("1");
		}
		else{
			System.out.println("2");
		}
	}
	
}
		