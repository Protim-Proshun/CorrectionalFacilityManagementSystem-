import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ContinueJI extends JFrame implements ActionListener
{
	private JLabel ContinueJILable,ContinueJILable2;
	//private JTextField loginTextField;
	//private JPasswordField loginPasswordField;
	private JButton co1,co2,co3;
	private JPanel ContinueJIPanel;
	private JComboBox ContinueJIcombo1,ContinueJIcombo2;
	//public static int cou=0;
	
	private String s[] = {"Drug Trafficking","Gunrunning","Money laundering","Extortion","Murder for hire"/*,"Fraud","Human trafficking","Poaching","Black marketing","Political violence","Religious violence","Terrorism","Abduction","Cyber Crime","Rape"*/};
	private String s1[]= {"Jail Inspector","Guard","Doctor","IT Technician"};
	public ContinueJI(){
		super("ContinueJI");
		this.setSize(1000,800);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		ContinueJIPanel=new JPanel();
		ContinueJIPanel.setLayout(null);
		
		ContinueJILable=new JLabel("Criminals who did the following crime: ");
		ContinueJILable.setBounds(200,50,400,40);
		ContinueJILable.setBackground(Color.YELLOW);
		ContinueJILable.setOpaque(true);
		ContinueJILable.setFont(new Font("Arial Unicode MS",0,20));
		ContinueJIPanel.add(ContinueJILable);
		
		ContinueJIcombo1 = new JComboBox(s);
		ContinueJIcombo1.setBounds(610, 50, 300, 50);
		ContinueJIPanel.add(ContinueJIcombo1);
		
		ContinueJILable2=new JLabel("Employees: ");
		ContinueJILable2.setBounds(200,200,400,40);
		ContinueJILable2.setBackground(Color.CYAN);
		ContinueJILable2.setOpaque(true);
		ContinueJILable2.setFont(new Font("Arial Unicode MS",0,20));
		ContinueJIPanel.add(ContinueJILable2);
		
		ContinueJIcombo2 = new JComboBox(s1);
		ContinueJIcombo2.setBounds(610, 200, 300, 50);
		ContinueJIPanel.add(ContinueJIcombo2);
		
		ContinueJIcombo1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                
                JComboBox ContinueJIcombo1 = (JComboBox) event.getSource();

                Object selected = ContinueJIcombo1.getSelectedItem();
                if(selected.toString().equals("Drug Trafficking")){
					System.out.println("Selected");
					//dispose();
					DrugTraffickingJI d=new DrugTraffickingJI();
					//d.setVisible(true);
				}
				else if(selected.toString().equals("Gunrunning")){
					System.out.println("Selected");
					//dispose();
					GunrunningJI g=new GunrunningJI();
					//g.setVisible(true);
				}
				else if(selected.toString().equals("Money laundering")){
					System.out.println("Selected");
					//dispose();
					MoneylaunderingJI m=new MoneylaunderingJI();
					//m.setVisible(true);
				}
				else if(selected.toString().equals("Extortion")){
					System.out.println("Selected");
					//dispose();
					ExtortionJI ee=new ExtortionJI();
					//ee.setVisible(true);
				}
				else if(selected.toString().equals("Murder for hire")){
					System.out.println("Selected");
					//dispose();
					MurderforhireJI mj=new MurderforhireJI();
					//mj.setVisible(true);
				}

		}}
		);
		
		ContinueJIcombo2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                
                JComboBox ContinueJIcombo2 = (JComboBox) event.getSource();

                Object selected = ContinueJIcombo2.getSelectedItem();
                if(selected.toString().equals("Jail Inspector")){
					System.out.println("Selected");
					//dispose();
					JailInspectorJI j=new JailInspectorJI();
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
					DoctorJI d3=new DoctorJI();
					
					//d3.setVisible(true);
				}
				else if(selected.toString().equals("IT Technician")){
					System.out.println("Selected");
					//dispose();
					ITTechnicianA ii3=new ITTechnicianA();
					//ii3.setVisible(true);
				}

		}}
		);
		
		/*co1= new JButton("Description");
		co1.setBounds(200, 400, 100, 50);
		co1.setBackground(Color.GREEN);
		
		co1.addActionListener(this);
		co1.setActionCommand("Description");
		ContinueJIPanel.add(co1);*/
		
		co2= new JButton("FAQ");
		co2.setBounds(400, 400, 100, 50);
		co2.setBackground(Color.CYAN);
		
		co2.addActionListener(this);
		co2.setActionCommand("FAQ");
		ContinueJIPanel.add(co2);
		
		co3= new JButton("Back");
		co3.setBounds(600, 400, 100, 50);
		co3.setBackground(Color.MAGENTA);
		
		co3.addActionListener(this);
		co3.setActionCommand("Back");
		ContinueJIPanel.add(co3);
		
		this.add(ContinueJIPanel);
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