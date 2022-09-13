// public class Example{
//     public static void main(String[] args){
//         int[] marks = {78,93,72,81,86};
//         System.out.println(marks[1]);
//     }
// }

//manipulating an array
// public class Example{
//     public static void main(String[] args){
//         String[] javaStudents = {"Mike", "Sam", "LEo", "Arjun", "PErry", "Nikki"};
//         javaStudents[3] = "Potato Dan";
//         System.out.println(javaStudents[3]);
//     }
// }

//getting the length of an array
// public class Example{
//     public static void main(String[] args){
//         int[] stonch = {4,5,6,7,8};
//         System.out.println("The lenght is " + beers.length);
//     }
// }

// looping an array length
// public class Example{
//     public static void main(String[] args){
//         String[] snookiesCookies = {"asdf", "wert", "qwerty", "bnm,."};
//         for(int i=0; i<snookiesCookies.length; i++){
//             System.out.println(snookiesCookies[i]);
//         }
//     }
// }

// looping until found in array
// public class Example{
//     public static void main(String[] args){
//         int[] numbers = {1,2,4,6,8,19,25,63,85,90};
//         for(int i=0; i<numbers.length; i++){
//             if (numbers[i] == 25){
//                 break;
//             }
//             System.out.println(numbers[i]);
//         }
//     }
// }

//basic for each loop example
// public class Example{
//     public static void main(String[] args){
//         int[] numsArr = {56, 34, 25, 67, 12, 4};
//         for(int num : numsArr){
//             System.out.println(num);
//         }
//     }
// }

// initializing a 2d array... thrn storing values
// int [][] numbers = new int[2][2];
// numbers[0][0] = 73;
// numbers[0][1] = 25;
// numbers[1][0] = 37;
// numbers[1][1] = 11;

// store data at init 2d array
// int[][] numbers = {{2,3}, {5,12}};

// accessing elements of a multidimensional array
// 

// public class Example{
//     public static void main(String[] args){
//         int[][] nums = {{2,3},{5,6}};
//         System.out.println("Element @ [0,0]: " + nums[0][0]);
//         System.out.println("Element @ [0,1]: " + nums[0][1]);
//         System.out.println("Element @ [1,0]: " + nums[1][0]);
//         System.out.println("Element @ [1,1]: " + nums[1][1]);
//     }
// }

// looping through mdas
// public class Example{
//     public static void main(String[] args){
//         int[][] nums = {{2,3}, {4,5}};
//         for(int i=0; i<2; i++){
//             for(int j=0; j<2; j++){
//                 System.out.println(nums[i][j]);
//             }
//         }
//     }
// }

// public class Example{
//     public static void main(String[] args){
//         int[][][] intArr = {{{11,12}, {14,15}, {17,18}}, 
//                             {{21,22}, {23,24}, {27,28}}, 
//                             {{31, 32}, {34, 35}, {37, 38}}};
//         System.out.println("Following 3D elements");
//         for(int i=0; i<3; i++){
//             for(int j=0; j<2; j++){
//                 for(int k=0; k<2; k++){
//                     System.out.println("intArr [" + i + "][" + j + "][" + k + "] = " + intArr[i][j][k]);
//                 }
//             }
//         }
//     }
// }

// write a program to add the sum of all the elements of an array together abd return the sum
// public class Example{
//     public static void main(String[] args){
//         int[] nums = {3, 67, 8, 23, 5, 43, 21, 10, 13};
//         int sum = 0;
//         for(int num : nums){
//             sum += num;
//         }
//         System.out.println("The Sum is: " + sum);
//     }
// }

//finding the highest number element in an array
// public class Example{
//     public static void main(String[] args) {
//         int[] nums = {3, 67, 8, 23, 5, 43, 89, 10, 13};
//         int largest = nums[0];
//         for(int num : nums){
//             if(largest < num)
//                 largest = num;
//         }
//         System.out.println("The largest element is: " + largest);
//     }
// }