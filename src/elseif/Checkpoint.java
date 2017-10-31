package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	
String d =JOptionPane.showInputDialog("type your favorite color");
	JOptionPane.showMessageDialog(null,d + " is my favorite color too");
	
	 Robot bill = new Robot();
	
	for(int i=0;i<4;i++){
		bill.penDown();
		bill.move(100);
		bill.turn(90);
	}
	
} 
}
