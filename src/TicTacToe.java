//Developed by @cyberkunju
//checkout www.cyberkunju.online to know more about me
//This is a mini project to create a simple Tic Tac Toe game using Java Swing for my collage!.

package src;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TicTacToe {
    private JFrame frame;
    private JButton[] buttons;
    private JTextField player1Field;
    private JTextField player2Field;
    private JLabel player1WinsLabel;
    private JLabel player2WinsLabel;
    private JLabel drawsLabel;
    private int moveCounter = 0;
    private int player1Wins = 0;
    private int player2Wins = 0;
    private int draws = 0;
    private final int[] board = new int[9];
    private static final String[] WINNING_COMBINATIONS = {"012", "345", "678", "036", "147", "258", "048", "246"};
    private static final Logger LOGGER = Logger.getLogger(TicTacToe.class.getName());

    public TicTacToe() {
        setUpGame();
        displayInstructions();
    }

    private void displayInstructions() {
        String instructions = """
             Welcome to Tic Tac Toe! Copyrighted @www.cyberkunju.online
            
             Here's how to play:
             1. Enter the name of player 1 in the first text\s
             box and second player in the second text box
             1. Player 1 starts the game by clicking on a cell to place their 'X'.
             2. Player 2 follows by clicking on a different cell to place their 'O'.
             3. Players alternate turns. The goal is to get three of your own mark (X or O)
             in a row, either horizontally, vertically, or diagonally.
             4. If all cells are filled and no player has three in a row, the game is a draw.
             5. You can start a new game at any time by clicking the 'RESET' button.
            
             Enjoy the game! Also visit www.cyberkunju.online to know more about me ;)
            \s""";
        JOptionPane.showMessageDialog(frame, instructions, "How to Play", JOptionPane.INFORMATION_MESSAGE);
    }

    private void setUpGame() {
        frame = new JFrame("Tic Tac Toe");
        frame.getContentPane().setBackground(Color.BLACK);
        buttons = new JButton[9];
        player1Field = new JTextField(10);
        player2Field = new JTextField(10);

        createResetButton();
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(createPlayerFields(), BorderLayout.NORTH);
        mainPanel.add(createGameBoard(), BorderLayout.CENTER);
        frame.add(mainPanel, BorderLayout.CENTER);
        createWatermark();

        frame.setSize(550, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void createResetButton() {
        JButton resetButton = new JButton("RESET");
        resetButton.setForeground(Color.GRAY);
        resetButton.setBackground(Color.BLACK);
        resetButton.addActionListener(_ -> resetGame());
        frame.add(resetButton, BorderLayout.NORTH);
    }

    private JPanel createPlayerFields() {
        JPanel playerFields = new JPanel();
        playerFields.setLayout(new BoxLayout(playerFields, BoxLayout.Y_AXIS));
        playerFields.setBackground(Color.BLACK);

        JPanel namesPanel = new JPanel();
        namesPanel.setBackground(Color.BLACK);
        JLabel player1Label = new JLabel();
        player1Label.setForeground(Color.GRAY);
        namesPanel.add(player1Label);
        namesPanel.add(player1Field);
        addDocumentListener(player1Field, player1Label);

        JLabel player2Label = new JLabel();
        player2Label.setForeground(Color.GRAY);
        namesPanel.add(player2Label);
        namesPanel.add(player2Field);
        addDocumentListener(player2Field, player2Label);

        playerFields.add(namesPanel);

        JPanel winsPanel = new JPanel();
        winsPanel.setBackground(Color.BLACK);
        player1WinsLabel = new JLabel("Wins: 0");
        player1WinsLabel.setForeground(Color.GRAY);
        winsPanel.add(player1WinsLabel);

        player2WinsLabel = new JLabel("Wins: 0");
        player2WinsLabel.setForeground(Color.GRAY);
        winsPanel.add(player2WinsLabel);

        drawsLabel = new JLabel("Draws: 0");
        drawsLabel.setForeground(Color.GRAY);
        winsPanel.add(drawsLabel);

        playerFields.add(winsPanel);

        return playerFields;
    }

    private void addDocumentListener(JTextField textField, JLabel label) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                label.setText(textField.getText() + ": ");
            }

            public void removeUpdate(DocumentEvent e) {
                label.setText(textField.getText() + ": ");
            }

            public void insertUpdate(DocumentEvent e) {
                label.setText(textField.getText() + ": ");
            }
        });
    }

    private JPanel createGameBoard() {
        JPanel gameBoard = new JPanel(new GridLayout(3, 3));
        gameBoard.setBackground(Color.BLACK);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("Arial", Font.BOLD, 40));
            buttons[i].setForeground(Color.GRAY);
            buttons[i].setBackground(Color.BLACK);
            int index = i;
            buttons[i].addActionListener(_ -> onButtonClick(index));
            gameBoard.add(buttons[i]);
        }

        return gameBoard;
    }

    private void createWatermark() {
        JLabel watermark = new JLabel("<html><font color='gray'>Copyrights by </font><a href='https://www.cyberkunju.online'>www.cyberkunju.online</a></html>", SwingConstants.CENTER);
        watermark.setCursor(new Cursor(Cursor.HAND_CURSOR));
        watermark.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent unused) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.cyberkunju.online"));
                } catch (Exception ex) {
                    LOGGER.log(Level.WARNING, "Error opening browser", ex);
                }
            }
        });
        frame.add(watermark, BorderLayout.SOUTH);
    }

    private void resetGame() {
        this.moveCounter = 0;
        for (int i = 0; i < this.board.length; i++) {
            this.board[i] = 0;
            this.buttons[i].setText("");
            this.buttons[i].setEnabled(true);
        }
    }

    private void onButtonClick(int index) {
        this.board[index] = this.moveCounter % 2 == 0 ? 1 : -1;
        this.buttons[index].setText(this.moveCounter % 2 == 0 ? "X" : "O");
        this.buttons[index].setEnabled(false);
        this.moveCounter++;
        checkWinCondition();
    }

    private void checkWinCondition() {
        for (String winCombo : WINNING_COMBINATIONS) {
            int sum = 0;
            for (int i = 0; i < winCombo.length(); i++) {
                int boardIndex = Integer.parseInt(Character.toString(winCombo.charAt(i)));
                sum += this.board[boardIndex];
            }
            if (Math.abs(sum) == 3) {
                String winner = sum > 0 ? player1Field.getText() : player2Field.getText();
                JOptionPane.showMessageDialog(this.frame, winner + " wins!");
                if (sum > 0) {
                    player1Wins++;
                    player1WinsLabel.setText(winner + " Wins: " + player1Wins);
                } else {
                    player2Wins++;
                    player2WinsLabel.setText(winner + " Wins: " + player2Wins);
                }
                disableAllButtons();
                return;
            }
        }
        if (this.moveCounter == 9) {
            JOptionPane.showMessageDialog(this.frame, "It's a draw!");
            draws++;
            drawsLabel.setText("Draws: " + draws);
            disableAllButtons();
        }
    }

    private void disableAllButtons() {
        for (JButton button : this.buttons) {
            button.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TicTacToe::new);
    }
}