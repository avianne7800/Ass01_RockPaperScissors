import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        boolean done = false;
        String[] CPUPool = {"R","P","S"};
        String CPUPlay;
        String UserPlay;

        do{
            System.out.println();
            System.out.println("(R)ock, (P)aper, or (S)cissors? (Q to quit)");
            UserPlay = in.next();
            in.nextLine();
            int randomNumber = random.nextInt(CPUPool.length);
            CPUPlay = CPUPool[randomNumber];
            if(UserPlay.equalsIgnoreCase("R")){
                switch (CPUPlay) {
                    case "R" -> {
                        System.out.println("P1: Rock");
                        System.out.println("VS");
                        System.out.println("CPU: Rock");
                        System.out.println("It's a tie!");
                    }
                    case "P" -> {
                        System.out.println("P1: Rock");
                        System.out.println("VS");
                        System.out.println("CPU: Paper");
                        System.out.println("You lose!");
                    }
                    case "S" -> {
                        System.out.println("P1: Rock");
                        System.out.println("VS");
                        System.out.println("CPU: Scissors");
                        System.out.println("You win!");
                    }
                }
            }
            else if(UserPlay.equalsIgnoreCase("P")){
                switch (CPUPlay) {
                    case "R" -> {
                        System.out.println("P1: Paper");
                        System.out.println("VS");
                        System.out.println("CPU: Rock");
                        System.out.println("You win!");
                    }
                    case "P" -> {
                        System.out.println("P1: Paper");
                        System.out.println("VS");
                        System.out.println("CPU: Paper");
                        System.out.println("It's a tie!");
                    }
                    case "S" -> {
                        System.out.println("P1: Paper");
                        System.out.println("VS");
                        System.out.println("CPU: Scissors");
                        System.out.println("You lose!");
                    }
                }
            }
            else if(UserPlay.equalsIgnoreCase("S")){
                switch (CPUPlay) {
                    case "R" -> {
                        System.out.println("P1: Scissors");
                        System.out.println("VS");
                        System.out.println("CPU: Rock");
                        System.out.println("You lose!");
                    }
                    case "P" -> {
                        System.out.println("P1: Scissors");
                        System.out.println("VS");
                        System.out.println("CPU: Paper");
                        System.out.println("You win!");
                    }
                    case "S" -> {
                        System.out.println("P1: Scissors");
                        System.out.println("VS");
                        System.out.println("CPU: Scissors");
                        System.out.println("It's a tie!");
                    }
                }
            }
            else if(UserPlay.equalsIgnoreCase("Q")){
                System.out.println("Goodbye!");
                done = true;
            }
            else{
                System.out.println("The input you entered is invalid.");
                UserPlay = "";
            }
        }while(!done);
    }
}
