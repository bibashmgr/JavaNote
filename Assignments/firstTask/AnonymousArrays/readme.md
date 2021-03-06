> # ANONYMOUS ARRAYS

Array without a name is an __Anonymous__ array. __Anonymous__ array is created just for instant use (just for using  one time) . They are usually passed as arguments to methods.

__Syntax:__
```java
new returnType[] = {"variable1" , "variable2" , ..... };
```

__CODE:__
```java
class Task{

    public static void main(String args[]){
    Task obj = new Task() ;
    obj.sumOfArrays(new int[]{5, 6, 4, 3, 5, 6}) ;

  }

  public void sumOfArrays(int a[]){

    int total = 0 ;

    for(int i: a){
      
      total = total + i ;
      System.out.println("The Total sum is : ") ;

      }

  } 
  
}
```