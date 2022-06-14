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