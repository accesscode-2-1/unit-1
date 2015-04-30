### Exercises and Review

#### Pull Requests

[Fork a Repo](https://help.github.com/articles/fork-a-repo/)

[Creating a Pull Request](https://help.github.com/articles/using-pull-requests/)

Instructions: After you're done with the exercises today, please create a pull request with your work.

#### Object-oriented exercise

Use the provided Instrument and Musician classes for this exercise.

Create an abstract class ReedInstrument, which implements Instrument. A ReedInstrument needs a boolean field `reed`, which represents if the instrument currently has a reed in it. It also needs methods, `has_reed` which tells us if the instrument currently has a reed, `place_reed`, which puts a reed on the instrument, and `remove_reed` which removes the reed from the instrument.

Create the concrete class Clarinet, which inherits from ReedInstrument. Implement whatever methods need to be implemented.

Create the concrete class ClarinetPlayer, which extends Musician<Clarinet>. The ClarinetPlayer constructor should take in a Clarinet, and save it in a field called `myClarinet`. Add a method `toggle_reed`, which puts a reed on the Clarinet if it doesn't have one, and takes the reed off it if does.  Implement the `play_instrument` method such that if the instrument doesn't have a reed on, it returns `null`, and otherwise plays the instrument sound.

#### Android exercise

#### Bonus
