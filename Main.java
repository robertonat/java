import java.util.Scanner; 

public class Main {

    static void app(){

        Scanner input = new Scanner(System.in); 

        loop: while(true){
        System.out.println("Welcome to our app");
        System.out.println("please enter a number for the task you want to do");
        System.out.println("Enter 0 to exit the app");
        System.out.println("Enter 1 to play a game of tictactoe");
        try{
        String choice = input.nextLine();
            
        switch(choice){
            case "0":
                break loop;
            case "1":
                ticTacToe newGame = new ticTacToe();
                newGame.run();
                break;
            default:
                System.out.println("Sorry I couldnt understand that. " +choice+ " was not a valid choice. Please try again");
                break;
        }   
        }
        catch (Exception e){
            System.out.println("Sorry it seems the input was invalid");
        }
        }
        input.close();
        System.out.println("Thank you for using this app.");
        System.out.println("Goodbye");
    }


    public static void main(String[] args) {
      app();
    }
  }