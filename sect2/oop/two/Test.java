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

