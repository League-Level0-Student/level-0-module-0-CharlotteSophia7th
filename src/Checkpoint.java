import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog(null,"What is your favorite color?");
	JOptionPane.showMessageDialog(null, color + " is also my favorite color!");
	Robot c= new Robot();
	c.penDown();
	c.setSpeed(5);
	
	for(int i=0; i<3; i++) {
	c.turn(120);
	c.move(50);
	}
	c.hide();
}
}
