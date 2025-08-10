import java.sql.SQLOutput;
import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args){
        int[] arr = {2, 5, 6, 1, 3, 4};
        selectionsortalgo(arr);
    }

    static void selectionsortalgo(int[] array){
        for(int i = 0; i < array.length; i++){
            int lastidx = array.length - i - 1;
            int maxidx = maximum(array, lastidx);

            int temp = array[maxidx];
            array[maxidx] = array[lastidx];
            array[lastidx] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

    static int maximum(int[] array, int end){
        int max = array[0];
        int idx = 0;
        for(int i = 1; i < end; i++){
            if(max < array[i]){
                max = array[i];
                idx = i;
            }
        }

        return idx;
    }
}
