import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import java.awt.event.*;

public class Overweightfood extends JFrame implements ActionListener  {
	JButton btnCancel, btnDelete;
	 JPanel pbtn;
	 JButton btnInsert;
	ImageIcon normalIcon1,normalIcon2;
	Overweightfood() {
		 
		
		
		 setTitle("과체중 음식 가이드");
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     Container c = getContentPane();
	     c.setBackground(Color.WHITE);
	     c.setLayout(new FlowLayout());
	    
	     
	     
	     
	     JLabel label1 = new JLabel(new ImageIcon("C:\\pbl\\obesefood.jpg"));
	        add(label1,BorderLayout.NORTH);
	        

	        pbtn = new JPanel();
	        btnCancel = new JButton("닫기");
	        pbtn.add(btnCancel);
	        add(pbtn,BorderLayout.SOUTH);
	        
	        btnCancel.addActionListener(this);
	        
	    
	     setSize(600, 400);
	     setVisible(true);        
	     setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	      
	       
	}
	  public static void main(String[] args) {
	      new Overweightfood();
	      
	   }
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnCancel) {
			this.dispose(); //창닫기 (현재창만 닫힘)
		}
		
	}
}
