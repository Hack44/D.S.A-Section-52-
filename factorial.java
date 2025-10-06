import java.util.*;
class factorial {
    static int fac(int N){
        if (N<2){
            return 1;
        }else{
            return N *fac(N-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N= ");
        int N = sc.nextInt();
        System.out.print(fac(N));
    }
}