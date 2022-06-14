# Intro to OOP in Java Pt1:
* in programming there are different paradigms or patterns that define 
    how to write and structure our code. Each paradigm has different functionalitiies and behaviors
#### Some Paradigm Patterns:
* Structural programming
* Procedural programming
* OOP
* Functional programming
* etc
***   
* oop is a programming paradigm that provides a means for structuring 
    programs so that properties and behaviors are bundled into individual objects
* it is not possible to write a java program without a class. 
* oop in java is a programming approach that focuses on using objects and 
    classes as the building blocks of the program
* the major focus of oop is reusability
#### Pillars of OOP:
* Abstraction
* Encapsulation
* Inheritance
* Polymorhpism

Abstraction - means abstracting only the details/data which migh concern 
    the user
Encapsulation - similarly in encapsulation we try to encapsulate all the 
    data as a single entity
Inheritance - in programming, one element can inherit various 
    characteristics and capabilities from another element. Inheritance is important because it supports the conecpt of reusability
PolyMorphism - poly = many morphism = forms in programming data comes in 
    many forms via array string int obj ...

### Classes and Objects:
* just like a variable is used to store some data, similarly, a clas is a 
    high-level container that is used to store data, define behaviors(methods), and group various programming statements
* therefore, a class is used to encapsulate the whole surface code into a 
    single wrapper that can be accessed with help of objects 
***   
##### What is a Class?
- a class is a user-defined prototype for an object that defines the set 
    of attributes that characterize and object of the class
- in simple words it is a blueprint for new objects created in that class 
    to define how they will be contructed and what variables and behaviors they will have access too
***   
##### What is an Object?
- an object is known as an instance of the class. as we have seen, a 
    class is just a blyeprint so its just like a description
- Objects have 2 things: 
    * Attributes (data variables of the class)
    * Behaviors (methods defined in the class)
    
### Defining a Class:
* Class is a simple prototype to create objects. 
##### SYNTAX #####   
accessModifier class className{
    //body of the class
}
* in the above syntax, accessModifier is the type of access modifier that 
    specifies the accessibility of scape of the class. So far we've used public
* the accessModifier is followed by the class keyword and finally the
     name of the class. And as we have seen, the curly brace {} define the body of the class in which we encapsulated all the attributes and methods
- in a single Java file (.java file), there can only be one public class 
    but there can be multiple non-public classes
- while defining a class, mentioning the access modifier is optional
- as we already know, the name of the source file should be the same as 
    the name of the public class 
- the name of the class should be meaningful and should be in a 
    capitalized form. For example, the class name Data is valid while the class name is invalid

### Exploring Methods:
- A method in Java is a block of code that performs a perticular task and 
    may accept optional user inputs ad accordingly give outputs
- This block fo codde is responsible for a particular task and only 
    executes when they are called, which is in simple words when we want them to execute
- This block of code is written once and can be executed 'n' number of 
    times (whenever its called)
* 1st reason methods are important: resuablility (write once exe anytime)
* 2nd reason: methods help us group various programming statements that 
    are responsible to perform an operation
    - methods help to divide a complex problem into smaller chunks that 
        make your program easy to understand and reusable
- There are 2 types on methods in java:
    * Standard Library Methods (javas default methods)
    * User-defined Methods (built by the user)
##### SYNTAX #####   
access_modifier return_type
method_name(data_type param1, data_type param2, ...){
    //body of method
}
- the return_type represents the data type of value that will be returned 
    by the method by performing a particlar operation. If nothing is returned by the method, the return_type will be void

### Variables:
* is a names memory location in the computer memory which helps us to 
    store data. this data can be retireved in any instance of the program. In simple words, a variable is a container to store data
##### There are 3 types of variables in java:
* local variables
* instancce variables
* static variables
***   
Local Variables - is a var thats decalred within the body of a method or 
    a code block, these variables can only be used in that particular code block/method. Other methods in the class aren't even aware that the variable exist 
* The memory is allocated to the local variables only when the control 
    flow enters the method or code block. These variables are destroyed once the control flow exits that method/code block
* While defining the local variable, we cannot use access modifiers
* Local variables when defined should be initialized with some initial 
    value before they can be used
***     
Instance Variables - are also calles fields in a class that represent the 
    data associated with an object of a class, since Java follows the concept of reusability, we can create a class and its instance once that can be used by various instances of the class. There are called instance vairables... These variables are decalred inside the body of a class but not within any methods
* When space is allocated for an object in the memory heap, a slot for 
    each instance varaible is created. therefore they differ with each instance of the class created although they have the same identity
* The memory is allocated to the instance variables when an object is 
    created with the use of keyword 'new' and these variables are destoryed when the object is destoryed
* We can specify various access modifiers with the instance variables
* These variables have a global scope, meaning they can be accessed and 
    used by any method or the code block in a particular class
***   
Static Variables - a static variabel is just like an instance variable 
    that is defined in the body of the class at the top and not in any mthod or code block. The difference lies while defining these variables, they are defines using the static keyword in the beginning, following is the syntax:
##### SYNTAX #####    
static data_type variable_name = value;
