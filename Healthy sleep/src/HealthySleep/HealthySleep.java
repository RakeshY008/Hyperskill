/**
 * @ Author : Rakesh Yadav
 */
package HealthySleep;

import java.util.Scanner;
public class HealthySleep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a <= b) {
            if (c <= b && c >= a)
                System.out.println("Normal");
            else if (c <= a)
                System.out.println("Deficiency");
            else if (c >= b)
                System.out.println("Excess");
        }
    }
}
