public class MegaPrimeNum {
    public static void main(String args[]){
        int megaPrime=129;
        MegaPrimeNum obj=new MegaPrimeNum();
        obj.isMegaPrime(megaPrime);
    }
    public boolean isPrime(int num){
        if (num==0 || num==1){
            return false;
        }else {
            int temp=0;
            for (int i=2;i<num-1;i++){
                if (num%i==0){
                    temp++;
                }
            }if (temp==0){
                return true;
            }else {
                return false;
            }
        }

    }

    private boolean isMegaPrime(int num){
        int finalnum=num;
        if (isPrime(num)){
            while (num!=0){
                int remainder=num%10;
                if (isPrime(remainder)){
                    num=num/10;
                }else {
                    System.out.println("not a mega prime");
                    return false;
                }
            }
        }else {
            System.out.println("not a mega prime");
        }
        System.out.print(finalnum+ " is a mega prime");
        return true;
    }
}
