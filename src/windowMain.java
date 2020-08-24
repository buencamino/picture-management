import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class windowMain {
    JFrame pnl_main;
    JMenuBar mb;
    JMenu menu1;
    JMenuItem menu1_encode, menu1_view, menu1_exit;
    JPanel pnl_center;

    public windowMain(){
       pnl_main = new JFrame("Product Browser (Mike)");
       pnl_main.setBounds(10,10,1100,685);
       pnl_main.setLayout(new BorderLayout());

       HandleControlButton control = new HandleControlButton();

       pnl_center = new JPanel();
       pnl_center.setLayout(new BorderLayout());

       mb = new JMenuBar();
       menu1 = new JMenu("Modules");
       menu1_encode = new JMenuItem("Encode Product");
       menu1_view = new JMenuItem("View Product");
       menu1_exit = new JMenuItem("Exit");

       menu1_encode.addActionListener(control);
       menu1_view.addActionListener(control);
       menu1_exit.addActionListener(control);

       menu1.add(menu1_encode);
       menu1.add(menu1_view);
       menu1.addSeparator();
       menu1.add(menu1_exit);

       mb.add(menu1);

       pnl_center.add(new panelEncode(), BorderLayout.CENTER);

       pnl_main.setJMenuBar(mb);
       pnl_main.add(pnl_center, BorderLayout.CENTER);
       pnl_main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       pnl_main.setVisible(true);
    }

    class HandleControlButton implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            Object source = e.getSource();

            if(source == menu1_encode)
            {
                pnl_center.removeAll();
                pnl_center.repaint();
                pnl_center.revalidate();

                pnl_center.add(new panelEncode(), BorderLayout.CENTER);
                pnl_center.repaint();
                pnl_center.revalidate();
            }

            if(source == menu1_view)
            {
                pnl_center.removeAll();
                pnl_center.repaint();
                pnl_center.revalidate();

                pnl_center.add(new panelView(), BorderLayout.CENTER);
                pnl_center.repaint();
                pnl_center.revalidate();
            }

            if(source == menu1_exit)
            {
                System.exit(0);
            }
        }
    }
}
