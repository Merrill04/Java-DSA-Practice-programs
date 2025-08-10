public class matrixsearch {

    public static void main(String[] args){
        int[][] matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        int target = 11;

        boolean result = matrixsearch(matrix, target);
        System.out.println(result);
    }

    static boolean matrixsearch(int[][] matrix, int target){
        int a = matrix.length;
        int b = matrix[0].length;
        int start = 0;
        int end = (a * b) - 1;

        int row;
        int col;

        while(start <= end){
            int mid = start + ((end - start)/2);
            row = mid / b;
            col = mid % b;

            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }

/*    public boolean matrixsearch(int[][] matrix, int target) { // O(n)
        for(int i=0; i<matrix.length; i++){
            int j = matrix[0].length-1;

            if(matrix[i][j] == target){
                return true;
            }else if(matrix[i][j] > target){
                while(j>0){
                    j--;
                    if(matrix[i][j] == target){
                        return true;
                    }
                }
            }
        }

        return false;
    }
*/
}
