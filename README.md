# scala-first-look
Scala First Look course at LinkedIn Learning

## Challenges

### Challenge 1: Translate Java to Scala

Translate the Java class below to Scala.

```java
public class Calculator {

  public static void main(String[] args) {
    int x = 10;
    int y = 5;
    System.out.println(addition(x, y));
    System.out.println(quotient(x, y));
    System.out.println(times(x, y));
    System.out.println(minus(x, y));

  }
  public static int addition(int a, int b) {
    return a + b;
  }

  public static int quotient(int a, int b) {
    if(b == 0)
      return 0;
    return a/b;
  }

  public static int times(int c, int d) {
    return c * d;
  }

  public static int minus(int a, int b) {
    return a - b;
  }

}
```

#### Solution

[Calculator.scala](src/main/scala/com/github/johanbrorson/training/scala/Calculator.scala)

### Challenge 2: Scala Basics

Take the following list of numeric grades and print a letter grade for each value. Print also the average of all numeric grades.

```scala
var grades = List(100, 99, 75, 67, 89, 85, 92, 93, 60, 97, 88)
```

#### Scale for letter grades

| Result   | Grade   |
|----------|:-------:|
| 93-100   | A       |
| 86-92    | B       |
| 77-85    | C       |
| 69-76    | D       |
| Below 69 | F       |

#### Solution

[Grades.scala](src/main/scala/com/github/johanbrorson/training/scala/Grades.scala)

### Challenge 3: Movies Ratings

1. Create a map with movies and their rating.
1. Print the map.
1. Add another movie to the map.
1. Print the map again.

#### Solution

[Movies.sc](src/main/scala/com/github/johanbrorson/training/scala/Movies.sc)

### Challenge 4: Employees

1. Create an employee case class. Employees should have an id, first name and last name
1. Override the toString method
1. Create and print a list of employees

Employees should be printed in the following format

```
Employee ID: 12345
Full Name: firstName lastName
```

#### Solution

[Employees.sc](src/main/scala/com/github/johanbrorson/training/scala/Employees.sc)
