/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grocerylist;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
public class GroceryList {

    public static void main(String[] args) {
        Frame frame = new Frame("Shopping List");
        Panel panel = new Panel();
        Label label = new Label();
        
        Checkbox check = new Checkbox("Milk");
        Checkbox check1 = new Checkbox("Eggs");
        Checkbox check2 = new Checkbox("Mapple Syrup");
        
        frame.setTitle("Grocery List");
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(250, 250);
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(150, 200));
        
        label.setText("Grocery Items");
        
        frame.add(panel);
        frame.add(label);
        frame.add(check);
        frame.add(check1);
        frame.add(check2);
        
        frame.addWindowListener(new WindowAdapter(){
        @Override
        public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    });
        
        ItemListener strike = e ->{
          if(e.getStateChange()== ItemEvent.SELECTED){
              ((Checkbox) e.getSource()).setForeground(Color.red);
          } else{
              ((Checkbox) e.getSource()).setForeground(Color.black);
          }  
        };
        
        check.addItemListener(strike);
        check1.addItemListener(strike);
        check2.addItemListener(strike);
   
   
    }
    
}
