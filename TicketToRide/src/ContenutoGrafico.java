

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

        spaceShip = new SpaceShip();

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

        g2d.drawImage(loadImage(),0,0,this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }

    private Image loadImage() {
       
    }
         
    private class TAdapter extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            spaceShip.keyReleased(e);
        }

    }
}
    

