package compulsory;


import compulsory.*;
import javafx.event.EventHandler;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import java.io.IOException;
import java.time.format.TextStyle;

public class ControlPanel extends JPanel {
    final MainFrame frame;

    //Initial planuisem alta aspect dar nu a iesit cum voiam si l-am schimbat
    //JButton classBtn = new JButton("ClassType");
    //JButton instanceBtn = new JButton("LoadClass");



    public ControlPanel(MainFrame frame){
        this.frame =frame;
        init();
    }

    public void init(){
        //setLayout(new GridLayout(1,4));
        //adauga butoane cu optiuni

        //Creem un buton cu input pentru a lua string-ul pe baza caruie instantiem clasele

        JButton b=new JButton("Make it");
        b.setBounds(100,100,140, 40);
        //facem un label pentru claritate
        JLabel label = new JLabel();
        label.setText("Scrieti mai sus clasa care trebuie instantiata");
        label.setBounds(10, 10, 100, 100);
        //acest label ar trebui sa apara dupa fiecare click pe "Make It"
        JLabel label1 = new JLabel();
        label1.setBounds(10, 110, 200, 100);
        //aici scriem
        JTextField textfield= new JTextField();
        textfield.setBounds(110, 50, 130, 30);
        //add la toate elementele declarate
        this.add(label1);
        this.add(textfield);
        this.add(label);
        this.add(b);
        //am experimentat putin cu diferite layout-uri dar am lasat Grid din cauza unui neajuns, anume afisare claselor instantiate
        this.setLayout(new GridLayout(26,6));

        //this.frame.setVisible(true);
        //action listener


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg) {
                label1.setText(textfield.getText());
                DesignPanel designPanel = new DesignPanel(frame,textfield.getText());
                add(designPanel, BorderLayout.CENTER);
                Class clazz = null;
                try {
                    clazz = Class.forName(textfield.getText());
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                //Am incercat cateva metode sa si adaug in frame claza care se instantiaza,
                //nu am reusit, am parcurs tutoriale (scrise, conexiunea la internet nu imi permite sa ma uit la Video peste 144p, zona rurala montana)
                // si cursul, presupun ca nu mi-am dat seama ce trebuia sa caut
                //Deoarece nu a iesit cu clasa instantiata, am ales sa creez un buton pentru fiecare input pentru
                //a vedea ce clase sunt instatiate, cele scrise gresit nu se vor instatia (erori in terminal, aplicatia continua)
                // butonul va aparea indiferent de input (exceptand input vid sau identic cu inputul precedent).


            }
        });



    }

}
