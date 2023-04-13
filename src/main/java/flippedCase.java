import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class flippedCase {
    public static void main(String[] args) {

        Scanner objectScanner = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String userInput = objectScanner.nextLine();

        System.out.println("You Entered: " + userInput);

        if (StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is a number");
        } else {
            System.out.println(userInput + " is NOT a number");
        }

        String flippedCase = StringUtils.swapCase(userInput);
        System.out.println("Flipped Case: " + flippedCase);

        String reversed = StringUtils.reverse(userInput);
        System.out.println("Reversed: " + reversed);

    }
}
