
package project3_tharp;

import java.awt.*;

public class MyCalculatorApp extends MyFrame{
    //constructor
   public MyCalculatorApp(){
       super("Calculator Application", 360, 200);
       add(new MyCalculatorPanel());
   }
}//end of the class

