# Advandce OOP: 
- OOP allows you to break down the software into smaller problems that you can solve one at a time, as a result OOP designing is flexible, modular, and abstract. 
***   
### Polymorphism:
- the ord polymorphism os used n various conexts and describes situations in which somting occus in several different forms
##### 2 Basic types of Polymorphism:
* Static - aka Complie-time polymorphism, is one of the most basic forms of
    polymorphism. In Java it is represented with the help of Method Overloading
    * method overloading is the situation where there are 2 methods of the same name but with different parameters in the same class (there are situations where a method can have different params so that it can perform different functionalities as required)
    * these method params must differ in at least one of these ways:
        * different number of parameters
        * the types of params need to be different
        * they need to expect the params in a different order(NOT RECOMMENDED)

* Dynamic - aka Runtime polymorphism is used in the instance of method overridding
***   
### Abstraction: 
- the abstract keyword when used with a method makes it an abstract method and when used with a class, makes it an abstract class. 
***   
* Abstract Methods - is a method that doesnt have a body, that is it is a method without implementation. They can only be called within an abstract class 
##### SYNTAX #####
access_modifier abstract return_type
method_name(params);

- if the class declaration is prefixed with the abstract keyword, it becomes an 
    abstract class. An abstract class is a class that cannot be instantiated, which means we cannot create objects of abstract class.
- abstract classes can contain both methods, abstract methods. Since the anstract 
    class cannot be instantiated, we need to create a new class that would inherit form the abstract class
- note that the subclass which inherits from the abstract class should have the 
    implementation of the abstract methods declared in the super class.
- if a subclass does not implement all the abstract methods of the abstract 
    superclass, then the subclass must be declared abstract as well

### Interfaces in Java:
- Interfaces -> Abstract Class - data abstraction simply refers tp providing only 
        essential info about the daya to the outside world, hiding the background details or implementation

* an interface in java is just like a class, yet it's not a class. An interface can 
    have methods and variables jist like the class but the methods declared in the interface are default abstract
* also the variables declared in an interface are public, static & final by default
* an interface is a collection of abstract methods and prvides a fully abstract class. 
    For the class to use these methods, it needs to implement an interface, thereby inheriting the abstract methods of interface 
* KEYWORD = interface
* KEYWORD to implement = implements
##### SYNTAX #####
interface interfaceName{
    //body of interface
} 
class className implements interfaceName{
    //body of class
}
* Shape.java - implementing interface ex 
    * an interface is implicitly abstract. You do not need to use the abstract keyword 
        while declaring an interface
    * Each method in an interface is also implicitly abstract, so the abstract keyword 
        is not needed
    * Methods in an interface are implicitly public 
    * Just like a class, an interface is written in a file .java ext, w/the nam of the 
        interface matching the name of the file

#### Multiple Interfaces
interface interfaceName{
    //body of interface 
}
interface interfaceTwoName{
    //body of interface 
}
class className implements interfaceName, interfaceTwoName{
    //body of class 
}
- just like a class if one interface is to inherit another interface we use the 
    extends keyword
interface interfaceOne{
    //body of interface 
}
interface interfaceTwo extends interfaceOne{
    //body of interface 
}
- multiple inheritance is not supported in Java when it comes to classes. But it does 
    for interfaces. an interface can inherit from multiple interfaces 
interface interfaceOne{
    //body of interface 
}
interface interfaceTwo{
    //body of interface 
}
interface interfaceThree extends interfaceOne, interfaceTwo{
    //ody of interface 
}
* obviously declaring methods in an interface works but coding all of those methods 
    implemetation for each new instance of the interface is tedious. Therefore Default Methods:
    * Default methods are methods that can have a body. The most important use of default methods in interfaces is to provide additional functionality to a given type without breaking down the implementing classes 
    * sometimes methods have only a single implementation and there is no need to provide their implementation in each class, in that case we can declare that method as default and provide the interface the implementation itself

- Default methods are methods that have a body inside the interface and use the 
    'default' keyword
public interface Shape{
    public void getShape();
    public void getShapeName();
    public void getSides();
    public void createShape(){
        //this method will have the code to render the shape
    }
}
