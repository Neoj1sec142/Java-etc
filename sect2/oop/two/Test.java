// init of a basic constructor
// public class Test{
//     Test(){
//         System.out.println("Constructor called");
//     }
//     public static void main(String[] args){
//         Test test = new Test();
//     }
// }

// ex init the instance var w/ constructor
public class Test{
    String appName;
    double appVersion;
    Test(){
        System.out.println("Constructor called");
        appName = "JavaX";
        appVersion = 1.0;
    }
    public static void main(String[] args){
        Test test = new Test();
        System.out.println(test.appName);
        System.out.println(test.appVersion);
    }
}