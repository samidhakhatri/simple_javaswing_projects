import java.awt.event.*;  // for  actionlistener
import javax.swing.*;

public class jbutton2{
public static void main(String args[]){

JFrame frame= new JFrame("click me");
final JTextField tf=new JTextField();

tf.setBounds(100,70,100,20);

JButton button=new JButton("click me");

button.setBounds(130,200,90,30);

button.addActionListener( new ActionListener(){         // defining the anonymous class
public void actionPerformed(ActionEvent e){

tf.setText("WELCOME :)");

}
}
);

frame.add(button);  // adds button to the frame
frame.add(tf);   // adds text field to the frame

frame.setSize(400,400); // sets the size of the frame

frame.setLayout(null);
frame.setVisible(true);
}
}
