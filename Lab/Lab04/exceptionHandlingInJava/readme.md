> # EXCEPTION HANDLING IN JAVA

An __Exception__ is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.

According to Oracle, there are three types of exceptions:

* __Checked Exception:__
        
    They are checked at compile-time.Some of the examples of checked exception are  *IOException* , *SQLException*  etc.

* __Unchecked Exception:__

    They are checked at runtime.Some of the examples of unchecked exception are *ArithmeticException* , *NullPointerException* , *ArrayIndexOutOfBoundsException* etc.

* __Error:__

    Error is irrecoverable.Some of the examples of errors are *OutOfMemoryError* , *VirtualMachineError* , *AssertionError* etc.


__Exception Handling__ in Java is mechanism to handle the runtime errors so that normal flow of the application can be maintained.

__For Example:__
```java
statement 1;  
statement 2;  
statement 3; //exception occurs
statement 4;  
statement 5;
```
In the following program , let's us suppose that there occurs an exception at statement 3, then the rest of the code will not be executed i.e. statement 4 & 5 will not be executed. If we perform exception handling, the rest of the statement will be executed. That is why we use exception handling in Java.

> ## Java Exception Keywords

There are 5 keywords which are used in handling exceptions in Java.They are:

> ### try
    The "try" keyword is used to specify a block where we should place exception code. The try block must be followed by either catch or finally. It means, we can't use try block alone.

> ### catch
    The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.

> ### finally
    The "finally" block is used to execute the important code of the program. It is executed whether an exception is handled or not.

> ### throw
    The "throw" keyword is used to throw an exception.

> ### throws
    The "throws" keyword is used to declare exceptions. It doesn't throw an exception. It specifies that there may occur an exception in the method. It is always used with method signature.

 __SYNTAX:__
```java

// syntax for tryCatchFinally keyword

try{
     
    // code that may raise exception 

}catch(typeOfException ref ){    

   // exception handler for exception type

}

  // optional

finally {

  // block of code to be executed after try block ends

}

// syntax for throw keyword

throw new typeOfException("... ");

// syntax for throws keyword

return_type method_name() throws exception_class_name{  
//method code  
}  



