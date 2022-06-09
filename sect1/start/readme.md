# Practice Repo For Java:
* Is a general purpose OO, high-level prgramming language
- The Java Development Kit (JDK) is a software dev env used to develop Java apps
    It contains JRE and other tools such as 
    * java: the launcher for java apps
    * javac: the compiler for Java
    * javadoc: API documentation generator
    * jar: creates and manages JAR files
### Elements of a JVM Loader:
* ClassLader: is a subsystem of JVM, used to load class files. Whenever we run the 
                java program the class laoder loads it first
* Method Area: on of the data areas in JVM in which class data will be stored.
                Static variables, static blacks, staic methods, instance methods
                are stored in this 
* Heap: is created when the JVM starts up and may increase or decrease in size as 
                the program runs
* Stack: is known as a thread stack, is a data area in the JVM memory which is 
                created for a single execution thread
* Native Stack: includes all the native methods used in your application
* Execution Engine: 
    * JIT Compiler: part of runtime env it helps in imporiving performance of Java 
            apps by compliling bytecodes to machine code at run time. The JIT compiler complies the bytecode of that method into machine code, compiling it "Just in Time to Run"
    * Garbage Collector: is used for collecting unused data, memory, etc. It tracks 
            each and every object avaliable in the JVM heap space and removes the unwanted ones

### Java Compiling and Executing:
* javac <file_name/>.java
* java <file_name/>
- files must have the same name as the class within 

Python X - This folder container sect 1-2 of Java
