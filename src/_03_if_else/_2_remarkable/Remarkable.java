package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	
		String input =JOptionPane.showInputDialog(null,"Enter someones name");
	
	
		String nolife =
				String.format("%s is remarkable! Not only have they never touched grass,\n", input) +
				String.format("but %s also has over 5000 hours in League of Legends. \n", input) +
				String.format("But the most remarkable thing is that %s is a Discord moderator! \n", input) +
				String.format("Fantastic!");
		
		// 2. Ask the user to enter a name. Store their answer in a variable.
	
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		JOptionPane.showMessageDialog(null, nolife);
	}
}

