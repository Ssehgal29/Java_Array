public class FibonaciSeries {
    public static void main(String args[]){
        FibonaciSeries obj=new FibonaciSeries();
        obj.findFibonaci();
    }
    private void findFibonaci(){
        int fibonaciNum=10,a=0,b=0,c=1;
        for(int i=0;i<fibonaciNum;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(a+" ");
        }
    }
}
