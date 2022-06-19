# Packages:
- resuability is an important aspect of programming. Packages help us to reuse code instead of building from scratch.
***   
* packages in java are just like a container or a folder that groups classes, interfaces, and more.
* it helps oraganize your classes into a folder structre and makes it easy to locate and use them. 
* understand that each package in Java has its unique name and organizes its classes and interfaces intoa separate namespace.
#### How to create a package?
- Java also allows us to create opackages according to our requirements. These oackages are called yser-defined packages.
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
