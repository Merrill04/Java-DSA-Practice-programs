import java.util.*;

public class Matrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter size of array:");
        n = sc.nextInt();

        int arr[][] = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter element at position ["+i+"]["+j+"] :" );
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        System.out.println("The transpose of a matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}