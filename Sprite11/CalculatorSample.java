import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CalculatorSample extends JFrame implements ActionListener {
    private JFrame fr;
    private JButton[] buttons;
    private JTextField textField;
    private String[] buttonTexts = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "x", "0", "c", "=", "/"};
    private Font font = new Font("Arial", Font.PLAIN, 24);
    private int num_1 = 0;
    private int num_2 = 0;
    private String oper = "def";
    // private int num1 = 0, size = 0, result = 0;

    public CalculatorSample(){
        fr = new JFrame("My Calculator");
        JPanel pane2 = new JPanel();
        pane2.setVisible(true);
        JPanel pane3 = new JPanel();
        pane3.setVisible(true);

        
        fr.setSize(300, 400);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(true);

        textField = new JTextField("", 10);
        textField.setFont(font);
        textField.setEditable(false);
        pane2.add(textField);

        pane3.setLayout(new GridLayout(4, 4));
        buttons = new JButton[16];
        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(buttonTexts[i]);
            buttons[i].setFont(font);
            buttons[i].addActionListener(this);
            pane3.add(buttons[i]);
        }


        fr.add(pane2, BorderLayout.NORTH);
        fr.add(pane3, BorderLayout.CENTER);

        fr.setVisible(true);
    }
    public static void main(String[] args){
         try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
         } catch (Exception e){
            e.printStackTrace();
         }
         new CalculatorSample();
    }

    //buton_click
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(buttons[14])){
            num_2 = Integer.valueOf(textField.getText());
            System.out.println(oper);
            switch (oper) {
                case "+" -> {
                    System.out.println("wow");
                    textField.setText(num_1 + num_2 + "");
                }
                case "-" -> textField.setText(num_1 - num_2 + "");
                case "x" -> textField.setText(num_1 * num_2 + "");
                case "/" -> {
                    if (num_2 != 0){
                        textField.setText(num_1 / num_2 + "");}
                    else{
                        textField.setText("");
                    }
                }
                case "" -> {
                    textField.setText("");
                }
                default -> {
                }
            }
        }else if (e.getSource().equals(buttons[13])){
             textField.setText("");
        }else if (e.getSource().equals(buttons[3])){
             num_1 = Integer.valueOf(textField.getText());
             textField.setText("");
             System.out.println("buak");
             oper = "+";
        }else if (e.getSource().equals(buttons[7])){
             num_1 = Integer.valueOf(textField.getText());
             textField.setText("");
             System.out.println("lob");
             oper = "-";
        }else if (e.getSource().equals(buttons[11])){
             num_1 = Integer.valueOf(textField.getText());
             textField.setText("");
             System.out.println("kun");
             oper = "x";
        }else if (e.getSource().equals(buttons[15])){
             num_1 = Integer.valueOf(textField.getText());
             textField.setText("");
             System.out.println("han");
             oper = "/";
        }
        else{
             textField.setText(textField.getText() + (((JButton) e.getSource()).getText()));
        }
    }
}