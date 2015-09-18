package simpleskills;

class Polynom{
    public static void main(String args[]){  
        double[] a=new double[]{1,-3,2,4,1,-1};
        double[] b=new double[a.length-1];
        double x=2,q=0,p=1,Q=0;      
        for(int k=0;k<b.length;k++){
        b[k]=(k+1)*a[k+1];
        System.out.print(b[k]);
               q+=(b[k]*p);
               Q+=(a[k]*p);
               p*=x;
            }
        Q+=a[a.length-1]*p;
         System.out.print("\n"+q+"\n "+Q+"");
    }
}