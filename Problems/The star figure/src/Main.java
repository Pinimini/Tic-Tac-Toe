import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] star = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2 || j == n / 2 || i == j || i == Math.abs(j - n + 1)) {
                    star[i][j] = "* ";
                } else {
                    star[i][j] = ". ";
                }
            }
        }

        for (String[] masSimvol :
             star) {
            for (String simvol :
                    masSimvol) {
                System.out.print(simvol);
            }
            System.out.println();
        }
    }
}