public class Reader {
    private final String fullName, libraryCardNumber, faculty, birthDate, phone;
    public Reader(String fullName,String libraryCardNumber,String faculty,String birthDate,String phone){
        this.fullName=fullName;this.libraryCardNumber=libraryCardNumber;this.faculty=faculty;this.birthDate=birthDate;this.phone=phone;
    }
    public void takeBook(int count){System.out.println(fullName+" взял(а) книг: "+count);}
    public void takeBook(String... titles){System.out.println(fullName+" взял(а) книги: "+String.join(", ",titles));}
    public void takeBook(Book... books){System.out.println(fullName+" взял(а) книги: "+java.util.Arrays.toString(books));}
    public void returnBook(int count){System.out.println(fullName+" вернул(а) книг: "+count);}
    public void returnBook(Book... books){System.out.println(fullName+" вернул(а) книги: "+java.util.Arrays.toString(books));}
}
