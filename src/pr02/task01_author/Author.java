public class Author {
    private final String name;
    private String email;
    private final char gender;
    public Author(String name, String email, char gender) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Имя обязательно.");
        if ("m f u".indexOf(Character.toLowerCase(gender)) < 0 || gender == ' ')
            throw new IllegalArgumentException("Пол обозначается m, f или u.");
        this.name = name; this.email = email; this.gender = Character.toLowerCase(gender);
    }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public char getGender() { return gender; }
    @Override public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}
