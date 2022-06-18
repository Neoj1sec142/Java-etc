# Wrapper-Classes:
- A wrapper class is a class whose object wraps or contains primitive data types. When we create an object to a wrapper class, it contains a field and in this foeld, we can store primitive data types.
***    
#### Authoboxing and Unboxing:
* each of the primitive data types has a class dedicated to it. Therefore, the wrapper class in Java provides the mechanism to convert primitive into object and object into primitive 
* The automatic conversion of primitve data type into it corresponding wrapper class is known as autoboxing while the automatic conversion of wrapper type into it corresponding primitive type is known as unboxing. It is the reverse process of autoboxing
* One of the reasons we need wrapper is to use them in Collections API, Serialization, Sychronization, etc
* On the other hand, the wrapper objects hold much more memory compared to primitive types. So use primitive types when you need efficiency and use wrapper class when you need objects instead of primitive types
* The primitive data types are not objects so they do not belong to any class. While storing in data structures that support only objects, it is required to convert the primitive type to object first which we can do by using wrapper classses