public class MaxMinArray {
    public static void main(String args[]){
        int arr[]={20,67,45,88,77,13,25,98};

        MaxMinArray obj=new MaxMinArray();
        obj.MaxElementInArray(arr);
        obj.MinElementInArray(arr);
    }

    private void MaxElementInArray(int arr[]){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                int temp=arr[i];
                arr[i]=max;
                max=temp;
            }
        }
        System.out.println(max+" is the max element");
    }

    private void MinElementInArray(int arr[]){
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                int temp=arr[i];
                arr[i]=min;
                min=temp;
            }
        }
        System.out.println(min+" is the min element");
    }
}
