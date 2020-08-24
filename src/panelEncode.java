import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class panelEncode extends JPanel {
    private JTextField text_search, text_brand, text_description, text_price;
    private JButton btn_search, btn_picture1, btn_picture2, btn_picture3, btn_picture4, btn_picture5, btn_add, btn_update, btn_delete;
    private JList list_results;
    private JScrollPane sp, sp1;
    private JPanel pnl_north, pnl_center, pnl_south;
    private JLabel lbl_brand, lbl_description, lbl_details, lbl_active, lbl_picture1, lbl_picture2, lbl_picture3, lbl_picture4, lbl_picture5, lbl_path1, lbl_path2, lbl_path3, lbl_path4, lbl_path5, lbl_price;
    private JTextArea text_details;
    private JRadioButton radio_active, radio_inactive, radio_single, radio_variants;
    private String path1, path2, path3, path4, path5;

    public panelEncode(){
        setLayout(new BorderLayout());

        path1 = "";
        path2 = "";
        path3 = "";
        path4 = "";
        path5 = "";

        pnl_north = new JPanel(new GridBagLayout());
        pnl_center = new JPanel(new GridBagLayout());
        pnl_south = new JPanel(new FlowLayout());
        btn_search = new JButton("Search");
        text_search = new JTextField(60);
        list_results = new JList();
        sp = new JScrollPane(list_results);
        sp.setPreferredSize(new Dimension(700,100));

        GridBagConstraints c = new GridBagConstraints();
        HandleControlButton control = new HandleControlButton();
        HandleItemButton itemcontrol = new HandleItemButton();
        HandleKeyControl keycontrol = new HandleKeyControl();

        //first row
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5,0,0,10);
        //c.anchor = GridBagConstraints.LINE_END;
        pnl_north.add(text_search, c);

        c.gridx = 1;
        //c.anchor = GridBagConstraints.LINE_START;
        pnl_north.add(btn_search, c);

        //second row
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 2;
        pnl_north.add(sp, c);

        add(pnl_north, BorderLayout.NORTH);

        //center panel part
        lbl_brand = new JLabel("Brand :");
        lbl_description = new JLabel("Description :");
        lbl_details = new JLabel("Enter Details Below");
        lbl_active = new JLabel("Active :");
        lbl_picture1 = new JLabel("Picture 1");
        lbl_picture2 = new JLabel("Picture 2");
        lbl_picture3 = new JLabel("Picture 3");
        lbl_picture4 = new JLabel("Picture 4");
        lbl_picture5 = new JLabel("Picture 5");
        lbl_price = new JLabel("Price :");

        text_brand = new JTextField(25);
        text_description = new JTextField(50);
        text_details = new JTextArea();
        sp1 = new JScrollPane(text_details);
        sp1.setPreferredSize(new Dimension(700,100));
        text_price = new JTextField(25);
        text_price.setEnabled(false);

        text_brand.addKeyListener(keycontrol);
        text_description.addKeyListener(keycontrol);
        text_details.addKeyListener(keycontrol);
        text_price.addKeyListener(keycontrol);

        text_brand.requestFocus();

        btn_picture1 = new JButton("Browse Image 1");
        btn_picture2 = new JButton("Browse Image 2");
        btn_picture3 = new JButton("Browse Image 3");
        btn_picture4 = new JButton("Browse Image 4");
        btn_picture5 = new JButton("Browse Image 5");
        btn_picture1.setPreferredSize(new Dimension(130, 15));
        btn_picture2.setPreferredSize(new Dimension(130, 15));
        btn_picture3.setPreferredSize(new Dimension(130, 15));
        btn_picture4.setPreferredSize(new Dimension(130, 15));
        btn_picture5.setPreferredSize(new Dimension(130, 15));
        btn_picture1.addActionListener(control);
        btn_picture2.addActionListener(control);
        btn_picture3.addActionListener(control);
        btn_picture4.addActionListener(control);
        btn_picture5.addActionListener(control);

        btn_picture1.addKeyListener(keycontrol);
        btn_picture2.addKeyListener(keycontrol);
        btn_picture3.addKeyListener(keycontrol);
        btn_picture4.addKeyListener(keycontrol);
        btn_picture5.addKeyListener(keycontrol);

        radio_active = new JRadioButton("Yes");
        radio_inactive = new JRadioButton("No");
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(radio_active);
        bgroup.add(radio_inactive);
        radio_single = new JRadioButton("Single Item");
        radio_variants = new JRadioButton("With Variants");
        ButtonGroup bgroup1 = new ButtonGroup();
        bgroup1.add(radio_single);
        bgroup1.add(radio_variants);
        radio_single.addItemListener(itemcontrol);
        radio_variants.addItemListener(itemcontrol);
        radio_active.addKeyListener(keycontrol);
        radio_inactive.addKeyListener(keycontrol);
        radio_single.addKeyListener(keycontrol);
        radio_variants.addKeyListener(keycontrol);

        lbl_path1 = new JLabel();
        lbl_path2 = new JLabel();
        lbl_path3 = new JLabel();
        lbl_path4 = new JLabel();
        lbl_path5 = new JLabel();

        btn_add = new JButton("Add Product");
        btn_update = new JButton("Update Product");
        btn_delete = new JButton("Delete Product");

        btn_add.addActionListener(control);
        btn_update.addActionListener(control);
        btn_delete.addActionListener(control);
        btn_add.addKeyListener(keycontrol);
        btn_update.addKeyListener(keycontrol);
        btn_delete.addKeyListener(keycontrol);
        btn_update.setEnabled(false);
        btn_delete.setEnabled(false);

        //first row
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.insets = new Insets(5,0,0,10);
        c.anchor = GridBagConstraints.LINE_END;
        pnl_center.add(lbl_brand, c);

        c.gridx = 1;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.LINE_START;
        pnl_center.add(text_brand, c);

        //second row
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.anchor = GridBagConstraints.LINE_END;
        pnl_center.add(lbl_description, c);

        c.gridx = 1;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.LINE_START;
        pnl_center.add(text_description, c);

        //third row
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        pnl_center.add(lbl_details, c);

        //fourth row
        c.gridy = 3;
        c.gridwidth = 3;
        pnl_center.add(sp1, c);

        //fifth row
        c.gridx = 0;
        c.gridwidth = 1;
        c.gridy = 4;
        pnl_center.add(lbl_active, c);

        c.gridx = 1;
        pnl_center.add(radio_active, c);

        c.gridx = 2;
        pnl_center.add(radio_inactive, c);

        //sixth row
        c.gridx = 0;
        c.gridy = 5;
        pnl_center.add(lbl_picture1, c);

        c.gridx = 1;
        pnl_center.add(btn_picture1, c);

        c.gridx = 2;
        pnl_center.add(lbl_path1, c);

        //seventh row
        c.gridx = 0;
        c.gridy = 6;
        pnl_center.add(lbl_picture2, c);

        c.gridx = 1;
        pnl_center.add(btn_picture2, c);

        c.gridx = 2;
        pnl_center.add(lbl_path2, c);

        //eighth row
        c.gridx = 0;
        c.gridy = 7;
        pnl_center.add(lbl_picture3, c);

        c.gridx = 1;
        pnl_center.add(btn_picture3, c);

        c.gridx = 2;
        pnl_center.add(lbl_path3, c);

        //ninth row
        c.gridx = 0;
        c.gridy = 8;
        pnl_center.add(lbl_picture4, c);

        c.gridx = 1;
        pnl_center.add(btn_picture4, c);

        c.gridx = 2;
        pnl_center.add(lbl_path4, c);

        //10th row
        c.gridx = 0;
        c.gridy = 9;
        pnl_center.add(lbl_picture5, c);

        c.gridx = 1;
        pnl_center.add(btn_picture5, c);

        c.gridx = 2;
        pnl_center.add(lbl_path5, c);

        //11th row
        c.gridx = 1;
        c.gridy = 10;
        pnl_center.add(radio_single, c);

        c.gridx = 2;
        pnl_center.add(radio_variants, c);

        //12th row
        c.gridx = 0;
        c.gridy = 11;
        pnl_center.add(lbl_price, c);

        c.gridx = 1;
        c.gridwidth = 2;
        pnl_center.add(text_price, c);

        add(pnl_center, BorderLayout.CENTER);

        pnl_south.add(btn_add);
        pnl_south.add(btn_update);
        pnl_south.add(btn_delete);
        add(pnl_south, BorderLayout.SOUTH);
    }

    class HandleItemButton implements ItemListener
    {
        public void itemStateChanged(ItemEvent e) {
            Object source = e.getSource();
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (source == radio_single)
                {
                    text_price.setEnabled(true);
                }
                else if (source == radio_variants)
                {
                    text_price.setEnabled(false);
                }
            }
            else if (e.getStateChange() == ItemEvent.DESELECTED) {
                // Your deselected code here.
            }
        }
    }

    class HandleControlButton extends Component implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            Object source = e.getSource();

            if(source == btn_add)
            {
                dbconnect conn = new dbconnect();
                String active = null, variant = null;
                String brand, description, details, price;

                if (radio_active.isSelected())
                    active = "1";
                else if (radio_inactive.isSelected())
                    active = "0";
                else
                    active = "0";

                if (radio_single.isSelected())
                    variant = "0";
                else if (radio_variants.isSelected())
                    variant = "1";
                else
                    variant = "0";

                brand = text_brand.getText();
                description = text_description.getText();
                details = text_details.getText();
                price = text_price.getText();

                try {
                    conn.addProduct(brand, description, details, active, path1, path2, path3, path4, path5, variant, price);
                    //conn.close();

                } catch (Exception exception) {
                    exception.printStackTrace();
                }

                text_brand.setText("");
                text_description.setText("");
                text_details.setText("");
                text_price.setText("");
                lbl_path1.setText("");
                lbl_path2.setText("");
                lbl_path3.setText("");
                lbl_path4.setText("");
                lbl_path5.setText("");
                path1 = "";
                path2 = "";
                path3 = "";
                path4 = "";
                path5 = "";
            }

            if (source == btn_picture1)
            {
                String userDirLocation = System.getProperty("user.dir");
                File userDir = new File(userDirLocation);

                JFileChooser fc = new JFileChooser(userDir);
                fc.showOpenDialog(this);

                File f = fc.getSelectedFile();
                if (f != null)
                {
                    path1 = f.getName();
                    path1 = "images/" + path1;
                    path1 = path1.replace('\\', '/');
                    lbl_path1.setText(path1);
                }
            }

            if (source == btn_picture2)
            {
                String userDirLocation = System.getProperty("user.dir");
                File userDir = new File(userDirLocation);

                JFileChooser fc = new JFileChooser(userDir);
                fc.showOpenDialog(this);

                File f = fc.getSelectedFile();

                if (f != null)
                {
                    path2 = f.getName();
                    path2 = "images/" + path2;
                    path2 = path2.replace('\\', '/');
                    lbl_path2.setText(path2);
                }
            }

            if (source == btn_picture3)
            {
                String userDirLocation = System.getProperty("user.dir");
                File userDir = new File(userDirLocation);
                JFileChooser fc = new JFileChooser(userDir);
                fc.showOpenDialog(this);

                File f = fc.getSelectedFile();

                if (f != null)
                {
                    path3 = f.getName();
                    path3 = "images/" + path3;
                    path3 = path3.replace('\\', '/');
                    lbl_path3.setText(path3);
                }
            }

            if (source == btn_picture4)
            {
                String userDirLocation = System.getProperty("user.dir");
                File userDir = new File(userDirLocation);
                JFileChooser fc = new JFileChooser(userDir);
                fc.showOpenDialog(this);

                File f = fc.getSelectedFile();

                if (f != null)
                {
                    path4 = f.getName();
                    path4 = "images/" + path4;
                    path4 = path4.replace('\\', '/');
                    lbl_path4.setText(path4);
                }
            }

            if (source == btn_picture5)
            {
                String userDirLocation = System.getProperty("user.dir");
                File userDir = new File(userDirLocation);
                JFileChooser fc = new JFileChooser(userDir);
                fc.showOpenDialog(this);

                File f = fc.getSelectedFile();

                if (f != null)
                {
                    path5 = f.getName();
                    path5 = "images/" + path5;
                    path5 = path5.replace('\\', '/');
                    lbl_path5.setText(path5);
                }
            }
        }
    }


    class HandleKeyControl implements KeyListener
    {
        public void keyTyped(KeyEvent e) {

        }

        public void keyPressed(KeyEvent e) {

        }

        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_UP)
            {
                if (btn_add.hasFocus())
                    btn_picture5.requestFocus();
                if (btn_picture5.hasFocus())
                    btn_picture4.requestFocus();
                if (btn_picture4.hasFocus())
                    btn_picture3.requestFocus();
                if (btn_picture3.hasFocus())
                    btn_picture2.requestFocus();
                if (btn_picture2.hasFocus())
                    btn_picture1.requestFocus();
                if (btn_picture1.hasFocus())
                    text_description.requestFocus();
                if (text_description.hasFocus())
                    text_brand.requestFocus();
                if (text_brand.hasFocus())
                    btn_add.requestFocus();
            }

            if (e.getKeyCode() == KeyEvent.VK_DOWN)
            {
                if (text_brand.hasFocus())
                    text_description.requestFocus();
                if (text_description.hasFocus())
                    btn_picture1.requestFocus();
                if (btn_picture1.hasFocus())
                    btn_picture2.requestFocus();
                if (btn_picture2.hasFocus())
                    btn_picture3.requestFocus();
                if (btn_picture3.hasFocus())
                    btn_picture4.requestFocus();
                if (btn_picture4.hasFocus())
                    btn_picture5.requestFocus();
                if (btn_picture5.hasFocus())
                    btn_add.requestFocus();
                if (text_price.hasFocus())
                    btn_add.requestFocus();
                if (btn_add.hasFocus())
                    text_brand.requestFocus();
            }
        }
    }
}
