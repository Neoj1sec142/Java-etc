// the below code would throw an arithmetic exception
// public class Handling{
//     public static void main(String[] args){
//         int num1, num2, res;
//         num1 = 5;
//         num2 = 0;
//         res = num1 / num2;
//         System.out.println("Division is: " + res);
//     }
// }

// here how to handle the above
// public class Handling{
//     public static void main(String[] args){
//         try{
//             int num1, num2, res;
//             num1 = 5;
//             num2 = 0;
//             res = num1 / num2;
//             System.out.println("Division is: " + res);
//         }catch(ArithmeticException e){
//             System.out.println("You cannot divide a number by zero.");
//         }
//     }
// }

// or try to access an index that doesnt exist
// public class Handling{
//     public static void main(String[] args){
//         try{
//             int[] nums = { 1,2,3,4,5 };
//             System.out.println(nums[5]);
//         }catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("This index doesnt exist");
//         }
        
//     }
// }

// implementing getMessage() 
// public class Handling{
//     public static void main(String[] args){
//         try{
//             int[] nums = {1,2,3,4,5};
//             System.out.println(nums[5]);
//         }catch(ArrayIndexOutOfBoundsException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }

// implementing printStackTrace()
// public class Handling{
//     public static void main(String[] args){
//         try{
//             int[] nums = {1,2,3,4,5};
//             System.out.println(nums[5]);
//         }catch(ArrayIndexOutOfBoundsException e){
//             System.out.println(e.getMessage());
//             e.printStackTrace();
//         }
//     }
// }

// when you dont know which exception will be throw use generic exception class
// public class Handling{
//     public static void main(String[] args){
//         try{
//             int num1, num2, res;
//             num1 = 5;
//             num2 = 0;
//             res = num1 / num2;
//             System.out.println("Division is: " + res);
//         }catch(Exception e){
//             System.out.println("You cannot divide a num by zero");
//         }
//     }
// }

// using a finally block
// public class Handling{
//     public static void main(String[] args){
//         try{
//             int num1, num2, res;
//             num1 = 5;
//             num2 = 0;
//             res = num1 / num2;
//             System.out.println("Division is: " + res);
//         }catch(Exception e){
//             System.out.println("You cannot divide a num by zero");
//         }finally{
//             System.out.println("Thank yo for ussing our calculator");
//         }
//     }
// }

// imagine a full calucaltor
// public class Handling{
//     public static void divide(int num1, int num2){
//         try{
//             int res;
//             res = num1 / num2;
//             System.out.println("Division is: " + res);
//         }catch(ArithmeticException e){
//             System.out.println("You cannot divide a num by zero");
//         }
//     }
//     public static void main(String[] args){
//         divide(10,2);
//     }
// }

// using the throws keyword
// public class Handling{
//     public static void divide(int num1, int num2)throws ArithmeticException{
//         int res;
//         res = num1 / num2;
//         System.out.println("Division is: " + res);
//     }
//     public static void main(String[] args){
//         try{
//             divide(10,2);
//         }catch(ArithmeticException e){
//             System.out.println("you cannot divide by zero");
//         }
        
//     }
// }

// using throw keyword
import java.util.Scanner;
public class Handling{
    public static void votingSys(int age){
        if(age > 18){
            System.out.println("You are elidgeable to vote");
        }else{
            throw new ArithmeticException("Cannot cast a vote must be 18!");
        }
    }
    public static void main(String[] args){
        int age;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter your age: ");
            age = scan.nextInt();
            votingSys(age);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("every vote counts!");
        }
        scan.close();
    }
}