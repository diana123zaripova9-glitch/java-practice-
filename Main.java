/**
 * Практическая работа №3: абстрактные классы, наследование и интерфейсы.
 * Shape/Circle/Rectangle/Square и Movable-типы собраны в одном файле.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Shape hierarchy ===");
        Shape[] shapes = {
            new Circle(5.5, "RED", false),
            new Rectangle(4.0, 2.0, "BLUE", true),
            new Square(3.0)
        };
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.printf("Площадь: %.2f, периметр: %.2f%n",
                    shape.getArea(), shape.getPerimeter());
        }

        System.out.println("\n=== Movable hierarchy ===");
        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        System.out.println(point);
        point.moveUp();
        point.moveRight();
        System.out.println("После moveUp и moveRight: " + point);

        MovableCircle circle = new MovableCircle(5, 6, 1, 2, 3);
        System.out.println(circle);
        circle.moveDown();
        System.out.println("После moveDown: " + circle);

        MovableRectangle rectangle = new MovableRectangle(0, 10, 10, 0, 2, 2);
        System.out.println(rectangle);
        rectangle.moveRight();
        System.out.println("После moveRight: " + rectangle);
    }

    static abstract class Shape {
        protected String color = "green";
        protected boolean filled = true;
        protected Shape() {}
        protected Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }
        public String getColor() { return color; }
        public void setColor(String color) { this.color = color; }
        public boolean isFilled() { return filled; }
        public void setFilled(boolean filled) { this.filled = filled; }
        public abstract double getArea();
        public abstract double getPerimeter();
        @Override public String toString() {
            return "Shape[color=" + color + ", filled=" + filled + "]";
        }
    }

    static class Circle extends Shape {
        protected double radius;
        public Circle() { this(1.0); }
        public Circle(double radius) { this(radius, "green", true); }
        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            if (radius < 0) throw new IllegalArgumentException("Радиус не может быть отрицательным");
            this.radius = radius;
        }
        public double getRadius() { return radius; }
        public void setRadius(double radius) {
            if (radius < 0) throw new IllegalArgumentException("Радиус не может быть отрицательным");
            this.radius = radius;
        }
        @Override public double getArea() { return Math.PI * radius * radius; }
        @Override public double getPerimeter() { return 2 * Math.PI * radius; }
        @Override public String toString() {
            return "Circle[Shape[color=" + color + ", filled=" + filled + "], radius=" + radius + "]";
        }
    }

    static class Rectangle extends Shape {
        protected double length;
        protected double width;
        public Rectangle() { this(1.0, 1.0); }
        public Rectangle(double length, double width) { this(length, width, "green", true); }
        public Rectangle(double length, double width, String color, boolean filled) {
            super(color, filled);
            if (length < 0 || width < 0) throw new IllegalArgumentException("Стороны не могут быть отрицательными");
            this.length = length;
            this.width = width;
        }
        public double getLength() { return length; }
        public void setLength(double length) {
            if (length < 0) throw new IllegalArgumentException("Длина не может быть отрицательной");
            this.length = length;
        }
        public double getWidth() { return width; }
        public void setWidth(double width) {
            if (width < 0) throw new IllegalArgumentException("Ширина не может быть отрицательной");
            this.width = width;
        }
        @Override public double getArea() { return length * width; }
        @Override public double getPerimeter() { return 2 * (length + width); }
        @Override public String toString() {
            return "Rectangle[Shape[color=" + color + ", filled=" + filled + "], length=" + length + ", width=" + width + "]";
        }
    }

    static class Square extends Rectangle {
        public Square() { this(1.0); }
        public Square(double side) { this(side, "green", true); }
        public Square(double side, String color, boolean filled) { super(side, side, color, filled); }
        public double getSide() { return length; }
        public void setSide(double side) { setLength(side); setWidth(side); }
        @Override public void setLength(double side) { super.setLength(side); super.setWidth(side); }
        @Override public void setWidth(double side) { super.setLength(side); super.setWidth(side); }
        @Override public String toString() {
            return "Square[Rectangle[Shape[color=" + color + ", filled=" + filled + "], side=" + length + "]]";
        }
    }

    interface Movable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }

    static class MovablePoint implements Movable {
        int x, y, xSpeed, ySpeed;
        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x; this.y = y; this.xSpeed = xSpeed; this.ySpeed = ySpeed;
        }
        @Override public void moveUp() { y -= ySpeed; }
        @Override public void moveDown() { y += ySpeed; }
        @Override public void moveLeft() { x -= xSpeed; }
        @Override public void moveRight() { x += xSpeed; }
        @Override public String toString() {
            return "MovablePoint[x=" + x + ", y=" + y + ", speed=(" + xSpeed + "," + ySpeed + ")]";
        }
    }

    static class MovableCircle implements Movable {
        private final MovablePoint center;
        private final int radius;
        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
            center = new MovablePoint(x, y, xSpeed, ySpeed);
            this.radius = radius;
        }
        @Override public void moveUp() { center.moveUp(); }
        @Override public void moveDown() { center.moveDown(); }
        @Override public void moveLeft() { center.moveLeft(); }
        @Override public void moveRight() { center.moveRight(); }
        @Override public String toString() { return "MovableCircle[center=" + center + ", radius=" + radius + "]"; }
    }

    static class MovableRectangle implements Movable {
        private final MovablePoint topLeft;
        private final MovablePoint bottomRight;
        public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
            topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
            bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        }
        private boolean sameSpeed() {
            return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
        }
        private void moveIfValid(int direction) {
            if (!sameSpeed()) throw new IllegalStateException("Точки прямоугольника должны иметь одинаковую скорость");
            switch (direction) {
                case 0: moveUpPoints(); break;
                case 1: topLeft.moveDown(); bottomRight.moveDown(); break;
                case 2: topLeft.moveLeft(); bottomRight.moveLeft(); break;
                case 3: topLeft.moveRight(); bottomRight.moveRight(); break;
                default: throw new IllegalArgumentException("Неизвестное направление");
            }
        }
        private void moveUpPoints() { topLeft.moveUp(); bottomRight.moveUp(); }
        @Override public void moveUp() { moveIfValid(0); }
        @Override public void moveDown() { moveIfValid(1); }
        @Override public void moveLeft() { moveIfValid(2); }
        @Override public void moveRight() { moveIfValid(3); }
        @Override public String toString() {
            return "MovableRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + ", sameSpeed=" + sameSpeed() + "]";
        }
    }
}