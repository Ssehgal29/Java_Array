public class PrimeNum {
    public static void main(String args[]){
        int num=739;
        PrimeNum obj=new PrimeNum();
        obj.isPrime(num);
    }
    private void isPrime(int num){
        int temp=0;
        for (int i=2;i<num-1;i++){
            if (num%i==0){
                temp++;
            }
        }
        if (temp==0){
            System.out.println(num+" is prime");
        }else {
            System.out.println(num+" is not prime");
        }
    }
}
