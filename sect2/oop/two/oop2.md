# OOP 2 of 3: 
- as we have learned the basic concept is that instead of writing a program, you 
    create a class, which is a kind of template containing functions and variables
- objects are self contained instances of that class, and you can get them to 
    interact how you like
### The Special Method:
- constructors are generally used for instantiating an object. The task of 
    constructors is to initialize(assign values) the data members of the class when an object of the class is created.
- a constructor is used to assign values to the instance variables declared in a 
    class which makes every instance unique
- constructors can also be used to initiate the start-up procedures (if any) which 
    are required to be executed as soon as the object is created or to create a fully functional object
- a constructor in java is called a special method because it is syntactically 
    similar to a method. 
##### SYNTAX #####
class Name{
    className(){
        constructor body
    }
}
* the name of the constructor has to be the same as the name of the class
* unlike methods, constructors do not have any explicit return type even though they 
    are similar to methods
* even if you do not create a constructor manually, Java automatically provides a 
    defualt constructor that initializes all member variables to zero
* once you define your own constructor, the defualt constructor is no longer used