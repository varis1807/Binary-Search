import java.util.*;

public class searchNearlySortedArr {

    public static int binarySearch(int[] arr, int si, int ei, int x) {
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == x)
                return mid;
            else if (mid > si && arr[mid - 1] == x)
                return mid - 1;
            else if (mid < ei && arr[mid + 1] == x)
                return mid + 1;
            else if (arr[mid] > x)
                ei = mid - 1;
            else if (arr[mid] < x)
                si = mid + 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 10, 30, 20, 40 };
        int n = arr.length;
        int x = 40;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " +
                    result);
    }

}