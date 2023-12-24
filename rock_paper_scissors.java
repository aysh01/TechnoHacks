import java.util.*;

//Rock, Paper, Scissors Game
class game {
    static String guess;

    public static void game() {
        System.out.println(
                "-======-----------======\n Welcome, To Our World Famous Rock, Paper & Scissors Game..\n-======-----------======");
        input();
    }

    static void input() {
        try {
            Scanner S = new Scanner(System.in);
            System.out.println("Rock -- Paper -- Scissors ..?\nChoose, Your Option..");
            guess = S.next(); // Take, User Input ...
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/**
 * rock_paper_scissors
 */
public class rock_paper_scissors extends game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        arr[0] = "Rock";
        arr[1] = "Paper";
        arr[2] = "Scissors";
        Random rd = new Random();
        int i = rd.nextInt(arr.length); // random index
        String x = arr[i]; // access random index
        String output = x.toLowerCase(); // Converts the random Value (x) to lowercase
        System.out.println(x); //The, Output is UnCommented for Demonstration Purposes..

        game();
        for (int z = 0; z < 5; z++) {
            if (output.equals(guess)) {
                System.out.println("-======-----------======\n It's a Draw..\n-======-----------======");
                System.out.println("Want, To Continue ? Y/N");
                String choice = sc.next();

                if (choice.equalsIgnoreCase("Y")) {
                    System.out.println("You, chose to Continue....");
                    for (int second = 0; second < 2; second++) {
                        input();
                        // System.out.println("-======-----------======");
                        // For loop, for executing the loop again.....//
                    }
                } else {
                    System.out.println("You, Chose to Quit..");
                    break;
                }
                // break;
            } else if (output.equals("paper") && guess.equals("rock")) {
                System.out.println("-======-----------======\n Congrats..! You, Won..\n-======-----------======");
                System.out.println("Want, To Continue ? Y/N");
                String choice = sc.next();

                if (choice.equalsIgnoreCase("Y")) {
                    System.out.println("You, chose to Continue....");
                    for (int second = 0; second < 2; second++) {
                        input();
                        // System.out.println("-======-----------======");
                        // For loop, for executing the loop again.....//
                    }
                } else {
                    System.out.println("You, Chose to Quit..");
                    break;
                }
            } else if (output.equals("rock") && guess.equals("paper")) {
                System.out.println("-======-----------======\n SORRY..! You, Lost..\n-======-----------======");
                System.out.println("Want, To Quit ? Y/N");
                String choice = sc.next();

                if (choice.equalsIgnoreCase("Y")) {
                    System.out.println("You, chose to Quit....");
                    break;
                } else {
                    System.out.println("You, Chose to Continue..");
                    // break;
                    for (int second = 0; second < 2; second++) {
                        input();
                        // System.out.println("-======-----------======");
                        // For loop, for executing the loop again.....//
                    }
                }
            } else if (output.equals("scissors") && guess.equals("paper")) {
                System.out.println("-======-----------======\n SORRY..! You, Lost..\n-======-----------======");
                System.out.println("Want, To Quit ? Y/N");
                String choice = sc.next();

                if (choice.equalsIgnoreCase("Y")) {
                    System.out.println("You, chose to Quit....");
                    break;
                } else {
                    System.out.println("You, Chose to Continue..");
                    // break;
                    for (int second = 0; second < 2; second++) {
                        input();
                        // System.out.println("-======-----------======");
                        // For loop, for executing the loop again.....//
                    }
                }
            } else if (output.equals("rock") && guess.equals("scissors")) {
                System.out.println("-======-----------======\n SORRY..! You, Lost..\n-======-----------======");
                System.out.println("Want, To Quit ? Y/N");
                String choice = sc.next();

                if (choice.equalsIgnoreCase("Y")) {
                    System.out.println("You, chose to Quit....");
                    break;
                } else {
                    System.out.println("You, Chose to Continue..");
                    // break;
                    for (int second = 0; second < 2; second++) {
                        input();
                        // System.out.println("-======-----------======");
                        // For loop, for executing the loop again.....//
                    }
                }
            }
        }
        System.out.println("G A M E - O V E R...");
    }
}
