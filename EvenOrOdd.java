package practice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EvenOrOdd implements ActionListener {
JTextField t;
JButton b;
JLabel l;
EvenOrOdd() {
JFrame f=new JFrame("EvenOddChecker");
JPanel p=new JPanel();
t=new JTextField(10);
t.setBounds(50,50,300,30);
b=new JButton("Check");
b.setBounds(100,80,200,30);
l=new JLabel("");
l.setBounds(50,110,300,30);
p.add(t);
p.add(b);
p.add(l);
b.addActionListener(this);
f.setContentPane(p);
f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String args[])
{
new EvenOrOdd();
}
public void actionPerformed(ActionEvent e) {
String s=t.getText();
int n=Integer.parseInt(s);
if(n%2==0)
l.setText("Number is even");
else
l.setText("Number is odd");
}

}
