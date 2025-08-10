import java.util.*;

public class wierdalgorithm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

        List<Long> list = new ArrayList<>();
        list.add(n);

        while(n > 1){
            if(n % 2 == 0){
                n = n / 2;
                list.add(n);
            }else{
                n = 3 * n + 1;
                list.add(n);
            }
        }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
