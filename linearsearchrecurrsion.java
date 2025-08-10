public class linearsearchrecurrsion {
    public static void main(String[] args){
        int[] array = {1, 7, 9, 11, 5};
        int k = 8;

        System.out.print(linearsearch(array, k, 0));
    }

    static boolean linearsearch(int[] arr, int target, int index){
        if(arr[index] == target){
            return true;
        }

        return index < arr.length-1 && linearsearch(arr, target, index + 1);
    }
}
