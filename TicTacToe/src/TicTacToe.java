package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TicTacToe implements ActionListener{


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
 
 public TicTacToe() {
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


     newMethod(btn1, btn2, btn3, btn4, btn5);
     newMethod(btn6, btn7, btn8, btn9, btn10);

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

    private void newMethod(JButton btn1, JButton btn2, JButton btn3, JButton btn4, JButton btn5) {
        btn1.setBackground(new Color(255,255,255));
        btn2.setBackground(new Color(255,255,255));
        btn3.setBackground(new Color(255,255,255));
        btn4.setBackground(new Color(255,255,255));
        btn5.setBackground(new Color(255,255,255));
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

   if(Objects.equals(btn1.getText(), btn2.getText()) &&
           Objects.equals(btn2.getText(), btn3.getText()) &&
           !Objects.equals(btn1.getText(), "") &&
           !Objects.equals(btn2.getText(), "") &&
           !Objects.equals(btn3.getText(), ""))
 {
        win = true;
 }
 
  else if(Objects.equals(btn4.getText(), btn5.getText()) &&
           Objects.equals(btn5.getText(), btn6.getText()) &&
           !Objects.equals(btn4.getText(), "") &&
           !Objects.equals(btn5.getText(), "") &&
           !Objects.equals(btn6.getText(), ""))
  {
      win = true;
  }
  

    else if(Objects.equals(btn7.getText(), btn8.getText()) &&
           Objects.equals(btn8.getText(), btn9.getText()) &&
           !Objects.equals(btn7.getText(), "") &&
           !Objects.equals(btn8.getText(), "") &&
           !Objects.equals(btn9.getText(), ""))
    {
        win = true;
    }
  
    else if(Objects.equals(btn1.getText(), btn4.getText()) &&
           Objects.equals(btn4.getText(), btn7.getText()) &&
           !Objects.equals(btn1.getText(), "") &&
           !Objects.equals(btn4.getText(), "") &&
           !Objects.equals(btn7.getText(), ""))
    {
        win = true;
    }

    else if(Objects.equals(btn2.getText(), btn5.getText()) &&
           Objects.equals(btn5.getText(), btn8.getText()) &&
           !Objects.equals(btn2.getText(), "") &&
           !Objects.equals(btn5.getText(), "") &&
           !Objects.equals(btn8.getText(), ""))
    {
        win = true;
    }
    
    else if(Objects.equals(btn3.getText(), btn6.getText()) &&
           Objects.equals(btn6.getText(), btn9.getText()) &&
           !Objects.equals(btn3.getText(), "") &&
           !Objects.equals(btn6.getText(), "") &&
           !Objects.equals(btn9.getText(), ""))
    {
        win = true;
    }
    

    else if(Objects.equals(btn1.getText(), btn5.getText()) &&
           Objects.equals(btn5.getText(), btn9.getText()) &&
           !Objects.equals(btn1.getText(), "") &&
           !Objects.equals(btn5.getText(), "") &&
           !Objects.equals(btn9.getText(), ""))
    {
        win = true;
    }
    

    else win = Objects.equals(btn3.getText(), btn5.getText()) &&
               Objects.equals(btn5.getText(), btn7.getText()) &&
               !Objects.equals(btn3.getText(), "") &&
               !Objects.equals(btn5.getText(), "") &&
               !Objects.equals(btn7.getText(), "");
 
 if (win) {
     lbl.setText("Hurray! Player " + letter + " wins!");
     newMethod();

 } else if (count == 9) {
        lbl.setText("The game ended in a tie.");
     newMethod();
 }
 }

    private void newMethod() {
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

    public static void main(String[] args) {
        new TicTacToe();

    }
}