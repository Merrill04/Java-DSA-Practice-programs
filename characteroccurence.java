public class characteroccurence {
    public static void main(String[] args) {
        characteroccurence count = new characteroccurence();

        String s1 = "book";
        char target = 'o';

        int result = count.charcount(s1, target);
        System.out.print(result);
    }

    public int charcount(String s, char t){
        int count = 0;

        for(int i=0;i< s.length();i++){
            if(s.charAt(i)==t){
                count += 1;
            }
        }
        return count;
    }
}