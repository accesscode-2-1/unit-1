### Homework Due 5/1

The homework this week will focus on Object Oriented programming.
To make it easier to do code reviews, please fork this and send a pull request
to submit the assignment. Store your files in a folder titled with your name
(e.g. unit-1/homework/week-0/amyquispe). Each problem should probably be in
its own subfolder under your name.

#### Problem 1: Animal Sort

* Create an Animal class that includes a "species name" field and implements the
[Comparable](https://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html) interface.
Compare two animals by species name, alphabetically.
* Implement `equals` to compare by species name.
* Test your `compareTo` function by creating an array of Animal instances and calling sort.
* Create the Domestic interface. This interface should include getters and setters for a name field,
since pets tend to have their own names.
* Create a class for a Domestic Animal, perhaps a DomesticCat, that both inherits from Animal
and implements the Domesitc interface.
* Implement the `compareTo` function for your Domestic animal so that it compares two such animals
by their given name instead of their species name. 
* Implement `equals` to compare by given name.
* Create a constructor for your Domestic animal that takes in both the species name and given name.
* Test your compareTo function by creating an array and calling sort.

#### Problem 2: Cards
* Create an abstract class representing a game, which includes the method getpieces().
* Create a class that extends your Game class, PlayingCards.
* Create a class, Card, representing a playing card.
* In your constructor for PlayingCards, genereate a 52-deck hand of Cards. (Do not write 52 lines of code to
do this). Decide an appropriate collection to store these in.
* Implement getpieces() which should return your collection of Cards. What should be the type signature
for getpieces() in the abstract class?

#### Problem 3: Return of the text adventure game
Create your own text adventure game! This is a similar concept to one of your earlier assignments but with
a few requirements:
* You must create Character, Weapon and Room classes.
* Every character must be an instance of a Character or an instance of a sub-class of Character.
* Every weapon must be an instance of a Weapon or an instance of a sub-class of Weapon.
* Every room must be an instance of a Room or of a sub-class of Room.
* You must create an abstract class and use it at least twice.
* You must create an interface and use it at least twice.
* You may create other classes including container classes (e.g. the World class may be a collection of
Rooms).

This assignment is the more object-oriented version of the previous assignment. Be very careful in the way
you design your code. Here's an example: You can make Character an abstract class, and create a Non-Player Character
class and a Player Character class inheriting from it, and then make all characters instances of either NPCs or PCs.
Although it may take a little more thinking, these kinds of decisions can prevent copy-pasting code and help you debug.

#### Bonus
Design and implement [Battleship](http://en.wikipedia.org/wiki/Battleship_%28game%29) using your new object-oriented knowledge. Create a reasonable text-based user interface. Write a simple AI so you can play against your computer.
