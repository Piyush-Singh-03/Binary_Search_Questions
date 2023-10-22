public class rotated_array_count {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,1,2,3};
        System.out.println(numofrotation(nums));
    }
    static int numofrotation(int[] arr){
        int pivot = findPivot(arr);
        return pivot +1;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start + (end - start) /2;
            // 4 cases
            if(mid < end && arr[mid] > arr[mid +1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid -1]){
                return mid -1;
            }
            if(arr[mid] <= arr[start]){
                end = mid -1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
}
