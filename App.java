import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.CardLayout;

public class App extends JPanel {
    public static JFrame window = new JFrame("Multi-use Java application");
    public JPanel parentPanel = new JPanel();
    public CardLayout cl = new CardLayout();

    public void initiateButtons(JPanel panel1){
        JButton options = new JButton("TicTacToe");
        options.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("TicTacToe has been clicked");
                ticTacToe newGame = new ticTacToe();
            }
        });
        panel1.add(options);
        JButton todoListButton = new JButton("Look at my todoList");
        todoListButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("To Do list was clicked");
            }

        });
        panel1.add(todoListButton); 
    }

    public void setUp(){
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(500,500,600,600); // area
        window.setVisible(true); // show the window
        window.setLocationRelativeTo(null); // center the window
        JPanel appPanel = new JPanel();
        JLabel label1 = new JLabel();
        parentPanel.setLayout(cl);
        window.add(parentPanel);
        label1.setText("<html>   Welcome to the multipurpose Java app <br />Choose what you would like to do <br/></html>");        
        appPanel.add(label1);
        initiateButtons(appPanel);
        parentPanel.add(appPanel, "menu");
        Main.newApp.cl.show(Main.newApp.parentPanel, "menu");
        

    }

}