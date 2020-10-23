package GuestBook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ContactViewTester implements ActionListener {
    public static void main(String[] args) {
        new ContactViewTester();
    }

    JFrame jf = new JFrame();
    JPanel jp = new JPanel();
    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    JLabel jl = new JLabel("Input");
    JLabel jl1 = new JLabel("Output");
    JTextField jt = new JTextField(30);
    JTextField jt1 = new JTextField(30);
    JButton jb = new JButton("Enter");

    ContactViewTester() {
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 200);
        jf.add(jp);
        jp.add(jl);//position matters
        jp.add(jt);
        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = jt.getText();
                jt.setText(input);
            }
        });

        jp.add(jl1);
        jp.add(jt1);
        jt1.setEditable(false);

        jp.add(jp2);
        jp2.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = jt.getText();
                jt1.setText(input);
            }
        });

    }

    public void setLayout(LayoutManager mgr) {

    }

    public void actionPerformed(ActionEvent e) {


    }
}