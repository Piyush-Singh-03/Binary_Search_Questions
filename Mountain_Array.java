// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class Mountain_Array {
    public static void main(String[] args) {

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
}
