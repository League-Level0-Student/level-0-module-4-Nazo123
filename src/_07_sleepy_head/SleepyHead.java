package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
       int a = JOptionPane.showConfirmDialog(null, "Are you sleeping in?","",JOptionPane.YES_NO_OPTION) ;
    		  if (a==1) {
    			  
    		  }
    		  else {
        
    	boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        
         /// Ask the user for these values using a confirm dialog like the one below
        int answer = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         if (answer==1) {
        	 isWeekday=false;
         }
         else {
        	 isWeekday=true;
         }
         int an = JOptionPane.showConfirmDialog(null, "Is it a Vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         if (an==1) {
        	 isVacation=false;
         }
         else {
        	 isVacation=true;
         }
         if (isWeekday & isVacation!=true) {
        	 JOptionPane.showMessageDialog(null, "Wake up sleepy head!");
         }
         else if(isWeekday==false) {
        	 JOptionPane.showMessageDialog(null, "Sleep in");
         }
         else if (isVacation&isWeekday) {
        	 JOptionPane.showMessageDialog(null, "Sleep in");
        	 
         }


        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }}
}
