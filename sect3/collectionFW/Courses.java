// import java.util.ArrayList;

// public class Courses{
//     public static void main(String[] args){
//         ArrayList<String>courses = new ArrayList<String>();
//         courses.add("Hello Java");
//         courses.add("Getting Started");
//         courses.add("Working with Data");
//         courses.add("Basic Operations");
//         courses.add("Decision Making");
//         System.out.println("Welcome to Java. Following is the courses: " + courses);
//     }
// }

import java.util.ArrayList;

public class Courses{
    public static void main(String[] args){
        ArrayList<String>courses = new ArrayList<String>();
        courses.add("Hello Java");
        courses.add("Getting Started");
        courses.add("Working with Data");
        courses.add("Basic Operations");
        courses.add("Decision Making");
        System.out.println("Welcome to Java. Following is the courses: " + courses);
        int size = courses.size();
        System.out.println("Lastest Course: " + courses.get(size - 1));
        courses.set(0, "Intro To Java");
        System.out.println("Updated List: " + courses);
    }
}