> # Constructor In Java:

In Java, A Constructor
 is a block of codes similar to the method.Every time an object is created using the new() keyword, at least one constructor is called.

> ## Rules For Creating Constry=uctor In Java:

1. Constructor name must be the same as its class name.

2. A Constructor must have no explicit return type.

3. A Java constructor cannot be abstract, static, final, and synchronized.

> ## Types of Java constructors
There are two types of constructors in Java:

1. Default constructor (no-arg constructor):

    A constructor is called "Default Constructor" when it doesn't have any parameter.The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type

    __Syntax:__
    ```java
    <classname>(){

        //body of constructor

    }
    ```

2. Parameterized constructor:

    A constructor which has a specific number of parameters is called a parameterized constructor.

        __Syntax:__
    ```java
    <classname>( parameter01,parameter02,... ){

        //body of constructor

    }
    ```

> ## Constructor Overloading in Java

Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.They are differentiated by the compiler by the number of parameters in the list and their types.
