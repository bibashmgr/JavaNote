> # Java LayoutManagers:
In Java,*LayoutManagers* are used to arrange components in a particular manner.

> ## Types of Layout:

> ### BorderLayout:

The *BorderLayout* is used to arrange the components in five regions: north, south, east, west and center. It provides five constants for each region:

* public static final int NORTH
* public static final int SOUTH
* public static final int EAST
* public static final int WEST
* public static final int CENTER

> ### GridLayout:
The *GridLayout* is used to arrange the components in rectangular grid.The constructors of GridLayout class contain four parameters:rows , columns , hgap & vgap .
```java
GridLayout((int rows, int columns, int hgap, int vgap)
```

> ### FlowLayout
The *FlowLayout* is used to arrange the components in a line, one after another (in a flow).The constructors of FlowLayout class contain three parameters: align, hgap & vgap.

```java
FlowLayout(int align, int hgap, int vgap)
```
>### CardLayout
The *CardLayout* class manages the components in such a manner that only one component is visible at a time.The constructors of CardLayout class contain two parameters:
hgap & vgap.

```java
CardLayout(int hgap, int vgap)
```

