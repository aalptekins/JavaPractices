package Point;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point(6, 8);
        Point p2 = new Point(5, 12);
        
        System.out.println("p1 merkeze uzaklik: " + p1.distanceToCenter());
        System.out.println("p1-p2 uzaklik: " + p1.distanceTo(p2));
        
        Point p3 = p1.clone();
        System.out.println("p3 koordinatlari: (" + p3.getX() + ", " + p3.getY() + ")");
        
        p1.move('x', -3);
        p1.move('y', -4);
        
        System.out.println("p1 yeni koordinatlari: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("yeni p1'in merkeze olan uzakligi :"+ p1.distanceToCenter());
    }
}