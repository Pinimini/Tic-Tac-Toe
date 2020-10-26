import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] firstBox = new int[3];
        int[] secondBox = new int[3];

        for (int i = 0; i < 3; i++) {
            firstBox[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            secondBox[i] = sc.nextInt();
        }

        Arrays.sort(firstBox);
        Arrays.sort(secondBox);

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < 3; i++) {
            if (secondBox[i] > firstBox[i]) {
                count2++;
            }
            if (secondBox[i] < firstBox[i]) {
                count1++;
            }
        }
        if (count1 == 3) {
            System.out.println("Box 1 > Box 2");
        } else if (count2 == 3) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}
