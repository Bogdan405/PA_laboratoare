package compulsory;

import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame
{

    ControlPanel controlPanel;
    DesignPanel designPanel;

    public MainFrame(){ // vom ave o fereastra numita LAB12
        super("LAB12");
        init();
    }

    private void init(){ // setam continutul aplicatiei

        setDefaultCloseOperation(EXIT_ON_CLOSE);//inchidem frame-ul se opreste rularea

        controlPanel= new ControlPanel(this);//vom avea posibilitatea sa adaugam elemente prin Control Panel
        add(controlPanel, BorderLayout.NORTH);//Punem elementul in sus
        //this.setSize(455,455);

        pack();
    }


}