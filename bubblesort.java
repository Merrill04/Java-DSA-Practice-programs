import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args){
        int[] arr = {5, 1, 4, 2, 3};
        bubblesortalgo(arr);
    }

    static void bubblesortalgo(int[] array){
        boolean isswapped = false;
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length - i; j++){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    isswapped = true;
                }
            }

            if(isswapped == false){  // why this if loop? Because if the array becomes sorted in first
                break;               // iteration only then still the outer for loop will run for n times.
                                     // that is why we check if the inner for loop returns isswapped value as
                                     // false. If false then array is sorted and break and if not then continue.
            }
        }

        System.out.print(Arrays.toString(array));
    }
}

