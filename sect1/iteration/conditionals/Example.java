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
// public class Example{
//     public static void main(String[] args){
//         String username = "John";
//         String password = "12345";
//         if(username == "John"){
//             if (password == "12345"){
//                 System.out.println("Login Successful");
//             }else{
//                 System.out.println("Password Incorrect");
//             }
//         }else{
//             System.out.println("User not found");
//         }
//     }
// }

// traffic light example
// public class Example{
//     public static void main(String[] args){
//         String light = "Green";
//         if(light == "Green"){
//             System.out.println("Please keep going");
//         }else if(light == "Yellow"){
//             System.out.println("Please slow down / YEILD");
//         }else{
//             System.out.println("Please STOP!");
//         }
//     }
// }

// game w/3 players
// public class Example{
//     public static void main(String[] args){
//         int user1 = 9;
//         int user2 = 4;
//         int user3 = 7;
//         if(user1 > user2 && user1 > user3){
//             System.out.println("User 1 Wins");
//         }else if(user2 > user1 && user2 > user3){
//             System.out.println("User 2 Wins");
//         }else{
//             System.out.println("User 3 Wins");
//         }
//     }
// }

// basic switch statement
// public class Example{
//     public static void main(String[] args){
//         int num1 = 5;
//         int num2 = 3;
//         String operator = "/";
//         switch(operator){
//             case "+":
//                 System.out.println("Addition is: " + (num1 + num2));
//                 break;
//             case "-":
//                 System.out.println("Subtraction is " + (num1 - num2));
//                 break;
//             case "*":
//                 System.out.println("Multiplication is " + (num1 * num2));
//                 break;
//             case "/":
//                 System.out.println("Division is: " + (num1 / num2));
//                 break;
//             default:
//                 System.out.println("Invalid Operator...");
//         }
//     }
// }

// ternary if else
// public class Example{
//     public static void main(String[] args){
//         int num = 8;
//         String res;
//         res = (num % 2 == 0)? "Even Number" : "Odd Number";
//         System.out.println(res);
//     }
// }