package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TicTaeToe implements ActionListener{


 JFrame f = new JFrame("Tic Tac Toe");


 Label lbl=new Label("");

 Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\NARENDER KESWANI\\Downloads\\data-flair-icon.jpeg");    


 JButton btn1 = new JButton("");
 JButton btn2 = new JButton("");
 JButton btn3 = new JButton("");
 JButton btn4 = new JButton("");
 JButton btn5 = new JButton("");
 JButton btn6 = new JButton("");
 JButton btn7 = new JButton("");
 JButton btn8 = new JButton("");
 JButton btn9 = new JButton("");
 JButton btn10 = new JButton("");
 

 JPanel board = new JPanel();
 JPanel panel = new JPanel();

 String letter = "";
 int count = 0;
 

 boolean win = false;
 
 public TicTaeToe() {
     initUI();
     addActionEvents();
 }

 
 @Override
 public void actionPerformed(ActionEvent a) {
 count++;
 if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9){
 letter = "X";
 } else if(count == 2 || count == 4 || count == 6 || count == 8 ){
 letter = "O";
 }

 if(a.getSource() == btn1){
 btn1.setText(letter);
 btn1.setEnabled(false);
 }else if(a.getSource() == btn2){
 btn2.setText(letter);
 btn2.setEnabled(false);
 } else if(a.getSource() == btn3){
 btn3.setText(letter);
 btn3.setEnabled(false);
 } else if(a.getSource() == btn4){
 btn4.setEnabled(false);
 btn4.setText(letter);
 } else if(a.getSource() == btn5){
 btn5.setText(letter);
  btn5.setEnabled(false);
 } else if(a.getSource() == btn6){
 btn6.setText(letter);
  btn6.setEnabled(false);
 } else if(a.getSource() == btn7){
 btn7.setEnabled(false);
 btn7.setText(letter);
 } else if(a.getSource() == btn8){
 btn8.setEnabled(false);
 btn8.setText(letter);
 } else if(a.getSource() == btn9){
 btn9.setText(letter);
 btn9.setEnabled(false);
 }
 else if(a.getSource() == btn10){
     
 letter = "";
 count = 0;
        
 btn1.setEnabled(true);
 btn2.setEnabled(true);
 btn3.setEnabled(true);
 btn4.setEnabled(true); 
 btn5.setEnabled(true);
 btn6.setEnabled(true);
 btn7.setEnabled(true);
 btn8.setEnabled(true);
 btn9.setEnabled(true);
 
 btn1.setText("");
 btn2.setText("");
 btn3.setText("");
 btn4.setText("");
 btn5.setText("");
 btn6.setText("");
 btn7.setText("");
 btn8.setText("");
 btn9.setText("");
 btn9.setText("");

 lbl.setText("");
 
 win = false;
 
 }


 checkWinner();
 }
 
 
 private void initUI(){
          

 board.setLayout(new GridLayout(3,3));
 panel.setLayout(new FlowLayout());


 btn1.setBackground(new Color(255,255,255));
 btn2.setBackground(new Color(255,255,255));
 btn3.setBackground(new Color(255,255,255));
 btn4.setBackground(new Color(255,255,255));
 btn5.setBackground(new Color(255,255,255));
 btn6.setBackground(new Color(255,255,255));
 btn7.setBackground(new Color(255,255,255));
 btn8.setBackground(new Color(255,255,255));
 btn9.setBackground(new Color(255,255,255));
 btn10.setBackground(new Color(255,255,255));

 panel.setBackground(new Color(255,255,255));
 

 btn10.setText("RESET");

 btn1.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 btn2.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 btn3.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 btn4.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 btn5.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 btn6.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 btn7.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 btn8.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
 btn9.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));


 board.add(btn1);
 board.add(btn2);
 board.add(btn3);
 board.add(btn4);
 board.add(btn5);
 board.add(btn6);
 board.add(btn7);
 board.add(btn8);
 board.add(btn9);
 
 panel.add(btn10);
 panel.add(lbl);
 

 f.add(board,BorderLayout.CENTER);
 f.add(panel,BorderLayout.SOUTH);

 f.setIconImage(icon);    
 
 f.setVisible(true);
 f.setSize(550,550);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      }
 
    public void addActionEvents(){

 btn1.addActionListener(this);
 btn2.addActionListener(this);
 btn3.addActionListener(this);
 btn4.addActionListener(this);
 btn5.addActionListener(this);
 btn6.addActionListener(this);
 btn7.addActionListener(this);
 btn8.addActionListener(this);
 btn9.addActionListener(this);
 btn10.addActionListener(this);
      
    }
    
      
 private void checkWinner()
 {

   if(btn1.getText() =package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This class represents a Tic Tac Toe game. It extends {@link JFrame} and implements {@link ActionListener}.
 * It creates a GUI for the game and handles the game logic.
 */
public class TicTaeToe extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JFrame f;
    private Label lbl;
    private Image icon;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    private JPanel board, panel;
    private String letter;
    private int count;
    private boolean win;

    /**
     * Constructor for the Tic Tac Toe game. It initializes the GUI and sets up the game logic.
     */
    public TicTaeToe() {
        initUI();
        addActionEvents();
    }

    /**
     * Initializes the GUI components and layouts.
     */
    private void initUI() {
        board = new JPanel();
        board.setLayout(new GridLayout(3, 3));
        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        btn1 = new JButton("");
        btn2 = new JButton("");
        btn3 = new JButton("");
        btn4 = new JButton("");
        btn5 = new JButton("");
        btn6 = new JButton("");
        btn7 = new JButton("");
        btn8 = new JButton("");
        btn9 = new JButton("");
        btn10 = new JButton("RESET");

        btn1.setBackground(Color.WHITE);
        btn2.setBackground(Color.WHITE);
        btn3.setBackground(Color.WHITE);
        btn4.setBackground(Color.WHITE);
        btn5.setBackground(Color.WHITE);
        btn6.setBackground(Color.WHITE);
        btn7.setBackground(Color.WHITE);
        btn8.setBackground(Color.WHITE);
        btn9.setBackground(Color.WHITE);
        btn10.setBackground(Color.WHITE);

        panel.setBackground(Color.WHITE);
        btn10.setText("RESET");

        btn1.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        btn2.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        btn3.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        btn4.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        btn5.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        btn6.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        btn7.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        btn8.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));
        btn9.setBorder(BorderFactory.createLineBorder(Color.decode("#2C6791")));

        board.add(btn1);
        board.add(btn2);
        board.add(btn3);
        board.add(btn4);
        board.add(btn5);
        board.add(btn6);
        board.add(btn7);
        board.add(btn8);
        board.add(btn9);

        panel.add(btn10);
        panel.add(lbl);

        f.add(board, BorderLayout.CENTER);
        f.add(panel, BorderLayout.SOUTH);

        f.setIconImage(icon);

        f.setVisible(true);
        f.setSize(550, 550);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Adds action listeners to the game buttons.
     */
    private void addActionEvents() {
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
    }

    /**
     * Checks if a player has won the game.
     */
    private void checkWinner() {
        // Checks if a player has won the game
    }
}= btn2.getText() &&
    btn2.getText() == btn3.getText() && 
    btn1.getText() != "" && 
    btn2.getText() != "" && 
    btn3.getText() != "" )
 {
        win = true;
 }
 
  else if(btn4.getText() == btn5.getText() && 
          btn5.getText() == btn6.getText() && 
          btn4.getText() != "" &&
          btn5.getText() != "" &&
          btn6.getText() != "")
  {
      win = true;
  }
  

    else if(btn7.getText() == btn8.getText() && 
            btn8.getText() == btn9.getText() && 
            btn7.getText() != "" &&
            btn8.getText() != "" &&
            btn9.getText() != "")
    {
        win = true;
    }
  
    else if(btn1.getText() == btn4.getText() &&
            btn4.getText() == btn7.getText() &&
            btn1.getText() != "" &&
            btn4.getText() != "" &&
            btn7.getText() != "")
    {
        win = true;
    }

    else if(btn2.getText() == btn5.getText() && 
            btn5.getText() == btn8.getText() && 
            btn2.getText() != "" &&
            btn5.getText() != "" &&
            btn8.getText() != "")
    {
        win = true;
    }
    
    else if(btn3.getText() == btn6.getText() &&
            btn6.getText() == btn9.getText() && 
            btn3.getText() != "" &&
            btn6.getText() != "" &&
            btn9.getText() != "")
    {
        win = true;
    }
    

    else if(btn1.getText() == btn5.getText() && 
        btn5.getText() == btn9.getText() && 
        btn1.getText() != "" &&
        btn5.getText() != "" &&
        btn9.getText() != "")
    {
        win = true;
    }
    

    else if(btn3.getText() == btn5.getText() && 
            btn5.getText() == btn7.getText() && 
            btn3.getText() != "" &&
            btn5.getText() != "" &&
            btn7.getText() != "")
    {
            win = true;
    }
    
    else {
        win = false;
    }
 
 if (win) {
     lbl.setText("Hurray! Player " + letter + " wins!");
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false); 
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);

 } else if (!win && count == 9) {
        lbl.setText("The game ended in a tie.");
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false); 
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
 }
 }
 
 public static void main(String[] args) {
TicTaeToe ttt=new TicTaeToe();

 }
}