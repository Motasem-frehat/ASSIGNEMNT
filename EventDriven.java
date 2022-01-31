package assessment;

import javax.swing.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Scanner;

public class EventDriven {
	public static void main(String[] args) {
		 
		JFrame f=new JFrame(); //object
		JLabel label = new JLabel("Are you healthy?");
		JRadioButton r1=new JRadioButton("A) Yes");    //created an object from the class its name is Radio Button
		JRadioButton r2=new JRadioButton("B) No");    
		label.setBounds(40, 10, 150, 30);// here we have set the size and location of the frame in the Radio Button 
		r1.setBounds(75,50,100,30);    // here we set the size and location of the frame in the r1 
		r2.setBounds(75,100,100,30);    // here we set the size and location of the frame in the r2 
		f.add(r1);f.add(r2); f.add(label);     // here we added the frame in the radio Button
		f.setSize(300,300);   //Specify the size and width 
		f.setLayout(null);    
		//Here we put the things that should start when clicking on the r1
		r1.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame f=new JFrame(); 
				JLabel label = new JLabel("What do you like?");
				JRadioButton r1=new JRadioButton("A) Fruits");    
				JRadioButton r2=new JRadioButton("B) Vegetables");    
				r1.setBounds(75,50,100,30);    
				r2.setBounds(75,100,100,30);   
				label.setBounds(40, 10, 150, 30);

				f.add(r1);f.add(r2);   f.add(label);
				f.setSize(300,300);    
				f.setLayout(null);    
				r1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
				 			favoruitFruit();
			}
			});
             r2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
				 			favoruiteVegetables();
			}
			});
 			f.setVisible(true); 
			}

		});

		r2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("I advise you to become healthy, eat healthily, eat a healthy diet, and go to the gym because it brings a lot of harm to you that you are an unhealthy person.");				
			}
		});
		f.setVisible(true); 

	}
	public static void favoruitFruit(){
		JFrame f=new JFrame(); 
		JRadioButton r1=new JRadioButton("A) Apple");    
		JRadioButton r2=new JRadioButton("B) Manga"); 
		JLabel label = new JLabel("What do you like? ");
		r1.setBounds(75,50,100,30);    
		r2.setBounds(75,100,100,30); 
		label.setBounds(40, 10, 150, 30);

		f.add(r1);f.add(r2);f.add(label); 	
		f.setSize(300,300);    
		f.setLayout(null);    
     r1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("The benefit of your chosen fruit: Apples maintain a healthy heart, a good choice!");
			}
		});
     r2.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("The benefit of your chosen fruit: Manga has a great role in regulating the work of the digestive system, a good choice!");
	}
});
    f.setVisible(true); 

	}
	
	public static void favoruiteVegetables(){
		JFrame f=new JFrame(); 
		JRadioButton r1=new JRadioButton("A) Cucumber");    
		JRadioButton r2=new JRadioButton("B) Broccoli");
		JLabel label = new JLabel("What do you like? ");
		r1.setBounds(75,50,100,30);    
		r2.setBounds(75,100,100,30); 
		label.setBounds(40, 10, 150, 30);

		f.add(r1);f.add(r2);f.add(label); 	
		f.setSize(300,300);    
		f.setLayout(null);    
        r1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("The benefit of your chosen Vegetables: Cucumber reduces the complications of diabetes, a good choice!");
			}
		});
r2.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		     System.out.println("Broccoli reduces cholesterol levels in the blood, a good choice!");
	}
});
    f.setVisible(true); 

	
	}
	}		