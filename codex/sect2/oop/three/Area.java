// static polymorphism multiple areas with different functionalities
// public class Area{
//     double area;
//     double area(double length, double breadth){
//         area = length * breadth;
//         return area;
//     }
//     double area(double side){
//         area = side * side;
//         return area;
//     }
//     public static void main(String[] args){
//         Area area = new Area();
//         System.out.println("Area of rectangle is " + area.area(5,2));
//         System.out.println("Area of a square is: " + area.area(5));
//     }
// }

// example of abstract classes and methods
public abstract class Area{
    public abstract void getDetails();
}
class Library extends Area{
    String bookName;
    String authorName;
    int qnty;
    Library(String bookName, String authorName, int qnty){
        this.bookName = bookName;
        this.authorName = authorName;
        this.qnty = qnty;
    }
    public void getDetails(){
        System.out.println("Book name " + bookName);
        System.out.println("Author name " + authorName);
    }
}
class Main{
    public static void main(String[] args){
        Library dupe = new Library("The Dhamapada", "Sidartha Guttama", 4);
        dupe.getDetails();
    }
}