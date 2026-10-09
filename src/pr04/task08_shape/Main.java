public class Main {
    public static void main(String[] args) {
        Shape[] shapes={new Circle(2),new Rectangle(3,4),new Square(5)};
        for(Shape s:shapes)System.out.println(s);
    }
}
