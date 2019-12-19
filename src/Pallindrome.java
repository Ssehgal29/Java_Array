public class Pallindrome {
    public static void main(String args[]){
        String str="naman";
        Pallindrome obj = new Pallindrome();
        obj.checkPallindrome(str);
    }
    private void checkPallindrome(String str){
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        if (str.equals(reverse)){
            System.out.println("yes its a pallindrome");
        }else {
            System.out.println("no its not a pallindrome");
        }
    }
}