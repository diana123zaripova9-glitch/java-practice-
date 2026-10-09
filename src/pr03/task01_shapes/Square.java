public class Square extends Rectangle {
    public Square(){ this(1); }
    public Square(double side){ this(side,"blue",false); }
    public Square(double side,String color,boolean filled){ super(side,side,color,filled); }
    public double getSide(){ return width; }
    public void setSide(double side){ setWidth(side); setLength(side); }
    @Override public void setWidth(double width){ super.setWidth(width); super.setLength(width); }
    @Override public void setLength(double length){ super.setLength(length); super.setWidth(length); }
    @Override public String getType(){ return "Square"; }
    @Override public String toString(){ return "Square[side="+width+", "+super.toString()+"]"; }
}
