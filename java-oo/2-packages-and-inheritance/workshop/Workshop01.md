# Animals and Birds

Create a simple `Animal` class
- has a `sleep()` method that prints out that the animal is sleeping
- has an `eat()` method that prints out that the animal is eating

Create a `Bird` class that inherits from the `Animal`
- has a `fly()` method that prints out that the bird can fly

So this should run:
```java
public class Workshop01 {
  public static void main(String... args) {
    Bird bird = new Bird();
    bird.fly();
    bird.eat();
    bird.sleep();
  }
}
```
And should result in this:
```
The bird can fly
Animal is eating
Animal is sleeping
```
