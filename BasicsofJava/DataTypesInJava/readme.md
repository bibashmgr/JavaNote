> # Data Types In Java
Data types specify the different sizes and values that can be stored in the variable. There are two types of data types in Java.They are:

* __Primitive Data types:__ The primitive data types include *boolean, char, byte, short, int, long, float* and *double.*
* __Non-primitive Data types:__ The non-primitive data types include *Classes, Interfaces* and *Arrays*.

> ## Primitive Data Types:
In Java, primitive data types are the building blocks of data manipulation. These are the most basic data types.
Basically,Primitive Data types are classified in two types:
**Boolean** and **Numeric**.

* Boolean:

    It is used to store only two possible values: true and false . It specifies one bit of information(i.e only stores one bit).For example:
    ```java
    boolean isCompleted = true;
    ```

* Numeric:
It is classified into two types: **character** and **integral**.

    * Character:
    
        *char* data type is a single 16-bit Unicode character. Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).The char data type is used to store characters . It stores 2 byte of information.For example:
        ```java
        char letter = 'A' ;
        ```

    * Integral: 
    It is further classified into **integer** and **floating point**.

        * integer:

         1. __byte:__
             The *byte* data type is an 8-bit signed two's complement integer. Its value-range lies between -128 to 127 (inclusive).It stores 1 byte of information.For example:
            ```java
            byte javaMarks = 23 ;
            ```

         2. __short:__
            The *short* data type is a 16-bit signed two's complement integer. Its value-range lies between -32,768 to 32,767 (inclusive).It stores 2 byte of information.For example:
            ```java
            short monthlyTax = 5000;
            ```

        3. __int:__ 
            The *int* data type is a 32-bit signed two's complement integer. Its value-range lies between - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive).It stores 4 byte of information.For example:
            ```java
            int totalArea = 1234567890;
            ```

        4. __long:__
            The *long* data type is a 64-bit two's complement integer. Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive).It stores 8 byte of information.For example:
            ```java
            long totalAmount = 12345678987654321;
            ```

        * floating point:

        1. __float:__
            The *float* data type is a single-precision 32-bit IEEE 754 floating point.Its value range is unlimited.Its default value is 0.0f. It stores 4 byte of information.For example:
            ```java
            float totalMarks = 355.5f ;
            ```

        2. __double:__
            The *double* data type is a double-precision 64-bit IEEE 754 floating point. Its value range is unlimited.Its default value is 0.0d. It stores 8 byte of information.For example:
            ```java
            double totalDistance =2555.47 ;
            ```

> ## Non-Primitive Data Types:
`We will read this data types in later chapters.`