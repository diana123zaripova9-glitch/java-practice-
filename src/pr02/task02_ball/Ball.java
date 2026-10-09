public class Ball {
    private double x, y, xSpeed, ySpeed;
    public Ball() { this(0, 0, 0, 0); }
    public Ball(double x, double y) { this(x, y, 0, 0); }
    public Ball(double x, double y, double xSpeed, double ySpeed) {
        this.x=x; this.y=y; this.xSpeed=xSpeed; this.ySpeed=ySpeed;
    }
    public double getX(){ return x; }
    public double getY(){ return y; }
    public double getXSpeed(){ return xSpeed; }
    public double getYSpeed(){ return ySpeed; }
    public void setXY(double x, double y){ this.x=x; this.y=y; }
    public void setXYSpeed(double xSpeed, double ySpeed){ this.xSpeed=xSpeed; this.ySpeed=ySpeed; }
    public void move(){ x += xSpeed; y += ySpeed; }
    public void move(double dx, double dy){ x += dx; y += dy; }
    @Override public String toString(){ return String.format("Ball @ (%.2f, %.2f)", x, y); }
}
