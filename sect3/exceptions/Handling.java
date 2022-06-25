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
public class Handling{
    public static void main(String[] args){
        try{
            int num1, num2, res;
            num1 = 5;
            num2 = 0;
            res = num1 / num2;
            System.out.println("Division is: " + res);
        }catch(Exception e){
            System.out.println("You cannot divide a num by zero");
        }
    }
}
