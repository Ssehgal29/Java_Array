public class NumOfEvenOddInt {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        NumOfEvenOddInt obj = new NumOfEvenOddInt();
        obj.countEvenOdd(arr);
    }

    private void countEvenOdd(int arr[]){
        int countEven=0;
        int countOdd=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                countEven++;
            }else if (arr[i]%2!=0){
                countOdd++;
            }
        }
        System.out.println("No of even integer are "+countEven);
        System.out.println("No of odd integer are "+countOdd);
    }
}
