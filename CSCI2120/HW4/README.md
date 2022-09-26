# HW4
HW4 Project

### Content
- HW4
    - code
        - Dog.java
        - Iterator.java
        - LinkedList.java
        - LinkedListTest.java
        - ListRunner.java
        - Dog.class
        - Iterator.class
        - LinkedList.class
        - LinkedListTest.class
        - ListRunner.class
        - LinkedList$Node.class
    - docs
        - JavaDoc files

### Description
For this assignment I will write an implementation of a doubly linked list and an iterator class for that list.
An Iterator is an object that "holds" a place in a data structure and can be moved around stepwise through the data
structure. In order for us to get a better feel for this type of an object, which is ubiquitous in more complex data
structures, I will be implementing an iterator for a fairly simple data structure, a doubly-linked list.

### Instructions and Installations
>How to run the test for the project:

You should have already these files at the machine you're doing development on:

[hamcrest-core-1.3.jar](https://moodle.uno.edu/pluginfile.php/2575339/mod_folder/content/0/hamcrest-core-1.3.jar?forcedownload=1)

[junit-4.12.jar](https://moodle.uno.edu/pluginfile.php/2575339/mod_folder/content/0/junit-4.12.jar?forcedownload=1)

In my project you will see Iterator.class, LinkedList.class, LinkedList$Node.class, LinkedListTester.class, ListRunner.class, Dog.class. These are already compiled classes,
so you do not need to compile again.

JUnit doesn't have to be installed through terminal. It's a Java library,
like all the other libraries, that you can use in your code. The PATH must
not be changed to use it.
Next,
1. Open Java files and save them on your computer in one directory.
2. Open Terminal (Mac OS) or Command Line (Windows).
3. Type cd command `cd` and the name of the directory
   until you reach the directory `code` (which is in HW4 folder) where you saved the
   .java files and compiled JUnit .class files.
4. Type in console

        java org.junit.runner.JUnitCore LinkedListTest 

5. Push Enter button.
6. You should be able to see this output. (Write in support if something wrong)

        JUnit version 4.12
        ....
        Time: 0.006

        OK (8 tests)


>How to open HTML version of my project:
1. My project has folder `docs` which contains all files, which executed during the documenting java files.
   Open folder called `docs`.
2. Find file index.html with extension `.html`
3. Next, you should be able to see the HTML page in your browser which shows all hierarchy and description of my project.

### Support
*idzelenk@uno.edu*

### Author
*Ivan Zelenkov*
