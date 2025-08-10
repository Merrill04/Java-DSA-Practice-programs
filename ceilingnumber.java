import static java.lang.Math.floor;

public class ceilingnumber {
    public static void main(){
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;

        int result = ceiling(arr, target);

        System.out.println(result);
    }

    static int ceiling(int[] array, int k){
        int left = 0;
        int right = array.length - 1;

        if(array[right] < k){
            return 0;
        }

        while(left <= right){
            int mid = left + ((right - left) / 2);

            if(array[mid] == k){
                return array[mid];
            }else if(array[mid] > k){
                right = mid - 1;
            }else if(array[mid] < k){
                left = mid + 1;
            }
        }

        return array[left];
    }
}
