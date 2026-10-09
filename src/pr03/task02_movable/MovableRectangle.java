public class MovableRectangle implements Movable {
    private final MovablePoint topLeft, bottomRight;
    public MovableRectangle(int x1,int y1,int x2,int y2,int xs,int ys){
        topLeft=new MovablePoint(x1,y1,xs,ys); bottomRight=new MovablePoint(x2,y2,xs,ys);
        if(x2<x1 || y2<y1) throw new IllegalArgumentException("Некорректные координаты прямоугольника.");
    }
    public boolean hasSameSpeed(){ return topLeft.getXSpeed()==bottomRight.getXSpeed() && topLeft.getYSpeed()==bottomRight.getYSpeed(); }
    private void check(){ if(!hasSameSpeed()) throw new IllegalStateException("Скорости точек должны совпадать."); }
    @Override public void moveUp(){check();topLeft.moveUp();bottomRight.moveUp();}
    @Override public void moveDown(){check();topLeft.moveDown();bottomRight.moveDown();}
    @Override public void moveLeft(){check();topLeft.moveLeft();bottomRight.moveLeft();}
    @Override public void moveRight(){check();topLeft.moveRight();bottomRight.moveRight();}
    @Override public String toString(){return "MovableRectangle[topLeft="+topLeft+", bottomRight="+bottomRight+"]";}
}
