public class findduplicates{
    public static void main(String args[]){
        findduplicates dup = new findduplicates();

        String s = "character";

        dup.countduplicates(s);
    }

    public void countduplicates(String s){
        char[] arr = s.toCharArray();
        int count=1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count += 1;
                }
            }
            if(count>1){
                System.out.println(arr[i]+"="+count);
            }

            count=1;
        }
    }
}