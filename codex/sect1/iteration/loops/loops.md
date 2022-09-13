# Iteration in Java:
#### Two types of Iteration:
* definite iteration - in which the num of repetitions is specified explicitly in 
    advance. (run 3 laps of this code...etc)
* indefinite iteration - in which the code will execute until some condition is met 
    (run until user completes form... etc)

#### Different Loops in Java:
* For loop 
* While Loop
* Do While loop 

### For Loops:
##### SYNTAX ##### 
for(initilization; condition; increment/decrement){
    //body of loop
}

* Initialization - marks the start of a for loop and this part is executed only once
        he we can decalre and init a looping variable
* Condition - evaluates to a boolean value. if the boolean is returned true the Loop
        is executed otherwise the body of the loop will not be executed and the control jumps to the next statment after the for loop
* Update Expression(incre/decre) - is used for updating the variable for the next
        iteration. if the conditio is true the body of the for loops gets executed
        the control jumps back up to the update statment which updates the value of the lop variable

### While Loops:
##### SYNTAX #####
while(condition){
    //body of the Loop
    //update the condition of the loop
}

### DO WHILE Loops:
##### SYNTAX #####
do{
    //body of loop
}while(condition);