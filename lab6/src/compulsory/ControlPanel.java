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

        //adauga butoane cu optiuni
        this.add(saveBtn);
        this.add(loadBtn);
        this.add(resetBtn);
        this.add(exitBtn);

        //selectam actiunea care se face la apasarea fiecarui buton
        saveBtn.addActionListener(this::save);
        loadBtn.addActionListener(this::load);
        resetBtn.addActionListener(this::reset);
        exitBtn.addActionListener(this::exit);
    }


    //actiune de save, genereaza o fila noua
    private void save(ActionEvent e){
        try{
            ImageIO.write(frame.canvas.image,"PNG", new File("./test.png"));
        }
        catch (IOException ex){
            System.err.println(ex);
        }
    }

    //exit straight forward eliminam tot frame-ul
    private void exit(ActionEvent e){
        frame.dispose();
    }

    //tot exit(reset), nu am reusit sa imi dau seama de implementare, dar cerinta nu cerea o actiune specifica la acest buton
    private void reset(ActionEvent e){
        frame.dispose();
    }

    //tot exit(load), nu am reusit sa imi dau seama de implementare, dar cerinta nu cerea o actiune specifica la acest buton
    private void load(ActionEvent e){
        frame.dispose();
    }
}
