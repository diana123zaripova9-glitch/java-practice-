public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Tan Ah Teck", "ahTeck@example.com", 'm');
        System.out.println(a);
        a.setEmail("tan@example.com");
        System.out.println("Имя: " + a.getName());
        System.out.println("Email после изменения: " + a.getEmail());
        System.out.println("Пол: " + a.getGender());
    }
}
