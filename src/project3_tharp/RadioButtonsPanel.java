
package project3_tharp;

import javax.swing.*;
import java.awt.*;


public class RadioButtonsPanel extends JPanel{
    private TwoPanels twoPanel;
    private JRadioButton iterativeRadio = new JRadioButton("Iterative");
    private JRadioButton recursiveRadio = new JRadioButton("Recursice");
    
    //constructor
    public RadioButtonsPanel(TwoPanels twoPanel){
        ButtonGroup bg = new ButtonGroup();
        bg.add(iterativeRadio);
        bg.add(recursiveRadio);
        iterativeRadio.setSelected(true);
        
        this.twoPanel = twoPanel;
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        add(iterativeRadio);
        add(recursiveRadio);
    }
    
    public boolean isIterative(){
       
        return iterativeRadio.isSelected();
       
    }
    
    public boolean isRecursive(){
        return recursiveRadio.isSelected();
    }
    
}
