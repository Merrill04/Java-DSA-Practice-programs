public class reversewords{
    public static void main(String [] args){
        reversewords rev = new reversewords();

        String s = "Hello World from Java";

        String[] reversed = rev.reverse(s);

        for (String word : reversed) {
            System.out.print(word+ " ");
        }
    }

    public String[] reverse(String s){
        String[] words = s.split(" ");

        int left = 0;
        int right = words.length-1;

        while(left<right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        return words;
    }
}