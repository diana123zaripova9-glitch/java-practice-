public class Book {
    private final String title, author;
    public Book(String title,String author){this.title=title;this.author=author;}
    @Override public String toString(){return title+" — "+author;}
}
