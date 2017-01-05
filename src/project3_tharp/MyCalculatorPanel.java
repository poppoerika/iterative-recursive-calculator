
package project3_tharp;

import java.awt.*;
import javax.swing.*;

public class MyCalculatorPanel extends JPanel{
    public TwoPanels twoPanel = new TwoPanels(this);
    public IOPanel2 ioPanel2 = new IOPanel2(this);
    public IOPanel3 ioPanel3 = new IOPanel3(this);
    public ButtonPanel buttonPanel = new ButtonPanel(this);
    
    //constructor
    public MyCalculatorPanel(){
        setLayout(new BorderLayout());
        setBackground(Color.MAGENTA);
        add(twoPanel, BorderLayout.NORTH);
        add (ioPanel2, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.EAST);
        add(ioPanel3, BorderLayout.SOUTH);
        
    }
    
}//end of the class
