package javaPro;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame  extends  JFrame implements ActionListener{

JFrame frame = new  JFrame();
JButton button;
JLabel label;
MyFrame(){
    this.setSize(500,500);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());
    this.pack();
    button = new JButton("Pick a color ");
    button.addActionListener(this);
    label = new JLabel();
    label.setBackground(Color.white);
    label.setText("this is some txt :D");
    label.setFont(new Font("MV Boli",Font.PLAIN,100));
    label.setOpaque(true);
    this.add(button);
    this.add(label);
} 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "pick a color", Color.BLACK);
            label.setForeground(color);
        }
}
}
