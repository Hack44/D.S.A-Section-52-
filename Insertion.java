import java.util.*;

public class Insertion {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50};
        int newNumber = 25;
        int position = 2; 
        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = newNumber;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
