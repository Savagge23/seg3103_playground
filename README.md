# seg3103_playground Lab 4
This project is designed to familiarize ourselves with the Test Driven Design process
of an application. For the follwing project I decided to implement the TicTacToe project
using TDD. For the follwoing project I implemented 7 test cases and following those test case
I implemented the neccessary function in the TicTacToe.java class to pass the TC's I failed. 
The first TC01 I implemented was to see if the class was able to generate an empty table i which 
TicTacToe can be played. Follwoing the implementation of the constructor I refactored the 
code to have a private void method to fill the table. For TC02 & TC03 I developed a testcase
to play X & O, follwoing failing the TC's I implemented the methods to change the corresponding 
positions to either an X or O. In context of refacoring the methods, there wasn't much I could refactor. 
For TC04 I developed a test case to see if the table is full, and after failing the TC I
developed the method tableisFull() to search through the table and return false, if any space
is equal to an empty string. To refactor the code for the method I got rid of an unnecessary boolean
variable in the method and used table[i][j].equals(" ") instead of table[i][j] == " ". For 
TC05 I developed a test case to see if a game is won, and after failing the test I implemented the
corresponding method isGameWon() to return if X has won the game for the corresponding test values. 
Refactoring isGameWon() I decided to return if either X or O has won the game for all possible outcomes.
For TC06 I developed a test case to see if a illegal arguement is thrown if it's tried to play an X in 
the table where there is already a corresponding value. After failing the test case I implemented the
IllegalArgumentException in playX. For refacoring the code I also implemented the IllegalArgumentException
in playO. Finally for TC07 I developed a test case to see if a illegal arguement is thrown if you try playing
a move after O has won the game. After failing the test I implemented the IllegalArgumentException in playX. 
When refactoring the code I implemented the IllegalArgumentException in playO aswell. 