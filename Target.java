import java.util.*;
class Target{
    public static void main(String [] srgs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target= ");
        int target=sc.nextInt();
        int [] array = {4,7,3,2,9,11,6};
        boolean found= false;
        for (int i=0; i<=array.length; i++){
            if(array[i]==target){
                found=true;
                break;
            }}
            if (found== true){
                 System.out.println("Yes");
            }
            else{
                System.out.println("no");
            }
        }
        
    }
