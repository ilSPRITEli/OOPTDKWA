import javax.swing.*;
import java.awt.*;
public class TellerGUI extends JFrame{
    private JFrame fr;
    private JButton dep, wtd, ext;
    private JLabel tbl, tamnt;
    private JTextField blnc, amnt;

    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        fr.setLayout(new GridLayout(2,1));
        fr.setSize(300, 200);
        fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fr.setResizable(false);

        JPanel pane2 = new JPanel();
        pane2.setLayout(new GridLayout(2, 2));
        JPanel pane3 = new JPanel();
        pane3.setLayout(new FlowLayout());
        pane2.setVisible(true);
        pane3.setVisible(true);

        tbl = new JLabel("Balance", JLabel.CENTER);
        tamnt = new JLabel("Amount", JLabel.CENTER);

        blnc = new JTextField("6000");
        blnc.setEditable(false);
        amnt = new JTextField("");
        amnt.setEditable(true);

        pane2.add(tbl);
        pane2.add(blnc);
        pane2.add(tamnt);
        pane2.add(amnt);

        dep = new JButton("Deposite");
        wtd = new JButton("Withdraw");
        ext = new JButton("Exit");

        pane3.add(dep);
        pane3.add(wtd);
        pane3.add(ext);
        

        fr.add(pane2);
        fr.add(pane3);
        fr.setVisible(true);
    }
    public static void main(String[] args){
        new TellerGUI();
    }
}

