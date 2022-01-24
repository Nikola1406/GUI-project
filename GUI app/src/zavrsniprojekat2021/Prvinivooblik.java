
package zavrsniprojekat2021;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Prvinivooblik extends Component {
    @Override
    public void paint(Graphics d){
        
    Graphics2D oblik=(Graphics2D)d;
    oblik.setColor(Color.red);
    oblik.fillRect(150, 150, 100, 100);
    }
}
