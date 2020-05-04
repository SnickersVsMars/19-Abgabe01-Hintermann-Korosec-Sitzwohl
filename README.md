# Software Configuration Management

**Assignment 01: Test Automation with JUnit**

Studies: FH Joanneum - MSD 2019

Projectteam:

- [Tobias Hintermann][tobi]
- [Marian Korošec][marian]
- [Christian Sitzwohl][chrisu]

## Drinks Project

This project aims to introduce us to the world of software testing and test automation. Our first steps into this field will be made with Java and the Unit Testing framework JUnit 5.
TODO explain what our drinks programm does

## Additions to the template

The following additions were made to the original Drinks Template in the process of carrying out this task.
The template can be found here: [Drinks Project Template][template].

### Addition 1 - Cocktails

TODO Explain planned features before development, add code snippets afterwards    

Represents a mixture of liquids which are represented by the ArrayList.  
The class can calculate the alcohol content of each cocktail.  
It sets the maximum volume of a standard-cocktail to 0,5l and for the party-cocktail to 1,5l.


### Addition 2 - Long Drinks

The class LongDrink is an additional subclass of the class drink. It contains two different liquids - one alcoholic and one non-alcoholic. 
So a valid LongDrink cannot consist of two non-alcoholic liquids or two alcoholic liquids.
Beer cannot be mixed with a non-alcoholic liquid - but if it did, an exception with the message **Radler ist kein Alkohol** should be thrown.
On the other hand, it should be possible to add an alcoholic liquid to a beer - this is the only exception to the rule made above.

[tobi]: https://github.com/fly8899
[marian]: https://github.com/m4rien0
[chrisu]: https://github.com/sitcha07
[template]: https://github.com/michaelulm/software-configuration-management/tree/master/test-automation/junit5/Drinks
