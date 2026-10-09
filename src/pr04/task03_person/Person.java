public class Person {
    private final String fullName; private final int age;
    public Person(){this("Не указано",0);}
    public Person(String fullName,int age){this.fullName=fullName;this.age=age;}
    public void move(){System.out.println(fullName+" движется.");}
    public void talk(){System.out.println(fullName+" говорит.");}
    @Override public String toString(){return fullName+", возраст "+age;}
}
