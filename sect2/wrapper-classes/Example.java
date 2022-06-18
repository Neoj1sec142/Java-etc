// example of the instanceof operator
// class Example{
//     public static void main(String[] args){
//         Example ex = new Example();
//         System.out.println(ex instanceof Example);
//     }
// }

// coverting primitive to object with valueOf()
// public class Example{
//     public static void main(String[] args){
//         int num = 5; 
//         Integer numObj = Integer.valueOf(num);
//         System.out.println(numObj);
//         System.out.println(numObj instanceof Integer);
//     }
// }

// converting obj back to prim with value methods in each corresponding class
// public class Example{
//     public static void main(String[] args){
//         Integer numObj = 5;
//         int num = numObj.intValue();
//         System.out.println(num);
//     }
// }

// autoboxing ex
// public class Example{
//     public static void main(String[] args){
//         int num = 5;
//         Integer numObj = num;//not using the valueOf() method as before
//         System.out.println(num);
//         System.out.println(numObj instanceof Integer);
//     }
// }

// unboxing ex
// public class Example{
//     public static void main(String[] args){
//         Integer numObj = 5;
//         int num = numObj;// not using the intValue() method as before
//         System.out.println(num);
//     }
// }