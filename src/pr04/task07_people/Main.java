public class Main {
    public static void main(String[] args) {
        Person[] people={new Student("Алексей","ИВТ-1"),new Schoolchild("Ольга",9),new Student("Мария","ИВТ-2")};
        for(Person p:people){
            System.out.println(p.getName());
            if(p instanceof Student s)System.out.println("Студент, группа "+s.getGroup());
            else if(p instanceof Schoolchild c)System.out.println("Школьник, класс "+c.getGrade());
        }
    }
}
