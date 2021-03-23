##Bonus1
Bonus1 Project


###Content
- HW1
    - Bonus1
        - ComplexNumber.java
        - RealNumber.java
        - ComplexNumberTest.java
        - ComplexNumber.class
        - RealNumber.class
        - ComplexNumberTest.class
            - docs
        - JavaDoc files

###Description
The goal of this project is to be able to add, subtract, 
multiply and divide complex numbers **(a + bi)** and display
this data. It will feature three classes. The ComplexNumber is a 
class that has a complete implementation of how we can 
get complex numbers. The RealNumber class will represent a real 
number and construct it. The ComplexNumberTest class is the tester class,
which checks if the calculation converges with the expected
result. Various numbers have been selected to test whole project.

###Instructions and Installations
>How to run the test for the project:

You should have already these files at the machine you're doing development on:

[hamcrest-core-1.3.jar](https://moodle.uno.edu/pluginfile.php/2575339/mod_folder/content/0/hamcrest-core-1.3.jar?forcedownload=1)

[junit-4.12.jar](https://moodle.uno.edu/pluginfile.php/2575339/mod_folder/content/0/junit-4.12.jar?forcedownload=1)

In my project you will see ComplexNumber.class, ComplexNumberTest.class and RealNumber.class. These are already compiled JUnit classes,
so you do not need to compile again. 

JUnit doesn't have to be installed through terminal. It's a Java library, 
like all the other libraries, that you can use in your code. The PATH must
not be changed to use it. 
Next,
1. Open Java files and save them on your computer in one directory.
2. Open Terminal (Mac OS) or Command Line (Windows).
3. Type cd command `cd` and the name of the directory 
until you reach the directory(Bonus1) where you saved the
.java files and compiled JUnit .class files.
4. Type in console

        java org.junit.runner.JUnitCore ComplexNumberTest 
       
5. Push Enter button.
6. You should be able to see this output. (Write in support if something wrong)
    
        JUnit version 4.12
        ....
        Time: 0.006

        OK (4 tests)
        
        
>How to open HTML version of my project:
1. My project has folder `docs` which contains all files, which have been executed during the documenting java files before.
Open folder called `docs`.
2. Find file `index.html` with extension `.html`
3. Next, you should be able to see the HTML page in your browser which shows all hierarchy and description of my project.

###Support 
*idzelenk@uno.edu*

###Author
*Ivan Zelenkov*