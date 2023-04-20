import javax.swing.*;
import java.awt.*;
public class MDIFromGUI {
    private JDesktopPane desktopPane;
    private JInternalFrame ap01, ap02, ap03;
    private JFrame fr;
    private JMenuBar mb;
    private JMenu fil, edt, vw, nw;
    private JMenuItem opn, sav, ext, win, msg;


    public MDIFromGUI(){
        desktopPane = new JDesktopPane();
        desktopPane.setBackground(Color.BLACK);
        ap01 = new JInternalFrame("Application01"); ap02 = new JInternalFrame("Application02"); ap03 = new JInternalFrame("Application03");
        ap01.setSize(200, 100); ap02.setSize(200, 120); ap03.setSize(240, 200);

        ap01.setVisible(true); ap02.setVisible(true); ap03.setVisible(true);

        desktopPane.add(ap01); desktopPane.add(ap02); desktopPane.add(ap03);

        fr = new JFrame("SubMenuitem Demo");
        fr.setSize(960, 540);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(true);
        fr.add(desktopPane, BorderLayout.CENTER);

        mb = new JMenuBar();

        fil = new JMenu("File"); edt = new JMenu("Edit"); vw = new JMenu("View");

        nw = new JMenu("New");
        opn = new JMenuItem("Open"); sav = new JMenuItem("Save"); ext = new JMenuItem("Exit"); win = new JMenuItem("Window"); msg = new JMenuItem("Message");
        fil.add(nw); fil.add(opn); fil.add(sav); fil.add(ext);
        nw.add(win); nw.add(msg);

        mb.add(fil); mb.add(edt); mb.add(vw);
        fr.setJMenuBar(mb);

        fr.setVisible(true);

    }
        public static void main(String[] args){
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e){
                e.printStackTrace();
            }
            // SwingUtilities.invokeLater(() -> {new MDIFromGUI();});
            new MDIFromGUI();
    }

}
