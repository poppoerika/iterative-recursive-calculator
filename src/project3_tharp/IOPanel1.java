
package project3_tharp;

import java.awt.*;
import javax.swing.*;

public class IOPanel1 extends JPanel{
    private TwoPanels twoPanel;
    
    //create a lable
    private JLabel enterLabel = new JLabel("Enter i:", JLabel.CENTER);
    
    //create a text field
    private JTextField enterText = new JTextField("");
    
    //constructor
    public IOPanel1(TwoPanels twoPanel){
        this.twoPanel = twoPanel;
        setLayout(new GridLayout(1,2));
        add(enterLabel);
        add(enterText);
        
    }
    
    //getEnterText method
    public int getEnterText(){
        return Integer.parseInt(enterText.getText());
    }
    
}//end of the class
