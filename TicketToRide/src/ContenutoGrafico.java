

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;




public class ContenutoGrafico extends JPanel implements ActionListener{


    private Timer timer;
    private final int DELAY = 10;

    public ContenutoGrafico() {

        initBoard();
    }

    private void initBoard() {

        addMouseListener(new TAdapter());
        setBackground(Color.black);
	setFocusable(true);
        setSize(1100, 749);
        setLocation(230, 0);

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
        
        Toolkit.getDefaultToolkit().sync();
    }
    
    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(loadImage(),0,0, this);
         
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
         
    private class TAdapter extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

    }
    
     private BufferedImage loadImage(){
        URL imagePath = getClass().getResource("img/board.png");
        BufferedImage result = null;
        try {
            result = ImageIO.read(imagePath);
        } catch (IOException e) {
            System.err.println("Errore, immagine non trovata");
        }

        return result;
    }
}
    

