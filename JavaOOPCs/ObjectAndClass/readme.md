> # Object In Java:
Object has following 3 characteristics:

- `State` : represents the data (value) of an object.

- `Behavior` : represents the behavior (functionality) of an object such as deposit, withdraw, etc.

- `Identity` : An object identity is typically implemented via a unique ID.

> # How to initialize object in Java.
There are 3 ways to initialize object in Java.

- By reference variable
- By method
- By constructor

> # Anonymous Object 

Anonymous simply means nameless. An object which has no reference is known as an anonymous object. It can be used at the time of object creation only.If you have to use an object only once, an anonymous object is a good approach.

__Syntax:__
```java
new Calculation(); //anonymous object  
```

Lets see the differece between calling method through reference and calling method through an anonymous object:

| Through reference                        | Through anonumous                               |
| :-----------:                            | :-----------:                                   |
| __Syntax:__                              | __Syntax:__                                     |
|                                          |                                                 |
| ```ClassName object = new ClassName()``` |```new ClassName().method(parameter1,...);```    |
| ```object.method(parameter1,...);```     |                                                 |
|                                          |                                                 |
|                                          |                                                 |