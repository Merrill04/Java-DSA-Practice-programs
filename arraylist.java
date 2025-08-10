import java.util.ArrayList;
import java.util.List;

public class arraylist {
    public static void main(String args[]){
/*      List<String> list = new ArrayList<>(10);

        list.add("Merrill");
        list.add("Neil");
        list.add("Rex");
        
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
*/ 

/*      List<Integer> list = new ArrayList<>(10);

        for(int i = 1; i <= 10; i++){
            list.add(i);
        }

        System.out.println(list);
        System.out.println(list.get(4));
        list.set(4 , 11);
        System.out.println(list);

        if(list.contains(11)){
            System.out.println("11 is in the list");
        }else{
            System.out.println("11 is not in the list");
        }

        list.remove(4);
        System.out.println(list);

        for(int i : list){
            System.out.print(i + " ");
        }
*/

        List<Integer> list = new ArrayList<>(10);
        List<Integer> list1 = new ArrayList<>(10);

        list.add(4);
        list.add(7);
        list.add(5);
        list.add(1);
        list.add(9);
        list1.add(4);
        list1.add(7);
        list1.add(5);
        list1.add(1);
        list1.add(9);
//        list.sort(null);

        list.addAll(list1);
        System.out.println(list);        
    }

}
