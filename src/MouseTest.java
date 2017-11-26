import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseTest extends JFrame {
    DrawingPanel panel;
    public MouseTest() {
        super("Test Mouse Events");
        panel = new DrawingPanel();
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String args[]) {
        MouseTest mt = new MouseTest();
    }
}

class DrawingPanel extends JPanel {
    private Color recColor;

    public DrawingPanel() {
        recColor=Color.GREEN;
    	addMouseListener(new MouseListener() {
    		public void mouseClicked(MouseEvent e) {
    		}

    		public void mousePressed(MouseEvent e) {
    			int x = e.getX();
    			int y = e.getY();
    			if (x >= 100 && x <= 300 && y >= 50 && y <= 150) {
        			recColor=Color.RED;
        			repaint();
    			}
    		}
    
                public void mouseReleased(MouseEvent e) {
    			int x = e.getX();
    			int y = e.getY();
    			if (x >= 100 && x <= 300 && y >= 50 && y <= 150) {
        			recColor=Color.GREEN;
        			repaint();
    			}
    		}
    
                public void mouseEntered(MouseEvent e) {
    		}
    
                public void mouseExited(MouseEvent e) {
    		}}
        ); 
    }
    public void paintComponent(Graphics g) {
        g.setColor(recColor);
        g.fillRect(100, 50, 200, 100);
        g.setColor(Color.BLACK);
        g.drawRect(100, 50, 200, 100);
        }
}

