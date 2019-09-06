package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	static String pet;
	static int task;
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What pet do you want to buy? A dog or a cat?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
for (int i=0;1<4;i++) {

			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			task = JOptionPane.showOptionDialog(null, "What do you want to do to your pet to make it happier?", "1", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Give It Food", "Take It On A Walk", "Groom It" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
petResponse();
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happinessLevel>59) {
	break;
}
	}
	}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void petResponse(){
		if (task==1) {
			if(pet.equalsIgnoreCase("Dog")) {
				 happinessLevel =+25;
				JOptionPane.showMessageDialog(null, "Dog loves walking!");
			}
			else {
			happinessLevel =+10;
			JOptionPane.showMessageDialog(null, "Cat likes walking");
			}
		}
		if (task==0) {
			if(pet.equalsIgnoreCase("Cat")) {
				happinessLevel =+25;
				JOptionPane.showMessageDialog(null, "Cat loves eating!");
			}
			else {
			happinessLevel =+10;
			JOptionPane.showMessageDialog(null, "Dog likes eating");
			}
		}
		if (task==3) {
			if(pet.equalsIgnoreCase("Dog")) {
				happinessLevel =+10;
				JOptionPane.showMessageDialog(null, "Dog likes being groomed!");
			}
			else {
			 happinessLevel =+10;
			JOptionPane.showMessageDialog(null, "Cat likes being groomed");
			}
		}
		
	}
}