import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class DragePanel extends JPanel{
    ImageIcon image = new ImageIcon("");
  final  int WIDTH = image.getIconWidth();
  final int HEIGhT=image.getIconHeight();
  Point imageConrner;
  Point PrevPt;
    DragePanel(){
        imageConrner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DrageListener drageListener = new DrageListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(drageListener);
    }
    public  void paintComponent(Graphics g) {
      super.paintComponent(g);  
      image.paintIcon(this, g,(int) imageConrner.getX(),(int) imageConrner.getY());
    }

    private  class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            PrevPt = e.getPoint();
        }
    }
    private  class DrageListener extends MouseMotionAdapter  {
        public void mouseDragged(MouseEvent e){
            Point currentPt=e.getPoint();
            imageConrner.translate(
                (int)(currentPt.getX()-PrevPt.getX()),
                (int)(currentPt.gety()-PrevPt.gety())

            );
            PrevPt = currentPt;
            repaint();
        }
    }
}
