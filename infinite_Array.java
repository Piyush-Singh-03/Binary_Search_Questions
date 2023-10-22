public class infinite_Array {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,11,23,34,56,67,78,89,90,112,334,556};
        int target = 112;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target){
        // find the range
        //Starting with the box of size 2
        int start =0;
        int end = 1;
        //condition for target to lie in the range
        while(target > arr[end]){
            int newStart = end+1; //it is basically like temp
            //double the box value
            //Previous end + boxvalue*2
            end  = end + (end - start +1)*2;
            start = newStart;
        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int[] arr, int target,int start, int end){
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
        return -1;
    }
}
