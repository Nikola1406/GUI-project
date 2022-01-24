package zavrsniprojekat2021;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Druginivooblik extends Component {

    @Override
    public void paint(Graphics d) {
        Graphics2D d1 = (Graphics2D) d;
        d1.setColor(Color.yellow);
        d1.fillOval(150, 150, 100, 160);
    }
}
