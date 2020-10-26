package tictactoe;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Scanner scanner = new Scanner(System.in);
    String enteryData = "         ";

    String [][] field = new String [3][3];
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            field[i][j] = enteryData.substring(0, 1);
            enteryData = enteryData.substring(1);
        }
    }
    System.out.println("---------");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 5; j++) {
            if (j == 0 || j == 4) {
                System.out.print("| ");
            } else {
                System.out.print(field[i][j-1] + " ");
            }
        }
        System.out.println();
    }
    System.out.println("---------");
        int count = 0;
        boolean isXWinner = false,isOWinner = false;
        while (!isXWinner && !isOWinner) {


            try {
                int koordinataFirst = scanner.nextInt();
                int koordinataSecond = scanner.nextInt();
                if ((koordinataFirst < 1 || koordinataFirst > 3) || (koordinataSecond < 1 || koordinataSecond > 3)) {
                    System.out.println("Coordinates should be from 1 to 3");
                    continue;
                }
                if (field[Math.abs(koordinataSecond - 3)][koordinataFirst - 1].equals("X") || field[Math.abs(koordinataSecond - 3)][koordinataFirst - 1].equals("O")) {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                } else {
                    if (count % 2 == 0) {
                        count++;
                        field[Math.abs(koordinataSecond - 3)][koordinataFirst - 1] = "X";
                    } else {
                        count++;
                        field[Math.abs(koordinataSecond - 3)][koordinataFirst - 1] = "O";
                    }


                }

                for (int i = 0; i < 3; i++) {
                    if (field[i][0].equals(field[i][1]) && field[i][1].equals(field[i][2]) && field[i][0].equals("X") || field[0][i].equals(field[1][i]) && field[1][i].equals(field[2][i]) && field[2][i].equals("X") || (field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2]) || field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0])) && field[1][1].equals("X")) {
                        isXWinner = true;
                    }
                    if (field[i][0].equals(field[i][1]) && field[i][1].equals(field[i][2]) && field[i][0].equals("O") || field[0][i].equals(field[1][i]) && field[1][i].equals(field[2][i]) && field[2][i].equals("O") || (field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2]) || field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0])) && field[1][1].equals("O")) {
                        isOWinner = true;
                    }
                }

                int countX = 0;
                int countO = 0;
                int countSpace = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++){
                        if (field[i][j].equals("X")) {
                            countX++;
                        } else if (field[i][j].equals("O")){
                            countO++;
                        } else {
                            countSpace++;
                        }
                    }
                }
                System.out.println("---------");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (j == 0 || j == 4) {
                            System.out.print("| ");
                        } else {
                            System.out.print(field[i][j-1] + " ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("---------");
                if (isXWinner && !isOWinner) {
                    System.out.println("X wins");
                }
                if (isOWinner && !isXWinner) {
                    System.out.println("O wins");
                }
                if (!isOWinner && !isXWinner && countSpace == 0) {
                    System.out.println("Draw");
                    break;
                }
                /*else if (!isOWinner && !isXWinner && countSpace > 0 && Math.abs(countO - countX) < 1) {
                    System.out.println("Game not finished");
                } */
                else if (isOWinner && isXWinner || Math.abs(countO - countX) > 1) {
                    System.out.println("Impossible");
                }

            } catch (Exception e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
                continue;
            }
        }




    /*boolean isXWinner = false,isOWinner = false;
    for (int i = 0; i < 3; i++) {
        if (field[i][0].equals(field[i][1]) && field[i][1].equals(field[i][2]) && field[i][0].equals("X") || field[0][i].equals(field[1][i]) && field[1][i].equals(field[2][i]) && field[2][i].equals("X") || (field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2]) || field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0])) && field[0][0].equals("X")) {
            isXWinner = true;
        }
        if (field[i][0].equals(field[i][1]) && field[i][1].equals(field[i][2]) && field[i][0].equals("O") || field[0][i].equals(field[1][i]) && field[1][i].equals(field[2][i]) && field[2][i].equals("O") || (field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2]) || field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0])) && field[0][0].equals("O")) {
            isOWinner = true;
        }
    }

    int countX = 0;
    int countO = 0;
    int countSpace = 0;

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++){
            if (field[i][j].equals("X")) {
                countX++;
            } else if (field[i][j].equals("O")){
                countO++;
            } else {
                countSpace++;
            }
        }
    }
    if (isXWinner && !isOWinner) {
        System.out.println("X wins");
    }
    if (isOWinner && !isXWinner) {
        System.out.println("O wins");
    }
    if (!isOWinner && !isXWinner && countSpace == 0) {
        System.out.println("Draw");
    } else if (!isOWinner && !isXWinner && countSpace > 0 && Math.abs(countO - countX) < 1) {
        System.out.println("Game not finished");
    } else if (isOWinner && isXWinner || Math.abs(countO - countX) > 1) {
        System.out.println("Impossible");
    }*/

    }
}
