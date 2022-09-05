
/*
 * Class that will control the board that is played on. Initilizes the board with the rules and prints out what the boards state is. 
 * Allows for the modification of the board. Does not control any of the game functions or methods. 
 * 
 */

public class ticTacToeBoard{
    private char[][] board ={{'1','2','3'},
                    {'4','5','6'},
                    {'7','8','9'}} ;

    public ticTacToeBoard(){
        System.out.println("This is how the board will look like.");
        this.printBoard();
        System.out.println("To choose where youd like your symbol to be, input the corresponding cell");
        System.out.println("Have fun");

    }

    public char getValue(int i, int j){
        return this.board[i][j];
    }

    public boolean valid(int coordinate){
        int i = coordinate/3;
        if(this.getValue(i, 0) == this.getValue( i, 1) && this.getValue(i, 1) == this.getValue(i, 2))return true;
        i = coordinate%3;
        if(this.getValue(0,i) == this.getValue( 1, i) && this.getValue(1, i) == this.getValue(2, i))return true;
        return false;
    }

    public void printBoard(){
        System.out.println(" " + getValue(0, 0) + " | " + getValue(0, 1) + " | " + getValue(0, 2));
        System.out.println("----------- ");
        System.out.println(" " +getValue(1, 0) + " | " + getValue(1, 1) + " | " + getValue(1, 2));
        System.out.println("----------- ");
        System.out.println(" " + getValue(2, 0) + " | " + getValue(2, 1) + " | " + getValue(2, 2));
    }

    public void changeValue(char val, int num){

        this.board[num/3][num%3] = val;
    }

}