package compulsory;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.*;

public class MainFrame extends JFrame
{
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;

    public MainFrame(){
        super("MY drawing applicattion");
        init();
    }

    private void init(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        canvas = new DrawingPanel(this);
        configPanel = new ConfigPanel(this);
        controlPanel= new ControlPanel(this);

        add(canvas, BorderLayout.CENTER);
        add(configPanel, BorderLayout.NORTH);
        add(controlPanel, BorderLayout.SOUTH);


        pack();
    }

    public int getSidesFigure(){
        return configPanel.getSides();
    }
}