public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(100, 100, 30, 15);
        System.out.println(ball);
        ball.move();
        System.out.println("После движения: " + ball);
        ball.setXYSpeed(-5, 2);
        ball.move();
        System.out.println("После смены скорости: " + ball);
    }
}
