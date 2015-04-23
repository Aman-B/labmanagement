import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.ButtonGroup;
class Patient1 extends JFrame{
	 JComboBox tests,timeslot;
	 JRadioButton rb1,rb2,rb3,rb4;
	 JLabel name,price,requirements,available,Name,Price,Requirements,Available;
	 JButton booktime,card,cod,ok,confirm,feed,back;
	 JLabel sel,selt,mess,cont;
	 JLabel pay,codcash,cno,cvv,pass;
	 JTextField cnotext,cvvtext,content;
	 JPasswordField passtext;
	 JLabel l1,l2,l3,l4;
	 JButton select,acc;
	 
 	 Patient1()
	 {
		 JFrame pat=new JFrame();
		 Container cont =pat.getContentPane();
		 cont.setLayout(null);
		 String[] list={"Uric Acid test","Bilirubin","Total Proteins","Albumin","Chloride"};
		 String[] time={"10:00-10:30","11:00-11:30","2:00-3:00","3:30,4:30"};
		 tests=new JComboBox(list);
		 timeslot=new JComboBox(time);
		 pat.add(tests);
		 tests.setBounds(25,50,120,20);
		 sel=new JLabel("Select test");
		 
		 pat.add(sel);
		 sel.setBounds(25,20,70,20);
		 
		 tests.addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent ae) {
		    	  
		    	  JFrame boo=new JFrame();
					Container co=boo.getContentPane();
					co.setLayout(null);
					
					timeslot.setBounds(275,50,120,20);
					boo.add(timeslot);
					selt=new JLabel("Select time slot");
					selt.setBounds(275,20,120,20);
					boo.add(selt);
					name=new JLabel("Name Of The Test:");
					name.setBounds(20,20,120,20);
					boo.add(name);
					
					price=new JLabel("Cost:");
					price.setBounds(20,60,120,20);
					boo.add(price);
					
					available=new JLabel("availability:");
					available.setBounds(20,100,120,20);
					boo.add(available);
					
					requirements=new JLabel("Pre requisites:");
					requirements.setBounds(20,140,120,20);
					boo.add(requirements);
					
					Name=new JLabel();
					Name.setBounds(140,20,90,20);
					boo.add(Name);
					
					Price=new JLabel();
					Price.setBounds(140,60,90,20);
					boo.add(Price);
					
					Requirements=new JLabel();
					Requirements.setBounds(140,140,120,20);
					boo.add(Requirements);
					
					Available=new JLabel();
					Available.setBounds(140,100,100,20);
		        if (tests.getSelectedItem().equals("Uric Acid test")) {
		        	Name.setText("Uric Acid");
		        } 
		        else if (tests.getSelectedItem().equals("Bilirubin")) {
		          
		        	Name.setText("Bilirubin");
		          
		        } 
		        else if(tests.getSelectedItem().equals("Total Proteins")) {
		        	Name.setText("Total Proteins");
		        }
		        else if(tests.getSelectedItem().equals("Albumin"))
		        {
		        	Name.setText("Albumin");
		        }
		        else if(tests.getSelectedItem().equals("Chloride"))
		        {
		        	Name.setText("Chloride");
		        }
		        booktime=new JButton("Book");
			 	booktime.setBounds(20,200,70,25);
			 	boo.add(booktime);
			 	
			 	booktime.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ae){
						
						JFrame mon=new JFrame();
						Container con=mon.getContentPane();
						con.setLayout(null);
						pay=new JLabel("Select Payment Options");
						pay.setBounds(30,30,150,20);
						mon.add(pay);
						cod=new JButton("Cash On Report Delivary");
						cod.setBounds(30,80,175,25);
						mon.add(cod);
						
						cod.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent ae){
							
									JFrame n=new JFrame();
									Container conta=n.getContentPane();
									conta.setLayout(null);
									
									codcash=new JLabel("You have selected to pay Cash on delivary,click on OK to confirm");
									codcash.setBounds(10,20,400,20);
									n.add(codcash);
									
									ok=new JButton("Confirm");
									n.add(ok);
									ok.setBounds(10,70,100,25);
									ok.addActionListener(new ActionListener(){
										public void actionPerformed(ActionEvent ae){
											JOptionPane.showMessageDialog(null, "SUCCESS");
										}
									});
									n.setSize(600,300);
									n.setVisible(true);
							}
						});						
						card=new JButton("Credit/Debit Card");
						card.setBounds(30,125,175,25);
						mon.add(card);
						
						card.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent ae){
								
								JFrame ne=new JFrame();
								Container o=ne.getContentPane();
								o.setLayout(null);
								
								mess=new JLabel("Enter The Following Details");
								mess.setBounds(10,20,175,20);
								ne.add(mess);
								
								JLabel cno=new JLabel("Card Number");
								cno.setBounds(10,50,90,20);
								ne.add(cno);
								
								cnotext=new JTextField();
								cnotext.setBounds(150,50,150,20);
								ne.add(cnotext);
								
								JLabel cvv=new JLabel("CVV");
								cvv.setBounds(10,80,40,20);
								ne.add(cvv);
								
								cvvtext=new JTextField();
								cvvtext.setBounds(150,80,150,20);
								ne.add(cvvtext);
								
								JLabel pass=new JLabel("Password");
								pass.setBounds(10,110,90,20);
								ne.add(pass);
								
								passtext=new JPasswordField();
								passtext.setBounds(150,110,150,20);
								ne.add(passtext);
								
								confirm=new JButton("Submit");
								confirm.setBounds(10,150,90,25);
								ne.add(confirm);
								
								confirm.addActionListener(new ActionListener(){
									public void actionPerformed(ActionEvent ae){
										JOptionPane.showMessageDialog(null, "SUCCESS");
									}
								});
								ne.setSize(400,400);
								ne.setVisible(true);
							}
						});
						mon.setSize(500,500);
						mon.setVisible(true);
						
					}
			 	});
			 	
		        boo.setSize(500,500);
				boo.setVisible(true);
				
		      }
		    });
		 			 	
		 feed=new JButton("FeedBack");
		 feed.setBounds(175,50,100,25);
		 pat.add(feed);
		 
		 feed.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					
					JFrame jf=new JFrame();
					Container g=jf.getContentPane();
					g.setLayout(null);
					rb1=new JRadioButton("Excellent");
					rb1.setBounds(10,30,100,25);
					jf.add(rb1);
					
					rb2=new JRadioButton("Good");
					rb2.setBounds(110,30,60,25);
					jf.add(rb2);
					
					rb3=new JRadioButton("Average");
					rb3.setBounds(180,30,90,25);
					jf.add(rb3);
					
					rb4=new JRadioButton("poor");
					rb4.setBounds(270,30,80,25);
					jf.add(rb4);
					
					 ButtonGroup group = new ButtonGroup();
					    group.add(rb1);
					    group.add(rb2);
					    group.add(rb3);
					    group.add(rb4);
					    
					l1=new JLabel("How do you rate the promptness of the report delivary?");  
					l1.setBounds(10,10,400,25);
					jf.add(l1);		
					
					l2=new JLabel("How do you rate the behaviour of the delivary staff?");
					l2.setBounds(10,60,400,25);
					jf.add(l2);
					
					rb1=new JRadioButton("Excellent");
					rb1.setBounds(10,80,100,25);
					jf.add(rb1);
					
					rb2=new JRadioButton("Good");
					rb2.setBounds(110,80,60,25);
					jf.add(rb2);
					
					rb3=new JRadioButton("Average");
					rb3.setBounds(180,80,90,25);
					jf.add(rb3);
					
					rb4=new JRadioButton("poor");
					rb4.setBounds(270,80,80,25);
					jf.add(rb4);
					
					 ButtonGroup group2 = new ButtonGroup();
					    group2.add(rb1);
					    group2.add(rb2);
					    group2.add(rb3);
					    group2.add(rb4);
					
					l3=new JLabel("Were your greviences properly addressed by the Customer care?");
					l3.setBounds(10,110,400,25);
					jf.add(l3);
					
					
					rb1=new JRadioButton("Excellent");
					rb1.setBounds(10,140,100,25);
					jf.add(rb1);
					
					rb2=new JRadioButton("Good");
					rb2.setBounds(110,140,60,25);
					jf.add(rb2);
					
					rb3=new JRadioButton("Average");
					rb3.setBounds(180,140,90,25);
					jf.add(rb3);
					
					rb4=new JRadioButton("poor");
					rb4.setBounds(270,140,80,25);
					jf.add(rb4);
					
					 ButtonGroup group3 = new ButtonGroup();
					    group3.add(rb1);
					    group3.add(rb2);
					    group3.add(rb3);
					    group3.add(rb4);
					
					l4=new JLabel("Overall,are you satisfied with our work?");
					l4.setBounds(10,170,400,25);
					jf.add(l4);
					
					rb1=new JRadioButton("Excellent");
					rb1.setBounds(10,200,100,25);
					jf.add(rb1);
					
					rb2=new JRadioButton("Good");
					rb2.setBounds(110,200,60,25);
					jf.add(rb2);
					
					rb3=new JRadioButton("Average");
					rb3.setBounds(180,200,90,25);
					jf.add(rb3);
					
					rb4=new JRadioButton("poor");
					rb4.setBounds(270,200,80,25);
					jf.add(rb4);
					
					 ButtonGroup group4 = new ButtonGroup();
					    group4.add(rb1);
					    group4.add(rb2);
					    group4.add(rb3);
					    group4.add(rb4);
					
					  select=new JButton("Submit");
					  select.setBounds(10,250,80,25);
					  jf.add(select);
					 select.addActionListener(new ActionListener(){
							public void actionPerformed(ActionEvent ae){
								
								JOptionPane.showMessageDialog(null, "Thank You For Your Response!");
							}
					 });
					jf.setSize(500,500);
					jf.setVisible(true);
				}
				});
		 
		 acc=new JButton("Account");
		 acc.setBounds(175,80,100,25);
		 pat.add(acc);
		 
		 pat.setSize(400,400);
		 pat.setVisible(true);
	 }
}

public class Patient{
	public static void main(String[] args)
	{
		Patient1 ob=new Patient1();
	}
}