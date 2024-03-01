package Item10HashCodeEquals;

import java.awt.*;
import java.awt.Color;
import java.util.Objects;

public class ColorPoint {
    private final Point point;
    private final Color color;

    public ColorPoint(int x,int y, Color color) {
        point = new Point(x,y);
        this.color = Objects.requireNonNull(color);
    }
    /**
     * Returns the point-view of this color point
     */
}
