import java.util.*;
import javax.swing.*;
import java.awt.*;

class Home_Page extends JFrame{
	
	private JButton btnAddCustomer;
	private JButton btnViewCustomer;
	private JButton btnUpdateCustomer;
	private JButton btnDeleteCustomer;
	private JButton btnSearchCustomer;
	private JButton btnExit;
	
	private JPanel btnPane;
	
	Home_Page(){
		
		setSize(300,400);
		setTitle("Home Page");
		
		btnAddCustomer = new JButton("ADD CUSTOMER");
		btnViewCustomer = new JButton("View CUSTOMER");
		btnUpdateCustomer = new JButton("Update CUSTOMER");
		btnDeleteCustomer = new JButton("Delete CUSTOMER");
		btnSearchCustomer = new JButton("Search CUSTOMER");
		btnExit = new JButton("Exit");
		
		
		btnPane = new JPanel();
		btnPane.setLayout(new GridLayout(6,1));
		
		btnPane.add(btnAddCustomer);
		btnPane.add(btnViewCustomer);
		btnPane.add(btnUpdateCustomer);
		btnPane.add(btnDeleteCustomer);
		btnPane.add(btnSearchCustomer);
		btnPane.add(btnExit);
		
		add("Center",btnPane);
		
		
		}
	
	
	
	
}
