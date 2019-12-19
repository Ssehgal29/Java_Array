public class NumOfZeroInArray {
    public static void main(String args[]){
        int arr[]={1,2,0,3,0,4,5,0,0,4,6,0};
        NumOfZeroInArray obj=new NumOfZeroInArray();
        obj.countZero(arr);
    }
    private void countZero(int arr[]){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
                count++;
            }
        }
        System.out.print("Num of zeros are "+count);
    }
}
