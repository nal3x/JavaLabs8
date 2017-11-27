import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TempConvert extends JFrame implements ActionListener  {//
    private JPanel row1, row2, row3;
    private JLabel Celsius_Label, Fahr_Label;
    private JTextField Celsius, Fahr;
    private JButton calculateButton, resetButton;

    public TempConvert() {
        super("Celsius to Fahrenheit");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        row1=new JPanel();
        Celsius_Label=new JLabel("Enter Temperature in Celsius :", JLabel.RIGHT);
        Celsius = new JTextField(15);

        row2 = new JPanel();
        calculateButton = new JButton("Calculate");
        calculateButton.setActionCommand("calc");
        
        resetButton=new JButton("Reset Values");
        resetButton.setActionCommand("reset");
        
        //Register an instance of the event handler class as a listener on one or more components
        calculateButton.addActionListener(this); //
        resetButton.addActionListener(this);

        row3=new JPanel();
        Fahr_Label=new JLabel("Temperature in Fahrenheit :", JLabel.RIGHT);
        Fahr = new JTextField(15);

        Container pane = getContentPane();

        GridLayout layout=new GridLayout(3,1);
        pane.setLayout(layout);
        FlowLayout flowlayout = new FlowLayout();

        row1.setLayout(flowlayout);
        row1.add(Celsius_Label);
        row1.add(Celsius);
        pane.add(row1);

        row2.setLayout(flowlayout);
        row2.add(calculateButton);
        row2.add(resetButton);
        pane.add(row2);

        row3.setLayout(flowlayout);
        row3.add(Fahr_Label);
        row3.add(Fahr);
        pane.add(row3);

        setContentPane(pane);
        pack();
    }
    
    public void actionPerformed(ActionEvent e) {
        if ("calc".equals(e.getActionCommand())) {
             double fahr = celsiusToFahr(Double.parseDouble(Celsius.getText()));
             //String s = Double.toString(fahr);
             String s = String.format("%.1f", fahr);
             Fahr.setText(s);
        } else {
            Celsius.setText("");
            Fahr.setText("");
        }
    }
    
    private double celsiusToFahr(double celsius) {
        return 1.8 * celsius + 32;
    }
}

public class Temperature {
    public static void main(String[] args) {
        TempConvert a=new TempConvert();
    }
}