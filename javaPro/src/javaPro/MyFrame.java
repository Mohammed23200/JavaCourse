package javaPro;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame  extends  JFrame implements KeyListener{

JFrame frame = new  JFrame();
JLabel label;
MyFrame(){
    this.setSize(500,500);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.pack();
    this.addKeyListener(this);
    label = new JLabel();
    label.setBounds(0, 0, 100, 100);
    label.setBackground(Color.white);
    label.setOpaque(true);

}
@Override
public void keyTyped(KeyEvent e) {
    // TODO Auto-generated method stub
    switch (e.getKeyChar()){
        case 'a':label.setLocation(label.getX()-50,label.getY());
        break;
        case 'w':label.setLocation(label.getX(),label.getY()-50);
        break;
        case 's':label.setLocation(label.getX(),label.getY()+50);
        break;
        case 'd':label.setLocation(label.getX()+50,label.getY());

    }
}
@Override
public void keyPressed(KeyEvent e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
}
@Override
public void keyReleased(KeyEvent e) {
    // TODO Auto-generated method stub
   System.out.println("You released key char: "+e.getKeyChar());
   System.out.println("You released key code: "+e.getKeyCode());
} 
}
