# Module 03 #P - Projects for Demos
_NOTE if you are reading this right now, be ware, we are not done! (But may we also say well done for looking ahead.)_

By now, we've covered the basics of most programming languages and that means we can write something interesting.  We have a collection of ideas here for you to choose from; or, with a well reasoned argument, we Mentors might be convinced by you to try something else.

For the projects we're looking for something that:-
- Must (meaning it has to)
  - Use one or more functions
  - Employs Loops
  - Can be called with different parameters so as to generate different results
- Should (you have some *choice* here)
  - Employ strings and some string manipulation
  - Involve arrays
- Could (this is at your discretion)
  - Work like a game
  - Be inspired by something from Codewars, the exercises, the ideas proposed here.

These projects can be refined for the demos at the end of the week.


## Materials & Resources
N/A

## Assignment Review
N/A


## Workshops
Chose from the assignments that follow.

__Note__ that we illustrate what the expected output of the console would be as follows.
```
items shown like this
``` 
> The *User input/action* that might then follow.



### Challenge: Palindrome Builder (Simple)
Take any input, validate whether it's a palindrome and output the value in reverse.  The program must operate as a game, asking a series of questions and then determining the output.  It must also reverse the capitalisation of start and end.


####Sample Operation
```
What do you want to do [1=Test if such is a Palindrome, 0=Quit]?
```
> 1

```
Enter the phrase please?
```
> Mark is here

```
Ereh si kram
Nope, not a palindrome.

What do you want to do [1=Generate A Palindrome, 2=Test if such is a Palindrome, 0=Quit]?
```
> 2

```
Enter the phrase please?
```
> Able I was ere I saw elba.

```
Able I was ere I saw elba.
Yup, it's a palindrome

What do you want to do [1=Generate A Palindrome, 2=Test if such is a Palindrome, 0=Quit]?
```
> 0

```
Bye!
```

### Challenge: Prime Factors (Simple)
Enter a numeric value and report back the prime factors.

####Sample Operation
```
Enter a number to test, or 0 to Quit?
```
> 12

```
"12" has the following factors: 2 3 3
Or by count:-
"2" - 1 (once)
"3" - 2 times

Enter a number to test, or 0 to Quit?
```
> 120

```
"120" has the following factors: 2 2 3 3 5
Or by count:-
"2" - 2 times
"3" - 2 times
"5" - 1 (once)

Enter a number to test, or 0 to Quit?
```
> 17

```
"17" is a prime number

Enter a number to test, or 0 to Quit?
```
> 0

```
Bye!
```

### Challenge: Guess my number 
The program randomly choses a number and then gives hints and/or goads the user for not determining it

####Sample Operation
```
Enter a top number in the range, or 0?
```
> 64

```
Okay, I've got a number.  You should be able to figure that out in 6 goes, let's begin.  
Guess?
```
> 32

```
Nope, you're low. You've got 5 guesses left.  Guess?
```
> 48

```
Nope, you're high. You've got 4 guesses left.  Guess?
```
> 40

```
Nope, you're high. You've got 3 guesses left.  Guess?
```
> 35

```
Nope, you're low. You've got 2 guesses left.  Guess?
```
> 37

```
Nope, you're high and you've just repeated yourself, what a waste. Last chance.  Guess?
```
> 37

```
What are you thick?  You just guessed 37.  Guess?
```
> 37

```
Ugh, you tried that before! Guess?
```
> 38

```
Ever considered being a fortune teller?  Guess not.  Guess?
```
> 36

```
Yippee, I was running out of insults.

Try again?  Enter a top number in the range, or 0?
```
> 1

```
Okay, I've got a number.  You should be able to figure that out in 1 go, let's begin.  

Guess?
```
> 1

```
Well done, you managed to guess it in 1 go.

Try again?  Enter a top number in the range, or 0?
```
> 0

```
It was fun playing.  Bye!
```

### Challenge: Rotate a Matrix
Take any input and then rotate the matrix.

*Note that this is a typical Big Name challenge you might expect if you were applying to Google.*

####Sample Operation
```
Enter a matrix and terminate with the symbol !
```
> 11 12 13 14 

> 21 22 23 24 

> 31 32 33 34 

> 41 42 43 44 

> ! 

```
-- 1st Rotation
41 31 21 11
42 32 22 12
43 33 23 13
44 34 24 14
-- 2nd Rotation
44 43 42 41
34 33 32 31
24 23 22 21
14 13 12 11
-- 3rd Rotation
14 24 34 44
13 23 33 43
12 22 32 42
11 21 31 41

Enter a matrix and terminate with the symbol !
```
>11 12 13

>21 22 23

>31 32 33 

>!

```
-- 1st Rotation
31 21 11
32 22 12
33 23 13
-- 2nd Rotation
33 32 31
23 22 21
13 12 11
-- 3rd Rotation
13 23 33
12 22 32
11 21 31

Enter a matrix and terminate with the symbol !
```
>dogs cats

>bats rats

>!

```
-- 1st Rotation
bats dogs
rats cats
-- 2nd Rotation
rats bats
cats dogs
-- 3rd Rotation
cats rats
dogs bats

Enter a matrix and terminate with the symbol !
```
  !
```
Bye
```

####Extra challenge
Handle a jagged array, for example 
```
Enter a matrix and terminate with the symbol !
```
>11 12 13 14

>21 22 23

>31 32 33 34 35

>!

```
-- 1st Rotation
31 21 11
32 22 12
33 23 13
34    14
35
-- 2nd Rotation
 35 34 33 32 31
       23 22 12 
    14 13 12 11
-- 3rd Rotation
      35
14    34
13 23 33
12 22 32
11 22 31
```



### Challenge: Combinatorics
Stefan is a board game developer who has the option to use a couple of different sided dice.  Of course he can use 6 sided dice, but he can also use 8, 12, etc.  The thing is, for the various game play options, he wants to stack the percentages a certain way and therefore needs to see what sums occur with a frequency to match his "design".

####Sample Operation
```
Enter the number of dice sides.  0 to end; add an ! if you want to see all the combinatorics
```
>4 4!

```
You asked for a listing of all the combinatorics ...
1 + 1 
1 + 2
1 + 3
1 + 4
2 + 1 
2 + 2
2 + 3
2 + 4
3 + 1
3 + 2
3 + 3
3 + 4
3 + 4
4 + 1
4 + 2 
4 + 3
4 + 4

Total combinations = 16
Sum   Occurs   Probability
  2        1      6.25%
  3        2     12.50%
  4        3     18.75%
  5        4     25.00%
  6        3     18.75%
  7        2     12.50%
  8        1      6.25%
```

Alternatively, without the combinations
```
Enter the number of dice sides.  0 to end; add an ! if you want to see all the combinatorics
```
>6 6 

```
Total combinations = 36
Sum   Occurs   Probability
  2	       1         2.78%
  3        2         5.56%
  4        3         8.33%
  5        4        11.11%
  6        5        13.89%
  7        6        16.67%
  8        5        13.89%
  9        4        11.11%
 10        3         8.33%
 11        2         5.56%
 12        1         2.78%
 
Enter the number of dice sides.  0 to end; add an ! if you want to see all the combinatorics
```
>0
```
Bye!
```


### Challenge: Monster Dodge 'Ems
This is a old standard for playing with multi-dimensional arrays.  You have a game board and you have to populate it with "monsters" who if they get you, you're toast.  But monsters can be blocked by walls and will be destroyed if they run into other monsters, hit traps you lay or run into swamps that are also randomly distributed when the game starts.

Note that I did this by hand, in your version you should space the matrix out better with borders and/or so that the cells appear more as squares.

#### Sample Operation

```
Enter game board size (up to 50 square), or ! to stop?
```
>10

```
Enter number of monsters, or ! to stop?
```
>2

```
Enter level of difficulty (1 to 5) or ! to stop?
```
>1

```
Generating initial matrix
_0123456789
0         *
1
2       X  
3   @   W
4     W             
5
6   W
7 *
8
9

Traps left=2.

@=is You. !=Trap. X=Swamp. W=Wall. Press A=Left. W=Up. D=Right. X=Down. To lay a trap, type !.
Your move?
```
>X!

```
Moved Down, Trap laid.
_0123456789
0         
1         *
2       X  
3       W
4   !@W             
5
6 * W
7 
8
9

Traps left=1.
@=is You. !=Trap. X=Swamp. W=Wall. Press A=Left. W=Up. D=Right. X=Down. To lay a trap, type !.
Your move?
```
>W

```
Moved Up
_0123456789
0         
1         
2       X * 
3    @  W
4   ! W             
5 *
6   W
7 
8
9

Traps left=1.
@=is You. !=Trap. X=Swamp. W=Wall. Press A=Left. W=Up. D=Right. X=Down. To lay a trap, type !.
Your move?
```
>Press the return key, no move.

```
Moved Up
_0123456789
0         
1         
2       X* 
3    @  W
4   ! W             
5  *
6   W
7 
8
9

Traps left=1.
@=is You. !=Trap. X=Swamp. W=Wall. Press A=Left. W=Up. D=Right. X=Down. To lay a trap, type !.
Your move?
```
>A

```
Moved Left, 1 monster drowned in the swamp.
_0123456789
0         
1         
2       X 
3   @   W
4   ! W             
5   *
6   W
7 
8
9

Traps left=1.
@=is You. !=Trap. X=Swamp. W=Wall. Press A=Left. W=Up. D=Right. X=Down. To lay a trap, type !.
Your move?
```
>W

```
Moved Up, Last monster destroyed by your trap. You won
_0123456789
0         
1         
2       X 
3   @   W
4   ! W             
5   *
6   W
7 
8
9

Traps left=1.

Play Again (Y/N)?
```

### Challenge: Hangman
This is a 2 person game, one person enters a value.  And the other person then has to guess.

#### Sample Operation

```
Enter the word to guess?
```
>One Love

``` 
Good choice sir, "ONE LOVE" it is.  Press "Enter" and I'll scroll the display.
```

*Note that the word is Upper Case even though lower was entered.  All Lowercase letters are upper cased.*

>User presses "Enter" key

```
STARTING!!!
       +------+
       |      |
       0      |
       |      |
     /+++\    |
    / +++ \   |
      | |     |
      | |     |
      m m     |
              |
   +----------+
    _ _ _   _ _ _ _
   +----------+

 Enter a letter?
```
>H

```
Sorry, there are no "H"s.

       +------+
       |      |
       0      |
              |
              |
              |
              |
              |
              |
   +----------+
    _ _ _   _ _ _ _
   +----------+

Enter a letter?
```
>L

```
Yup, there's a(n) "L".

       +------+
       |      |
       0      |
              |
              |
              |
              |
              |
              |
   +----------+
    _ _ _   L _ _ _
   +----------+

Enter a letter?
```
>O

``` 
Well done, there are 2 "O"s.
       +------+
       |      |
       0      |
              |
              |
              |
              |
              |
              |
   +----------+
    O _ _   L O _ _
   +----------+

Enter a letter?
```
>W

```
Nope, "W"s we have not.

       +------+
       |      |
       0      |
       |      |
              |
              |
              |
              |
              |
              |
   +----------+
    O _ _   L O _ _
   +----------+

Enter a letter?
```
>Y

```
Nope, "Y", why not!

       +------+
      |      |
       0      |
       |      |
     /+++\    |
              |
              |
              |
              |
              |
   +----------+
    O _ _   L O _ _
   +----------+

Enter a letter?
```
>X

```
Nope, "X", might mark the spot, but here it definitely does not! It's not looking good mate!

       +------+
       |      |
       0      |
       |      |
     /+++\    |
    / +++ \   |
              |
              |
              |
              |
   +----------+
    O _ _   L O _ _
   +----------+

Enter a letter?
```
>E

```
Well done, there are 2 "E"s.

       +------+
       |      |
       0      |
       |      |
     /+++\    |
    / +++ \   |
              |
              |
              |
              |
   +----------+
    O _ E   L O _ E
   +----------+

Enter a letter?
```
>B

```
Nope, to "B" or not to be, we'll it's looking like I'll know the answer to that question pretty soon.

       +------+
       |      |
       0      |
       |      |
     /+++\    |
    / +++ \   |
      | |     |
              |
              |
              |
   +----------+
    O _ E   L O _ E
   +----------+

Enter a letter?
```
>C

```
Nope, I guess "C" stands for "see you later".  Think man! One more wrong guess and it's my toes and I'm toast!

       +------+
       |      |
       0      |
       |      |
     /+++\    |
    / +++ \   |
      | |     |
      | |     |
              |
              |
   +----------+
    O _ E   L O _ E
   +----------+

Enter a letter?
```
>N

```
Yup, there's a(n) "N".  Think man! One more wrong guess and it's curtains for me!

       +------+
       |      |
       0      |
       |      |
     /+++\    |
    / +++ \   |
      | |     |
      | |     |
              |
              |
   +----------+
    O N E   L O _ E
   +----------+

Enter a letter?
```

I think I'll leave it there (it's a cliffhanger)... Does he live or does he die?  Who knows... Mwaahahah.

#### Extra ideas
- There should a cache of messages to send depending upon where the player is in the game
  - not guessing right
  - same letter again, ugh, you're playing with the poor guy's life.
    > hey, I can't feel me toes!
- Watch for singular and plurals (note how he says there are 2 and there is a(n))

### Zsuzsi's Challenge
Take an input file consisting of the following sorted data, for example:
```
AA 1234
AA 4321
AA 2344
AA 2321
BB 2312
BB 2132
BB 3421
CC 2131
```

The program should work as follows:-
```
Provide the file location and name, or <enter> to end?
```
>D:\temp\ZsuzsiTest.txt

```
The results are:-

Run  Count  Total 
AA      4   10220 
BB      3    7865 
CC      1    2131 

Totals  8   20216 

Provide the file location and name, or <enter> to end?
```
>Enter

#### Optionally, more challenging
Add the average and percentage.  This means having to store the interim results.

```
The results are:-

Run  Count  Total Average Percent
AA      4   10220    2633   50.55
BB      3    7865    2622   38.90
CC      1    2131    2131   10.54

Totals  8   20216    2527   99.99

Provide the file location and name, or <enter> to end?
```
>Enter


## Individual Workshop Review
Remember what we've been pointing out about the code.  Neatness counts in coding.

# Links
- [Parent - Java Basic Module](../README.md)
- [01) Installation of the IDE (IntelliJ's IDEA)](../1-installing-basics/README.md) - be able to work
- [02) Expressions &amp; Control Flow](../2-expressions-control-flow/README.md) - know what stores data and navigates the program
- [03) Arrays &amp; Functions](../3-arrays-collections-functions/README.md) - additional tools for storing results and managing repeated code
- [04) ArrayLists &amp; Foreach](../4-arraylists-foreach/README.md) - introduction to Objects and propert
- [05) I/O &amp; Exception Handling ](../5-io-exceptions-try-catch-finally/README.md) - read and write files and handle unexpected results
- [06) Serialization &amp; Regular Expression Pattern Matching](../6-serialization-regex/README.md) - how to transmit and receive complex data
