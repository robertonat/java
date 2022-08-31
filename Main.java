/*
 * Initilized 8/30/22
 * Base App program that will manage what the user wants to do
 * Asks for input and directs the user to the proper application.
 * 
 */
import java.util.Scanner;  //Scanner class for input.

public class Main {
    public static final Scanner input = new Scanner(System.in); //public scanner for all input.

    static void app(){ 
        loop: while(true){
            System.out.println("Welcome to our app");
            System.out.println("please enter a number for the task you want to do");
            System.out.println("Enter 0 to exit the app");
            System.out.println("Enter 1 to play a game of tictactoe");
            String choice = "";
            choice =input.nextLine();
            try{   
            switch(choice){
                case "0":
                    break loop;
                case "1":
                    ticTacToe newGame = new ticTacToe();
                    newGame.run();
                    
                    break;
                default:
                    System.out.println("Sorry I couldnt understand that. " +choice+ " was not a valid choice. Please try again \n \n ");
                    break;
                }   
            }
            catch (Exception e){
                System.out.println("Sorry it seems the input was invalid");
            }
            choice = "";
        }

        input.close();
        System.out.println("Thank you for using this app.");
        System.out.println("Goodbye");
        
    }

    public static void main(String[] args) {
        app();
    }
  }