package practice;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JPanel;

public class TrafficLight extends JPanel implements ActionListener{
JRadioButton r1,r2,r3;
Color r,y,gg;
public TrafficLight() {
setBounds(0,0,640,480);
r1=new JRadioButton("Red");
r2=new JRadioButton("Yellow");
r3=new JRadioButton("Green");
r1.setSelected(true);
r=Color.RED;
y=getBackground();
gg=getBackground();
ButtonGroup gp=new ButtonGroup();
gp.add(r1);
gp.add(r2);
gp.add(r3);
add(r1);
add(r2);
add(r3);
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);

}
public void paintComponent(Graphics g) {
super.paintComponent(g);
g.drawOval(50, 50, 50, 50);
g.drawOval(50, 110, 50, 50);
g.drawOval(50, 170, 50, 50);
g.setColor(r);
g.fillOval(50, 50, 50, 50);
g.setColor(y);
g.fillOval(50, 110, 50, 50);
g.setColor(gg);
g.fillOval(50, 170, 50, 50);
}
public void actionPerformed(ActionEvent e) {
if(r1.isSelected()==true) {
r=Color.RED;
y=getBackground();
gg=getBackground();
}
else if(r2.isSelected()==true) {
r=getBackground();
y=Color.yellow;
gg=getBackground();
}
else if(r3.isSelected()==true) {
r=getBackground();
y=getBackground();
gg=Color.green;
}
repaint();
}

public static void main(String[] args) {
// TODO Auto-generated method stub
	TrafficLight s= new TrafficLight();
JFrame f=new JFrame("Traffic Light");
f.setSize(300,300);
f.setVisible(true);
f.add(s);
//new GUITrafficLight();
}

}

