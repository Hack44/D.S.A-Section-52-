import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a number= ");
        int no = sc.nextInt();
        boolean Prime = true;
        if (no <= 1) {
            Prime = false;
        } else {
            for (int i = 2; i <= no/2; i++) {
                if (no % i == 0) {
                    Prime = false;
                    break;
                }
            }
        }

        if (Prime)
            System.out.println("Prime Number");
        else
            System.out.println("not a Prime Number"); 
    }
}
