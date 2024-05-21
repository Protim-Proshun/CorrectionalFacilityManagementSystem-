import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Description extends JFrame implements ActionListener
{
	private JLabel DescriptionLabel;
	private JButton d1;
	private JPanel DescriptionPanel;
	
	public Description()
	{
		super("Description");
		this.setSize(1000,800);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		DescriptionPanel=new JPanel();
		DescriptionPanel.setLayout(null);
		
		DescriptionLabel=new JLabel("Description of the JAIL");
		DescriptionLabel.setBounds(200,50,600,40);
		DescriptionLabel.setBackground(Color.CYAN);
		DescriptionLabel.setOpaque(true);
		DescriptionLabel.setFont(new Font("Arial Unicode MS",0,20));
		DescriptionPanel.add(DescriptionLabel); 
		
		d1= new JButton("Back");
		d1.setBounds(300, 500, 100, 50);
		d1.setBackground(Color.RED);
		
		d1.addActionListener(this);
		d1.setActionCommand("Back");
		DescriptionPanel.add(d1);
		
		this.add(DescriptionPanel);
		
		
	}
	
	public void actionPerformed(ActionEvent p){
		String sq=p.getActionCommand();
		if(sq.equals("Back")){
			dispose();
			Continue c=new Continue();
			c.setVisible(true);
		}
	}

}