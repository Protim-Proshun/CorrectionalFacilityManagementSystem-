import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Continue extends JFrame implements ActionListener
{
	private JLabel continueLable,continueLable2;
	//private JTextField loginTextField;
	//private JPasswordField loginPasswordField;
	private JButton co1,co2,co3;
	private JPanel continuePanel;
	private JComboBox continuecombo1,continuecombo2;
	//public static int cou=0;
	
	private String s[] = {"Drug Trafficking","Gunrunning","Money laundering","Extortion","Murder for hire"/*,"Fraud","Human trafficking","Poaching","Black marketing","Political violence","Religious violence","Terrorism","Abduction","Cyber Crime","Rape"*/};
	private String s1[]= {"Jail Inspector","Guard","Doctor","IT Technician"};
	public Continue(){
		super("Continue");
		this.setSize(1000,800);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		continuePanel=new JPanel();
		continuePanel.setLayout(null);
		
		continueLable=new JLabel("Criminals who did the following crime: ");
		continueLable.setBounds(200,50,400,40);
		continueLable.setBackground(Color.YELLOW);
		continueLable.setOpaque(true);
		continueLable.setFont(new Font("Arial Unicode MS",0,20));
		continuePanel.add(continueLable);
		
		continuecombo1 = new JComboBox(s);
		continuecombo1.setBounds(610, 50, 300, 50);
		continuePanel.add(continuecombo1);
		
		continueLable2=new JLabel("Employees: ");
		continueLable2.setBounds(200,200,400,40);
		continueLable2.setBackground(Color.CYAN);
		continueLable2.setOpaque(true);
		continueLable2.setFont(new Font("Arial Unicode MS",0,20));
		continuePanel.add(continueLable2);
		
		continuecombo2 = new JComboBox(s1);
		continuecombo2.setBounds(610, 200, 300, 50);
		continuePanel.add(continuecombo2);
		
		continuecombo1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                
                JComboBox continuecombo1 = (JComboBox) event.getSource();

                Object selected = continuecombo1.getSelectedItem();
                if(selected.toString().equals("Drug Trafficking")){
					System.out.println("Selected");
					//dispose();
					DrugTrafficking d=new DrugTrafficking();
					//d.setVisible(true);
				}
				else if(selected.toString().equals("Gunrunning")){
					System.out.println("Selected");
					//dispose();
					Gunrunning g=new Gunrunning();
					//g.setVisible(true);
				}
				else if(selected.toString().equals("Money laundering")){
					System.out.println("Selected");
					//dispose();
					Moneylaundering m=new Moneylaundering();
					//m.setVisible(true);
				}
				else if(selected.toString().equals("Extortion")){
					System.out.println("Selected");
					//dispose();
					Extortion ee=new Extortion();
					//ee.setVisible(true);
				}
				else if(selected.toString().equals("Murder for hire")){
					System.out.println("Selected");
					//dispose();
					Murderforhire mj=new Murderforhire();
					//mj.setVisible(true);
				}

		}}
		);
		
		continuecombo2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                
                JComboBox continuecombo2 = (JComboBox) event.getSource();

                Object selected = continuecombo2.getSelectedItem();
                if(selected.toString().equals("Jail Inspector")){
					System.out.println("Selected");
					//dispose();
					JailInspector j=new JailInspector();
					//j.setVisible(true);
				}
				else if(selected.toString().equals("Guard")){
					System.out.println("Selected");
					//dispose();
					Guard g3=new Guard();
					//g3.setVisible(true);
				}
				else if(selected.toString().equals("Doctor")){
					System.out.println("Selected");
					//dispose();
					//cou=1;
					Doctor d3=new Doctor();
					
					//d3.setVisible(true);
				}
				else if(selected.toString().equals("IT Technician")){
					System.out.println("Selected");
					//dispose();
					ITTechnician ii3=new ITTechnician();
					//ii3.setVisible(true);
				}

		}}
		);
		
		/*co1= new JButton("Description");
		co1.setBounds(200, 400, 100, 50);
		co1.setBackground(Color.GREEN);
		
		co1.addActionListener(this);
		co1.setActionCommand("Description");
		continuePanel.add(co1);*/
		
		co2= new JButton("FAQ");
		co2.setBounds(400, 400, 100, 50);
		co2.setBackground(Color.CYAN);
		
		co2.addActionListener(this);
		co2.setActionCommand("FAQ");
		continuePanel.add(co2);
		
		co3= new JButton("Back");
		co3.setBounds(600, 400, 100, 50);
		co3.setBackground(Color.MAGENTA);
		
		co3.addActionListener(this);
		co3.setActionCommand("Back");
		continuePanel.add(co3);
		
		this.add(continuePanel);
	}
	
	public void actionPerformed(ActionEvent p){
		String sq=p.getActionCommand();
		/*if(sq.equals("Description")){
			dispose();
			Description d=new Description();
			d.setVisible(true);
		}
		else*/ if(sq.equals("FAQ")){
			dispose();
			FAQ f5=new FAQ();
			f5.setVisible(true);
		}
		else if(sq.equals("Back")){
			dispose();
			//Profile pp=new Profile();
			//p.setVisible(true);
		}
	}
	
}