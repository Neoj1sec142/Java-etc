// public class Library{
//     String bookName;
//     String authorName;
//     int qnty;

//     Library(String bookName, String authorName, int qnty){
//         this.bookName = bookName;
//         this.authorName = authorName;
//         this.qnty = qnty;
//     }

//     void bookDetails(){
//         System.out.println("Book Name: " + bookName);
//         System.out.println("Author Name: " + authorName);
//     }
// }
// class Reader extends Library{
//     String dateBorrowed;
//     int readerId;

//     Reader(String bookName, String authorName, int qnty, String dateBorrowed, int readerId){
//         super(bookName, authorName, qnty);
//         this.dateBorrowed = dateBorrowed;
//         this.readerId = readerId;
//     }

//     void readerDetails(){
//         System.out.println("Date: " + dateBorrowed);
//         System.out.println("ID: " + readerId);
//     }
// }
// class Main{
//     public static void main(String[] args){
//         Reader reader = new Reader("1Q84", "Haruki Marukami", 4, "1/5/2022", 12345);
//         System.out.println("Following are details of book borrowed");
//         // System.out.println(reader.bookName);
//         // System.out.println(reader.dateBorrowed);
//         // System.out.println(reader.readerId);
//         reader.bookDetails();
//         reader.readerDetails();
//         Reader reader2 = new Reader("The Art of Invisibility", "Kevin Mitnick", 8, "3/13/2022", 92747);
//         reader2.bookDetails();
//         reader2.readerDetails();
//     }
// }
// when executing we compile the file name then java <Main class Name>

// example of method overridding #!#
// public class Library{
//     String bookName;
//     String authorName;
//     int qnty;
//     Library(String bookName, String authorName, int qnty){
//         this.bookName = bookName;
//         this.authorName = authorName;
//         this.qnty = qnty;
//     }
//     void getDetails(){
//         System.out.println("Book Name: " + bookName);
//         System.out.println("Author: " + authorName);
//     }
// }
// class Reader extends Library{
//     String dateBorrowed;
//     int readerId;
//     Reader(String bookName, String authorName, int qnty, String dateBorrowed, int readerId){
//         super(bookName, authorName, qnty);
//         this.dateBorrowed = dateBorrowed;
//         this.readerId = readerId;
//     }
//     @Override
//     void getDetails(){
//         super.getDetails();
//         System.out.println("Date: " + dateBorrowed);
//         System.out.println("ID: " + readerId);
//     }
// }
// class Main{
//     public static void main(String[] args){
//         Reader red = new Reader("A Brave New World", "Aldous Huxley", 5, "5/26/1987", 256433);
//         red.getDetails();
//         Reader blu = new Reader("The Doors of Perception", "Aldous Huxley", 5, "2/1/2022", 87623);
//         blu.getDetails();
//     }
// }