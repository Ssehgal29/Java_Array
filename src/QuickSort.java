public class QuickSort {
    public static void main(String args[]){
        int arr[]={2,4,1,5,3,8,6,9,7};
        QuickSort obj=new QuickSort();
        obj.quickSortRecursion(arr,0,arr.length-1);
        obj.printArray(arr);
    }

    public int partition(int arr[], int low, int high){

        int pivot=arr[(low+high)/2];
        while (low<=high){
            while (arr[low]<pivot){
                low++;
            }
            while (arr[high]>pivot){
                high--;
            }
            if (low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;

                low++;
                high--;
            }
        }
        return low;
    }

    public void quickSortRecursion(int arr[],int low, int high){
        int pi=partition(arr,low,high);
        if (low<pi-1){
            quickSortRecursion(arr,low,pi-1);
        }if (high>pi){
            quickSortRecursion(arr,pi,high);
        }
    }
    public void printArray(int arr[]){
        for (int i:arr){
            System.out.print(i+ " ");
        }
    }
}
