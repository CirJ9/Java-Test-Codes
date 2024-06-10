/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sexbomb;
import java.awt.*;

public class SexBomb {

    public static void main(String[] args) {
       Frame frame = new Frame("Hello");
       
       Label lb1 = new Label("Label 1");
       Label lb2 = new Label("Label 2");
       Label lb3 = new Label("Label 3");
       
       TextField txt = new TextField("HEHE");
       
       TextArea txtArea = new TextArea("");
       
       Button btn = new Button("Subscribe");
       
       frame.setSize(300, 250); 
       frame.setResizable(true);
       frame.setVisible(true);
       frame.setLayout(new FlowLayout());
       
       txt.setPreferredSize(new Dimension (100, 30));
       
       txtArea.setPreferredSize(new Dimension (100, 100));
       
       btn.setLabel("label");
       
       frame.add( lb1);
       frame.add( lb2);
       frame.add( lb3);
       
       frame.add(txt);
       frame.add(txtArea);
       
       frame.add(btn);
    }
    
}
