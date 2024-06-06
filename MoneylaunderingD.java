import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import java.sql.*;

public class MoneylaunderingD //extends JFrame
{
	
	public MoneylaunderingD(){
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String s;
	try{
       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop1","root","");
       st = con.createStatement();
       s="SELECT `ID`, `Name`, `Age`, `Gender`, `MedicalReport` FROM `moneylaundering`;";
       rs = st.executeQuery(s);
       ResultSetMetaData rsmt = rs.getMetaData();
       int c = rsmt.getColumnCount();
       Vector column = new Vector(c);
       for(int i = 1; i <= c; i++)
       {
           column.add(rsmt.getColumnName(i));
       }
       Vector data = new Vector();
       Vector row = new Vector();
       while(rs.next())
       {
           row = new Vector(c);
           for(int i = 1; i <= c; i++){
               row.add(rs.getString(i));
           }
           data.add(row);
       }
       JFrame frame = new JFrame();
       frame.setSize(1000,800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel panel = new JPanel();
        JTable table = new JTable(data,column);
        JScrollPane jsp = new JScrollPane(table);
        panel.setLayout(new BorderLayout());
        panel.add(jsp,BorderLayout.CENTER);
        frame.setContentPane(panel);
        frame.setVisible(true);
               
        }
		catch(Exception e){
        JOptionPane.showMessageDialog(null, "ERROR");
		}finally{
       try{
       st.close();
       rs.close();
       con.close();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "ERROR CLOSE");
       }
   }
      
  }
}