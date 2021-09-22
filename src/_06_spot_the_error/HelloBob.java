package _06_spot_the_error;

import javax.swing.JOptionPane;

public class HelloBob {
public static void main(String[] args) {
	
	// This program is supposed to pop up    Hello Bob   only if the user enters the name   Bob
	// BUT it's not working. If you don't believe me, try running it.
	// Change one line of code to fix this program.
	
	String name = JOptionPane.showInputDialog("What is your name?");
	
	if (name == "Bob") {
		JOptionPane.showMessageDialog(null, "Hello Bob");
	} else {
		JOptionPane.showMessageDialog(null, "You're not Bob!!!");
	}
}
}
