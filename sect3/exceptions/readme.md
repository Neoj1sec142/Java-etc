# Exceptions:
- any error the user can see is basically a bad user experience, and might even stop the application.
- Errors are the mistakes or faults in the program that cause it to behave unexpectedly
- Programming errors are generally known as bugs and the process to remove bugs from the program is called debugging.
- In general, there are three tyoes in which errors are categorized:
    * Syntax errors - is an error in the 
        source code of a program 
    * Logic errors - logic errors will cause your program to perform in undesired operations that you didn't intend your program to perform. = IMPROPER LOGIC 
    * Runtime errors - errors not in syntax or logic so not caught by complier but when u look at the program u notice a bug. they are generated when the program is running and lead to abnormal behavior or termination of the program. The general cause of runtime errors is because your program is trying tp perform an oipoeration that is not possible to carry out.
***   
### Excpetion Handling:
- Runtime errors are called Exceptions.
- In simple words, an exception is an error that happens at the time of execution of a program. Therefore, it is an unwanted event that interrupts the normal flow of the program because when such an exception occurs, program execution is terminated
##### Handling Exceptions:
- If an exception occurs, which has not been handled by the programmer then program execution gets terminated and a system generated error message is shown to the user. This message is not user friendly so they wont understand it. To make these messages understandable we use exceptions.
- We handle such conditions and print a user friendly warning message to the users, which lets them correct the error. Thus, it is a good idea to handle and manage these exceptions with grace rather than throwing errors to the users rezulting in termination of the program.
- The biggest benifit of exception handling in Java is to maintain a programs flow.
- If the exception is handled, then the complier will skip only one line of code where the excption occurs, and the rest of the code will be executed in a natural flow.
***   