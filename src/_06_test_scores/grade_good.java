package _06_test_scores;

import javax.swing.JOptionPane;

public class grade_good {

	public static void main(String[] args) {
		
		
		String score = JOptionPane.showInputDialog("What score did you get on your test? Write your score as the nearest tenth");
		
		double s = Double.parseDouble(score);
		
		if (s<=110 & s>=90) {
			
			JOptionPane.showMessageDialog(null, "Wow you must of studied hard to get that A");
			
			
		}
		else if (s<=89.9&s>=80) {
			
			JOptionPane.showMessageDialog(null, "Wow you must of studied well get that B");
			
		}
else if (s<=79.9 & s>=70) {
			
			JOptionPane.showMessageDialog(null, "You must of a little bit to get that C");
			
		}
else if (s<=69.9&s>=60) {
	
	JOptionPane.showMessageDialog(null, "Wow you need to studie better get that D");
	
}

else if (s<=59.9) {
	
	JOptionPane.showMessageDialog(null, "Are you even trying");
	
}
	}
	
}
