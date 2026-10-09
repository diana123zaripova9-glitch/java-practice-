public class MovablePoint implements Movable {
    private int x, y, xSpeed, ySpeed;
    public MovablePoint(int x,int y,int xSpeed,int ySpeed){ this.x=x;this.y=y;this.xSpeed=xSpeed;this.ySpeed=ySpeed; }
    public int getX(){return x;} public int getY(){return y;}
    public int getXSpeed(){return xSpeed;} public int getYSpeed(){return ySpeed;}
    @Override public void moveUp(){ y-=ySpeed; } @Override public void moveDown(){ y+=ySpeed; }
    @Override public void moveLeft(){ x-=xSpeed; } @Override public void moveRight(){ x+=xSpeed; }
    @Override public String toString(){ return "MovablePoint("+x+","+y+") speed=("+xSpeed+","+ySpeed+")"; }
}
