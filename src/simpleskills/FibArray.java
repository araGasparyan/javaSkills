package simpleskills;

class FibArray{
    public static void main(String args[]){
        int k,n=30;
        int[] Fib=new int[n];
        Fib[0]=1;
        Fib[1]=1;
        System.out.print("Ֆիբոնաչիի հաջորդականություն\n");
        System.out.print("1,1,");
        for(k=2;k<n;k++){
            Fib[k]=Fib[k-1]+Fib[k-2];
             System.out.print(Fib[k]+(k!=n-1?",":"\n"));
        }
        
    }
}