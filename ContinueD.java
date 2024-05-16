import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ContinueD extends JFrame implements ActionListener
{
	private JLabel ContinueDLable,ContinueDLable2;
	//private JTextField loginTextField;
	//private JPasswordField loginPasswordField;
	private JButton co1,co2,co3;
	private JPanel ContinueDPanel;
	private JComboBox ContinueDcombo1,ContinueDcombo2;
	//public static int cou=0;
	
	private String s[] = {"Drug Trafficking","Gunrunning","Money laundering","Extortion","Murder for hire"/*,"Fraud","Human trafficking","Poaching","Black marketing","Political violence","Religious violence","Terrorism","Abduction","Cyber Crime","Rape"*/};
	private String s1[]= {"Jail Inspector","Guard","Doctor","IT Technician"};
	public ContinueD(){
		super("ContinueD");
		this.setSize(1000,800);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		ContinueDPanel=new JPanel();
		ContinueDPanel.setLayout(null);
		
		ContinueDLable=new JLabel("Criminals who did the following crime: ");
		ContinueDLable.setBounds(200,50,400,40);
		ContinueDLable.setBackground(Color.YELLOW);
		ContinueDLable.setOpaque(true);
		ContinueDLable.setFont(new Font("Arial Unicode MS",0,20));
		ContinueDPanel.add(ContinueDLable);
		
		ContinueDcombo1 = new JComboBox(s);
		ContinueDcombo1.setBounds(610, 50, 300, 50);
		ContinueDPanel.add(ContinueDcombo1);
		
		ContinueDLable2=new JLabel("Employees: ");
		ContinueDLable2.setBounds(200,200,400,40);
		ContinueDLable2.setBackground(Color.CYAN);
		ContinueDLable2.setOpaque(true);
		ContinueDLable2.setFont(new Font("Arial Unicode MS",0,20));
		ContinueDPanel.add(ContinueDLable2);
		
		ContinueDcombo2 = new JComboBox(s1);
		ContinueDcombo2.setBounds(610, 200, 300, 50);
		ContinueDPanel.add(ContinueDcombo2);
		
		ContinueDcombo1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                
                JComboBox ContinueDcombo1 = (JComboBox) event.getSource();

                Object selected = ContinueDcombo1.getSelectedItem();
                if(selected.toString().equals("Drug Trafficking")){
					System.out.println("Selected");
					//dispose();
					DrugTraffickingD d=new DrugTraffickingD();
					//d.setVisible(true);
				}
				else if(selected.toString().equals("Gunrunning")){
					System.out.println("Selected");
					//dispose();
					GunrunningD g=new GunrunningD();
					//g.setVisible(true);
				}
				else if(selected.toString().equals("Money laundering")){
					System.out.println("Selected");
					//dispose();
					MoneylaunderingD m=new MoneylaunderingD();
					//m.setVisible(true);
				}
				else if(selected.toString().equals("Extortion")){
					System.out.println("Selected");
					//dispose();
					ExtortionD ee=new ExtortionD();
					//ee.setVisible(true);
				}
				else if(selected.toString().equals("Murder for hire")){
					System.out.println("Selected");
					//dispose();
					MurderforhireD mj=new MurderforhireD();
					//mj.setVisible(true);
				}

		}}
		);
		
		ContinueDcombo2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                
                JComboBox ContinueDcombo2 = (JComboBox) event.getSource();

                Object selected = ContinueDcombo2.getSelectedItem();
                if(selected.toString().equals("Jail Inspector")){
					System.out.println("Selected");
					//dispose();
					JailInspectorD j=new JailInspectorD();
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
					DoctorD d3=new DoctorD();
					
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
		ContinueDPanel.add(co1);*/
		
		co2= new JButton("FAQ");
		co2.setBounds(400, 400, 100, 50);
		co2.setBackground(Color.CYAN);
		
		co2.addActionListener(this);
		co2.setActionCommand("FAQ");
		ContinueDPanel.add(co2);
		
		co3= new JButton("Back");
		co3.setBounds(600, 400, 100, 50);
		co3.setBackground(Color.MAGENTA);
		
		co3.addActionListener(this);
		co3.setActionCommand("Back");
		ContinueDPanel.add(co3);
		
		this.add(ContinueDPanel);
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