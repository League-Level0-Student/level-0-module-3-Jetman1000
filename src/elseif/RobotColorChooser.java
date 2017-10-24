
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
Robot josh = new Robot();
	
		//3. ask the user what color they would like the robot to draw
		for(int y=0;y<3;y++){
String k=JOptionPane.showInputDialog("what color do you want to have the robot to draw?");
		josh.setSpeed(100);
		//4. use an if/else statement to set the pen color that the user requested
if(k.equals("blue")){
	josh.setPenColor(Color.blue);
	for(int i=0;i<4;i++){
		josh.penDown();
	josh.move(100);
josh.turn(90);
	}
}else if(k.equals("red")){
	josh.setPenColor(Color.red);
	for(int i=0;i<4;i++){
		josh.penDown();
	josh.move(100);
josh.turn(90);
	}
}else if(k.equals("pink")){
	josh.setPenColor(Color.pink);
	for(int i=0;i<4;i++){
		josh.penDown();
	josh.move(100);
josh.turn(90);
	}
}else if(k.equals("green")){
	josh.setPenColor(Color.green);
	for(int i=0;i<4;i++){
		josh.penDown();
	josh.move(100);
josh.turn(90);
	}
}else if(k.equals("black")){
	josh.setPenColor(Color.black);
	for(int i=0;i<4;i++){
		josh.penDown();
	josh.move(100);
josh.turn(90);
	}
}else if(k.equals("yellow")){
	josh.setPenColor(Color.yellow);
	for(int i=0;i<4;i++){
		josh.penDown();
	josh.move(100);
josh.turn(90);
	}
        //5. if the user doesn’t enter anything, choose a random color
}else {
	josh.setRandomPenColor();;
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		josh.setPenWidth(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
for(int i=0;i<4;i++){
		josh.penDown();
	josh.move(100);
josh.turn(90);
		}
	}
}
	}}

