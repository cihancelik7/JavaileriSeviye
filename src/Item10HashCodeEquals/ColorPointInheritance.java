package Item10HashCodeEquals;

import java.awt.*;

public class ColorPointInheritance extends Point{
    private final Color color;
    public ColorPointInheritance(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // Broken - violates symmetry!
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPointInheritance)){
            return false;
        }
        return super.equals(o) && ((ColorPointInheritance) o).color == color;
    }
    // Broken - violates transitivity!
//    @Override public boolean equals(Object o){
//        if (!(o instanceof ColorPoint)){
//            return o.equals(this);
//        }
//        // o is a ColorPoint; do a full comparison
//        return super.equals(o) && ((ColorPoint) o).color == color;
//    }
    public static void main(String[] args) {
        //First equals function violates symmetry
        Point p = new Point(1,2);
        ColorPointInheritance  cp  = new ColorPointInheritance(1,2,Color.RED);
        System.out.println(p.equals(cp)+ " "+cp.equals(p));

        // Second equals function violates transitivity
        ColorPointInheritance p1 = new ColorPointInheritance(1,2, Color.RED);
        Point p2 = new Point(1,2);
        ColorPointInheritance p3 = new ColorPointInheritance(1,2, Color.BLUE);
        System.out.printf("%s %s %s%n",p1.equals(p2),p2.equals(p3),p1.equals(p3));
    }
}
