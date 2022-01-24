package zavrsniprojekat2021;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Cetvrtinivooblik extends Component {

    @Override
    public void paint(Graphics d) {
        Graphics2D pravougaonik = (Graphics2D) d;
        pravougaonik.setColor(Color.GREEN);
        pravougaonik.fillRect(200, 200, 150, 150);
    }

}
