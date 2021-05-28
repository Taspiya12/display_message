import javax.swing.JApplet;
import java.awt.*;

public class display extends JApplet {

    public void init() {}

    public void paint(Graphics g){
    super.paint(g);
    g.drawString("i live in chittagong", 40, 40);
    }
}
