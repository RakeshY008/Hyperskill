###### Code Challenge — Write a program

   Write a program that reads three integer numbers and prints true if exactly one number is positive (i.e. > 0).
   Otherwise, it should print false.

>> Sample Input 1:

    1 1 1

>> Sample Output 1:

    false

>> Sample Input 2:

    1 0 -1

>> Sample Output 2:

    true


#### Reference solution :
    import java.util.Scanner;
     
    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int n3 = scanner.nextInt();
            
            boolean onlyFirstIsPositive = n1 > 0 && n2 <= 0 && n3 <= 0;
            boolean onlySecondIsPositive = n1 <= 0 && n2 > 0 && n3 <= 0;
            boolean onlyThirdIsPositive = n1 <= 0 && n2 <= 0 && n3 > 0;
            
            boolean exactlyOneIsPositive = 
                onlyFirstIsPositive || 
                onlySecondIsPositive || 
                onlyThirdIsPositive;
            
            System.out.println(exactlyOneIsPositive);
        }
    }

>
>   
