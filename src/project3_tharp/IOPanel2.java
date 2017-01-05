
package project3_tharp;

import java.awt.*;
import javax.swing.*;

public class IOPanel2 extends JPanel{
    private MyCalculatorPanel mcPanel;
    
    //create a lable
    private JLabel resultLabel = new JLabel("Result:", JLabel.CENTER);
    
    //create a text field
    private JTextField resultText = new JTextField("");
    
    //constructor
    public IOPanel2(MyCalculatorPanel mcPanel){
        this.mcPanel = mcPanel;
        setLayout(new GridLayout(1,2));
        resultText.setEditable(false);
        add(resultLabel);
        add(resultText);
        
    }
    
    //setResultText method
    public void setResultText(int result){
        resultText.setText(String.valueOf(result));
    }
    
}//end of the class
