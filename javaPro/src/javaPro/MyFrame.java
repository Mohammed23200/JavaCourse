package javaPro;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame  extends  JFrame implements ActionListener{
JFrame frame = new JFrame();
JMenuItem loadItem;
JMenuItem saveItem;
JMenuItem exitItem;
JMenu fileMenu;
JMenu editMenu;
JMenu helpMenu;
MyFrame(){
    this.setSize(500,500);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    fileMenu = new JMenu("File");
    editMenu = new JMenu("Edit");
    helpMenu = new JMenu("Help");

    loadItem = new JMenuItem("Load");
    saveItem = new JMenuItem("Save");
    exitItem = new JMenuItem("Exit");

    loadItem.addActionListener(this);
    saveItem.addActionListener(this);
    exitItem.addActionListener(this);
    loadItem.setMnemonic(KeyEvent.VK_L);//l for reloading
    saveItem.setMnemonic(KeyEvent.VK_S);//S for saving
    exitItem.setMnemonic(KeyEvent.VK_E);//E for exiting
    fileMenu.setMnemonic(KeyEvent.VK_F);//l for file
    fileMenu.add(loadItem);
    fileMenu.add(saveItem);
    fileMenu.add(exitItem);
    JMenuBar menu = new JMenuBar();
    this.setJMenuBar(menu);
    menu.add(fileMenu);
    menu.add(editMenu);
    menu.add(helpMenu);
    

} 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loadItem){
            System.out.println("Loader");
        }
        else if (e.getSource()==saveItem) {
            System.out.println("you have saved");
        }
        else if (e.getSource()==exitItem){
            System.exit(0);
        }
    }


}
