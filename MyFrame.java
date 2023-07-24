import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {


    JLabel label1, label2, label3,label4,label5,label6,label7,label8;
    JTextField t1, t2;
    JRadioButton male, female;
    JComboBox day, month, year;
    JTextArea tx1, screen;
    JCheckBox terms;
    JButton submit;
    JLabel msg;
    ButtonGroup gen;

    /**
     * 
     */
    MyFrame (){

setTitle("Registration Form");
setSize(700, 500);
setLocationRelativeTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);

Container c = getContentPane();
c.setLayout(null);


label1 =new JLabel("Name");
label1.setBounds(20, 50, 100, 20);
c.add(label1);

t1 = new JTextField();
t1.setBounds(150, 50, 165, 25);
c.add(t1);

label2 =new JLabel("Mobile");
label2.setBounds(20, 100, 100, 20);
c.add(label2);

t2 = new JTextField();
t2.setBounds(150, 100, 165, 25);
c.add(t2);

label3 =new JLabel("Gender");
label3.setBounds(20, 150, 100, 20);
c.add(label3);

male = new JRadioButton("Male");
female = new JRadioButton("Female");
male.setBounds(130, 150, 80, 20);
female.setBounds(220, 150, 80, 20);
c.add(male);
c.add(female);

gen = new ButtonGroup();
gen.add(male);
gen.add(female);

label4 =new JLabel("DOB");
label4.setBounds(20, 200, 100, 20);
c.add(label4);

String days[] ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17",
"18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
String months[] = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUT","SEPT","NOV","DEC"};
String years[] = {"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"};


day = new JComboBox(days);
month = new JComboBox(months);
year = new JComboBox(years);
label5 = new JLabel("Day");
label6 = new JLabel("Month");
label7 = new JLabel("Year");
label5.setBounds(130,180,50,20);
label6.setBounds(200,180,50,20);
label7.setBounds(270,180,50,20);
day.setBounds(130,200,50,20);
month.setBounds(200,200,50,20);
year.setBounds(270,200,50,20);


c.add(label7);
c.add(label6);
c.add(label5);
c.add(day);
c.add(month);
c.add(year);

label8 =new JLabel("Adress");
label8.setBounds(20, 250, 100, 20);
c.add(label8);

tx1 = new JTextArea();
tx1.setBounds(130, 240, 200, 50);
c.add(tx1);

terms = new JCheckBox("Please accept terms and conditions");
terms.setBounds(50,300,250,20);
c.add(terms);

submit =new JButton("submit");
submit.setBounds(150, 350, 80, 20);
c.add(submit);
submit.addActionListener(this);

screen =new JTextArea();
screen.setBounds(350, 50, 300, 300);
c.add(screen);

msg = new JLabel("");
msg.setBounds(20, 400, 250, 20);
c.add(msg);

setVisible(true);


    }

    public void actionPerformed(ActionEvent e){

        if(terms.isSelected()){
msg.setText("Registration Successful");
String name = t1.getText();
String mobile = t2.getText();
String gender = "male";
if(female.isSelected()){
    gender="female";
}
String dob = day.getSelectedItem()+" "+month.getSelectedItem()+" "+year.getSelectedItem();
String address = tx1.getText();

screen.setText("name : "+ name+"\nMobile : "+mobile+"\nGender : "+gender+"\nDob : "+dob+"\n Address: "+address);



        }
        else
        {
            msg.setText("Please, accept terms and conditions!");

            screen.setText(" ");
        }
    }
    
}
