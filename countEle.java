import java.util.*;

public class countEle {
      public static int firstOccurene(int[] arr, int tar) {
            int start = 0, end = arr.length - 1, res = -1;
            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (tar == arr[mid]) {
                        res = mid;
                        end = mid - 1;
                  } else if (tar > arr[mid]) {
                        start = mid + 1;
                  } else {
                        end = mid - 1;
                  }
            }
            return res;
      }

      public static int lastOccurence(int[] arr, int tar) {
            int start = 0, end = arr.length - 1, res = -1;
            while (start <= end) {
                  int mid = start + (end - start) / 2;
                  if (tar == arr[mid]) {
                        res = mid;
                        start = mid + 1;
                  } else if (tar > arr[mid]) {
                        start = mid + 1;
                  } else {
                        end = mid - 1;
                  }
            }
            return res;
      }

      public static int count_ele(int[] arr, int tar) {
            int i = firstOccurene(arr, tar);
            System.out.println(i);
            int j = lastOccurence(arr, tar);
            System.out.println(j);
            int ans =( j - i )+ 1;
            return ans;
      }

      public static void main(String[] args) {
            int[] arr = { 2, 4, 10, 10, 10,10,10,10,10,10,10,10,10, 18, 20 };
            System.out.print(count_ele(arr, 10));
      }
}