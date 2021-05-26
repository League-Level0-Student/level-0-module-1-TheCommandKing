package _04_int._1_riddler;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0
import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		int score = 0;
		String answer = JOptionPane.showInputDialog(
				"Which creature walks on four legs in the morning, two legs in the afternoon, and three legs in the evening?");
		if (answer.equalsIgnoreCase("man")) {
			JOptionPane.showMessageDialog(null, "Correct!!!");
			score += 1;
		}
		else {
			JOptionPane.showMessageDialog(null,
					"Wrong. The answer is Man. He crawls on all fours as a baby, then walks on two feet as an adult, and then walks with a cane as an old man.");
		}
		answer = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
		if (answer.equalsIgnoreCase("candle")) {
			JOptionPane.showMessageDialog(null, "Correct!!!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null,
					"Wrong. The answer is candle. A candle is tall before the max melts away.");
		}
		answer = JOptionPane.showInputDialog(
				"You can drop me from the tallest building and I'll be fine, but if you drop me in water I die. What am I?");
		if (answer.equalsIgnoreCase("paper")) {
			JOptionPane.showMessageDialog(null, "Correct!!!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong. The answer is paper.");
		}
		JOptionPane.showMessageDialog(null, "Your score is: " + score + "");
	}
}
