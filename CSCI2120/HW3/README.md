#HW3
HW3 Project

###Content
- HW3
    - code
      - Recursion.java
      - RecursionTest.java
      - Recursion.class
      - RecursionTest.class
    - docs
        - JavaDoc files

###Description
I wrote a program with recursive method to compare two Strings using alphabetical order as the natural order (case insensitive),
a recursive method that uses your compare(String, String) method to find the minimum (i.e. first by alphabetical order)
String in an array of Strings, given the array and the number of strings in the array and I also wrote a JUnit test 
class that fully tests each of these methods.

###Instructions and Installations
>How to run the test for the project:

You should have already these files at the machine you're doing development on:

[hamcrest-core-1.3.jar](https://moodle.uno.edu/pluginfile.php/2575339/mod_folder/content/0/hamcrest-core-1.3.jar?forcedownload=1)

[junit-4.12.jar](https://moodle.uno.edu/pluginfile.php/2575339/mod_folder/content/0/junit-4.12.jar?forcedownload=1)

In my project you will see Recursion.class and RecursionTest.class. These are already compiled JUnit classes,
so you do not need to compile again.

JUnit doesn't have to be installed through terminal. It's a Java library,
like all the other libraries, that you can use in your code. The PATH must
not be changed to use it.
Next,
1. Open Java files and save them on your computer in one directory.
2. Open Terminal (Mac OS) or Command Line (Windows).
3. Type cd command `cd` and the name of the directory
   until you reach the directory `code` (which is in HW3 folder) where you saved the
   .java files and compiled JUnit .class files.
4. Type in console

        java org.junit.runner.JUnitCore RecursionTest 

5. Push Enter button.
6. You should be able to see this output. (Write in support if something wrong)

        JUnit version 4.12
        ....
        Time: 0.003

        OK (5 tests)


>How to open HTML version of my project:
1. My project has folder `docs` which contains all files, which executed during the documenting java files.
   Open folder called `docs`.
2. Find file index.html with extension `.html`
3. Next, you should be able to see the HTML page in your browser which shows all hierarchy and description of my project.

###Support
*idzelenk@uno.edu*

###Author
*Ivan Zelenkov*