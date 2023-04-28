import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class CalculatorOne extends JFrame implements ActionListener{
    private JFrame fr;
    private JButton buak, lob, kun, han;
    private JTextField textField_1, textField_2 , resField;


    public CalculatorOne(){
        fr = new JFrame("My Calculator");
        fr.setLayout(new GridLayout(4, 1));
        fr.setSize(400, 200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(true);

        JPanel pane = new JPanel();
        pane.setVisible(true);
        pane.setLayout(new FlowLayout());

        textField_1 = new JTextField("0");
        textField_1.setEditable(true);
        textField_2 = new JTextField("0");
        textField_2.setEditable(true);
        resField = new JTextField("");
        resField.setEditable(false);
        
        buak = new JButton("+");
        lob = new JButton("-");
        kun = new JButton("x");
        han = new JButton("/"); 
        buak.addActionListener(this);
        lob.addActionListener(this);
        kun.addActionListener(this);
        han.addActionListener(this);
        


        pane.add(buak);
        pane.add(lob);
        pane.add(kun);
        pane.add(han);

        fr.add(textField_1);
        fr.add(textField_2);
        fr.add(pane);
        fr.add(resField);
        
        

        fr.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        int num_1 = Integer.valueOf(textField_1.getText());
        int num_2 = Integer.valueOf(textField_2.getText());
        Object obj = e.getSource();
        if (obj == buak) {
            resField.setText(String.valueOf(num_1 + num_2));
          } else if (obj == lob) {
            resField.setText(String.valueOf(num_1 - num_2));
          } else if (obj == kun) {
            resField.setText(String.valueOf(num_1 * num_2));
          } else if (obj == han) {
            if (num_2 != 0){
                resField.setText(String.valueOf(num_1 / num_2));
            }else{
                resField.setText("");
            }
          }
        
    }
    public static void main(String[] args){
        new CalculatorOne();}
}