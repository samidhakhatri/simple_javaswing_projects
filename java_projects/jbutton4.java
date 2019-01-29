import javax.swing.*;

public class jbutton4{

public static void main(String args[]){

JFrame frame=new JFrame("Icon button");

JButton button=new JButton(new ImageIcon("C:\\Users\\lenovo\\Documents\\java_projects\\x.png"));     // adds the image on the button

button.setBounds(150,180,100,60);

frame.add(button);

frame.setLayout(null);
frame.setSize(400,400);
frame.setVisible(true);

}
}