public class Circle extends Shape {
    private double radius;
    public Circle(){ this(1.0); }
    public Circle(double radius){ this(radius, "blue", false); }
    public Circle(double radius, String color, boolean filled){ super(color, filled); if(radius<0) throw new IllegalArgumentException(); this.radius=radius; }
    public double getRadius(){ return radius; }
    public void setRadius(double radius){ if(radius<0) throw new IllegalArgumentException(); this.radius=radius; }
    @Override public double getArea(){ return Math.PI*radius*radius; }
    @Override public double getPerimeter(){ return 2*Math.PI*radius; }
    @Override public String getType(){ return "Circle"; }
    @Override public String toString(){ return "Circle[radius="+radius+", "+super.toString()+"]"; }
}
