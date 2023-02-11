package techniques.objectClass;

import java.util.Objects;

public class EqualsHashCodeBreaksTransitivity {

    static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static void main(String...args) {
            Point point = new Point(1,3);
            ColorPoint colorPoint = new ColorPoint(1,3,"BLUE");
            // breaks symmetry. If a.equals(b) == true then b.equals(a) must also be true
            System.out.println("point equals colorpoint = " +point.equals(colorPoint));
            System.out.println("colorpoint equals point = " +colorPoint.equals(point));
        }

        @Override public boolean equals(Object o) {
            if (!(o instanceof Point))
                return false;
            Point p = (Point)o;
            return p.x == x && p.y == y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    static class ColorPoint extends Point {
        private final String color;

        public ColorPoint(int x, int y, String color) {
            super(x, y);
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof ColorPoint))
                return false;
            return super.equals(o) && ((ColorPoint) o).color == color;
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), color);
        }
    }

}
