public class LinearSearch {

    public static void main(String args[]){

        int searchArray[]={1,2,3,4,5,6,7,8,9};
        LinearSearch obj = new LinearSearch();
        obj.linearSearch(searchArray);
    }

    private void linearSearch(int arr[]) {
        int temp=0;
        for (int i =0;i<arr.length;i++){
            int searchItem=2;
            if (arr[i]==searchItem){
                System.out.println("Item found at "+i+" index no.");
                temp++;
            }
        }
        if (temp==0){
            System.out.println("Item not found");
        }
    }
}
