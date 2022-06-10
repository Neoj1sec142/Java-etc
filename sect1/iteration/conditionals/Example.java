// simple if-else
// public class Example{
//     public static void main(String[] args){
//         int age = 13;
//         if(age >= 18){
//             System.out.println("Congrats, you are eligible to vote");
//         }else{
//             System.out.println("Sorry you are not eligiable to vote");
//         }
//     }
// }

// simple else if
// public class Example{
//     public static void main(String[] args){
//         int stu = 85;
//         if(stu >= 90){
//             System.out.println("You recieved an excellent grade!");
//         }else if(stu < 90 && stu >= 75){
//             System.out.println("You recieved a first class grade!");
//         }else if(stu < 75 && stu >= 40){
//             System.out.println("You recieved an average grade!");
//         }else{
//             System.out.println("You recieved a failing grade!");
//         }
//     }
// }

// simple nested else if
public class Example{
    public static void main(String[] args){
        String username = "Joh";
        String password = "12345";
        if(username == "John"){
            if (password == "12345"){
                System.out.println("Login Successful");
            }else{
                System.out.println("Password Incorrect");
            }
        }else{
            System.out.println("User not found");
        }
    }
}