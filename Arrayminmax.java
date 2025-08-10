// Naive Biase approach
public class Arrayminmax{
    public static void main(String[] args){
        Arrayminmax array= new Arrayminmax();

        int[] arr = {34, 7, 23, 32, 5, 62};
        int minimumnumber = array.minimum(arr);
        int maximumnumber = array.maximum(arr);

        System.out.println("min:"+minimumnumber);
        System.out.println("max:"+maximumnumber);
    }

//    public int minimum(int[] arr){
//        int min=0;
//        for(int i=0;i< arr.length;i++){
//            for(int j=i+1;j< arr.length;j++){
//                if(arr[i]<arr[j]){
//                    min = arr[i];
//                }
//                else{
//                    min =arr[j];
//                }
//            }
//        }
//        return min;
//    }

//    public int maximum(int[] arr){
//        int max=0;
//        for(int i=0;i< arr.length;i++){
//            for(int j=i+1;j< arr.length;j++){
//                if(arr[i]>arr[j]){
//                    max = arr[i];
//                }
//                else{
//                    max= arr[j];
//                }
//            }
//        }
//        return max;
//    }

//Two Pointer approach

    public int minimum(int[] arr) {
        int min = 0;
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            if(arr[left]<arr[right]){
                min=arr[left];
                right--;
            }
            else{
                min=arr[right];
                left++;
            }
        }
        return min;
    }

    public int maximum(int[] arr) {
        int max = 0;
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            if(arr[left]<arr[right]){
                max=arr[right];
                left++;
            }
            else{
                max=arr[right];
                right--;
            }
        }
        return max;
    }
}

