> # CONSTRUCTOR IN JAVA

In Java, a constructor is a block of codes similar to the method which is used to initialize the object. At the time of calling constructor, memory for the object is allocated in the memory.Every time an object is created,constructor is called.

__Note:__ It is called constructor because it constructs the values at the time of object creation.

> ## Rules For Naming Constructor In Java
* ConstructorName must be the same as its className.
* A Constructor must have no explicit return type.



> ## Types Of Constructor In Java
 There are two types of constructors in Java:

* Default Constructor
* Parameterized Constructor

> ### Default Constructor
 A constructor is called *Default Constructor* when it doesn't have any parameter.

 __Syntax:__

 ```java
<ClassName>()
{
  
  //body of constructor

}
 ```

 > ### Parameterized Constructor
 A constructor is called *Parameteized Constructor* when it doesn't have any parameter.

 __Syntax:__

 ```java
<ClassName>(argument1,argument2,..)
{
  
  //body of constructor

}
 ```