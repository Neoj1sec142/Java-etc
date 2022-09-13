public class conditionals {
    public static void main(String[] args){
        int randomNum = (int) (Math.random() * 50);
        if(randomNum < 25){
            System.out.println("The random number is less than 25");
        }else if(randomNum > 40){
            System.out.println("The random number is greater than 40");
        }else if(randomNum < 10){
            System.out.println("The random number is less than 10");
        }else if(randomNum !=  43){
            System.out.println("The random number not equal to 40");
        }else{
            System.out.println("The random number is lost in time");
        }
        System.out.println("The random number is " + randomNum);
    }
}
