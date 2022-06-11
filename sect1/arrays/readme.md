# Java Arrays:
***   
There are situations where we need to store the similar or correlated data sucha as marks of a student in five subjects. This can be achieved by jest declaring five different variables. But this has drawbacks:
* more memory will be required since the new block of memory space will be allocated 
    to every variable
* Processing and accessing this data would become touch since we would need to refer 
    them using their different variable names
* each element (variable) here would be independant. Therefore, it would be tough to 
    correlate those variables with a particular student
#### Arrays are the answer to these drawbacks
#### Array:
* is a data structure that allows us to store multiple values in a single variable.
    in simple words we can group various data together into groups
* an array is a fixed-size sequential colection of elements. These element have to be 
    of a similar type. Meaning an array can only store one data type but many of values in that form
##### SYNTAX !!!!!
data_type[] array_name;
array_name = new data_type[size];
|| OR ||
* you can combine those steps into one
data_type[] array_name = new data_type[size];
ex: int[] marks = new int[5];