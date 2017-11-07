//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String cool= "no";
		String nice= "yes";
		String y=JOptionPane.showInputDialog("Do you like bananas?");
		//2. if they say no, 
		if(y==cool){
			JOptionPane.showMessageDialog(null, "Boi you Crazy!");
			System.exit(0);
		}
		
			//tell them they are crazy 
		
			//and end quiz
		
		//3. if they say yes
		if(y==nice){
			String v=JOptionPane.showInputDialog("what's your favorite hobby");
			JOptionPane.showMessageDialog(null, v+" is much with bananas! ");
		}
		//	ask them what is their favorite hobby
		
		//	show a pop up that says "<your hobby> is much better with bananas!"
		

		//4. OPTIONAL: if they say something other than â€œyesâ€� or â€œnoâ€�
		if(y != nice){
			JOptionPane.showMessageDialog(null, "You're bananas!");
		}
		if(y != cool){
			JOptionPane.showMessageDialog(null, "You're bananas!");
		}
		//	show a pop up that says â€œYou are bananas!â€�
	
	}

}
