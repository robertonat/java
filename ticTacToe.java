
/*
 * Class that controls the main game functions
 * Will control if the game is active, when the players turn is, what move the enemy will make. 
 * 
 */
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JLabel;
 import javax.swing.JPanel;
public class ticTacToe{
    private boolean turn;
    private boolean game;

    public void initiatePanel(JPanel panel){
        JButton backButton = new JButton("Back to main menu");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Back to menu has been clicked");
                Main.newApp.cl.show(Main.newApp.parentPanel,"menu");
            }
        });
        panel.add(backButton);
    }
    public ticTacToe(){
        System.out.println("TicTacToe game was chosen");
        JPanel tictactoePanel = new JPanel();
        JLabel label1 = new JLabel();
        label1.setText("This is the tictactoe portion of the app");
        tictactoePanel.add(label1);
        initiatePanel(tictactoePanel);
        Main.newApp.parentPanel.add(tictactoePanel, "tttmenu");
        Main.newApp.cl.show(Main.newApp.parentPanel, "tttmenu");
        System.out.println("Reaches the end of the tictactoe constructor");

    }

    

    public void setTurn(boolean value){
        this.turn = value;
    }
    public boolean getTurn(){
        return this.turn;
    }

    public boolean gameActive(){
        return this.game;
    }

    public void stopGame(){
        this.game = false;
    }

    public void run(){

           
    }
}