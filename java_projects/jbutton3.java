import javax.swing.*;
import java.awt.event.*;

public class jbutton3{
public static void main(String args[]){

JFrame frame=new JFrame("click me program");   // declares the title of the frame


JTextField tf=new JTextField();
tf.setBounds(100,80,180,20);

JButton button = new JButton("click here");
button.setBounds(140,180,90,30);

button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e){

tf.setText("WELCOME :)");

}
}
);

frame.add(button);
frame.add(tf);

frame.setSize(400,400);
frame.setLayout(null);
frame.setVisible(true);
}
}
