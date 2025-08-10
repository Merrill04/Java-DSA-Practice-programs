import java.util.Arrays;

public class twosumsorted {
    public static void main(String[] args) {
        twosumsorted array = new twosumsorted();

        int[] arr = {2,3,4,6,7};
        int target = 11;

        int[] result = array.twosum(arr,target);
        System.out.println(Arrays.toString(result));
    }

    public int[] twosum(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            if(arr[left] + arr[right] == target){
                return new int[]{left, right};
            }
            else if(arr[left] + arr[right] < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{};
    }
}