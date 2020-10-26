import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstValue = sc.nextInt();
        int secondValue = sc.nextInt();
        int[][] array = new int[firstValue][secondValue];
        int[][] resultArray = new int[secondValue][firstValue];

        for (int i = 0; i < firstValue; i++) {
            for (int j = 0; j < secondValue; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < secondValue; i++) {
            for (int j = 0; j < firstValue; j++) {
                resultArray[i][firstValue - 1 - j] = array[j][i];
            }
        }

        for (int[] a:
                resultArray) {
            for (int c :
                    a) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
