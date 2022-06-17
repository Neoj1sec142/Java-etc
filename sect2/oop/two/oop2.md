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

### The 'this' keyword:
- with the last example having 2 same name variables in scope is not 
    allowed this is becuase the Java comipler gets confused because of the ambiguity in names between the instance variable and the param 
- 'this' keyword in Java is a reference variable thay points to the 
    current instance of a class. The keyword resolves and ambiguity between a param and a member variable of the same name
- with 'this' you can access methods, fields, and constructors f the same 
    class within the class. But, the main motto of using this keyword is to differentiate the formal param and data members of the class 

##### The 'this' keyword can also be used for:
* Use this() to invoke the current class constructor
    - this() can be used to call one constructor within another without creating the objects multiple times for the same class. 

### Inheritance:
- in programming one class can inherit carious characterisitics and 
    capabilities from another class. Here the charachteristics that we are talking about are the attributes of the class, while the capabilities are its behavior(methods of the class)

##### Terms to know when working with Inheritance:
* Parent Class: is the class being inherited from the other classes. AKA 
    Base class
* Child Class: is the class that inherits from another class. AKA Derived 
    class
##### SYNTAX ##### 
class derivedClass extends baseClass{
    //body of class
}
- whenever we create an object of the child class and try to access 
    something, it will first search for that in the child class, i found then it will execute it and return the data. If not found, then it will search and access the data from the parent class.
- the idea of reusability means when we want to create some feature and 
    there is already sucha feature that includes some of the code that we want, then we can derived our feature from the existing one instead of developing it from scratch
- when we want to include a child constructor we use the 'super' keyword
- the super keyword refers to superclass (parent) objects. it can be used 
    for the following
    * it is used to differentiate the members if the superclass from the members of the subclass if they have th same names
    * it is used to invoke the superclass constructor from the subclass

##### SYNTAX 2 access members of superclass from the subclass #####
super.variableName;
super.methodName();

#### Method Overriding:
- inhritance is an OOP property that allows us to derive a new class from 
    an existing class. The subclass can inherit the attributes and methods of the superclass
- just like the this keyword allows us to have the same variable name and
     different values from parent to child classes. When we have a parent and child class with the same name for methods, the method then becomes overwritten by the child class(hence because it check the subclass before the parent if the child has the same named method it will satisfy the call and execute from the child)
- #!# if you look in the labrary class you will see the @Override:
    * this is an annotation. In java, annotations are the metadata that we use to provide information to the complier
    * here the annotation specifies the complier that the method after this annotatio overrides the method of the superclass
* Inheritance we've seen until now is called Single Inheritance as it enables the 
    derived class to inherit properties from a single parent

##### More types of inheritance:
* Multilevel Inheritance
* Multiple Inheritance
* Hierarchial Inheritance
***   
Multilevel - attributes and behaviors of the base class and the derived class are 
    further inherited into the new derived class (Grandfather to father to child)
    EX
class Grandfather{
    //body of class
}
class Father extends Grandfather{
    //body of the class
}
class Child extends Father{
    //body of the class 
}
***   
Multiple - when a class can be derived from more than one base class then this type 
    of inheritance is called as multiple inheritance. In multiple inheritance, all the
    features of the base classes are inherited into the derived class
    * note that multiple inheritance is not directly supported in Java to work with classes. But it can be surely implemented with something called "Interfaces" 
***   
Hierarchial - when more than one derived class is created from a single base class, 
    then it is called as hierarchial inheritance
class Company{
    //body of class
}
class Employee extends Company{
    //body of class 
}
class Intern extends Company{
    //body of class 
}