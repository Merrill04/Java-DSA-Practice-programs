import java.util.HashMap;

public class stringanagram {
    public static void main(String[] args) {
        stringanagram anagram = new stringanagram();

        String s1 = "book";
        String s2 = "mood";

        boolean result = anagram.checkanagram(s1,s2);
        System.out.print(result);
    }

    public boolean checkanagram(String s1,String s2){
        char[] sone = s1.toCharArray();
        char[] stwo = s2.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i< sone.length;i++){
            map.put(sone[i],i);
        }

        int i=0;
        while(i< stwo.length){
            if(map.containsKey(stwo[i])){
                i++;
            }
            else{
                return false;
            }
        }

        return true;
    }
}