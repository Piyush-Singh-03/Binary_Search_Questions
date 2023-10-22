public class Sub_Arrays_googleQue {
    public static void main(String[] args) {

    }
    public int maximumScore(int[] nums, int m) {
        int start =0;
        int end = 0;
        for(int i = 0; i<nums.length;i++){
            start = Math.max(start,nums[i]); // in the end of loop this will contain the max item from the array
            end += nums[i];
        }
        // binary search
        while(start < end){
            // try to find the potential answer
            int mid = start + (end -start)/2;
            // calculate how many pieces you can divide with in this max sum
            int sum =0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    // you cannot add this subarray , make new one
                    // say you add this sum to new array , then sum = num
                    sum = num;
                    pieces++;
                }else{
                    sum += num;
                }
            }
            if(pieces > m){
                start = mid +1;
            }else{
                end = mid;
            }
        }
        return end; // here start == end

    }
}
