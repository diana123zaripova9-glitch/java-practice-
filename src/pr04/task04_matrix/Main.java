public class Main {
    public static void main(String[] args) {
        Matrix a=new Matrix(new int[][]{{1,2},{3,4}});
        Matrix b=new Matrix(new int[][]{{5,6},{7,8}});
        System.out.println("Сумма:");a.add(b).print();System.out.println("Умножение на 3:");a.multiply(3).print();
    }
}
