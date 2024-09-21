package javaPro;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBar {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    ProgressBar(){
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);//make this text apper 
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.red);//make the bar complet with the red color 
        bar.setBackground(Color.black);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.add(bar);

        fill();
    }
    public void fill(){
        int counter = 0;
        while(counter <=100){
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }//make it delay for a 1000ms
            counter+=10;
        }
bar.setString("Done! :");
    }
}
