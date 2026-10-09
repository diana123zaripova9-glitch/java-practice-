public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getType();
    @Override public String toString(){return getType()+"[area="+getArea()+", perimeter="+getPerimeter()+"]";}
}
