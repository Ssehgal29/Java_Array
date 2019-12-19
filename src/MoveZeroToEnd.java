public class MoveZeroToEnd {
    public static void main(String args[]){
        int arr[]={1,0,2,0,3,0,4,0,5,0,6};
        MoveZeroToEnd obj=new MoveZeroToEnd();
        obj.moveZero(arr);
    }
    private void moveZero(int arr[]){
        int count=0;
        int i;
        for (i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while (count<i){
            arr[count++]=0;
        }
        for (int j:arr){
            System.out.print(j+" ");
        }
    }
}
