import java.util.HashMap;
import java.util.Set;

public class CountDuplicateArrayInt {
    public static void main(String args[]){
        int arr[]={1,1,2,2,3,3,3,4,4,1,1,6,7,8,8,7};
        CountDuplicateArrayInt obj = new CountDuplicateArrayInt();
        obj.removeDuplicacy(arr);
    }

    private void removeDuplicacy(int arr[]){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i:arr){
            if (hashMap.containsKey(i)){
                hashMap.put(i,hashMap.get(i)+1);
            }else {
                hashMap.put(i,1);
            }
        }
        Set<Integer> setInt = hashMap.keySet();
        for (Integer i:setInt){
            if (hashMap.get(i)>0){
                System.out.println(i+" "+hashMap.get(i));
            }
        }
    }
}
