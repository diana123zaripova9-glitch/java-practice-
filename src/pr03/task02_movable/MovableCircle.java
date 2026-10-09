public class MovableCircle implements Movable {
    private final int radius; private final MovablePoint center;
    public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius){
        if(radius<0) throw new IllegalArgumentException("Радиус не может быть отрицательным.");
        this.center=new MovablePoint(x,y,xSpeed,ySpeed); this.radius=radius;
    }
    @Override public void moveUp(){center.moveUp();} @Override public void moveDown(){center.moveDown();}
    @Override public void moveLeft(){center.moveLeft();} @Override public void moveRight(){center.moveRight();}
    @Override public String toString(){return "MovableCircle(center="+center+", radius="+radius+")";}
}
