public class longestpalindrome{
    public static void main(String args[]){
        longestpalindrome pal = new longestpalindrome();

        String s = "babad";
        pal.palindromecheck(s);
    }

    public void palindromecheck(String s){
        char[] arr = s.toCharArray();

        if(arr.length%2==0){
            int mid1 = arr.length/2;
            int mid2 = mid1+1;
            while(mid2<arr.length){
                if(arr[mid1]==arr[mid2]) {
                    mid1--;
                    mid2++;
                }
                else{
                    System.out.print("String is not palindrome.");
                }
            }
            for(int i=mid1;i<=mid2;i++){
                System.out.print(arr[i]);
            }
        }
        else{
            int mid=arr.length/2;
            int mid1=mid-1;
            int mid2=mid+1;
            while(mid2< arr.length){
                if(arr[mid1]==arr[mid2]) {
                    mid1--;
                    mid2++;
                }
                else{
                    System.out.print("String is not palindrome.");
                }
            }
            for(int i=mid1;i<=mid2;i++){
                System.out.print(arr[i]);
            }
        }
    }
}