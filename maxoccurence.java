public class maxoccurence {
    public static void main(String[] args) {
        maxoccurence number = new maxoccurence();

        int[] arr = {1,1,2,2,2,1,2};

        int result = number.maximumoccur(arr);
        System.out.println(result);
    }

    public int maximumoccur(int[] arr){
        int maxnumber = arr[0];
        int maxcount = 0;
        int count = 1;

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                if(maxcount<count){
                    maxcount=count;
                    maxnumber=arr[i-1];
                    count=1;
                }
            }
        }

        if(maxcount<count){
            maxcount=count;
            maxnumber=arr[arr.length-1];
        }

        return maxnumber;
    }
}