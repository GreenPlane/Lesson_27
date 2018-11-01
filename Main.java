import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[30];
        int i = 0;
        int valueFound = 0;
        int userInput = 1;

        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (20) + 80);
            //System.out.print(array[i] + " "); ACTIVATING THIS LINE MAKES YOU NOT DIE WHEN TRYING TO TEST VALUES
        }


        System.out.println("Enter a value to search or enter, -1 to exit the search.");

        userInput = scan.nextInt();

        while (userInput != -1) {
            valueFound = 0;
            for (i = 0; i < array.length; i++) {
                if (array[i] == userInput) {
                    valueFound = 1;
                }
            }
            if (valueFound == 1) {
                System.out.println("Value was found.");
                System.out.println("Enter a value to search or enter, -1 to exit the search.");

                userInput = scan.nextInt();
            }
            else {
                System.out.println("Value was not found.");
                System.out.println("Enter a value to search or enter, -1 to exit the search.");

                userInput = scan.nextInt();
            }
        }
    }
}
