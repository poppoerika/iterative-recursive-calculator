
package project3_tharp;

import java.awt.*;
import javax.swing.*;

public class IOPanel3 extends JPanel{
    private MyCalculatorPanel mcPanel;
    
    //create a lable
    private JLabel efficiencyLabel = new JLabel("Efficiency:", JLabel.CENTER);
    
    //create a text field
    private JTextField efficiencyText = new JTextField("");
    
    //constructor
    public IOPanel3(MyCalculatorPanel mcPanel){
        this.mcPanel = mcPanel;
        setLayout(new GridLayout(1,2));
        efficiencyText.setEditable(false);
        add(efficiencyLabel);
        add(efficiencyText);
        
    }
    
    //setEfficiencyText method
    public void setEfficiencyText(int result){
        efficiencyText.setText(String.valueOf(result));
    }
    
}//end of the class
