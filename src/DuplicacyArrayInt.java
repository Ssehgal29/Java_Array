import java.util.HashSet;

public class DuplicacyArrayInt {
    public static void main(String args[]){
        int arr[]={1,1,2,2,3,10,3,4,5,5,6,6,7,8,9,9};
        DuplicacyArrayInt obj=new DuplicacyArrayInt();
        obj.removeDuplicacy(arr);
    }

    private void removeDuplicacy(int arr[]){
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        for (int i:hashSet)
        System.out.print(i+" ");
    }
}
