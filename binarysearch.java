public class binarysearch {

    static void binsearch(int[] arr, int t){
        int low = 0;
        int high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == t) {
                System.out.println("Found: " + arr[mid]);
                found = true;
                break;
            } else if (arr[mid] > t) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 9, 15, 18, 19};
        int target = 10;

        binsearch(arr, target);
    }
}
