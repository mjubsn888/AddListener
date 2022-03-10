package MathDiver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinK1Lev1 extends JFrame{

    public static final int WIDTH=1024;
    public static final int HEIGHT=768;

    public WinK1Lev1(){
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints c=new GridBagConstraints();

        //Color seaColor3=new Color();
        JPanel pan1=new JPanel();
        pan1.setBorder(BorderFactory.createRaisedBevelBorder());
        pan1.setBackground(Color.YELLOW);
        c.fill=GridBagConstraints.BOTH;
        c.gridx=0;
        c.gridy=0;
        c.weightx=1;
        c.weighty=0.1;
        add(pan1, c);

        JPanel pan2=new JPanel();
        pan2.setBorder(BorderFactory.createRaisedBevelBorder());
/*        pan2.setBackground(Color.ORANGE);*/
        c.fill=GridBagConstraints.BOTH;
        c.gridx=0;
        c.gridy=1;
        c.weightx=1;
        c.weighty=0.6;
        add(pan2, c);

        JPanel pan3=new JPanel();
        pan3.setBorder(BorderFactory.createRaisedBevelBorder());
        pan3.setBackground(Color.GREEN);
        c.fill=GridBagConstraints.BOTH;
        c.gridx=0;
        c.gridy=2;
        c.weightx=1;
        c.weighty=0.2;
        add(pan3, c);

       JPanel pan4=new JPanel();
        pan4.setBorder(BorderFactory.createRaisedBevelBorder());
        pan4.setBackground(Color.BLACK);
        c.fill=GridBagConstraints.BOTH;
        c.gridx=0;
        c.gridy=3;
        c.weightx=1;
        c.weighty=0.1;
        add(pan4, c);

        JTextArea textArea=new JTextArea();
        textArea.setText("2+8=?");
        Font fontTextArea=new Font("SansSerif", Font.BOLD, 72);
        textArea.setFont(fontTextArea);
        pan2.add(textArea);

        Font fontRadioButton=new Font("SansSerif", Font.BOLD, 30);
        JRadioButton rb1=new JRadioButton();
        rb1.setText("5");
        rb1.setFont(fontRadioButton);
        pan3.add(rb1);

        JRadioButton rb2=new JRadioButton();
        rb2.setText("8");
        rb2.setFont(fontRadioButton);
        pan3.add(rb2);

        JRadioButton rb3=new JRadioButton();
        rb3.setText("10");
        rb3.setFont(fontRadioButton);
        pan3.add(rb3);

        JRadioButton rb4=new JRadioButton();
        rb4.setText("11");
        rb4.setFont(fontRadioButton);
        pan3.add(rb4);

        Font fontButton=new Font("SansSerif", Font.BOLD, 30);
        JButton btn =new JButton();
        btn.setFont(fontRadioButton);
        btn.setText("submit answer");
        pan4.add(btn);

        ButtonGroup rbGroup=new ButtonGroup();
        rbGroup.add(rb1);
        rbGroup.add(rb2);
        rbGroup.add(rb3);
        rbGroup.add(rb4);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rb3.isSelected())
                    JOptionPane.showMessageDialog(pan2, "Correct!");
                else if(rb1.isSelected() || rb2.isSelected() || rb4.isSelected())
                    JOptionPane.showMessageDialog(pan2, "Incorrect, please try again!", "Warning", JOptionPane.WARNING_MESSAGE);
                else
                    JOptionPane.showMessageDialog(pan2, "Please select an answer first!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });
        setLocationRelativeTo(null); //set JFrame to be center of computer screen
    }
}