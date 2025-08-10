import java.util.ArrayList;
public class Practise{
    public static void main(String [] args){
        //float b = 1.7f;
        //int a = (int) b;
        //System.out.println(a);
        ArrayList<String> a = new ArrayList<>();
        a.add("Merrill");
        a.add("Rajesh");
        a.add("Dmonte");
        System.out.println("Original String: "+a);
        a.remove(2);
        System.out.println("After Removal: "+a);
        System.out.println(a.indexOf("Lopes"));
    }
}