package miniproject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Exam {
	
	Exam(){ // reference action event demo separate main method //constructor
		ExamTab();	
	}
        public void ExamTab() {
        JFrame ex = new JFrame ("Adding Exam");
        ex.setSize(600, 600);
        ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ex.setLayout(null);
        ex.getContentPane().setBackground(Color.pink);
        
        JTextField a = new JTextField();
        a.setBounds(200, 100, 200, 40);

        JDateChooser c = new JDateChooser();
        c.setBounds(200, 150, 200, 40);
       
        JLabel label1 = new JLabel("Exam Name:");
        JLabel label2 = new JLabel("Exam Date:");
        label1.setBounds(100, 100, 150, 40);
        label2.setBounds(100, 150, 150, 40);
        
        JButton b=new JButton("See Remaining Days"); 
        JButton e= new JButton("Add Exam");
	    b.setBounds(100,250,150,30);
	    e.setBounds(300,250,100,30);
      
        ex.add(label1);
        ex.add(label2);
        ex.setVisible(true);
        ex.add(a);
        ex.add(c);
        ex.add(b);
        ex.add(e);
        
        e.addActionListener(new ActionListener(){  
        //override
            public void actionPerformed(ActionEvent e){
				
				JOptionPane.showMessageDialog(ex, " Exam Added ", "Information", JOptionPane.INFORMATION_MESSAGE );
			}
		});
        
        b.addActionListener(new ActionListener() { // annonumous class
        	public void actionPerformed(ActionEvent e) {
        		
        		new RemainingDay();
        	    ex.dispose();
        	}
        });
    }
}

class RemainingDay {
   
    
     RemainingDay() {
    	 Remdays();
    	 
     }
     public void Remdays(){
        JFrame rem = new JFrame ();
    	rem.setSize(600, 600);
        rem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rem.setLayout(null);
        rem.getContentPane().setBackground(Color.cyan);
        
        JTextField a = new JTextField();
        JDateChooser c = new JDateChooser();
        a.setBounds(200, 50, 200, 40);
        c.setBounds(200, 100, 200, 40);
        
        String column[]= {"Exam name","Exam Date","Remaining Days"};
        String data[][] = { {"DPCO","29-12-2022","DEFAULT"},    
                			{"DS","02-01-2023","DEFAULT"},    
                			{"OOPS","04-01-2023","DEFAULT"},
                			{"FDS","06-01-2023","DEFAULT"},
                			{"DM","09-01-2023","DEFAULT"}};
        
        JTable table = new JTable(data, column);
        table.setBounds(45, 220, 500, 300);
        JScrollPane sp=new JScrollPane(table);    
        rem.add(sp);
    
        JLabel label1 = new JLabel("Exam Name:");
        JLabel label2 = new JLabel("Exam Date:");
        JButton x=new JButton("Exit"); 
        JButton y= new JButton("Delete");
        JButton z= new JButton("Update");
        JButton back = new JButton(" < ");
        
        label1.setBounds(100, 50, 150, 40);
        label2.setBounds(100, 100, 150, 40);
	    x.setBounds(100,170,100,30);
	    y.setBounds(250,170,100,30);
	    z.setBounds(400,170,100,30);
        back.setBounds(10, 10, 50, 20);
        
        rem.add(table);
        rem.add(label1);
        rem.add(label2);
        rem.setVisible(true);
        rem.add(a);
        rem.add(c);
        rem.add(x);
        rem.add(y);
        rem.add(z);
        rem.add(back);

    back.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		rem.dispose();
    		new Exam();
    		  
    	}
    });
    
    x.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		rem.dispose();
    	}
    });
   }

}
