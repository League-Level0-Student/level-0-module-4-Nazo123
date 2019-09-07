package _11_own_adventure;

import javax.swing.JOptionPane;

public class own_adventure {
public static void main(String[] args) {
	
	int operation = JOptionPane.showOptionDialog(null, "It is a dark and stormy night...\n You walk into the woods to get some fresh air...\n You hear a noise...", "Pick Your Path", 0,
			JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Investigate", "Run Away" },
			null);
	
	if (operation==1) {
		JOptionPane.showMessageDialog(null, "You run back to your house and close the door\n"
				+ "                           The End");
	}
	else {
		
		JOptionPane.showMessageDialog(null, "As you walk closer to the noise you see that it is a hurt animal in a ditch");
		int op = JOptionPane.showOptionDialog(null, "", "Decide", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Go in", "Look for a branch" },
				null);
		if (op==0) {
		JOptionPane.showMessageDialog(null, "You jump into the hole...\n Only to realize that you have no way out\n You're are knocked unconscious forever :");	
			
		}
		else {
			int p = JOptionPane.showOptionDialog(null, "You find the perfect branch and heard a loud noise...", "Decide", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Run away through the swamp", "Save the animal" },
					null);
			if (p==0) {
				JOptionPane.showMessageDialog(null, "You fall and hit your head, and you get hit unconscious forever");
			}
			else {
				JOptionPane.showMessageDialog(null, "You find a hurt puppy and take him home and he becomes your best friend!");
			}
			
		
		}
		
	}
	
	
	
	
	
	
	
}
}
