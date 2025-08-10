public class maxsubarray{
    public static void main(String args[]){
        maxsubarray array = new maxsubarray();

        int[] arr = {4, 6, 10, 11, 8, 1};
        int k = 3;

        int result = array.maxsum(arr,k);
        System.out.print(result);
    }

/*    public int maxsum(int[] arr, int k){
    
        int maxsum = Integer.MIN_VALUE;
        int currentsum;

        for(int i = 0; i <= arr.length-k; i++){
            currentsum = 0;
            for(int j = i; j < k + i; j++){
                currentsum += arr[j];
            }

            if(maxsum < currentsum){
                maxsum = currentsum;
            }
        }

        return maxsum;
    } */

    public int maxsum(int[] arr, int k){
        int maxsum = 0;
        int currentsum = 0;

        for(int i = 0; i < k; i++){
            currentsum += arr[i];
        }

        maxsum = currentsum;

        for(int i = k; i < arr.length; i++){
            currentsum = currentsum + arr[i] - arr[i - k];
            if(currentsum > maxsum){
                maxsum = currentsum;
            }
        }

        return maxsum;
    }
}