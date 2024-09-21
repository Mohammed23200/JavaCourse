

package javaPro;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener {
JSlider slider;
JFrame frame;
JPanel panel;
JLabel label;
SliderDemo(){
    slider = new JSlider(0,100,50);//first number is the first number and second is the most number of the slide the third number is the number we start with 
    slider.setPreferredSize(new Dimension(400,200));
    slider.setPaintTicks(true);
    slider.setMinorTickSpacing(10);//ever 10 units number appering
    slider.setPaintTrack(true);
    slider.setMajorTickSpacing(25);//ater 25 unit we see a larger line of number 
    slider.setPaintLabels(true);//apply the labels for the slider 
    slider.setFont(new Font("MV Boli",Font.PLAIN,15));
    slider.setOrientation(SwingConstants.VERTICAL);//make it vertical insted of horizntal

    frame = new JFrame();
    
    panel = new JPanel();
    label = new JLabel();
    label.setText("°C = "+slider.getValue());//make a text that tell us what to b 
    label.setFont(new Font("MV Boli",Font.PLAIN,25));
//we will notice that the number does not change 
//we will move the code in the methods 
slider.addChangeListener(this);
    panel.add(slider);
    panel.add(label);
    frame.add(panel);
    frame.setSize(420,420);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
@Override
public void stateChanged(ChangeEvent e) {
    // TODO Auto-generated method stub
    label.setText("°C = "+slider.getValue());

}


}
