> # DEFAULT METHODS IN INTERFACE
The methods added in an interface must be asbtract methods.So,To overcome it, the concept of default methods was introduced. These types of methods can be defined in the interface so that the classes implementing it dont always need to define these methods. These are like backup methods for classes implementing an interface.

__CODE:__
```JAVA
interface TestInterface{
    default void test(){
        System.out.println("Test method from test interface.") ;
    }
    public void test2();
  }
  
  
  class TestClass implements TestInterface{
        public void test2(){
              System.out.println("Test2 method from test class.") ;
        }
  }
```