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