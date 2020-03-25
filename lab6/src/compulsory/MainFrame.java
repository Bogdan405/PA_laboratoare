package compulsory;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.*;

public class MainFrame extends JFrame
{
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;

    public MainFrame(){ // vom ave o fereastra numita LAB6
        super("LAB6");
        init();
    }

    private void init(){ // setam continutul aplicatiei

        setDefaultCloseOperation(EXIT_ON_CLOSE);//inchidem frame-ul se opreste rularea

        canvas = new DrawingPanel(this);//corpul propriu zis unde apar desenele
        configPanel = new ConfigPanel(this);//o sa avem butoane de configuratie in partea de sus
        controlPanel= new ControlPanel(this);//optiuni pentru aplicatie in partea de jos

        add(canvas, BorderLayout.CENTER); // adaugam, mijloc (elementul descris mai sus la canvas)
        add(configPanel, BorderLayout.NORTH);// adugam, sus (^)
        add(controlPanel, BorderLayout.SOUTH);//adaugam jos (^)


        pack();
    }

    public int getSidesFigure(){
        return configPanel.getSides();//retrunam din configPanel valoare curenta selectata
        //(probabil exista o metoda mai eleganta, dar am probleme cu conexiunea la net(cautare mai dificila), si metoda asta face treaba)
    }
}