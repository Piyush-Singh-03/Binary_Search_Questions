// https://leetcode.com/problems/find-in-mountain-array/description/
public class finding_in_mountain {
    public static void main(String[] args) {

    }
    int search(int[] arr, int traget){
        int peak = peakIndexInMountainArray(arr);
        int firsttry = orderAgnosticBS(arr,traget,0,peak);
        if(firsttry != -1){
            return firsttry;
        }
        // otherwise try to search in secondhalf
        return orderAgnosticBS(arr,traget,peak+1,arr.length);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end - start) / 2;
            // this can be potential answer but it means you are in dc part
            if(arr[mid] > arr[mid +1]){
                // the ia why mid end is not equal to mid -1
                end = mid;
            }else {
                // you are at ac part
                start  = mid + 1;
            }

        }
        return start; // or return end as both are equal == max
    }
    static int orderAgnosticBS(int[] arr, int target,int start,int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
