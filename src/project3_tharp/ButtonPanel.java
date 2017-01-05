
package project3_tharp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ButtonPanel extends JPanel{
    private JButton computeButton = new JButton("Compute");
    private MyCalculatorPanel mcPanel;
    
    //constructor
    public ButtonPanel(MyCalculatorPanel mcPanel){
        
        this.mcPanel = mcPanel;
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        add(computeButton);
    
    
    //event listener for the compute button.
    computeButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(mcPanel.twoPanel.radioButtonsPanel.isIterative() == true){
                iterativeCalculation();
                getEfficiency();    
            }
            if(mcPanel.twoPanel.radioButtonsPanel.isRecursive() == true){
                recursiveCalculation();
                getEfficiency();
            }
            
        }
    });
}
    //recurisveCalculation method
    public void recursiveCalculation() throws NumberFormatException{
       try{
        int number =mcPanel.twoPanel.ioPanel1.getEnterText();
        mcPanel.ioPanel2.setResultText(Sequence.computeRecursive(number));
       }
       catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Input must be numeric.");
           System.exit(0);
       }
    }
    
    //iterativeCalculation method
    public void iterativeCalculation()throws NumberFormatException{
        try{
        int number = mcPanel.twoPanel.ioPanel1.getEnterText();
        mcPanel.ioPanel2.setResultText(Sequence.computeIterative(number));
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Input must be numeric.");
            System.exit(0);
        }
    }
    
    //getEfficiency method
    public void getEfficiency(){
        mcPanel.ioPanel3.setEfficiencyText(Sequence.getEfficiency());
    }
}
