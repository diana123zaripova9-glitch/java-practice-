public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(5.5,"red",false), new Rectangle(2,3,"green",true), new Square(4) };
        for (Shape s : shapes)
            System.out.printf("%s | type=%s | area=%.2f | perimeter=%.2f%n", s, s.getType(), s.getArea(), s.getPerimeter());
        // Shape s = new Shape(); // Ошибка: абстрактный класс нельзя инстанцировать.
    }
}
