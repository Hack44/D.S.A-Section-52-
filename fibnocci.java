import java.util.*;
class fibnocci{
    static int fib(int N){
        if(N==0){
            return 0;
        }
        else if(N==1){
            return 1;
        }
        else{
            return fib(N-1)+fib(N-2);
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
            System.out.print("enter the N term= ");
            int N= sc.nextInt();
            System.out.print(fib(N));
        }
    }
