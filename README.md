
Tic Tac Toe: A Java Swing Desktop Game

A simple yet fun implementation of the classic Tic Tac Toe game, designed for two players to enjoy on the same computer. Perfect for a quick break or a friendly challenge, this project showcases basic Java Swing GUI development and game logic.

Who it's for:

    Beginners: A great learning tool for those starting with Java Swing and event-driven programming.
    Casual Gamers: Anyone looking for a quick and easy game to play with a friend.
    Nostalgia Enthusiasts: Relive the joy of the classic Tic Tac Toe game in a digital format.
Acknowledgements

    Oracle: For providing the Java Swing and AWT frameworks, enabling the creation of interactive desktop applications.
    The Open-Source Community: For countless resources and examples that contributed to the learning process and inspired this project.


## Game Logic Reference

This section outlines core functions that drive the Tic-Tac-Toe game logic:
Function: checkWin()

Checks if the current game state results in a win for either player or a draw.

    Parameters: None (Operates on the internal game board state).
    Returns:
        0: If the game is ongoing.
        1: If player 1 (X) has won.
        2: If player 2 (O) has won.
        3: If the game is a draw (all cells filled with no winner).

Function: resetBoard()

Resets the game board to its initial empty state, clearing all marks (X and O).

    Parameters: None.
    Returns: Nothing (Modifies the internal game board directly).

Function: updateScore(int winner)

Updates the win/draw count based on the outcome of the game.

    Parameters:
        winner: (int) The player who won (1 or 2), or 3 for a draw.
    Returns: Nothing (Modifies the score variables directly).

Function: updateButton(JButton button, int player)

Marks a button on the game board with the appropriate player's symbol (X or O).

    Parameters:
        button: (JButton) The button to be updated.
        player: (int) The player whose turn it is (1 or 2).
    Returns: Nothing (Modifies the button's text directly).
## Appendix

Any additional information goes here

A. Java Swing Resources

    Oracle's Java Swing Tutorial:  An excellent starting point for learning the fundamentals of building graphical user interfaces with Swing.
    https://docs.oracle.com/javase/tutorial/uiswing/

    Swing Components: A comprehensive list of all available Swing components, their properties, and how to use them.
    https://docs.oracle.com/javase/8/docs/api/javax/swing/package-summary.html

B. Event Handling in Java Swing

    How to Write an Action Listener: A step-by-step guide on creating action listeners to respond to events like button clicks. https://docs.oracle.com/javase/tutorial/uiswing/events/actionlistener.html

C. Game Logic Enhancements (Optional)

    Minimax Algorithm: If you're interested in making the computer player unbeatable, you could explore the Minimax algorithm for Tic-Tac-Toe. https://en.wikipedia.org/wiki/Minimax

D. Additional Ideas for Improvement

    Graphical Enhancements: Add more visually appealing elements to the game, such as custom icons for X and O, or a more stylish game board.
    Difficulty Levels: Implement different AI difficulty levels for single-player mode.
    Online Multiplayer: Consider adding a network component to allow players to compete over the internet.
## Authors

@cyberkunju(https://github.com/cyberkunju):

    Developer and creator of the Java Swing Tic-Tac-Toe project. You can find more information and projects by this developer on their website: www.cyberkunju.online

## Color Reference

The game features a simple yet stylish dark theme:

    Background: Black (#000000)
    Text/Foreground: Gray (#808080)

This minimalist color palette creates a clean and focused gaming experience.
## Documentation

[Documentation](https://drive.google.com/file/d/1kf3AKxQAmLXmy656oe3JqQUdGpkEwA0-/view?usp=drive_link)


## Features

Features:

    Two-Player Gameplay: Enjoy classic Tic-Tac-Toe battles against a friend on the same computer.
    Interactive Board: Click on the 3x3 grid to place your X or O.
    Win/Loss Tracking: See who's winning with a live scoreboard displaying each player's wins.

Draw Detection: The game automatically recognizes a draw when the board is full with no winner.
Reset Functionality: Easily start a new game with a single click.
Clear Instructions: A pop-up dialog explains the rules, making it easy for beginners to learn.

## Deployment

Deployment

This Java Swing Tic-Tac-Toe game is a standalone desktop application, and deploying it involves the following steps:

Prerequisites:

    Java Development Kit (JDK): Make sure you have a compatible JDK (version 8 or newer) installed on your system. You can download it from the official Oracle website or use OpenJDK.
    Java Runtime Environment (JRE): If you plan to share the game with others who might not have Java installed, you'll need to package the JRE along with your application.

Building the Game:

    Clone the Repository: If you haven't already, clone the Tic-Tac-Toe repository from GitHub:
    Bash

    git clone https://github.com/your-username/your-tictactoe-repo.git



Navigate to the Project Directory:
Bash

cd your-tictactoe-repo

Compile the Source Code:
Bash

javac src/TicTacToe.java


    This will create the compiled .class files in the src directory.

Running the Game:

    From the Terminal:
    Bash

    java src.TicTacToe



This will execute the compiled class and launch the Tic-Tac-Toe game window.

Creating an Executable JAR:

    Create a Manifest File: This file will specify the entry point of your application (the main class). Create a text file named manifest.txt in your project directory and add the following line:

    Main-Class: src.TicTacToe

    Build the JAR:
    Bash

    jar cfm TicTacToe.jar manifest.txt src/*.class



This will create a JAR file named TicTacToe.jar containing your compiled classes and the manifest.
Run the JAR:
Bash

java -jar TicTacToe.jar


Distribution (Optional):

If you want to share your game with others, you have a few options:

    JAR with JRE: Package your JAR file along with a JRE using tools like Launch4j or jlink. This creates a standalone executable that can be run on systems without Java installed.
    Platform-Specific Installers: Use tools like Inno Setup (for Windows) or DMG (for macOS) to create installers that make it easy for users to install your game on their specific operating system.

## Support

For support, email cyberkunjuonline@gmail.com or join our Slack channel.


## Used By

Uses:

    Educational:
        Introduction to GUI Programming: A practical way for beginners to learn about Java Swing, event handling, and building user interfaces.
        Classroom Exercise: Can be assigned as a programming project for students to practice Java concepts and game logic.

    Entertainment:
        Casual Fun: A quick and enjoyable game for two players to have a friendly competition.
        Nostalgia: For those who remember the classic pen-and-paper version, this provides a digital way to relive the fun.

    Personal Projects:
        Code Portfolio: Showcase your Java Swing and game development skills on your GitHub or personal portfolio.
        Building Block: Use the code as a foundation to build more complex games or applications.

Examples:

    Learning Java Swing: Use the project's code to understand how different Swing components work together, how events are handled, and how to create basic layouts.

    Modifying the Game:
        Add different themes or visual styles.
        Implement an AI opponent using algorithms like Minimax for single-player mode.
        Explore adding network functionality for online multiplayer.

    School Assignment: Students could be tasked with adding features like a difficulty setting, a scoreboard to track historical wins/losses, or even sound effects.