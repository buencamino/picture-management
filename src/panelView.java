import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class panelView extends JPanel {
    private JPanel pnl_center, pnl_west, pnl_east, pnl_north;
    private JTextField text_search;
    private JButton btn_search;
    private JList list_results;
    private JScrollPane sp, sp1;
    private ImageIcon img_display, img1, img2, img3, img4, img5;
    private JLabel lbl_imgdisplay, lbl_img1, lbl_img2, lbl_img3, lbl_img4, lbl_img5, lbl_brand, lbl_description, lbl_price;
    private JComboBox combo_type;
    private ResultSet rset = null;
    private JTextArea text_details;
    private String pic1, pic2, pic3, pic4, pic5;

    public panelView() {
        setLayout(new BorderLayout());

        HandleControlButton control = new HandleControlButton();
        HandleList listcontrol = new HandleList();
        HandleMouseControl mousecontrol = new HandleMouseControl();
        HandleKeyControl keycontrol = new HandleKeyControl();

        pnl_center = new JPanel(new GridLayout(0,2));
        pnl_west = new JPanel(new GridBagLayout());
        pnl_east = new JPanel(new GridBagLayout());
        pnl_north = new JPanel(new GridBagLayout());

        text_search = new JTextField(60);
        text_search.addKeyListener(keycontrol);
        btn_search = new JButton("Search");
        btn_search.addActionListener(control);

        list_results = new JList();
        list_results.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list_results.addListSelectionListener(listcontrol);
        sp = new JScrollPane(list_results);
        sp.setPreferredSize(new Dimension(700,70));

        GridBagConstraints c = new GridBagConstraints();

        //first row north panel
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5,0,0,10);
        //c.anchor = GridBagConstraints.LINE_END;
        pnl_north.add(text_search, c);

        c.gridx = 1;
        pnl_north.add(btn_search, c);

        //second row north panel
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 2;
        pnl_north.add(sp, c);

        //center panel codes
        //west panel
        Border blackborder = BorderFactory.createLineBorder(Color.BLACK, 2);

        img_display = new ImageIcon(new ImageIcon("src/berry.png").getImage().getScaledInstance(450,300, Image.SCALE_DEFAULT));
        lbl_imgdisplay = new JLabel(img_display);
        lbl_imgdisplay.setPreferredSize(new Dimension(450,300));

        lbl_img1 = new JLabel(img_display);
        lbl_img2 = new JLabel(img_display);
        lbl_img3 = new JLabel(img_display);
        lbl_img4 = new JLabel(img_display);
        lbl_img5 = new JLabel(img_display);

        lbl_img1.setPreferredSize(new Dimension(80,53));
        lbl_img2.setPreferredSize(new Dimension(80,53));
        lbl_img3.setPreferredSize(new Dimension(80,53));
        lbl_img4.setPreferredSize(new Dimension(80,53));
        lbl_img5.setPreferredSize(new Dimension(80,53));
        lbl_img1.addMouseListener(mousecontrol);
        lbl_img2.addMouseListener(mousecontrol);
        lbl_img3.addMouseListener(mousecontrol);
        lbl_img4.addMouseListener(mousecontrol);
        lbl_img5.addMouseListener(mousecontrol);

        lbl_imgdisplay.setBorder(blackborder);
        lbl_img1.setBorder(blackborder);
        lbl_img2.setBorder(blackborder);
        lbl_img3.setBorder(blackborder);
        lbl_img4.setBorder(blackborder);
        lbl_img5.setBorder(blackborder);

        //first row west panel
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 5;
        c.insets = new Insets(10,0,0,15);
        pnl_west.add(lbl_imgdisplay, c);

        //second row west panel
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        pnl_west.add(lbl_img1, c);

        c.gridx = 1;
        pnl_west.add(lbl_img2, c);

        c.gridx = 2;
        pnl_west.add(lbl_img3, c);

        c.gridx = 3;
        pnl_west.add(lbl_img4, c);

        c.gridx = 4;
        pnl_west.add(lbl_img5, c);

        pnl_center.add(pnl_west);

        //east panel
        lbl_brand = new JLabel("-");
        lbl_description = new JLabel("-");
        lbl_price = new JLabel("-");
        combo_type = new JComboBox();
        lbl_brand.setFont(new Font("Verdana", Font.PLAIN, 12));
        lbl_description.setFont(new Font("Verdana", Font.PLAIN, 15));
        lbl_description.setPreferredSize(new Dimension(500,50));
        lbl_price.setFont(new Font("Verdana", Font.PLAIN, 25));
        lbl_price.setForeground(new Color(3,152,56));
        text_details = new JTextArea();
        text_details.setEditable(false);
        sp1 = new JScrollPane(text_details);
        sp1.setPreferredSize(new Dimension(500,200));

        //first row east panel
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5,0,0,10);
        c.anchor = GridBagConstraints.LINE_START;
        pnl_east.add(lbl_brand, c);

        //second row east panel
        c.gridy = 1;
        pnl_east.add(lbl_description, c);

        //third row east panel
        c.gridy = 2;
        pnl_east.add(lbl_price, c);

        //fourth row east panel
        c.gridy = 3;
        pnl_east.add(combo_type, c);

        //fifth row east panel
        c.gridy = 4;
        pnl_east.add(sp1, c);

        pnl_center.add(pnl_east);

        add(pnl_north, BorderLayout.NORTH);
        add(pnl_center, BorderLayout.CENTER);
    }

    class HandleControlButton extends Component implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            Object source = e.getSource();

            if(source == btn_search)
            {
                if (!(text_search.getText().equals(""))){
                    getSearch(text_search.getText());
                }
            }
        }
    }

    private void getSearch(String search)
    {
        dbconnect conn = new dbconnect();

        try {
            rset = conn.getProduct(search);

            Vector<String> temp = new Vector<String>();

            while (rset.next())
            {
                temp.add(rset.getString("brand") + " " + rset.getString("description"));
            }

            list_results.setListData(temp);

            //conn.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    class HandleList implements ListSelectionListener
    {
        public void valueChanged(ListSelectionEvent e) {
            if (list_results.getSelectedIndex() >= 0)
            {
                try {
                    rset.absolute(list_results.getSelectedIndex() + 1);
                    //System.out.println(rset.getString("brand"));
                    lbl_brand.setText(rset.getString("brand"));
                    lbl_description.setText("<html>" + rset.getString("description") + "</html>");
                    //lbl_price.setText(String.valueOf(rset.getBigDecimal("price")));
                    text_details.setText(rset.getString("details"));

                    ImageIcon img = new ImageIcon(new ImageIcon(rset.getString("picture1")).getImage().getScaledInstance(450,300, Image.SCALE_DEFAULT));
                    lbl_imgdisplay.setIcon(img);
                    ImageIcon img1 = new ImageIcon(new ImageIcon(rset.getString("picture1")).getImage().getScaledInstance(80,53, Image.SCALE_DEFAULT));
                    lbl_img1.setIcon(img1);
                    pic1 = rset.getString("picture1");
                    ImageIcon img2 = new ImageIcon(new ImageIcon(rset.getString("picture2")).getImage().getScaledInstance(80,53, Image.SCALE_DEFAULT));
                    lbl_img2.setIcon(img2);
                    pic2 = rset.getString("picture2");
                    ImageIcon img3 = new ImageIcon(new ImageIcon(rset.getString("picture3")).getImage().getScaledInstance(80,53, Image.SCALE_DEFAULT));
                    lbl_img3.setIcon(img3);
                    pic3 = rset.getString("picture3");
                    ImageIcon img4 = new ImageIcon(new ImageIcon(rset.getString("picture4")).getImage().getScaledInstance(80,53, Image.SCALE_DEFAULT));
                    lbl_img4.setIcon(img4);
                    pic4 = rset.getString("picture4");
                    ImageIcon img5 = new ImageIcon(new ImageIcon(rset.getString("picture5")).getImage().getScaledInstance(80,53, Image.SCALE_DEFAULT));
                    lbl_img5.setIcon(img5);
                    pic5 = rset.getString("picture5");
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    class HandleMouseControl extends MouseAdapter {
        public void mouseClicked(MouseEvent e)
        {
            Object source = e.getSource();

            if (source == lbl_img1)
            {
                ImageIcon img = new ImageIcon(new ImageIcon(pic1).getImage().getScaledInstance(450,300, Image.SCALE_DEFAULT));
                lbl_imgdisplay.setIcon(img);
            }
            if (source == lbl_img2)
            {
                ImageIcon img = new ImageIcon(new ImageIcon(pic2).getImage().getScaledInstance(450,300, Image.SCALE_DEFAULT));
                lbl_imgdisplay.setIcon(img);
            }
            if (source == lbl_img3)
            {
                ImageIcon img = new ImageIcon(new ImageIcon(pic3).getImage().getScaledInstance(450,300, Image.SCALE_DEFAULT));
                lbl_imgdisplay.setIcon(img);
            }
            if (source == lbl_img4)
            {
                ImageIcon img = new ImageIcon(new ImageIcon(pic4).getImage().getScaledInstance(450,300, Image.SCALE_DEFAULT));
                lbl_imgdisplay.setIcon(img);
            }
            if (source == lbl_img5)
            {
                ImageIcon img = new ImageIcon(new ImageIcon(pic5).getImage().getScaledInstance(450,300, Image.SCALE_DEFAULT));
                lbl_imgdisplay.setIcon(img);
            }
        }

        public void mouseEntered(MouseEvent me) {
            Object source = me.getSource();
            Border orangeborder = BorderFactory.createLineBorder(Color.ORANGE, 2);

            if (source == lbl_img1)
            {
                lbl_img1.setBorder(orangeborder);
            }
            if (source == lbl_img2)
            {
                lbl_img2.setBorder(orangeborder);
            }
            if (source == lbl_img3)
            {
                lbl_img3.setBorder(orangeborder);
            }
            if (source == lbl_img4)
            {
                lbl_img4.setBorder(orangeborder);
            }
            if (source == lbl_img5)
            {
                lbl_img5.setBorder(orangeborder);
            }
        }

        public void mouseExited(MouseEvent mx)
        {
            Object source = mx.getSource();
            Border blackborder = BorderFactory.createLineBorder(Color.BLACK, 2);

            if (source == lbl_img1)
            {
                lbl_img1.setBorder(blackborder);
            }
            if (source == lbl_img2)
            {
                lbl_img2.setBorder(blackborder);
            }
            if (source == lbl_img3)
            {
                lbl_img3.setBorder(blackborder);
            }
            if (source == lbl_img4)
            {
                lbl_img4.setBorder(blackborder);
            }
            if (source == lbl_img5)
            {
                lbl_img5.setBorder(blackborder);
            }
        }
    }

    class HandleKeyControl implements KeyListener {

        public void keyTyped(KeyEvent e) {

        }

        public void keyPressed(KeyEvent e) {

        }

        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER)
            {
                if (text_search.hasFocus())
                {
                    getSearch(text_search.getText());
                }
            }
        }
    }
}
