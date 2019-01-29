import javax.swing.*;

public class jbutton1{

public static void main(String args[]){

JFrame f=new JFrame("button"); //JFrame works like the main window where components like labels, buttons, textfields are added to create a GUI.
JButton button =new JButton("click here");  // used to create a button

button.setBounds(120,100,90,30);
f.add(button);

f.setSize(400,300);  // sets the size of the window
f.setLayout(null);   // sets the default layout of the window

f.setVisible(true);  // it is by default false
}
}