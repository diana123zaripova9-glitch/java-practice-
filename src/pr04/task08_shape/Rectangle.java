public class Rectangle extends Shape {
    protected final double width,length;
    public Rectangle(double width,double length){if(width<0||length<0)throw new IllegalArgumentException();this.width=width;this.length=length;}
    @Override public double getArea(){return width*length;}
    @Override public double getPerimeter(){return 2*(width+length);}
    @Override public String getType(){return "Прямоугольник";}
}
