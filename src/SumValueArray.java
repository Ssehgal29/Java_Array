public class SumValueArray {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        SumValueArray obj =new SumValueArray();
        obj.arraySum(arr);
    }
    private void arraySum(int arr[]){
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
