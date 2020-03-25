package compulsory;


import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton saveBtn = new JButton("save");
    JButton loadBtn = new JButton("load");
    JButton resetBtn = new JButton("reset");
    JButton exitBtn = new JButton("exit");

    public ControlPanel(MainFrame frame){
        this.frame =frame;
        init();
    }

    public void init(){
        setLayout(new GridLayout(1,4));

        //buttons
        this.add(saveBtn);
        this.add(loadBtn);
        this.add(resetBtn);
        this.add(exitBtn);

        saveBtn.addActionListener(this::save);
        loadBtn.addActionListener(this::load);
        resetBtn.addActionListener(this::reset);
        exitBtn.addActionListener(this::exit);
    }

    private void save(ActionEvent e){
        try{
            ImageIO.write(frame.canvas.image,"PNG", new File("./test.png"));
        }
        catch (IOException ex){
            System.err.println(ex);
        }
    }

    private void exit(ActionEvent e){
        frame.dispose();
    }

    private void reset(ActionEvent e){
        frame.dispose();
    }
    private void load(ActionEvent e){
        frame.dispose();
    }
}
