public class SecondMaxMinArray {
    public static void main(String args[]){
        int arr[]={13,24,33,67,45,98,77,81};
        SecondMaxMinArray obj = new SecondMaxMinArray();
        obj.secondMaxElement(arr);
        obj.secondMinElement(arr);
    }

    private void secondMaxElement(int arr[]){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }else if (arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println(max2+ " is the second largest element");
    }

    private void secondMinElement(int arr[]){
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }else if (arr[i]<min2){
                min2=arr[i];
            }
        }
        System.out.println(min2+" is the second smallest element");
    }
}
