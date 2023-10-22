public class floor {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6,7,9};
        int target = 4;
        System.out.println(BinarySearch(nums,target));

    }
    static int BinarySearch(int[] arr, int target){
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
        return end;
    }
}
