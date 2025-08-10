import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args){
        int[] array = {5, 4, 2, 3, 1};
        cyclesortalgo(array);
        System.out.println(Arrays.toString(array));
    }

    static void cyclesortalgo(int[] arr){
        int start = 0;
        while(start < arr.length){
            int correct = arr[start] - 1;
            if(arr[start] - 1 != start){
                int temp = arr[start];
                arr[start] = arr[correct];
                arr[correct] = temp;
            }else{
                start++;
            }
        }
    }
}
