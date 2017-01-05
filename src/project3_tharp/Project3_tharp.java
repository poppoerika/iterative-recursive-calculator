//This program will prompt a user to enter an integer number i and to choose either iterative or recurisive 
//to compute a culculation.
package project3_tharp;

import java.awt.event.*;


public class Project3_tharp {
    
    public static void main(String[] args) throws Exception{
       MyCalculatorApp mcApp = new MyCalculatorApp();
        mcApp.display();
        mcApp.addWindowListener(new WindowHandler());
        
    }//end of the main
    
}//end of week6d_2 class

 
