public class BinarySearch {
    public static void main(String args[]){
        int searchArray[] = {1,2,3,4,5,6,7,8,9};
        BinarySearch obj = new BinarySearch();
        obj.binarySearch(searchArray);
    }

    private void binarySearch(int arr[]) {
        int li=arr[0];
        int hi=arr.length;
        int mi=(li+hi)/2;
        int searchElement=5;

        while (li<=mi){
            if (searchElement==arr[mi]){
                System.out.println("Element found at "+mi+" position");
                break;
            } else if (searchElement<arr[mi]){
                hi=mi-1;
            } else if (searchElement>arr[mi]){
                li=mi+1;
            }
            mi=(li+hi)/2;
        }
        if (li>hi){
            System.out.println("Element not find");
        }
    }

}
