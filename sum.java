import java.util.Scanner;

class sum {
    static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n= ");
        int n = sc.nextInt();
        System.out.print(sum(n));
    }
}
