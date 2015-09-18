
package integerset;

public class IntegerSet {
    boolean a[];
    
    

    public IntegerSet() {
        a=new boolean[11];
    }
    
    public IntegerSet union(IntegerSet set){
        IntegerSet union=new IntegerSet();
        boolean b;
        for (int i = 0; i < a.length; i++) {
            b = a[i]|set.a[i];
            union.a[i]=b;
        }
        return union;
    }
    
     public IntegerSet intersection(IntegerSet set){
        IntegerSet union=new IntegerSet();
        boolean b;
        for (int i = 0; i < a.length; i++) {
            b = a[i]&set.a[i];
            union.a[i]=b;
        }
        return union;
    }

    public void insertElement(int num){
      a[num]=true;
    }
     
   
     
    @Override
    public String toString() {
        boolean tmp = false;
        for (int i = 0; i < a.length; i++) {
            tmp|=a[i];
            if(a[i])
            System.out.print(i+" ");
        }
        System.out.println("");
        if(!tmp)
            System.out.println("---");
        return "";
    }
    
    public boolean isEqual(IntegerSet set){
        for (int i = 0; i < a.length; i++) {
          if(a[i]^set.a[i]){
              return false;
          }
        }
        return true;
    }
    
    
}
