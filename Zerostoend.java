import java.util.Arrays;

public class Zerostoend {
    public static void main(String[] args) {
        Zerostoend array = new Zerostoend();

        int[] arr = {1,2,0,4,0,0,8,9};

        int[] result = array.rearrange(arr);

        System.out.println(Arrays.toString(result));

    }

    public int[] rearrange(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            if(arr[left] == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else{
                left++;
            }
        }
        return arr;
    }
}




