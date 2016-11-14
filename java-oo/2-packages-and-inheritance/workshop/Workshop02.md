# Animals and Birds again
- Add a *default* constructor (without any parameters) to the `Animal` class that prints out that an animal is created
- See what happens when you rerun `Workshop01`
- Add a *default* constructor (without any parameters) to the `Bird` class that prints out that a bird is created
- See what happens when you rerun `Workshop01`
- At this point something like this:
```
Animal is created
Bird is created
The bird can fly
Animal is eating
Animal is sleeping
```
- You can explicitly and implicitly call the superclass' constructor
- Add a constructor to the `Animal` class that takes a `String type` parameter and prints out that `type` animal is created
- Modify the the `Bird` class' *default* constructor to pass `"Bird"` to the superclass' constructor and remove the print out from here
- Check `Workshop01` again
```
Animal is created
Bird animal is created
The bird can fly
Animal is eating
Animal is sleeping
```
- Create a `sleep()` method in the `Bird` class that prints out that the bird is sleeping.
    - You can always use the superclass' methods using the `super` keyword
    - So after printing out that the bird is sleeping, it should print out that the animal is sleeping
- Similarly override the `eat()` method in the `Bird` class
- Create a `nightyNight()` method in the `Bird` class
    - that calls the animal's eat method
    - then calls the bird's sleep method
- Call `nightyNight()` on the bird instance created in `Workshop01` after other eat and sleep calls
```
Animal is created
Bird animal is created
The bird can fly
Animal is eating
The bird is sleeping
Animal is sleeping
Animal is eating
The bird is sleeping
Animal is sleeping
```
- If you're not sure which line is coming from where, play with the debugger for a little while
