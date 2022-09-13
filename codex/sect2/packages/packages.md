# Packages:
- resuability is an important aspect of programming. Packages help us to reuse code 
    instead of building from scratch.
***   
* packages in java are just like a container or a folder that groups classes, 
    interfaces, and more.
* it helps oraganize your classes into a folder structre and makes it easy to locate 
    and use them. 
* understand that each package in Java has its unique name and organizes its classes 
    and interfaces intoa separate namespace.
#### How to create a package?
- Java also allows us to create opackages according to our requirements. These 
    packages are called yser-defined packages.
##### SYNTAX #####
package packageName;

* a package inside another package is known as a subpackage. 
##### SYNTAX #####
package packageName.subpackageName;

### Using Packages:
- we can import packages using the 'import' keyword like:
import packageName; -> imports that package 
import packageName.subpackageName; -> imports just a subpackage 
import packageName.*; -> import everything from that package
import packageName.className; -> imports just a class from the package
import packageName.interfaceName; -> import just an interface from package 

### Types of packages:
- we use packages to breakdown big programs into smaller manageable oragainzed files 
- we can define our most used programs in a packages and import them, instead of 
    copying their definitions into different programs
* Built-in packages - java has already defined some packages that include them in the 
    Java JDK. These packages contain a large number of classes and interfaces for java programmers for different requirements (most commonly used packages: java.awt, java.io, java.lang, java.util, java.sql, java.net, etc)
* user-defined packages - are packages defined by the user, andbasically can be stored in some file and imported into my other projects

