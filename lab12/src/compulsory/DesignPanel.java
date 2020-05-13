package compulsory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DesignPanel extends JPanel{
    final MainFrame frame;
    String nameToAdd;
    JButton someBtn;

    //In final DesignPanel-ul a ramas destul de basic, doar adauga un buton cu nume corespunzator in frame

    public DesignPanel(MainFrame frame,String className){
        this.frame =frame;
        someBtn = new JButton(className);
        init();
    }

    public void init(){
        //setLayout(new GridLayout(5,5));
        //adauga butoane cu optiuni
        this.add(someBtn);


    }

}
