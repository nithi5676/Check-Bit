package checkBit;

import java.util.Scanner;

public class CheckBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter to number to check bit: ");
        int check = scanner.nextInt();
        scanner.close();
        System.out.print(bit(number, check));
    }

    private static int bit(int number, int check) {
        if (number == (number | (1 << check))) {
            return 1;
        } else {
            return 0;
        }
    }

}
