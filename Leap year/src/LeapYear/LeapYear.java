package LeapYear;
import java.time.Year;
import java.util.Scanner;
/**
 * @ Author : Rakesh Yadav
 * @ @ Version : 8.0
 */

public class LeapYear {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        Year check = Year.of(year);

        if (check.isLeap()){
            System.out.println("Leap");
        }
        else
            System.out.println("Regular");
    }
}
