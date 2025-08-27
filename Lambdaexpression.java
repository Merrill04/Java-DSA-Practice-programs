public class Lambdaexpression {
    public static void main(String[] args){
        sum addition = (int a, int b) ->  a + b;
        sum subtraction = (int c, int d) -> c - d;
        int res = addition.operate(1,2);
        int res1 = subtraction.operate(3,2);
        System.out.println(res);
        System.out.println(res1);
    }

    interface sum{
        int operate(int a, int b);
    }
}
