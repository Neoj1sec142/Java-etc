# Collections Framework:
***   
### Data in Programming:
- So far along the Java journey, all the structrures that we have used such as variables or arrays stroed in primitive data types. But, there are situations where we need to store objects and manipulate them..... Java Collections eenters the room.
    * They haelp us to work with data efficiently nd prvde some amazing methods that do the job of manipulation easily.
***   
### Collections in Java:
- Data storage and mainpulation are the pillars of any powerful software app.
- In Java, all the data types allow us to store a single value in the computer memory.
    Whenever we define a variable, a single block of memory space is allocated to thay variable which is refferred to using the variable name.
- There are situations where we need to stroe similar or correlated data such as marks of a student in five subjects. We know we use an array for this.
##### Array Drawbacks:
- An array in Java is a data strcture that allows us to store multiple values in a single variable. In simple words, using and array, we can group various daya items into a single container. Bute heres the downside:
    * arrays have fixed size so the array is structurally not dynamic
##### Collections:
- any group of individual objects which are represented as a single unit is knwona as the collection of the objects. Collections in Java are used to store the group of objects or data and provide access to these for efficient manipulation.
- In simple terms, collections can be defined as a group of related data items with an assiciated name. The data items in the collection can be of any object type but must be stored in a common schema (data structure)
- Technically, a colection is an object or container which stores a group of other objects as a single unit or single entity. Here the container (collection or data structure) can be different in different instances and the way of accessing the objects might differ as well.
- An element in a collection is known as a collection object or container object. A container object mean t contains other objects. In simple words, a collection is a container that stores multiple elements together
- JVM stores the reference of other objects into a collection object
- It never stores physical copies of other objects because othe objects are already available in the memory and storing another copy would be a waste of memory.
- To work with collections in Java, a separate framework named the Collection Framework has been defined which holds all the collection classes and interfaces in it.
- A framework is a set of classes and interfaces which provide a ready-made architecture. In order to implement a new feature or a class, there is no need to define a framework.
- However, an optimal object-oriented deisgn always includes a framwork with a colection of classes such that all the classes perform the same kind of task.
- A java collections framework is a sophisticated heirarchy of several perdefined interfaces and implementation classes that can be used to handle a group of objects as a single entity. It is present in the java.util package