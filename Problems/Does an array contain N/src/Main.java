import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int arraySize = reader.nextInt();
        // String arrayData = reader.nextLine;
        int numberCheck;
        int[] array = new int[arraySize];
        boolean isEquals = false;
        
        for (int i = 0; i < arraySize; i++) {
            array[i] = reader.nextInt();
        } 
        
        numberCheck = reader.nextInt();

        for (int j : array) {
            if (j == numberCheck) {
                isEquals = true;
                break;
            }
        }
        
        System.out.println(isEquals);
        
        
        
    }
}
