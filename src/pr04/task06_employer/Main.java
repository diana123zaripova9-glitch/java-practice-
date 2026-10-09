public class Main {
    public static void main(String[] args) {
        Employer[] staff={new Employer("Анна","Петрова",50000),new Manager("Иван","Сидоров",60000,10000)};
        for(Employer e:staff)System.out.println(e);
    }
}
