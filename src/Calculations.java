import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculations extends JFrame {
    private JPanel row1, row2, row3, row4;

    private JLabel label_arithmoi;
    private JTextField[] text_fields = new JTextField[5];
    private JLabel label_average;
    private JTextField  field_average;
    private JButton reset, calculate;

     public Calculations(){
            super ("ΥΠΟΛΟΓΙΣΜΟΙ");
            row1=new JPanel();
            row2=new JPanel();
            row3=new JPanel();
            row4=new JPanel();

            // Συμπληρώστε κώδικα για δημιουργία των components

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            Container pane = getContentPane();
            GridLayout glayout=new GridLayout(4,1);
            pane.setLayout(glayout);

            FlowLayout layout = new FlowLayout();
            row1.setLayout(layout);
            row1.add(label_arithmoi);
            pane.add(row1);

            row2.setLayout(layout);
            for (int i=0; i<text_fields.length; i++)
                  row2.add(text_fields[i]);
            pane.add(row2);

            row3.setLayout(layout);
            row3.add(reset);
            row3.add(calculate);
            pane.add(row3);

            field_average.setEditable(false);

            row4.setLayout(layout);
            row4.add(label_average);
            row4.add(field_average);
            pane.add(row4);


    // Συνδέστε τα κατάλληλα συστατικά με την ενεργοποίηση των γεγονότων (Events)


            setContentPane(pane);
            pack();
     }

    public static void main(String args[]){
        new Calculations(); 
    }
    
}

