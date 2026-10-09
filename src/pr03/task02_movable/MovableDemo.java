public class MovableDemo {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(1,2,3,4);
        p.moveRight(); System.out.println(p);
        MovableCircle c = new MovableCircle(5,5,1,1,3);
        c.moveUp(); System.out.println(c);
        MovableRectangle r = new MovableRectangle(0,0,4,3,2,2);
        System.out.println("Одинаковая скорость: "+r.hasSameSpeed());
        r.moveRight(); System.out.println(r);
    }
}
