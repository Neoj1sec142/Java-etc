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
#### Two Kinds Of Constructors:
* defualt - a default constructor is also known as a non-parameterized constructor. 
        it is a constructor that does not accept any arguements. In simple terms, a default constructor does not have any params in its definition
        * this type of constructor can be used to assign fixed values to the instance variables for all the objects or to execute some logic whenever the object is created
* parameterized - a parameterized constructor is obviously one that accepts one or    
        more params. this is generally used to create unique instances of the object and assign values to the instance variables
##### SYNTAX #####
class className{
    constructor(data_type param1, data_type param2, etc){
        //body of constructor
    }
}