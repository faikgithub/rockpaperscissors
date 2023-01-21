package j000_CodeChallange;

import java.util.Scanner;

public class RockPaperScissors {


    public static void main(String[] args) {

        // tas >makas
        // makas >kagit
        //kagit >tas


        Scanner sc = new Scanner(System.in);
        System.out.println("rock[ 1 ] | paper[ 2 ] | scissors[ 3 ]");
        int user = sc.nextInt();


        char rival = 'a';

        switch (user) {
            case 1:
                System.out.println("YOU PICKED UP: ROCK");
                break;
            case 2:
                System.out.println("YOU PICKED UP: PAPER");
                break;
            case 3:
                System.out.println("YOU PICKED UP: SCISSORS");
                break;
        }
        int pointUser = 0;
        int pointPc = 0;
        gameProgress(user, rival, pointUser, pointPc);
        System.out.println();

    }


    private static void gameProgress(int user, char rival, int pointUser, int pointPc) {

        for (int i = 1; i < 15; i++) {

            if (pointUser == 3 || pointPc == 3) {
                System.out.println("GAME OVER!\n" + "YOU: " + pointUser + " || " + "APPONENT: " + pointPc);
                System.out.println(pointUser == 3 ? "YOU WON!" : "YOU LOST!");
                break;
            }
            double random = (int) (Math.random() * 9);
            if (random < 3) { //Movement of the PC
                rival = 'r';
                System.out.println("YOUR OPPONENT: ROCK\n");
            } else if (random < 6) {
                rival = 'p';
                System.out.println("YOUR OPPONENT: PAPER\n");
            } else if (random < 9) {
                rival = 's';
                System.out.println("YOUR OPPONENT: SCISSORS\n");
            }


            if (rival == 'r' && user == 2) {
                System.out.println("WIN!");
                pointUser++;
            } else if (rival == 'r' && user == 1) {
                System.out.println("DRAW!");
            } else if (rival == 'r' && user == 3) {
                System.out.println("LOSE!");
                pointPc++;
            }


            if (rival == 'p' && user == 2) {
                System.out.println("DRAW!");
            } else if (rival == 'p' && user == 1) {
                System.out.println("LOSE!");
                pointPc++;
            } else if (rival == 'p' && user == 3) {
                System.out.println("WIN!");
                pointUser++;
            }

            if (rival == 's' && user == 2) {
                System.out.println("LOSE!");
                pointPc++;

            } else if (rival == 's' && user == 1) {
                System.out.println("WIN!");
                pointUser++;
            } else if (rival == 's' && user == 3) {
                System.out.println("DRAW");
            }

            System.out.println("SCORE: " + "YOU: " + pointUser + " || " + "APPONENT: " + pointPc);
            if (pointPc==3 || pointUser==3) {
                System.out.println();
                } else {
                Scanner sc = new Scanner(System.in);
                System.out.println("\nrock[ 1 ] | paper[ 2 ] | scissors[ 3 ]");
                user = sc.nextInt();
                switch (user) {
                    case 1:
                        System.out.println("YOU PICKED UP: ROCK");
                        break;
                    case 2:
                        System.out.println("YOU PICKED UP: PAPER");
                        break;
                    case 3:
                        System.out.println("YOU PICKED UP: SCISSORS");
                        break;
            }
            }


        }
    }
}
