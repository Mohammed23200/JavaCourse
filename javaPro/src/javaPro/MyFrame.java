package javaPro;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame  extends  JFrame implements ActionListener{

JFrame frame = new  JFrame();
JButton button;
MyFrame(){
    this.setSize(500,500);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());
    button = new JButton("Select file");
    button.addActionListener(this);
    this.add(button);

} 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));//set the current dirctory 
            System.out.println(fileChooser.showOpenDialog(null));//select file to open and this return an integer value 
            int response = fileChooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
}
}
