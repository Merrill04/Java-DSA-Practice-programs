
public class Patterns {
    public static void main(String args[]) {
        Patterns pat = new Patterns();
    }
}
//    public void pattern1(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

//    public void pattern2(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }

//    public void pattern3(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n-1; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

//    public void pattern4(int n,int m){
//        int i;
//        int j;
//
//        for(i=1;i<=n;i++){
//            if(i==1 || i==n){
//                for(j=1;j<=m;j++){
//                    System.out.print("*");
//                }
//            }
//            else{
//                for(j=1;j<=m;j++){
//                    if(j==1 || j==m){
//                        System.out.print("*");
//                    }
//                    else{
//                        System.out.print(" ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }

//    public void pattern5(int n){
//        for(int i=0;i<n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }

//    public void pattern6(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print(combination(i, j) + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static long factorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        return n * factorial(n - 1);
//    }
//
//    public static long combination(int n, int k) {
//        return factorial(n) / (factorial(k) * factorial(n - k));
//    }


