public class Cealing {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,9};
        int target = 9;
        System.out.println(BinarySearch(nums,target));

    }
    static int BinarySearch(int[] arr, int target){
        if (target>arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start + (end - start) /2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
