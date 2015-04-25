### Homework Due 5/1

The homework this week will focus on Object Oriented programming.
To make it easier to do code reviews, please fork this and send a pull request
to submit the assignment. Store your files in a folder titled with your name
(e.g. unit-1/homework/week-0/amyquispe).

#### Problem 1: Animal Sort

* Create an Animal class that includes a "species name" field and implements the
[Comparable](https://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html) interface.
Compare two animals by species name, alphabetically.
* Test your compareTo function by creating an array of Animal instances and calling sort.
* Create the Domestic interface. This interface should include getters and setters for a name field,
since pets tend to have their own names.
* Create a class for a Domestic Animal, perhaps a DomesticCat, that both inherits from Animal
and implements the Domesitc interface.
* Override the compareTo function for your Domestic animal so that it compares two such animals
by their given name instead of their species name.
* Test your compareTo function by creating an array and calling sort.
