# Conditionals in Java:
### Traditional Conditionals in Java:
* if
* if-else 
* if-else if 
* Nested if-else 
* Switch 
#### SYNTAX ####
if(condition){
    //statements to be executed if condition == true
}else if(condition){
    //statements to be executed if condition == true
}else{
    //statements to be executed if conditions != true
}

switch(expression){
    case value1:
        //code to be executed if expression == value1
        break;
    case value2:
        //code to be executed if expression == value2
        break;
    default:
        // default statement to execute if none match
}
#### Things to keep in mind for SWITCH statements:
* the var used in a switch statment can on be integers, convertible integers(
    byte, short, char), or strings
* the value for a case must be of the same data type as the variable in the switch
* You can have any number of case statements in a switch. Each case is followed by 
    the value to be compared to and a colon
* duplicate case values are not allowed
* must have default case