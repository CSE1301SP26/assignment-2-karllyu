import java.util.Scanner;

public class Nim {

    // wrap Math.random method
    static double random() { return Math.random(); }

    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        System.out.println("How many sticks should we start with? ");
        int numSticks = in.nextInt();
        int rounds = 0;
        boolean not_done = true;
        int winner = 0;

        while (not_done) {
            
            System.out.println("Round "+rounds+": Your move. ");
            int playerMove = in.nextInt();

            if (playerMove == 1 || playerMove == 2) {
            // Player move
                System.out.println("You took "+playerMove+".");
                Thread.sleep(1500);
                numSticks -= playerMove;
            // Evaluate game progress
                if (numSticks == 0) {
                    winner = 1;
                    not_done = false;
                }
                else{
                // Computer move
                    int compMove = (int) ((random() * 2) + 1);
                    System.out.println("My turn.");
                    Thread.sleep(1500);
                    System.out.println("I will take "+compMove+".");
                    Thread.sleep(1500);
                    numSticks -= compMove;  
                    System.out.println("So, "+numSticks+" remain.");
                    Thread.sleep(1500);
                    rounds += 1;
                // Evaluate game progress
                    if (numSticks == 0) {
                        not_done = false;
                    }
                }
            }
            else{
                System.out.println
                ("Hey! U can only take 1 or 2 sticks. Try again.");
                Thread.sleep(1500);
            }

        }

        if (winner == 0){
            System.out.println("I took the last stick.");
            Thread.sleep(1500);
            System.out.println("You lost :(");
        }
        else{
            System.out.println("You took the last stick.");
            Thread.sleep(1500);
            System.out.println("You... won.");
        }
        
    }

}
