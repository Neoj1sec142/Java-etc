// init of a basic constructor
// public class Test{
//     Test(){
//         System.out.println("Constructor called");
//     }
//     public static void main(String[] args){
//         Test test = new Test();
//     }
// }

// ex init the instance var w/ constructor still default constructor
// public class Test{
//     String appName;
//     double appVersion;
//     Test(){
//         System.out.println("Constructor called");
//         appName = "JavaX";
//         appVersion = 1.0;
//     }
//     public static void main(String[] args){
//         Test test = new Test();
//         System.out.println(test.appName);
//         System.out.println(test.appVersion);
//     }
// }

// parameterized constructor example 
// public class Test{
//     String bookName;
//     String authorName;
//     int qnty;
//     Test(String name, String author, int count){
//         bookName = name;
//         authorName = author;
//         qnty = count;
//     }
//     public void bookDetails(){
//         System.out.println("Book Name " + bookName);
//         System.out.println("Author Name " + authorName);
//     }
//     public static void main(String[] args){
//         Test test = new Test("Survivor", "Chuck Planuick", 4);
//         test.bookDetails();
//         Test test2 = new Test("Timequake", "Kurt Vaughnegutt", 3);
//         test2.bookDetails();
//     }
// }

// parameterized constructor example updated using 'this' keyword
// public class Test{
//     String bookName;
//     String authorName;
//     int qnty;
//     Test(String bookName, String authorName, int qnty){
//         this.bookName = bookName;
//         this.authorName = authorName;
//         this.qnty = qnty;
//     }
//     public void bookDetails(){
//         System.out.println("Book Name " + bookName);
//         System.out.println("Author Name " + authorName);
//     }
//     public static void main(String[] args){
//         Test test = new Test("Survivor", "Chuck Planuick", 4);
//         test.bookDetails();
//         Test test2 = new Test("Timequake", "Kurt Vaughnegutt", 3);
//         test2.bookDetails();
//     }
// }

//ex calling contrustor inside constructor without creating extra obj
// otherwise known as Constructor Chaining
// public class Test{
//     int num;
//     Test(){
//         this(50);
//     }
//     Test(int num){
//         this.num = num;
//     }
//     public static void main(String[] args){
//         Test test = new Test();
//         System.out.println(test.num);
//     }
// }

// example of accessing contructor of parent class in subclass
// public class Test{
//     int num = 10;
//     void display() {
//         System.out.println(num);
//     }
// }
// class Test2 extends Test{
//     int num = 12;
//     void display(){
//         System.out.println(num);
//         System.out.println(super.num);
//     }
// }
// class Main{
//     public static void main(String[] args){
//         Test2 test = new Test2();
//         test.display();
//     }
// }

//final class and method example
// PI remains the same throughout as it is  mathematical constant
// therfore we declare a var PI as final 
// public class Test{
//     public static void main(String[] args){
//         final double PI = 3.14;
//         double radius = 5.9;
//         double area = PI * radius * radius;
//         System.out.println("The area of the circle is " + area);
//     }
// }