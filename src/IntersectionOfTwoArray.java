public class IntersectionOfTwoArray {
    public static void main(String args[]){
        int arr1[]={1,2,3,4,5,6,7,8,9};
        int arr2[]={2,4,6,8,10,11,14,1,18};

        String str1="abcdef";
        String str2="befhi";
        IntersectionOfTwoArray obj = new IntersectionOfTwoArray();
        obj.findIntersectionIntArray(arr1,arr2);
        System.out.println();
        obj.findIntersectionCharArray(str1,str2);
    }

    private void findIntersectionIntArray(int arr1[],int arr2[]){
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                }
            }
        }
    }

    private void findIntersectionCharArray(String str1, String str2){
        char charArray1[]=str1.toCharArray();
        char charArray2[]=str2.toCharArray();

        for (int i=0;i<charArray1.length;i++){
            for (int j=0;j<charArray2.length;j++){
                if (charArray1[i]==charArray2[j]){
                    System.out.print(charArray1[i]+" ");
                }
            }
        }

    }
}
