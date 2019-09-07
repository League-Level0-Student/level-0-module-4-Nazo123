package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
static int numberOne = 0;
	static int numberTwo =0;
	public static void main(String[] args) {

	for (int i=0;i<10;) {	// 1. Get 2 numbers from the user and convert them to integer.
String one = JOptionPane.showInputDialog("Input a number!");
String two = JOptionPane.showInputDialog("Give a second number!");
		
numberOne = Integer.parseInt(one);
numberTwo = Integer.parseInt(two);
// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What do you want to do with the numbers?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Division" },
				null);
if (operation==3) {
	division();
}
if (operation==2) {
	multiply();
}
if(operation==1) {
	subtract();
}
if (operation==0) {
	add();
}
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.



public static void add(){
	int answer = numberOne + numberTwo;
	JOptionPane.showMessageDialog(null,numberOne+" + "+numberTwo+" = "+answer);
	
}
public static void subtract(){
	int answer = numberOne - numberTwo;
	JOptionPane.showMessageDialog(null,numberOne+" - "+numberTwo+" = "+answer);
	
}
public static void division(){
	int answer = numberOne / numberTwo;
	JOptionPane.showMessageDialog(null,numberOne+" ÷ "+numberTwo+" = "+answer);
	
}
public static void multiply(){
	int answer = numberOne * numberTwo;
	JOptionPane.showMessageDialog(null,numberOne+" x "+numberTwo+" = "+answer);
	
}






}