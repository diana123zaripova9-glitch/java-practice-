public class Main {
    public static void main(String[] args) {
        Reader r=new Reader("Петров В.В.","123","ИТ","01.01.2000","+700000000");
        r.takeBook(3);r.takeBook("Приключения","Словарь","Энциклопедия");
        Book b1=new Book("Java","Г. Шилдт"),b2=new Book("Алгоритмы","Т. Кормен");
        r.takeBook(b1,b2);r.returnBook(2);r.returnBook(b1,b2);
    }
}
