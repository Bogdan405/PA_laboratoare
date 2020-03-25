package compulsory;

import javax.swing.*;
import java.awt.*;

public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel sidesLabel;
    JSpinner sidesField;
    JComboBox colorCombo;


    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        sidesLabel = new JLabel("Number of sides:");
        sidesField = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        sidesField.setValue(6);

        colorCombo = new JComboBox<Color>(); // nu am mai folosit asta in final, poate ulterior la optional saptamna urmatoare
        colorCombo.addItem(Color.blue);
        colorCombo.addItem(Color.black);


        add(sidesLabel);
        add(sidesField);//avem label si input pentru numarul de laturi al figurii desenate
        //add(colorCombo);

    }

    public int getSides(){
        return (int) sidesField.getValue();//pentru imput utilizator
    }


}
