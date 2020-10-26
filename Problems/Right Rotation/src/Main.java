import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();
        int a = sc.nextInt();
        String[] splitNumber = numbers.split(" ");
        int[] arrayNumber = new int[splitNumber.length];

        for (int i = 0; splitNumber.length > i; i++) {
            arrayNumber[i] = Integer.parseInt(splitNumber[i]);
        }
        if (a > splitNumber.length) {
            a = a % splitNumber.length;
        }
        for (int i = 0; i < a; i++) {
            int temp = arrayNumber[arrayNumber.length - 1];
            for (int j = arrayNumber.length - 1; j > 0; j--) {
                arrayNumber[j] = arrayNumber[j - 1];
            }
            arrayNumber[0] = temp;
        }

        for (int v :
                arrayNumber) {
            System.out.print(v + " ");
        }
    }
}
