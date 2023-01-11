package ttrwithgui;

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
        setBackground(Color.lightGray);
        setFocusable(true);
        setSize(1100,749);
        setLocation(230, 0);

        //spaceShip = new SpaceShip();

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

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private class TAdapter extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Clic at " + e.getX() + "; " + e.getY());
            Tratta tratta = IndividuaTratta(e.getPoint());
            if(tratta != null){
                System.out.println(tratta.inizio.getName() + " - " + tratta.fine.getName());
            }
            else
            {
                System.out.println("Nessuna tratta cliccata");
            }
            
        }
        
        private double DistanzaDallaTratta(Point inizio, Point fine, Point clic){
            //return Math.abs((fine.getX() - inizio.getX()) * (inizio.getY() - clic.getY()) - (inizio.getX() - clic.getX()) * (fine.getY() - inizio.getY())) / Math.sqrt(Math.pow(fine.getX() - inizio.getX(), 2) + Math.pow(fine.getY() - inizio.getY(), 2));
            //return Math.sqrt(DistanceSquareToLine(clic.x, clic.y, inizio.x, inizio.y, fine.x, fine.y));
            pair A = new pair(inizio.x, inizio.y);
            pair B = new pair(fine.x, fine.y);
            pair E = new pair(clic.x, clic.y);
            
            return minDistance(A, B, E);
        }
        
        private Tratta IndividuaTratta(Point clic){
            
            Point inizioP;
            Point fineP;
            Stazione inizioS;
            Stazione fineS;
            double minDistance = 100;
            Tratta trattaScelta = null;
            
            for(Tratta tratta : MainBoard.getTabellone().getTratte()){
                inizioS = MainBoard.getTabellone().getStazione(tratta.inizio);
                fineS = MainBoard.getTabellone().getStazione(tratta.fine);
                inizioP = new Point(inizioS.getX(), inizioS.getY());
                fineP = new Point(fineS.getX(), fineS.getY());
                double distanza = this.DistanzaDallaTratta(inizioP, fineP, clic);
                if(distanza < minDistance && distanza < 10){
                    trattaScelta = tratta;
                    minDistance = distanza;
                }
            }
            return trattaScelta;
        }
    }
}
    

