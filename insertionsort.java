import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args){
        int[] arr = {5, 6, 3, 1, 4, 2};
        insertionsortalgo(arr);
    }

    static void insertionsortalgo(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
