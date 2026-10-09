public class Circle extends Shape {
    private final double radius;
    public Circle(double radius){if(radius<0)throw new IllegalArgumentException();this.radius=radius;}
    @Override public double getArea(){return Math.PI*radius*radius;}
    @Override public double getPerimeter(){return 2*Math.PI*radius;}
    @Override public String getType(){return "Круг";}
}
