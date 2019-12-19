public class BubbleSort {
    public static void main(String args[]){
        int sortArray[]={2,5,1,7,9,3,6,4,8};
        BubbleSort obj=new BubbleSort();
        obj.bubbleSort(sortArray);

    }

    private void bubbleSort(int arr[]) {

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
