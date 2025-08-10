public class checksortedrecurrsion {

    public static void main(String[] args){
        int[] array = {1, 2, 4, 6, 9};
        System.out.println(check(array, 0));
    }

    static boolean check(int[] arr, int idx){
        if(idx == arr.length - 1){
            return true;
        }

        return arr[idx] < arr[idx + 1] && check(arr, idx + 1);
    }
}
