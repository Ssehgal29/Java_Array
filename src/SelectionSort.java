public class SelectionSort {
    public static void main(String args[]){
        int sortArray[] ={2,4,1,5,7,3,8,6,9};
        bubbleSort(sortArray);
    }

    private static void bubbleSort(int arr[]) {

        for (int i=0;i<arr.length;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
