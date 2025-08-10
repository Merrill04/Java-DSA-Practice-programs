import java.util.*;

public class gcd {
    public static int[] arrayoffactors(int num){
        int count = 0;
        int[] arr = new int[num];
        int n = num;
        int i = 2;
        while(n>0 && i<=n){
            if(n % i == 0){
                arr[count] = i;
                count++;
                n = n/i;
            }else{
                i++;
            } 
        }
        
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int[] arr1 = arrayoffactors(n1);
        int[] arr2 = arrayoffactors(n2);
        
        int min=0;
        
        if(arr1.length < arr2.length){
            min = arr1.length;
        }else{
            min = arr2.length;
        }
        
        int gcd = 0;
        
        for(int i = 0; i < min; i++){
            for(int j = 0; j < min; i++){                
                if(arr1[i] == arr2[i]){
                    if(arr1[i] >= gcd){
                        gcd = arr1[i];
                        break;
                    }   
                }
            }
        }
        
        System.out.print(gcd);               
    }
}