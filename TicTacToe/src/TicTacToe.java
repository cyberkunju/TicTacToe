package src;

//The javax.swing package is a part of Java's Swing library, which provides a set of GUI components and utilities
//for building graphical user interfaces. The classes and interfaces in this package allow developers to create and
// manage windows, buttons, text fields, and other GUI elements.

import javax.swing.*;
//The java.awt package is also a part of Java's core libraries and provides the foundation for creating graphical user
// interfaces. It includes classes and interfaces for managing windows, graphics, and other low-level GUI components.

import java.awt.*;
//In the provided code, the javax.swing package is used to create and manage the game's user interface, including the game board,
// player fields, and reset button. The java.awt package is used to create and manage the game board panel,
// which is a container for the individual game board cells.




public class TicTacToe {

    // Declare the main JFrame for the game
    private JFrame frame;

    // Declare an array of JButton objects representing the game board
    private JButton[] buttons;

    // Declare JTextField objects for player names
    private JTextField player1Field, player2Field;

    // Define a static array of strings representing the winning combinations
    private static final String[] WINNING_COMBINATIONS = {"012", "345", "678", "036", "147", "258", "048", "246"};

    // Define an array to store the game state (0 for empty, 1 for X, -1 for O)
    private final int[] board = new int[9];

    // Declare a variable to keep track of the current move counter
    private int moveCounter = 0;

    // Constructor to set up the game
    public TicTacToe() {
        setUpGame();
    }

    // Method to set up the game's user interface
    private void setUpGame() {
        frame = new JFrame("Tic Tac Toe");
        buttons = new JButton[9];
        player1Field = new JTextField(10);
        player2Field = new JTextField(10);

        // Create a reset button and add it to the frame
        createResetButton();

        // Create a panel to hold the player fields and add it to the frame
        createPlayerFields();

        // Create a panel to hold the game board and add it to the frame
        createGameBoard();

        // Set the frame's size, close operation, and make it visible
        frame.setSize(550, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Method to create a reset button
    private void createResetButton() {
        JButton resetButton = new JButton("RESET");
        resetButton.addActionListener(_ -> resetGame());
        frame.add(resetButton, BorderLayout.NORTH);
    }

    // Method to create a panel with player fields
    private void createPlayerFields() {
        JPanel playerFields = new JPanel();
        playerFields.add(new JLabel("Player 1: "));
        playerFields.add(player1Field);
        playerFields.add(new JLabel("Player 2: "));
        playerFields.add(player2Field);
        frame.add(playerFields, BorderLayout.SOUTH);
    }

    // Method to create a game board panel
    private void createGameBoard() {
        JPanel gameBoard = new JPanel(new GridLayout(3, 3));

        // Iterate over the buttons array and add each button to the game board panel
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("Arial", Font.BOLD, 40));
            final int index = i;
            buttons[i].addActionListener(_ -> onButtonClick(index));
            gameBoard.add(buttons[i]);
        }

        // Add the game board panel to the frame
        frame.add(gameBoard, BorderLayout.CENTER);
    }

    // Method to reset the game
    private void resetGame() {
        moveCounter = 0;
        for (int i=0; i<board.length; i++) {
            board[i] = 0;
            buttons[i].setText("");
            buttons[i].setEnabled(true);
        }
    }

    // Method to handle a button click event
    private void onButtonClick(int index) {
        board[index] = (moveCounter % 2 == 0) ? 1 : -1;
        buttons[index].setText((moveCounter % 2 == 0) ? "X" : "O");
        buttons[index].setEnabled(false);
        moveCounter++;
        checkWinCondition();
    }

    // Method to check if a player has won the game
    void checkWinCondition() {
        for (String winCombo : WINNING_COMBINATIONS) {
            int sum = 0;
            for (int i =0; i<winCombo.length(); i++) {
                int boardIndex = Integer.parseInt(Character.toString(winCombo.charAt(i)));
                sum += board[boardIndex];
            }
            if (Math.abs(sum) == 3) {
                String winner = sum > 0 ? "Player 1" : "Player 2";
                JOptionPane.showMessageDialog(frame, winner + " wins!");
                disableAllButtons();
                return;
            }
        }
        if (moveCounter == 9) {
            JOptionPane.showMessageDialog(frame, "It's a draw!");
        }
    }

    // Method to disable all buttons on the game board
    private void disableAllButtons() {
        for (JButton button : buttons) {
            button.setEnabled(false);
        }
    }

    // Main method to start the game
    public static void main(String[] args) {
        new TicTacToe();
    }
}