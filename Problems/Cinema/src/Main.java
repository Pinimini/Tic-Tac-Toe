import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int riad = sc.nextInt();
        int mesto = sc.nextInt();
        int[][] zal = new int[riad][mesto];
        int k;

        for (int i = 0; i < riad; i++) {
            for (int j = 0; j < mesto; j++) {
                zal[i][j] = sc.nextInt();
            }
        }
        k = sc.nextInt();

        outer: for (int i = 0; i < riad; i++) {
            int count = 1;
            for (int j = 0; j < mesto - 1; j++) {
                if (zal[i][j] == 0 && k == 1) {
                    System.out.println(i + 1);
                    break outer;
                }
                int temp = zal[i][j];
                temp += zal[i][j + 1];

                if (temp == 0) {
                    count++;
                } else {
                    count = 1;
                    }
                if (k == count) {
                    System.out.println(i + 1);
                    break outer;
                }
                if (j == mesto - 2) {
                    count = 1;
                }
            }
            if (i == riad - 1 && count == 1) {
                System.out.println(0);
            }
        }
    }
}
