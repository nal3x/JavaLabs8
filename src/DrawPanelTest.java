import javax.swing.*;

public class DrawPanelTest {
    //creates a window to display the drawing
    public static void main(String[] args) {
        // create a new frame to hold the panel
        JFrame application = new JFrame();// create a panel that contains our drawing
        DrawPanel panel = new DrawPanel();
        // set the frame to exit when it is closed
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        // add the panel to the frame
        application.add(panel);
        // set the size of the frame
        application.setSize(350, 300);
        // make the frame visible
        application.setVisible( true );
    }
}