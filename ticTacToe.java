/*
 * Class that controls the main game functions
 * Will control if the game is active, when the players turn is, what move the enemy will make. 
 * 
 */

public class ticTacToe{
    private boolean turn;
    private boolean game;

    public ticTacToe(){
        this.game = true;
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
        System.out.println("Welcome to the tic tac toe game");
        System.out.println("If you didnt mean to pick this, you can exit now");
        System.out.println("Exit? (y/n)");
        String choice = Main.input.nextLine();

        if(choice.equals("y") ){
            choice = "";
            System.out.println("Yes was chosen.");
            System.out.println("You will now be returned to the main app \n");
            return;
        }

        System.out.println("Would you like to go first? (y/n)");
        choice = Main.input.nextLine();

        if(choice.equals("y")){
            setTurn(true);
        }
        else{
            setTurn(false);
        }
        ticTacToeBoard newBoard = new ticTacToeBoard();
        newBoard.changeValue('X', 0);
        newBoard.printBoard();
        /*
        while(gameActive()){
            if(getTurn()){

                setTurn(false);
            }
            else{
                setTurn(true);
            }
        }
        */
           
    }
}