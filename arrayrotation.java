import java.util.Arrays;

public class arrayrotation{
    public static void main(String[] args){
        arrayrotation array = new arrayrotation();

        int[] arr = {34, 7, 23, 32, 5, 62,9,10,11,12};
        int d = 4;

        int[] result = array.rotate(arr,d);
        System.out.println(Arrays.toString(result));
    }

    public int[] rotate(int[] arr, int d){
        return arr;
    }

}