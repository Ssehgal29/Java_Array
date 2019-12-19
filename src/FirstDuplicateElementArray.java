import java.util.HashSet;

public class FirstDuplicateElementArray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,2,1};
        FirstDuplicateElementArray obj=new FirstDuplicateElementArray();
        obj.findFirstDuplicate(arr);
    }
    private void findFirstDuplicate(int arr[]){
        HashSet<Integer> hashSet=new HashSet<>();
        int temp=-1;
        for (int i=arr.length-1;i>=0;i--){
            if (hashSet.contains(arr[i])){
                temp=i;
            }else{
                hashSet.add(arr[i]);
            }
        }
        if (temp!=-1){
            System.out.println(arr[temp]+" is the first duplicate element");
        }else {
            System.out.println("No duplicate element");
        }
    }
}
