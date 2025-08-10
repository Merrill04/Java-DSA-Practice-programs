public class fastandslowpointer {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 11, 13, 15};

        int slow = 0;
        int fast = 0;

        while (fast < arr.length && fast + 1 < arr.length) {
            // print positions for understanding
            System.out.println("Slow at index: " + slow + " -> " + arr[slow]);
            System.out.println("Fast at index: " + fast + " -> " + arr[fast]);
            System.out.println("-------------------");

            // move pointers
            slow = slow + 1;
            fast = fast + 2;
        }
    }
}
