package project3_tharp;

import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MyFrame extends JFrame{
    //set the final int WIDTH and HEIGHT
    static final int WIDTH = 350, HEIGHT = 350;
    
    //constructor1
    public MyFrame (){
        super("My Frame");
        setFrame(WIDTH, HEIGHT);
    }
    
    //constructor2
    public MyFrame(String title){
        super(title);
        setFrame(WIDTH, HEIGHT);
    }
    
    //constructor3
    public MyFrame(String title, int width, int height){
        super(title);
        setFrame(width, height);
    }
    
    //display method
    public void display(){
        setVisible(true);
    }
    
    //setFrame method
    private void setFrame(int width, int height){
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}//end of the class

class WindowHandler extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e){
     File file = new File("efficiency.txt");
     if(file.exists()){
         System.out.println("This file already exists.");
         System.exit(0);
     }
     
     try(PrintWriter output = new PrintWriter(file);){
         int iterative;
         int recursive;
         int iterativeE;
         int recursiveE;
         
         for(int i = 0; i < 11; i++){
         output.print(i);
         output.print(", ");
         iterative = Sequence.computeIterative(i);
         iterativeE = Sequence.getEfficiency();
         output.print(iterativeE);
         output.print(", ");
         recursive = Sequence.computeRecursive(i);
         recursiveE = Sequence.getEfficiency();
         output.println(recursiveE);
         
                 }
     }  catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "This file was not found.");
        }
    }
  }
