> # CUSTOM EXCEPTIONS
If you are creating your own Exception that is known as custom exception or user-defined exception.

__SYNTAX:__
```java
class CustomException extends Exception{
  ...
  //body of CustomException
}

class Task{
  public static void main(String[] args) throws CustomException
  {
    ...
    if(...) throw new CustomExc() ;
    ...
    
  }
}

```