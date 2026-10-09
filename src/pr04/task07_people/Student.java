public class Student extends Person {
    private final String group;
    public Student(String name,String group){super(name);this.group=group;}
    public String getGroup(){return group;}
}
