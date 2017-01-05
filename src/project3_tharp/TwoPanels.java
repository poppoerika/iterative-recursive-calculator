
package project3_tharp;

import java.awt.*;
import javax.swing.*;


public class TwoPanels extends JPanel{
    public MyCalculatorPanel mcPanel;
    public IOPanel1 ioPanel1 = new IOPanel1(this);
    public RadioButtonsPanel radioButtonsPanel = new RadioButtonsPanel(this);
    
    
    //constructor
    public TwoPanels(MyCalculatorPanel mcPanel){
        this.mcPanel = mcPanel;
        setLayout(new BorderLayout());
        add(radioButtonsPanel, BorderLayout.NORTH);
        add(ioPanel1, BorderLayout.CENTER);
    }
    
}
