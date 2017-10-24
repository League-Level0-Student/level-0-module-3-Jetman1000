package loops;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lotterynumbers {
public static void main(String[] args) {
	Random randy= new Random();
	int rand= randy.nextInt(100);
	int ralph= randy.nextInt(126)+100;
	int randyy= randy.nextInt(86)+225;
	int ran= randy.nextInt(176)+317;
	int rran= randy.nextInt(200)+124;
	System.out.println(rand);
	JOptionPane.showMessageDialog(null, "The numbers are ")+rand+"100"+ralp+"126+100"+randyy+"86+225"+ran+"176+317"rran+"200+124";
	
}
}
