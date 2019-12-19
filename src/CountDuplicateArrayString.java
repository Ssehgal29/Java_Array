import java.util.HashMap;
import java.util.Set;

public class CountDuplicateArrayString {
    public static void main(String args[]){
        String str="aabcabbcdbasgchbdasbhsmdgvjhasmn";
        CountDuplicateArrayString obj= new CountDuplicateArrayString();
        obj.removeDuplicacy(str);
    }

    private void removeDuplicacy(String str){
        char strArray[] = str.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (char c:strArray){
            if (hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c)+1);
            }else {
                hashMap.put(c,1);
            }
        }
        Set<Character> setChar=hashMap.keySet();
        for (char c:setChar){
            if (hashMap.get(c)>0){
                System.out.println(c+" "+hashMap.get(c));
            }
        }
    }
}
