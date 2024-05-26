import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FAQ extends JFrame implements ActionListener
{
	private JLabel FAQLabel;
	private JTextArea FAQTextArea;
	private JButton f1,f2;
	private JPanel FAQPanel;
	
	public FAQ()
	{
		super("FAQ");
		this.setSize(1000,800);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		FAQPanel=new JPanel();
		FAQPanel.setLayout(null);
		
		FAQLabel=new JLabel("Frequently Ask Question");
		FAQLabel.setBounds(200,50,600,40);
		FAQLabel.setBackground(Color.MAGENTA);
		FAQLabel.setOpaque(true);
		FAQLabel.setFont(new Font("Arial Unicode MS",0,20));
		FAQPanel.add(FAQLabel); 
		
		f1= new JButton("Back");
		f1.setBounds(300, 600, 100, 50);
		f1.setBackground(Color.RED);
		
		f1.addActionListener(this);
		f1.setActionCommand("Back");
		FAQPanel.add(f1);
		
		FAQTextArea = new JTextArea();
		FAQTextArea.setBounds(200, 200, 600, 100);
		FAQTextArea.setBackground(Color.CYAN);
		FAQPanel.add(FAQTextArea);
		
		f2=new JButton("Done");
		f2.setBounds(200,600,100,50);
		f2.setBackground(Color.YELLOW);
		
		f2.addActionListener(this);
		f2.setActionCommand("Done");
		FAQPanel.add(f2);
		
		this.add(FAQPanel);
		
		
	}
	
	public void actionPerformed(ActionEvent p){
		String sq=p.getActionCommand();
		if(sq.equals("Back")){
			dispose();
			Continue c=new Continue();
			c.setVisible(true);
		}
		else if(sq.equals("Done")){
			String text=FAQTextArea.getText();
			
			try{
			File file=new File("FAQ.txt");
			file.createNewFile();
			FileWriter writer=new FileWriter(file);
			
			writer.write(text);
			writer.flush();
			writer.close();
			}
			catch (IOException ex){
			}
		}
			
	}

}