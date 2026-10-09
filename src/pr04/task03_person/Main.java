public class Main {
    public static void main(String[] args) {
        Person p1=new Person(); Person p2=new Person("Мария Иванова",20);
        System.out.println(p1);p1.move();p1.talk();System.out.println(p2);p2.move();p2.talk();
    }
}
