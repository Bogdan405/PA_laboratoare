package sample;

//Multiple tutoriale de pe https://javatutorial.net/swing-jframe-basics-create-jframe au fost folosite
//(am cautat cum sa fac aplicatia sa functioneze cat mai aproape de cerinta, in final am compromis si am folosit ce am inteles
// cel mai bine si ce a mers), Am parcurs si cursul, si desi au fost niste chestii folositoare acolo, nu am
// reusit sa ma folosesc de ele prea mult, dar am reusit sa fac partial sa se comporte ok aplicatia

//Codul commentat e ramas de la diferite iteratii ale aplicatiei. Majoritatea e sters, au mai ramas cateva linii totusi, sunt bune pentru amintire ulterioara.





import compulsory.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;
import java.awt.*;

public class Main {



    public static void main(String[] args) {
        //generam frame-ul, vizibil pe ecran, cu o dimensiune predefinita
        MainFrame MainF = new MainFrame();
        MainF.setVisible(true);
        //MainF.pack();
        MainF.setSize(400,700);
    }
}

