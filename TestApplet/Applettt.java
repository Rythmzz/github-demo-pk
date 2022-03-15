import java.applet.Applet;
import java.awt.Graphics;


public class Applettt extends Applet{
  
    public void Init(){
        repaint();
    }
    public void Start(){
        
    }
    public void Pain(Graphics g){
        g.drawString("Yep",300, 300);
    }
    public void Stop(){
        System.exit(0);
    }
}
/* 
<applet code="Applettt.class" width="300" height="300"> 
</applet> 
*/
