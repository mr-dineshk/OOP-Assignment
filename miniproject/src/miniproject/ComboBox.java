package miniproject;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;//***Adithiya verma project***
public class ComboBox {


	public ComboBox() {
		JFrame f = new JFrame("Program");
		f.setSize(500, 500);
		f.setVisible(true);
		f.setLayout(null);
		
		JLabel name,no;
		
		name = new JLabel("Name :");
	    name.setBounds(127, 150, 100, 40);
	    f.add(name);
	    
		no  = new JLabel("Mobile No. :");
		no.setBounds(100, 200, 100, 40);
		f.add(no);
		
		JTextField t1,M;
		
		t1 = new JTextField();
		t1.setBounds(200, 150, 200, 40);
		f.add(t1);
		
		M = new JTextField();
		M.setBounds(200, 200, 200, 40);
		f.add(M);
		
		JButton submit = new JButton("Submit");
		submit.setBounds(200, 320, 100, 40);
		f.add(submit);
		
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				String name = t1.getText();
				int mobileno = M.getColumns();
				
				JOptionPane.showMessageDialog(f, "name :"+name+"\n"+"Mobile No. :"+mobileno, "Entered Information", 0);
			}
		});
	}
	public static void main(String args[]) {
		new ComboBox();
	}
}