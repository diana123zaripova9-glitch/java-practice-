public class Rectangle extends Shape {
    protected double width, length;
    public Rectangle(){ this(1, 1); }
    public Rectangle(double width, double length){ this(width,length,"blue",false); }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled); if(width<0||length<0) throw new IllegalArgumentException();
        this.width=width; this.length=length;
    }
    public double getWidth(){ return width; } public void setWidth(double w){ if(w<0) throw new IllegalArgumentException(); width=w; }
    public double getLength(){ return length; } public void setLength(double l){ if(l<0) throw new IllegalArgumentException(); length=l; }
    @Override public double getArea(){ return width*length; }
    @Override public double getPerimeter(){ return 2*(width+length); }
    @Override public String getType(){ return "Rectangle"; }
    @Override public String toString(){ return "Rectangle[width="+width+", length="+length+", "+super.toString()+"]"; }
}
