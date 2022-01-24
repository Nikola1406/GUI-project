package zavrsniprojekat2021;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Trecinivooblik extends Component {

    @Override
    public void paint(Graphics d) {
        Graphics2D d2 = (Graphics2D) d;
        d2.setColor(Color.black);
        int[] x={50,100,150};
        int[] y={260,220,330};
        d2.drawPolygon(x,y,3);
        
      
    }

}
