package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Ellie = "cool";
String Nate = "funny";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String person = JOptionPane.showInputDialog("Who are you?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if(person.equalsIgnoreCase("Ellie")) {
	JOptionPane.showMessageDialog(null, "You are " + Ellie);
}
else if(person.equalsIgnoreCase("Nate")) {
	JOptionPane.showMessageDialog(null, "You are " + Nate);
}
else {
	JOptionPane.showMessageDialog(null, "You aren't remarkable");
}
	}
}

