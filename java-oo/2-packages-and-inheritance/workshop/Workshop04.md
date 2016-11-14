Create a `Person` class
- each person should have a `name` as a string
- each person should haven an `age` as an integer
- a `toString()` method that returns nicely the name and the age

Create a `Student` class extending the `Person` class that has the following methods
- a constructor which calls the superclass' constructor
- `addGrade(int)` that takes a grade from 1 to 5
- `getAverage()`, that returns the average of the grades
- a `toString()` method that adds the average to whats returned by the superclass' same method

Create a `Mentor` class extending the `Person` class that has
- a `seniorityLevel` as a string
- and `subject` as a string
- a constructor which sets these
- a `toString()` method that adds the subject and the seniorityLevel to whats returned by the superclass' same method

```java
public class Workshop03 {
  public static void main(String... args) {
    ArrayList<Person> greenfox = new ArrayList<Person>();
    Student laci = new Student("Laci", 25);
    laci.addGrade(4);
    laci.addGrade(5);
    laci.addGrade(5);
    laci.addGrade(3);
    greenfox.add(laci);

    Student peti = new Student("Peti", 39);
    peti.addGrade(3);
    peti.addGrade(2);
    peti.addGrade(5);
    peti.addGrade(3);
    greenfox.add(peti);

    Student szilvi = new Student("Szilvi", 28);
    szilvi.addGrade(5);
    szilvi.addGrade(5);
    szilvi.addGrade(4);
    szilvi.addGrade(5);
    greenfox.add(szilvi);

    Mentor jakab = new Mentor("Jakab", 33, "medior", "java");
    greenfox.add(jakab);

    for(Person p : greenfox) {
      System.out.println(p);
    }
  }
}

```
This should print out:
```
Laci (25) average: 4.25
Peti (39) average: 3.25
Szilvi (28) average: 4.75
Jakab (33) is a(n) java medior
```
