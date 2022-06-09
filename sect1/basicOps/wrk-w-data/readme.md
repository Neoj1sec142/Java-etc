# Working w/ Data: Section 3
[x] Storage Containers   
[] Container Types      
[] Storing Numbers in Java      
[] Working w/ Alphabetical Data      
[] True or False      
***   
## Storage Containers:
* Variables are a named location where some data can be stored. This means that when 
        you creat a var you reserve some space in the memory
* a variable is a container in our memory that is used to store the data, where the 
        data is its value(entity) and the nae given the the var is a label
- Variable = Vary + Able : Something that can vary
## Creating Variables in Java:
* Specify the data type to define tht type of data that need to be stored
* Declare a label to the memory location
* Assign the value using = (optional) 
* add the value (optional)
#### SYNTAX ####
data_type var_name; OR data_type var_name = value;

#### A Few Key Programming Terms:
* Identifier - a name assigned to an element in a program (Var Name)
* Literals - source code representation of a fixed value. (Values)
* Keywords - predefined, reserved words that have special meaning to the compiler
        they are part of the syntax and they cannot be used as an Identifier    
[Java Keywords](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)

## Container Types:
- if you needed to store a textual file on your pc you would use .txt
        if you wanted data in columns and rows you would use .xlsx 
        or if you wish for graphical data you wpuld use a .pptx similarly
        we need to store data in variables with apropriate data Types
        -hence when you declare a var in java you need to specify the Types
#### Data Types in Java: ####
* Primitive - provided by java
* Non-Primitive - created by the user
#### Primitive Datra Types:
* Numeric - Integer(int), Floating Point(float), Double Floating Point(double)
* Textual - Character(char), String(String)
* Boolean
#### Non Primitive Data Types:
* Classes
* Objects
* Arrays
* ...etc
***   
### Storing Numbers in Java:
* simple ex
ex: int age; OR int age = 19;
* the only difference between a float and double point float is the size
double ex: double temp = 16.3;
float ex: float temp = 16.3f;

### Storing Alphabetical Data in Java:
* Character (char) - is used to manipulate characters of strings or just use one 
                        letter
- As you can see with compliing the letters are turned into numbers for binary
        The encoding is called ASCII and Unicode(uni = hexadecimal ex: 0x0041 = A)
* String(String) - strings are not considered primitive data types and therefore are 
        represented as a class(String class) but more later on this

### Storing Boolean in Java:
* 