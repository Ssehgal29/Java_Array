public class FactorialOfNum {
    public static void main(String args[]){
        FactorialOfNum obj=new FactorialOfNum();
        obj.findFactorial();
    }
    private void findFactorial(){
        int factorial=5;
        for (int i=factorial-1;i>0;i--){
            factorial=factorial*i;
        }
        System.out.print(factorial);
    }
}
