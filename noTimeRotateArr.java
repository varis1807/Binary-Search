import java.util.*;

public class noTimeRotateArr {
      public static int findMinEle(int[] arr) {
            int n = arr.length;
            if (arr == null || n == 0)
                  return 0;
            if (n == 1)
                  return arr[0];
            int si = 0, ei = n - 1;
            while (si < ei) {
                  int mid = (si + ei) / 2;
                  if (mid > 0 && arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1])
                        return arr[mid];
                  if (arr[mid] >= arr[si] && arr[mid] > arr[ei])
                        si = mid + 1;
                  else
                        ei = mid - 1;
            }
            return arr[si];
      }

      public static void main(String[] args) {
            int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
            System.out.println(findMinEle(arr));
      }
}
