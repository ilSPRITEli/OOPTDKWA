import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CalculatorTwoGUI extends JFrame implements ActionListener {
    private JFrame fr;
    private JButton[] buttons;
    private JTextField textField;
    private String[] buttonTexts = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "x", "0", "C", "=", "/"};
    private Font font = new Font("Arial", Font.PLAIN, 24);
    // private int num1 = 0, size = 0, result = 0;

    public CalculatorTwoGUI(){
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
         new CalculatorTwoGUI();
    }

    //buton_click
    public void actionPerformed(ActionEvent e) {
      //   String command = e.getActionCommand();
      //   if (command.charAt(0) == 'C') {                      
      //      textField.setText("");
      //   }else if (command.charAt(0) == '=') {                    
      //      textField.setText(evaluate(textField.getText()));
      //   }else {                                
      //      textField.setText(textField.getText() + command);
      //   }
    }
   //   public static String evaluate(String expression) {
   //      char[] arr = expression.toCharArray();
   //      String operand1 = "";String operand2 = "";String operator = "";
   //      int result = 0;
  
   //      for (int i = 0; i < arr.length; i++) {
   //         if (arr[i] >= '0' && arr[i] <= '9') {
   //            if(operator.isEmpty()){
   //               operand1 += arr[i];
   //            }else{
   //               operand2 += arr[i];
   //            }
   //         }  
  
   //         if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == 'x') {
   //            operator += arr[i];
   //         }
   //      }
  
   //      if (operator.equals("+")){
   //         result = (Integer.valueOf(operand1) + Integer.valueOf(operand2));
   //      }
   //      else if (operator.equals("-")){
   //         result = (Integer.valueOf(operand1) - Integer.valueOf(operand2));
   //      }
   //      else if (operator.equals("/")){
   //         result = (Integer.valueOf(operand1) / Integer.valueOf(operand2));
   //      }
   //      else if (operator.equals("x")){
   //         result = (Integer.valueOf(operand1) * Integer.valueOf(operand2));  
   //      }        
   //      return "" + result;
   //   }    
    
}
