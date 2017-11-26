import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShowMenu extends JFrame {
    private JMenuBar menuBar;
    private JMenu fileM, editM;
    private JMenuItem fileNew, fileExit;
    private JMenuItem editUndo, editCut, editPaste;
    private JTextArea text1;
    private JPanel panel;
    private MenuHandler handler;

    public ShowMenu(){
        super ("ΠΑΡΑΔΕΙΓΜΑ MENU");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        handler=new MenuHandler();
        Container pane = getContentPane();
        panel=new JPanel();

        // Γραμμή Menu
        menuBar = new JMenuBar();

        // Δημιουργία Menu "File"
        fileM = new JMenu("Αρχείο");
        fileNew = new JMenuItem("Νέο");
        fileNew.addActionListener(handler);
        fileNew.setActionCommand(wtf());
        fileM.add(fileNew);
        fileExit = new JMenuItem("Έξοδος");       
        fileExit.addActionListener(handler);
        fileM.add(fileExit);

        // προσθήκη Menu File στη γραμμή
        menuBar.add(fileM);

        // Δημιουργία Menu "Edit"
        editM = new JMenu("Επεξεργασία");
        editUndo = new JMenuItem("Αναίρεση");
        editUndo.addActionListener(handler);
        editM.add(editUndo);
        editCut = new JMenuItem("Αποκοπή");
        editCut.addActionListener(handler);
        editM.add(editCut);
        editPaste = new JMenuItem("Επικόλληση");
        editPaste.addActionListener(handler);
        editM.add(editPaste);

        // προσθήκη Menu Edit στη γραμμή
        menuBar.add(editM);

        // προσθήκη γραμμής Menu στο JFrame
        setJMenuBar(menuBar);

        text1=new JTextArea(10, 80);
        panel.add(text1);
        pane.setLayout(new FlowLayout());
        pane.add(panel);
        setContentPane(pane);
         pack();
     }
    
    private String wtf() {
        return String.format("%010d", 0).replace("0","WTF ");
    }

//getActionCommand() gives you a String representing the action command.
//The value is component specific! We can use setActionCommand(String command)
class MenuHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==fileExit)
            System.exit(0);
        else {
            String enteredCommand=e.getActionCommand();
            text1.setText(enteredCommand);
        }
    }
}


    public static void  main(String args[]) {
        new ShowMenu(); 
    } 
}
