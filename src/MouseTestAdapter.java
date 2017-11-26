import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseTestAdapter extends JFrame {
    TheDrawingPanel panel;
    public MouseTestAdapter() {
        super("Test Mouse Events");
        panel = new TheDrawingPanel();
        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String args[]) {
        MouseTestAdapter mt = new MouseTestAdapter();
    }
}

class TheDrawingPanel extends JPanel {
    private Color recColor;

    public TheDrawingPanel() {
        recColor=Color.BLUE;
        
        class MouseListener extends MouseAdapter {
            public void mousePressed(MouseEvent e) {
    			int x = e.getX();
    			int y = e.getY();
    			if (x >= 100 && x <= 300 && y >= 50 && y <= 150) {
        			recColor=Color.YELLOW;
        			repaint();
    			}
    		}
                public void mouseReleased(MouseEvent e) {
    			int x = e.getX();
    			int y = e.getY();
    			if (x >= 100 && x <= 300 && y >= 50 && y <= 150) {
        			recColor=Color.BLUE;
        			repaint();
    			}
    		}
        }
        
        MouseListener ml = new MouseListener();
    	addMouseListener(ml);
    }
    public void paintComponent(Graphics g) {
        g.setColor(recColor);
        g.fillRect(100, 50, 200, 100);
        g.setColor(Color.BLACK);
        g.drawRect(100, 50, 200, 100);
        }
}

