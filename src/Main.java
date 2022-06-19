import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1.	Code the Rock Paper Scissors program:
        //a.	Get a move choice from playerA which must be R, P, S or r, p, s
        //Loop until you get a valid move
        //b.	Get a move choice from playerB in the same manner
        //c.	Display the results using the accepted phrases from the game
        //Rock breaks Scissors,
                //Paper covers Rock,
        //Scissors cuts Paper
        //and indicate the winner (Player A wins) or
        //Rock vs Rock it’s a Tie!  Etc…
        //d.	Prompt the user to play again [Y/N]
        //e.	Continue or terminate based on the user’s choice.
        //Be sure to commit and push your changes if using GitHub.

        String aInput = "";
        String bInput = "";
        Scanner in = new Scanner(System.in);
        String cont = "Y";

        do {

            System.out.println("Player A please enter your move (R, P or S)");

            do {
                aInput = in.nextLine();

            } while (!(aInput.equalsIgnoreCase("r") || aInput.equalsIgnoreCase("p") || aInput.equalsIgnoreCase("s")));
            System.out.println("Player B please enter your move (R, P or S)");

            do {
                bInput = in.nextLine();

            } while (!(bInput.equalsIgnoreCase("r") || bInput.equalsIgnoreCase("p") || bInput.equalsIgnoreCase("s")));

            if (aInput.equalsIgnoreCase(bInput)){
                System.out.println(aInput + " vs " + bInput + ". It's a Tie!");
            } else if (aInput.equalsIgnoreCase("r")){
                if (bInput.equalsIgnoreCase("p")){
                    System.out.println("Paper beats Rock.");
                    System.out.println("Player B wins!");
                } else{
                    System.out.println("Rock beats Scissors.");
                    System.out.println("Player A wins!");
                }
            } else if (aInput.equalsIgnoreCase(("p"))){
                if (bInput.equalsIgnoreCase("r")){
                    System.out.println("Paper beats Rock.");
                    System.out.println("Player A wins!");
                } else{
                    System.out.println("Scissors beats Paper.");
                    System.out.println("Player B wins!");
                }
            } else {
                if (bInput.equalsIgnoreCase("p")){
                    System.out.println("Scissors beats Paper");
                    System.out.println("Player A wins!");
                } else{
                    System.out.println("Rock beats Scissors.");
                    System.out.println("Player B wins!");
                }
            }

            System.out.println("Do you want to continue? Y or N");

            cont = in.nextLine();

        } while (cont.equalsIgnoreCase(("Y")));
    }
}