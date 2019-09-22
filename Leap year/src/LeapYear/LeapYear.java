package LeapYear;

import java.time.Year;
import java.util.Scanner;

/**
 * @ Author : Rakesh Yadav
 * @ @ Version : 8.0
 */
public class LeapYear {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

    }

    public int LeapYear(int year){
        if (year%4 == 0 && year%100 != 0){
            System.out.println("Leap");
        }
        else if (year%400==0 && year%4==0){
            System.out.println("Leap");
        }else
            System.out.println("Regular");
    }
}
