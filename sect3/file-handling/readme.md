# File Handling:   
- There are instances where we need to syrpe and retrieve data from somewhere else, rather than the variables or avilable data structures. In such case, files play an impotant role
***   
* Files are names locations on a disk to styore relate dinforamtion. They are used to permanently store data in a non-volatile memory such as hard disks and more.
* These files can be any type via .txt .csv etc
* One can just flush the data in the carious files such as above according to the requirment and retrve it whenever needed.
* Files are stored in hard drives whereas, variables and other structures store data in Random Access Memory (RAM) which is volatile and loses its data when the computer is turned off or the program is terminated
* Files help us to store data permanently and retireve them since they are stored in ROM (Read-Only Mode)
#### Three steps of working with Files:
* Opening the File
* Performing Actions (Reading or Writing)
* Closing a File 
***   
#### java.io:
the Java I/O package (java.io) provides a set of input streams and a set of output streams used to read and write dat to files or other input and output sources. There are three categries of classes in java.io - input streams, output streams, and everything else
* this package contains a lot of things. Hence, to precisely work with Files, it provides a File class that can be used for all the file handling and manipulation in Java programs
* Thus, if we want to use a file class, we need to create an object of thaty particular class and should specify the filename or directory name followd by the operations.
* import java.io.*; //whole package
* import java.io.File; //file class