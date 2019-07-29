## Week : 3 Project for Skill Distillery Java Bootcamp

### Overview

This projects purpose was to expand our knowledge and use of object oriented programming. Specifically inheritance via abstract classes and interfaces. The program is an airfield simulator in that you can view all of the planes available and interact with them to an extent. The program is menu driven and executable via numbered choices and will play on a loop until the user exits the program.

The options available to the user are:

* View all planes
* Fly all planes
* View the fastest plane and the plane with the longest range
* Execute specific actions for specialty planes (load cargo, dog fight, etc...)
* Add and remove planes by user input

### New Techniques Used

* Abstract and Interface classes
* File Reader / Buffered reader
* Reading data into a program from a local .txt file
* Parsing  String data into various number formats (int, double, long)
* For Each loops

### Technologies Used

* Java
* Eclipse
* Git
* Atom
* Command line/terminal

### Plan of Attack

The first thing that was needed was to create the list of available airplanes. Once that was completed I had to use the File Reader/Buffered reader to read in the list of planes. Once I could see the list of planes inside of the Jets program I then created a Jets abstract class followed by several interface classes for other types of specialty planes.  I then created methods using a for each loop to find the plane with the top speed and also which plane had the largest range. Finally I added a method for a user to create their own plane with their own specifications. The final method allows a user to remove any plane that is currently in the airfield.
