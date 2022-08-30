import java.util.Scanner;
public class ticTacToe{
    private boolean turn;

    public void setTurn(boolean value){
        this.turn = value;
    }
    public boolean getTurn(){
        return turn;
    }

    public void run(){
        Scanner input = new Scanner(System.in); 
        System.out.println("Welcome to the tic tac toe game");
        System.out.println("If you didnt mean to pick this, you can exit now");
        System.out.println("Exit? (y/n)");

        String choice = input.nextLine();
        if(choice == "y" ){
            input.close(); 
            return;
        }
        input.close();

    }
}