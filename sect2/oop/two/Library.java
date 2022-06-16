public class Library{
    String bookName = "1Q84";
    String authorName = "Haruki Murakami";
    int qnty = 4;
    void bookDetails(){
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
    }
}
class Reader extends Library{
    String dateBorrowed = "1/5/2021";
    int readerId = 12345;
    void readerDetails(){
        System.out.println("Date: " + dateBorrowed);
        System.out.println("ID: " + readerId);
    }
}
class Main{
    public static void main(String[] args){
        Reader reader = new Reader();
        System.out.println("Following are details of book borrowed");
        // System.out.println(reader.bookName);
        // System.out.println(reader.dateBorrowed);
        // System.out.println(reader.readerId);
        reader.bookDetails();
        reader.readerDetails();
    }
}
// when executing we compile the file name then java <Main class Name>