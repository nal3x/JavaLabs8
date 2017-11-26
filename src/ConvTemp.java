import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConvTemp extends JFrame {
    private JPanel row1;
    private JLabel Celsius_Label;
    private JTextField Celsius;

    private JPanel row2;
    private JButton calculate;
    private JButton reset;

    private JPanel row3;
    private JLabel Fahr_Label;
    private JTextField Fahr;


    public ConvTemp() {
        super("Celsius to Fahrenheit");

        row1=new JPanel();
        Celsius_Label=new JLabel("Enter Temperature in Celsius :", JLabel.RIGHT);
        Celsius = new JTextField(15);

        row2=new JPanel();
        calculate=new JButton("Calculate");
        reset=new JButton("Reset Values");

        row3=new JPanel();
        Fahr_Label=new JLabel("Temperature in Fahrenheit :", JLabel.RIGHT);
        Fahr = new JTextField(15);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Container pane = getContentPane();
        GridLayout layout=new GridLayout(3,1);
        pane.setLayout(layout);

        //Prwti grammi
        FlowLayout flayout = new FlowLayout();
        row1.setLayout(flayout);
        row1.add(Celsius_Label);
        row1.add(Celsius);
        pane.add(row1);

        //Deuteri grammi
        row2.setLayout(flayout);
        row2.add(calculate);
        row2.add(reset);
        pane.add(row2);

        //Triti grammi
        row3.setLayout(flayout);
        row3.add(Fahr_Label);
        row3.add(Fahr);
        pane.add(row3);

        setContentPane(pane);
        pack();
        
        calculate.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    double cel = Double.parseDouble(Celsius.getText());
                    double far = 1.8*cel+32.;
                    Fahr.setText(Double.toString(far));
                }   
            }
        );

        reset.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Celsius.setText(null);
                    Fahr.setText(null);
                }
               }
        );
    }

    public static void main(String[] args) {
        ConvTemp a=new ConvTemp();
    }
}