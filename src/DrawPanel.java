import java.awt.Graphics;
import javax.swing.JPanel;

// Η κλάση JPanel παρέχει την περιοχή στην οποία μπορούμε να σχεδιάσουμε
public class DrawPanel extends JPanel {
    
    /* Κάθε κλάση JPanel συμπεριλαμβανομένης και της δική μας DrawPanel
     διαθέτει μια μέθοδο paintComponent, την οποία καλεί αυτόματα
     (callback)
     Η μέθοδος paintComponent απαιτεί μια παράμετρο δηλαδή ένα
     αντικείμενο τύπου Graphics */

    public void paintComponent( Graphics g ) {
        int height = getHeight(); // Height of panel
        int width = getWidth(); // Width of panel
        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);

    }
}