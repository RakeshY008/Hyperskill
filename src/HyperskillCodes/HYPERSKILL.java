package HyperskillCodes;

import java.util.Scanner;

/**
 * @author : Rakesh Yadav
 * @aim : Relational operators -> Exactly one parameter is positive
 */
public class HYPERSKILL {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[3];
        int s = 0, p = 0;
        Scanner scanner = new Scanner(System.in);
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();

        for (int i = 0; i < 3; i++) {
            if (arr[i] > 0)
                s = s + 1;
            else
                p = p + 1;
        }
        if (s == 1)
            System.out.println("true");
        else
            System.out.println("false");
    }
}