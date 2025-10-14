public class Searching {
    public static int binary(int[] arr, int low, int high, int key) {
        if (low > high)
            return -1; 

        int mid = (low + high) / 2;
        if (arr[mid] == key){
            return mid;
        }else if (arr[mid] < key){
            return binary(arr, mid + 1, high, key);
        }else{
            return binary(arr, low, mid - 1, key);
    }}

    public static void main(String[] args) {
        int[] arr = {5, 15, 25, 35, 45, 55};
        int key = 35;

        int result = binary(arr, 0, arr.length - 1, key);

        if (result != -1)
            System.out.println(result);
        else
            System.out.println("Element not found");
    }
}
