package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class UNbirthday {
	public static void main(String[] args) {

		String birthday = JOptionPane.showInputDialog(null, "When is your birthday?");
		if (birthday.equals("05/18")) {
JOptionPane.showMessageDialog(null,"Happy Birthday");
		}
		else {
			JOptionPane.showMessageDialog(null,"Happy UN-Birthday");
		}
	}
}