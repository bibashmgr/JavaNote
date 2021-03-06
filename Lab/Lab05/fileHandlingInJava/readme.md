> # File Handling In Java:

*File handling in Java* defines as the process of reading or writing data from/to a file.The *File class* from the *java.io* package , allows us to work with different formats of files. In order to use the File class, you need to create an object of the class and specify the filename or directory name.For Example:
```java
// Import the File class
import java.io*
 
// Specify the filename
File obj = new File("filename.txt");
```
> ## Stream In Java:
Java uses the concept of a stream to make I/O operations on a file.A stream is a sequence of data.There are 3 streams in java.They are:

> ### Input Stream:
Java application uses an input stream to read data from a source; it may be a file, an array, peripheral device or socket.

> ### Output Stream:
Java application uses an output stream to write data to a destination; it may be a file, an array, peripheral device or socket.

