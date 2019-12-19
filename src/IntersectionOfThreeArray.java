import java.util.ArrayList;

public class IntersectionOfThreeArray {
    public static void main(String args[]){
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={2,3,4,5,6,7};
        int arr3[]={3,4,5,6,7,8};
        IntersectionOfThreeArray obj=new IntersectionOfThreeArray();
        obj.getIntersection(arr1,arr2,arr3);
    }
    private void getIntersection(int arr1[],int arr2[],int arr3[]){
        int x=0;
        int y=0;
        int z=0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (x<arr1.length && y<arr2.length && z<arr3.length){
            if (arr1[x]==arr2[y] && arr2[y]==arr3[z]){
                arrayList.add(arr1[x]);
                x++;
                y++;
                z++;
            }else if(arr1[x]<arr2[y]){
                x++;
            }else if (arr2[y]<arr3[z]){
                y++;
            }else {
                z++;
            }
        }
        for (int i:arrayList){
            System.out.print(i+" ");
        }
    }
}
