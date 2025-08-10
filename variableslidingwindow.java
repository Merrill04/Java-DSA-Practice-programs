public class variableslidingwindow {
    public static void main(String args[]){
        int[] arr = {-2, 3, 5, 7, -8, 9};
        int result = maxSubArraySum(arr);
        System.out.println(result);
    }

    public static int maxSubArraySum(int[] arr) {
        int maxsum = Integer.MIN_VALUE;

        int left = 0;
        int right = 0;
        int windowsum = 0;

        while(right < arr.length){
            windowsum = windowsum + arr[right];
            if(windowsum < 0){
                windowsum = 0;
                left = right + 1;
                right = right + 1;
            }else if(windowsum > maxsum){
                maxsum = windowsum;
                right++;
            }else if(windowsum < maxsum){
                windowsum = 0;
                if(right == arr.length-1){
                    return maxsum;
                }else{
                    left = right + 1;
                    right = right + 1;
                }
            }
        }
        return maxsum;
    } 
}
