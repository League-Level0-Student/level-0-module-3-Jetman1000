//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		String q="https://www.youtube.com/watch?v=nhy8c3BOZJk";
		String y="https://www.youtube.com/watch?v=DuJF7DHlOZA";
		// 1. Ask the user how many cats they have
String s=JOptionPane.showInputDialog("how many cats do you have?");
		// 2. Convert their answer into an int
int x=Integer.parseInt(s);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if(x>3){
	JOptionPane.showMessageDialog(null, "You're A CRAZY CAT LADY!!!");
}else if(x<3){
playVideo(q);
	// 4. If they have 3 or less, call the method below to show them a cat video
}else if(x==0){
	playVideo(y);
}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

