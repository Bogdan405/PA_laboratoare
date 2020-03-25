package compulsory;

import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.Random;

public class DrawingPanel extends JPanel {
    final MainFrame frame;
    final static int W = 800, H = 600;

    BufferedImage image;
    Graphics2D graphics;

    public DrawingPanel(MainFrame frame) { // clasa de desen
        this.frame = frame;
        createOffscreenImage();
        init();
    }

    private void createOffscreenImage() { // continutul dinafara clasei de desen va fi alb
        image = new BufferedImage(W, H, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, W, H);
    }

    private void init() {
        setPreferredSize(new Dimension(W,H));
        setBorder(BorderFactory.createEtchedBorder());
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                drawShape(e.getX(),e.getY());//la apasarea mause, se deseneaza figura cu proprietatile selectate
                repaint();
            }
        });
    }

    private void drawShape(int x, int y){//desenam o figura, setant fiecare proprietaate
        Random rand = new Random();
        int radius = (int)(rand.nextFloat()*100); //dimensiunea aleatoare
        int sides = frame.getSidesFigure();//Laturile conform inputului (cerinta ca unul dintre inputuri sa fie folosit la desen)
        Color color = new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat());//culoare aleatoare RGB
        graphics.setColor(color);
        graphics.fill(new RegularPolygon (x,y,radius,sides));//functia de desen poligon regulat asa cum este prezentata la laborator in PDF

    }


    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(image, 0, 0, this);
    }

}

