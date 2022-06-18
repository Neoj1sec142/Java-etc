# Wrapper-Classes:
- A wrapper class is a class whose object wraps or contains primitive data types. When we create an object to a wrapper class, it contains a field and in this foeld, we can store primitive data types.
***    
#### Authoboxing and Unboxing:
* each of the primitive data types has a class dedicated to it. Therefore, the wrapper class in Java provides the mechanism to convert primitive into object and object into primitive 
* The automatic conversion of primitve data type into it corresponding wrapper class is known as autoboxing while the automatic conversion of wrapper type into it corresponding primitive type is known as unboxing. It is the reverse process of autoboxing
* One of the reasons we need wrapper is to use them in Collections API, Serialization, Sychronization, etc
* On the other hand, the wrapper objects hold much more memory compared to primitive types. So use primitive types when you need efficiency and use wrapper class when you need objects instead of primitive types
* The primitive data types are not objects so they do not belong to any class. While storing in data structures that support only objects, it is required to convert the primitive type to object first which we can do by using wrapper classses

### The Instanceof operator:
- the instanceof operator is Java is used to test whether the object is an instance of the specified class or not, aka a type comparison operator bcause it compares the instance with a type. Returns true or false
##### SYNTAX ##### (ex Example.java)
objectName instanceof className
***   
### Whapper Classes in Java:
- a warpper classs is a class whose object wraps or contains primitive data types. When we creat an object to a wrapper class, it contains a field and in this field, we can store our primitive data
#### Types of Wrapper Classes:
* Byte - wraps a primitive byte data type as an object, It's object contains a single 
    field of type byte
* Character - wraps a char primitive data type in an object. An object of type 
    Character contains a single field whose type is Char 
* Short - wrapps a primitive shot type value un an object, single field whose type is 
    short 
* Integer - wraps a primitive int type value in an object. Its object contains only a 
    single field whose type is int 
* Long - generally wraps the primitive data type long into an object, field type long
* Float - float type value in an object, single field type float.
* Double - wraps a primiive double into an object. Tis class is useful in providing 
    vairous methods that can be used to convert a double to a String and vice vera
* Boolean - wraps a primitive boolean and contains only a single param either T/F 

# Working with Wrappers:
- in java we can use the valueOf() method to convert primitive types into corresponding objects. 
- similarly, to convert objects into the primitive types, we can use the corresponding value methods(intValue(), doubleValue(), etc) present in each wrapper class