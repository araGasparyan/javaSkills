
package integerset;

public class Main {
    public static void main(String[] args) {
        IntegerSet set1=new IntegerSet();
        IntegerSet set2=new IntegerSet();
        set1.a[5]=true;
        set1.a[3]=true;
        set1.toString();
        set2.a[3]=true;
        set2.toString();
        IntegerSet set3=set1.intersection(set2);
        set3.toString();
        System.out.println(set2.isEqual(set3));
    }
}
