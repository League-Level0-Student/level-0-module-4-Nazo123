package _09_pi_aloud;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.io.IOException;
import java.util.Scanner;

public class PiAloud {

	// 1. Make a main method and make sure your program can run
public static void main(String[] args) {
	

	// 2. Make a String variable to hold the value of Pi. You could use http://www.piday.org/million/ for the value.
String Pi = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317";
	// 3. Print out some digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
for (int i=0;i<10;i++) {
	
	System.out.print((Pi.charAt(i)));
	
}
	// 4. Print ALL the digits of of Pi (hint: use a loop)
//for (int o=0;o<141;o++) {
	
	//speak((Pi.charAt(o)));
	
//}
	// 5. Use the speak() method to speak all the digits of Pi.
System.out.println("   Guess the next number of pi");
	// [ADVANCED]
if	(getInputFromUser()==(Pi.charAt(10))){
	System.out.println("Correct");
}
else {
	System.out.println("Wrong");
}
	// *7. Compare the users' char to the next digit of Pi
	// *8. If they are correct, print out "correct". If they are not, print "incorrect" to System.err.println
}
	private static void print(char charAt) {
		// TODO Auto-generated method stub
		
	}
	static void speak(char characterToSpeak) {
		try {
			Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}
}



